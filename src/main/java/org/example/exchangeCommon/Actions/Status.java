package org.example.exchangeCommon.Actions;

import lombok.Getter;
import org.example.exchangeCommon.Commands;
import org.example.exchangeCommon.Message;

@Getter
public class Status implements Message {
    private final String message;
    private final Commands command;

    public Status(String message) {
        this.message = message;
        this.command = Commands.STATUS;
    }

    @Override
    public Object getMessage() {
        return message;
    }

    @Override
    public Commands getType() {
        return command;
    }

}
