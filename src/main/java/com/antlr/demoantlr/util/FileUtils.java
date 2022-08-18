package com.antlr.demoantlr.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.stream.Collectors;

public class FileUtils {
    public static String readFile(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            return reader.lines().collect(Collectors.joining(System.lineSeparator()));

        } catch (Exception e) {
            System.out.println("readFile error" + e);
            return null;
        }
    }
}
