package org.example.serverside;


public interface AuthenticationProvider {
    String authByLoginAndPassword(String userName, String password);
    void createDB();
}