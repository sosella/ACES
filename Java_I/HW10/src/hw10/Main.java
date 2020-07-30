/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10;

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
        if (args.length != 2) {
            System.out.println("Need exactly 2 arguments");
            return;
        }
        try {
            FileReader in = new FileReader(args[0]);
            FileWriter out = new FileWriter(args[1]);
            
            int ch;
            while ((ch = in.read()) != -1) {
                out.write(ch);
            }
            
            in.close();
            out.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
