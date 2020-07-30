/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileio;

import java.io.*;

/**
 *
 * @author steph
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ByteStreams();
        CharacterStreams();
        BufferedStreams();
        Files();
    }

    private static void ByteStreams() {
        FileOutputStream out = null;
        FileInputStream in = null;
        try {
            out = new FileOutputStream("data.dat");
            for (int b = 0; b < 10; b++) {
                out.write(b);
            }
            out.close();

            in = new FileInputStream("data.dat");
            int b;
            while ((b = in.read()) != -1) {
                System.out.println(b);
            }
            in.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if (out != null) {
                try { out.close(); } catch (IOException ex) {}
            }
            if (in != null) {
                try { in.close(); } catch (IOException ex) {}
            }
        }
    }

    private static void CharacterStreams() {
        FileWriter out = null;
        FileReader in = null;
        try {
            out = new FileWriter("data.txt");
            out.write("Mary had a little lamb.");
            out.close();

            in = new FileReader("data.txt");
            int ch;
            while ((ch = in.read()) != -1) {
                System.out.println(ch + " - " + ((char)ch));
            }
            in.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if (out != null) {
                try { out.close(); } catch (IOException ex) {}
            }
            if (in != null) {
                try { in.close(); } catch (IOException ex) {}
            }
        }
    }

    private static void BufferedStreams() {
        BufferedWriter out = null;
        BufferedReader in = null;
        try {
            out = new BufferedWriter(new FileWriter("buf.txt"));
            out.write("Mary had a little lamb.");
            out.newLine();
            out.close();

            in = new BufferedReader(new FileReader("buf.txt"));
            String str;
            while ((str = in.readLine()) != null ) {
                System.out.println(str);
            }
            in.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if (out != null) {
                try { out.close(); } catch (IOException ex) {}
            }
            if (in != null) {
                try { in.close(); } catch (IOException ex) {}
            }
        }
    }

    private static void Files() {
        printFiles("./");
        createDir("./", "mydir");
        printFiles("./");
        createDir("./mydir", "mydir2");
        printFiles("./mydir");
    }

    private static void printFiles(String rootDir) {
        File f = new File(rootDir);
        String[] fileList = f.list();
        for (String file : fileList) {
            System.out.println(file);
        }
    }

    private static void createDir(String rootDir, String dirName) {
        File f = new File(rootDir + "/" + dirName);
        f.mkdir();
    }
}
