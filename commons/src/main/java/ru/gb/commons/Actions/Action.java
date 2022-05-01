package ru.gb.commons.Actions;

import ru.gb.commons.Commands;
import ru.gb.commons.Message;


public class Action implements Message {

    private final String filePath;
    private Commands command;

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