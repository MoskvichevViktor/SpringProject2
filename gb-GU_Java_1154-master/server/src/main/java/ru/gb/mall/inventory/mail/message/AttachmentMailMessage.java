package ru.gb.mall.inventory.mail.message;

public interface AttachmentMailMessage extends EmailMessage{
    EmailAttachment attachment();
}
