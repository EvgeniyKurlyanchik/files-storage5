package ru.gb.commons.Actions;

import java.util.List;
import ru.gb.commons.Commands;
import ru.gb.commons.Message;

public class FileList implements Message {

    private List<String> fileList;
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

