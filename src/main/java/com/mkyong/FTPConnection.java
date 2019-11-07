package com.mkyong;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

//@Service
public class FTPConnection {

    @Value("${host}")
    private String host;
    @Value("${port}")
    private int port;
    @Value("${url}")
    private String  url;
    @Value("${username}")
    private  String username;
    @Value("${pwd}")
    private String pwd;
    @Value("${ftpdir}")
    private String ftpdir;


    private FTPClient ftpClient = null;

    public FTPConnection(){
        try{
            ftpClient = new FTPClient();
            ftpClient.connect(host, port);
            ftpClient.login(username, pwd);
            ftpClient.enterLocalPassiveMode();
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (ftpClient.isConnected()) {
                    ftpClient.logout();
                    ftpClient.disconnect();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
    public void upload(InputStream is){
        try {
            ftpClient.storeFile(ftpdir, is);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
