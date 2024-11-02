package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterToText {
    private static final char arrowIn = '↳';
    private static final char arrowOut = '↲';
    private static BufferedWriter writer;
    private static File file;

    public FileWriterToText() throws IOException {
        file = new File("testing.txt");
        writer = new BufferedWriter(new FileWriter(file));
    }

    public static void printArrow(int insideLoop, boolean arrowDirection) throws IOException {
        printSpaces(insideLoop);

        if(arrowDirection){
            writer.write(arrowIn);
        }
        else {
            writer.write(arrowOut);
        }
        writer.newLine();
        writer.flush();
    }

    private static void printSpaces(int insideLoop) throws IOException {
        writer.write(" ".repeat(insideLoop));
    }

    public static void printDirectory(int insideLoop, File file) throws IOException {
        printSpaces(insideLoop);
        writer.write("Directory: " + file.getName() + "\n");
        writer.flush();
    }

    public static void printFile(int insideLoop, File file) throws IOException {
        printSpaces(insideLoop);
        writer.write("File: " + file.getName() + "\n");
        writer.flush();
    }

    public static void printNoFiles(int insideLoop) throws IOException {
        printSpaces(insideLoop);
        writer.write("No more files found\n");
        writer.flush();
    }
}