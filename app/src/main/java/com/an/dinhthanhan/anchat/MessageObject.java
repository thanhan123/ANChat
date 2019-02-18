package com.an.dinhthanhan.anchat;

public class MessageObject {
    String messageId,
            senderId,
            text;

    public MessageObject(String messageId, String senderId, String text) {
        this.messageId = messageId;
        this.senderId = senderId;
        this.text = text;
    }

    public String getMessageId() {
        return messageId;
    }

    public String getSenderId() {
        return senderId;
    }

    public String getText() {
        return text;
    }
}
