package org.example.exchangeCommon.Actions;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.exchangeCommon.Commands;
import org.example.exchangeCommon.Message;

@Data
@AllArgsConstructor
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