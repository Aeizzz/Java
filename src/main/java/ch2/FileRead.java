package ch2;

import java.io.*;

public class FileRead {
    public static String readText(String filepath) {
        String re = null;
        FileInputStream fis = null;
        File file = new File(filepath);
        int filelen = (int) file.length();
        byte[] content = new byte[filelen];


        try {
            fis = new FileInputStream(file);
            fis.read(content);
            re = new String(content);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return re;
    }


    public static String readText2(String filepath) {
        BufferedReader bufferedReader = null;
        StringBuffer sb = null;
        String line = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(filepath));
            sb = new StringBuffer();
            line = null;
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line).append('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(readText2("e:/aaa.txt"));
    }


}
