package com.mdp.filemanager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileSystem {

    private boolean exists(String fileName) throws Exception {
        if (!(new File(fileName).exists())) {
            throw new Exception("No existe el archivo [" + fileName.trim() + "]");
        }
        return true;
    }

    public boolean mv(String sourceFile, String destFile) throws Exception {
        if (cp(sourceFile, destFile)) {
            rm(sourceFile);
        } else {
            throw new Exception("Archivo no pudo ser movido.");
        }

        return true;
    }

    public boolean cp(String pathNameSource, String pathNameDest) throws Exception {
        if (exists(pathNameSource)) {
            InputStream is = new FileInputStream(new File(pathNameSource));
            OutputStream os = new FileOutputStream(new File(pathNameDest));

            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        }
        return true;
    }

    public boolean rm(String pathName) throws Exception {
        if (exists(pathName)) {
            File file = new File(pathName);
            file.delete();
        }
        return true;
    }

    public String[] ls(String path) throws Exception {
        File folder = new File(path);
        String[] listFiles = folder.list();
        return listFiles;
    }

}
