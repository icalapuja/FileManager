package com.mdp.filemanager.test;

import com.mdp.filemanager.FileSFTP;
import org.junit.Test;

public class TestFileSFTP {
    FileSFTP ftp = null;
    private String host = "192.168.80.20";
    private int port = 22;
    private String user = "ivan";
    private String password = "ivan";
    
    private String fileNameSource = "d:/local/data.txt";
    private String fileNameDest = "/home/ivan/Documentos/data.txt";
    private String pathFiles = "/home/ivan/Documentos/";
    
    
    public TestFileSFTP() {
        ftp = new FileSFTP(this.host, this.port, this.user, this.password);
    }
    
    @Test
    public void connect() throws Exception{
        this.ftp.connect();
        this.ftp.disconect();
    }
    
    @Test
    public void put() throws Exception{
        this.ftp.connect();
        this.ftp.put(this.fileNameSource, this.fileNameDest);
        this.ftp.disconect();
    }
    
    @Test
    public void get() throws Exception{
        this.ftp.connect();
        this.ftp.get(this.fileNameDest, this.fileNameSource);
        this.ftp.disconect();
    }
    
    @Test
    public void ls() throws Exception{
        this.ftp.connect();
        String[] lista = this.ftp.ls(this.pathFiles);
        this.ftp.disconect();
    }

}
