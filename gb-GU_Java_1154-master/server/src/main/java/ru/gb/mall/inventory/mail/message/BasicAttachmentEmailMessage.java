package ru.gb.mall.inventory.mail.message;

public record BasicAttachmentEmailMessage(
        String from,
        String to,
        String subject,
        String text,
        EmailAttachment attachment) implements AttachmentMailMessage {
}
