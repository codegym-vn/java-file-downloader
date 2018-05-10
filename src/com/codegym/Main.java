package com.codegym;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FileDownloader fileDownloader = new FileDownloader();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter URL string: ");
        String urlString = scanner.nextLine();//For example: "https://codegym.vn/wp-content/uploads/2017/04/CodeGym-Logo.png"
        System.out.println("Enter file path: ");
        String location = scanner.nextLine();//For example: "/Users/nhat/Desktop/logo.png"

        try {
            fileDownloader.download(urlString, location);
            System.out.println("Download completed");
        } catch (IOException e) {
            System.out.println("Error downloading file: " + e.getMessage());
        }
    }
}
