package org.example.exchangeCommon.File;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.exchangeCommon.Commands;
import org.example.exchangeCommon.Message;

@Getter
@RequiredArgsConstructor
public class PartFile implements Message {

    private final byte[] message;
    private final long startPos;
    private final long endPos;
    private final boolean isLast;
    private final String filename;
    @Override
    public Commands getType() {
        return Commands.PART_FILE;
    }

}