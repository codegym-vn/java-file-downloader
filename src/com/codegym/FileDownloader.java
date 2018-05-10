package com.codegym;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader {
    private static String USER_AGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.139 Safari/537.36";

    public void download(String urlString, String location) throws IOException {
        URL url = new URL(urlString);
        URLConnection urlConnection = url.openConnection();
        urlConnection.addRequestProperty("User-Agent", USER_AGENT);
        BufferedInputStream bis = new BufferedInputStream(urlConnection.getInputStream());
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(location));
        int length;
        byte[] buffer = new byte[1024];
        while ((length = bis.read(buffer)) > 0){
            bos.write(buffer, 0, length);
        }
        bis.close();
        bos.close();
    }
}
