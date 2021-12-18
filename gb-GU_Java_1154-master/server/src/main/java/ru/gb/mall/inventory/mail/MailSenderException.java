package ru.gb.mall.inventory.mail;

import org.springframework.mail.MailException;

public class MailSenderException extends RuntimeException{


    public MailSenderException(String message) {
        super(message);
    }

    public MailSenderException(String message, Throwable cause) {
        super(message, cause);
    }
}
