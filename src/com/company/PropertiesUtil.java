package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
    public static void main(String[] args) throws IOException {
        // write
        write();

        // read
        read();
    }

    private static void write() throws IOException {
        FileOutputStream fos = new FileOutputStream("my.properties");
        Properties properties = new Properties();
        properties.setProperty("name", "zhangsan");
        properties.setProperty("age", "20");
        properties.setProperty("address", "beijing");
        properties.store(fos, "my properties");
        properties.replace("address", "dalian");
        properties.store(fos, "my properties");
        fos.close();
    }

    private static void read() throws IOException {
        FileInputStream fis = new FileInputStream("my.properties");
        Properties properties = new Properties();
        properties.load(fis);
        System.out.println(properties.getProperty("name"));
        System.out.println(properties.getProperty("age"));
        System.out.println(properties.getProperty("address"));
        fis.close();
    }
}
