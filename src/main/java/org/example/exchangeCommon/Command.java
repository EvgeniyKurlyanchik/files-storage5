package org.example.exchangeCommon;

public class Command implements Message{
    private final String filePath;
    private final String command;

    public Command(String filePath, String command) {
        this.filePath = filePath;
        this.command = command;
    }

    @Override
    public String getType() {
        return command;
    }

    @Override
    public Object getMessage() {
        return filePath;
    }
}