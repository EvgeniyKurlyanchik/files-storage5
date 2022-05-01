package org.example.exchangeCommon;
import java.io.Serializable;
import org.example.exchangeCommon.Commands;

public interface Message extends Serializable {
    public Commands getType();
    public Object getMessage();

}