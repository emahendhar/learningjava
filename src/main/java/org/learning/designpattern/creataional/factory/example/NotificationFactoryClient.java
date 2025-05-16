package org.learning.designpattern.creataional.factory.example;

public class NotificationFactoryClient {
    public static void main(String[] args) {

        NotificationFactory enf = new EmailNotificationFactory();
        Notification emn = enf.createNotification();
        emn.notifyUser();
    }
}
