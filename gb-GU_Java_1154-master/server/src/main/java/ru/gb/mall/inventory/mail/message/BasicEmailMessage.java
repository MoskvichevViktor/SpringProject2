package ru.gb.mall.inventory.mail.message;

public record BasicEmailMessage(String from, String to, String subject, String text) implements EmailMessage{
}
