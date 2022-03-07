package ru.job4j.collection;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.ItemAscByName;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 1),
                new Job("Impl task", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameAndProrityAsc() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 1),
                new Job("Impl task", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void jobAscByName() {
        Job job1 = new Job("Impl task", 0);
        Job job2 = new Job("Fix bug", 1);
        List<Job> jobs = Arrays.asList(job1, job2);
        Collections.sort(jobs, new JobAscByName());
        List<Job> expected = Arrays.asList(job2, job1);
        Assert.assertArrayEquals(jobs.toArray(), expected.toArray());
    }

    @Test
    public void jobDescByName() {
        Job job1 = new Job("Impl task", 0);
        Job job2 = new Job("Fix bug", 1);
        List<Job> jobs = Arrays.asList(job1, job2);
        Collections.sort(jobs, new JobDescByName());
        List<Job> expected = Arrays.asList(job1, job2);
        Assert.assertArrayEquals(jobs.toArray(), expected.toArray());
    }

    @Test
    public void jobAscByPriority() {
        Job job1 = new Job("Impl task", 0);
        Job job2 = new Job("Fix bug", 1);
        List<Job> jobs = Arrays.asList(job1, job2);
        Collections.sort(jobs, new JobAscByPriority());
        List<Job> expected = Arrays.asList(job1, job2);
        Assert.assertArrayEquals(jobs.toArray(), expected.toArray());
    }

    @Test
    public void jobDescByPriority() {
        Job job1 = new Job("Impl task", 0);
        Job job2 = new Job("Fix bug", 1);
        List<Job> jobs = Arrays.asList(job1, job2);
        Collections.sort(jobs, new JobDescByPriority());
        List<Job> expected = Arrays.asList(job2, job1);
        Assert.assertArrayEquals(jobs.toArray(), expected.toArray());
    }
}