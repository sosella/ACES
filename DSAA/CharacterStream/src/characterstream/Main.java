/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstream;

import java.io.*;

/**
 *
 * @author steph
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("input.txt");
            out = new FileWriter("output.txt");
            int ch;
            while ((ch = in.read()) != -1) {
                out.write(ch);
            }
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        // The finally block always gets executed
        finally {
            if (in != null)
            {
                in.close();
            }
            if (out != null)
            {
                out.close();
            }
        }
    }
}
