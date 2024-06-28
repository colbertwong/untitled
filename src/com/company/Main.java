package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        String a = null;
        String str = (a==null)? null : (String) a;

        System.out.println(str);
//        System.out.println(("1".equals(null)));
    }
}
