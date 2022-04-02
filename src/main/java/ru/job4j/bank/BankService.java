package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывает модель банковской системы
 * В системе можно производить следующие действия:
 * 1. Регистрировать пользователя.
 * 2. Удалять пользователя из системы.
 * 3. Добавлять пользователю банковский счет. У пользователя системы могут быть несколько счетов.
 * 4. Переводить деньги с одного банковского счета на другой счет.
 * @author Marina Konteeva
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение задания осуществляется в коллекции типа HashMap
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * метод добавляет пользователя в систему, если такого пользователя еще нет
     * @param user пользователь, который добавляется
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * метод добавляет пользователю новый счет, если такого еще нет
     * @param passport по этому параметру ищем пользователя
     * @param account к списку счетов добавляем этот счет
     */
    public void addAccount(String passport, Account account) {
        var user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> accounts = users.get(user.get());
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * метод ищет пользователя по номеру паспорта
     * @param passport номер паспорта пользователя
     * @return возвращает пользователя по номеру паспорта
     */
    public Optional<User> findByPassport(String passport) {

        return users.keySet()
                .stream()
                .filter(u -> u.getPassport().equals(passport))
                .findFirst();

    }

    /**
     * метод ищет пользователя по реквизитам
     * @param passport паспортные данные пользователя
     * @param requisite номер счета
     * @return возвращает счет
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        var user = findByPassport(passport);

          if (user.isPresent()) {
              return users.get(user.get())
                      .stream()
                      .filter(u -> u.getRequisite().equals(requisite))
                      .findFirst();
          }
        return Optional.empty();
    }

    /**
     * метод перечисляет деньги с одного счета на другой
     * @param srcPassport паспортные данные пользователя, который переводит деньги
     * @param srcRequisite номер счета этого пользователя, с которого нужно перевести деньги
     * @param destPassport паспортные данные пользователя, которому переводят деньги
     * @param destRequisite номер счета этого пользователя, на который нужно перевести деньги
     * @param amount сумма, которую пытаемся перевести с одного счета на другой
     * @return возвращаем успешность перевода
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        var srcAccount = findByRequisite(srcPassport, srcRequisite);
        var destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent() && destAccount.isPresent() && srcAccount.get().getBalance() >= amount) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}