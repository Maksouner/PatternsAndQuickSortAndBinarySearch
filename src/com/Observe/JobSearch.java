package com.Observe;

import com.Iterator.JavaDeveloper;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        Observer firstSubscriber = new Subscriber("Maks Suvorov");
        Observer secondSubscriber = new Subscriber("Grigoriy Ershow");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third Java Position");

        jobSite.removeVacancy("First Java Position");
    }
}
