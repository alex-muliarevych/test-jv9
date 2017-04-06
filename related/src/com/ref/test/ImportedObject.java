package com.ref.test;

public class ImportedObject {
    private String value;

    public ImportedObject(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
