package org.example.exchangeCommon.Actions;


import org.example.exchangeCommon.Commands;
import org.example.exchangeCommon.Message;

public class Action implements Message {

    private final String filePath;
    private final Commands command;

    public Action(String filePath, Commands command) {
        this.filePath = filePath;
        this.command = command;
    }

    @Override
    public Commands getType() {
        return command;
    }

    @Override
    public Object getMessage() {
        return filePath;
    }
}