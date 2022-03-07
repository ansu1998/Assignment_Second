package com.company;
import java.io.File;

class Program1 {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\DEll\\Downloads");
        String[] files = file.list();
        for  (String string : files) {
            System.out.println(string);
        }
    }
}
