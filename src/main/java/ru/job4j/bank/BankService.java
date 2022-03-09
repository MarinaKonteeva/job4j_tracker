package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
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
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * метод ищет пользователя по реквизитам
     * @param passport паспортные данные пользователя
     * @param requisite номер счета
     * @return возвращает счет
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
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
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}