package com.epam.file.exceptions;

import java.io.IOException;

public class MyReaderException extends IOException {
    public MyReaderException(String message) {
        super(message);
    }
}
