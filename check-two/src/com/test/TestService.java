package com.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

public class TestService {

    private Logger LOGGER = Logger.getLogger("com.test.TestService");

    private String text;

    public TestService(String text) {
        this.text = text;
    }

    public void printf() {
        try (FileOutputStream fileOutputStream = new FileOutputStream(File.createTempFile("check", ".txt"))) {
            fileOutputStream.write(text.getBytes());
            System.out.printf("Successfully written to file");
        } catch (IOException e) {
            LOGGER.info(e.getMessage());
        }
    }
}
