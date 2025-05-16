package org.learning.designpattern.creataional.factory.example;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Notified by email");
    }
}
