package com.ChainofResponsibility;

public abstract class Notifier {
    private int priority;
    private Notifier nextNotifier; //Мі сможем ему передавать дальше запрос

    public Notifier(int priority) {
        this.priority = priority;    //Кнструктор
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void notifyManager(String message, int level) {
        if (level >= priority) {
            write(message);
        }
        if (nextNotifier != null) {
            nextNotifier.notifyManager(message, level); // вызывает свой метод
        }
    }

    public abstract void write(String message); // пишет нам сообщение
}