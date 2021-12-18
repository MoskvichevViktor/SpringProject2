package ru.gb.mall.inventory.exception;

import lombok.Data;

import java.util.*;

@Data
public class MarketError {
    private int status;
    private List<String> messages;


    public MarketError(int status, String... messages) {
        this.status = status;
        this.messages = new ArrayList<>(Arrays.asList(messages));

    }

    public MarketError(int status, Collection<String> messages) {
        this.status = status;
        this.messages = new ArrayList<>(messages);

    }
}