package com.newgen.app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args) {
        // Replace "path/to/your/output/file.txt" with the actual path of your text file
        String filePath = "path/to/your/output/file.txt";

        // Data to be appended to the file
        String newData = "This is new data to be appended.";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            // Append data to the file
            writer.write(newData);
            writer.newLine(); // Add a new line for clarity or separate entries

            System.out.println("Data appended to the file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
