package ru.gb.commons;
import java.io.Serializable;

public interface Message extends Serializable {
    Commands getType();
    Object getMessage();

}