package ch2;



import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandler {

    final static Logger log = Logger.getLogger(ExceptionHandler.class);
    /**
     *
     * 异常处理
     * @param args
     */
    public static void main(String[] args) {
        File f = new File("D:\\a.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            log.error(f.getAbsolutePath()+" can't find ",e);
        }


    }
}
