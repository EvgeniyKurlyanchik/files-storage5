package ru.gb.server.authentication;


import ru.gb.commons.Actions.Authentication;

public interface DbProvider {
    Authentication userAuthentication(String login, String password);
    Authentication userRegistration(String login, String password);
    Authentication getUserRootFolderByLogin(String login);
    void disconnect();
}