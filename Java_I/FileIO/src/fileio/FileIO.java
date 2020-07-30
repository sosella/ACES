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
public class FileIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ByteStreams();
        CharacterStreams();
        BufferedStreams();
    }

    private static void ByteStreams() {
        try {
            FileOutputStream out = new FileOutputStream("data.dat");
            for (int i = 0; i < 100; i++) {
                out.write(i);
            }
            out.close();

            FileInputStream in = new FileInputStream("data.dat");
            int b;
            while ((b = in.read()) != -1) {
                System.out.println(b);
            }
            in.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void CharacterStreams() {
        try {
            FileWriter out = new FileWriter("data.txt");
            out.write("Mary had a little lamb.");
            out.close();
            
            FileReader in = new FileReader("data.txt");
            int ch;
            while ((ch = in.read()) != -1) {
                System.out.println(ch + " - " + (char)ch);
            }
            in.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void BufferedStreams() {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("buf.txt"));
            out.write("Mary had a little lamb.");
            out.newLine();
            out.close();

            BufferedReader in = new BufferedReader(new FileReader("buf.txt"));
            String str = in.readLine();
            System.out.println(str);
            in.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
