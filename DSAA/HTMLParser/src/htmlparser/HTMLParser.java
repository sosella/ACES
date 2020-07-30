/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htmlparser;

import java.io.*;

/**
 *
 * @author steph
 */
public class HTMLParser
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test1();
    }

    private static void Test1() {
        Document parser = new Document();
        try {
            parser.parse("test1.html");
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
