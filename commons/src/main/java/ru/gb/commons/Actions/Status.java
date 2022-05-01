package ru.gb.commons.Actions;

import lombok.Getter;
import ru.gb.commons.Commands;
import ru.gb.commons.Message;

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
