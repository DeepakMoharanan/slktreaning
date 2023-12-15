package org.example.filewriter;

import java.io.FileReader;

public class B {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("D:\\Deepak.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}


