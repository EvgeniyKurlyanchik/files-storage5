package org.example.serverside.authentication;

import org.example.exchangeCommon.Actions.Authentication;

public interface DbProvider {
    Authentication userAuthentication(String login, String password);
    Authentication userRegistration(String login, String password);
    Authentication getUserRootFolderByLogin(String login);
    void disconnect();
}