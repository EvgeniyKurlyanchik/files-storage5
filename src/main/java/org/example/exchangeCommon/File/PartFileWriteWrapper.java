package org.example.exchangeCommon.File;

import java.nio.file.Path;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PartFileWriteWrapper {
    private final Path path;
    private final byte[] data;

}
