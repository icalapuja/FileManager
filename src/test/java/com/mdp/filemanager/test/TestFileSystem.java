package com.mdp.filemanager.test;

import com.mdp.filemanager.FileSystem;
import org.junit.Assert;
import org.junit.Test;

public class TestFileSystem {
    private String fileNameSource = "d:/local/data.txt";
    private String fileNameDest = "d:/local/data2.txt";
    private String fileNameDest2 = "d:/local/data3.txt";
    private String pathFiles = "d:/local/";
    private FileSystem fs = new FileSystem();

    public TestFileSystem() {
    }

    @Test
    public void cp() throws Exception {
        Assert.assertEquals("test cp", true, fs.cp(this.fileNameSource, this.fileNameDest));
    }

    @Test
    public void mv() throws Exception {
        Assert.assertEquals("test mv", true, fs.mv(this.fileNameDest, this.fileNameDest2));
    }
    
    @Test
    public void rm() throws Exception {
        Assert.assertEquals("test rm", true, fs.rm(this.fileNameDest2));
    }
    
    @Test
    public void ls() throws Exception {
        Assert.assertTrue("No hay archivos",fs.ls(pathFiles).length > 0);
    }

}
