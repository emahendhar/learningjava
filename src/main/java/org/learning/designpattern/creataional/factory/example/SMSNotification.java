package org.learning.designpattern.creataional.factory.example;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("SMS notifiction");
    }
}
