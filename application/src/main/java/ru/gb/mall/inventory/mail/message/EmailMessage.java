package ru.gb.mall.inventory.mail.message;

public interface EmailMessage {

        String from();
        String to();
        String subject();
        String text();

}
