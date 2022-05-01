package ru.gb.commons.Actions;

import lombok.Data;
import ru.gb.commons.Commands;
import ru.gb.commons.Message;

@Data
public class Authentication implements Message {

    private String login;
    private String password;
    private String rootDirectory;
    private Commands command;
    private String fileName;

    public Authentication() {}

    public Authentication(String login, String password, String directory, Commands command) {
        this.login = login;
        this.password = password;
        this.rootDirectory = directory;
        this.command = command;
    }

    @Override
    public Commands getType() {
        return command;
    }

    @Override
    public Object getMessage() {
        return this;
    }
}