package ru.gb.commons.File;

import lombok.RequiredArgsConstructor;
import ru.gb.commons.Commands;
import ru.gb.commons.Message;


@RequiredArgsConstructor
public class CloudFile implements Message {

    private final GenericFile genericFile;
    private Commands command;



    public CloudFile(GenericFile genericFile, Commands command) {
        this.genericFile = genericFile;
        this.command = command;
    }

    @Override
    public Commands getType() {
        return command;
    }

    @Override
    public Object getMessage() {
        return genericFile;
    }
}