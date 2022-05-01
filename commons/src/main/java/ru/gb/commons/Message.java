package ru.gb.commons;
import java.io.Serializable;

public interface Message extends Serializable {
    public Commands getType();
    public Object getMessage();

}