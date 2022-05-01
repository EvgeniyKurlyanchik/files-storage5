package org.example.exchangeCommon.Actions;

import java.util.List;
import org.example.exchangeCommon.Commands;
import org.example.exchangeCommon.Message;

public class FileList implements Message {

    private final List<String> fileList;
    private final Commands command;

    public FileList(List<String> fileList) {
        this.fileList = fileList;
        this.command = Commands.FILE_LIST;
    }

    @Override
    public Commands getType() {
        return command;
    }

    @Override
    public Object getMessage() {
        return fileList;
    }
}

