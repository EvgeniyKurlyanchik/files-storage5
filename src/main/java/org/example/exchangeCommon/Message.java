package org.example.exchangeCommon;
import java.io.Serializable;

public interface Message extends Serializable {
    public String getType();
    public Object getMessage();

}