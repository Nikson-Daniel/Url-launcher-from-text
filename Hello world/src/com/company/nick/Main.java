package com.company.nick;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Formatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            Formatter demoFile = new Formatter("E:\\Demo.txt");
            demoFile.format("%s","https://en.wikipedia.org/wiki/Hello_(Adele_song)");
            demoFile.close();

            File file = new File("E:\\Demo.txt");
            Scanner scanner = new Scanner(file);

            String url = scanner.next();
            System.out.println(url);

            Desktop d = Desktop.getDesktop();
            d.browse(new URI(url));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
