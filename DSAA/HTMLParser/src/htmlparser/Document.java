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
public class Document
{
    // Fields
    private Element root;
    
    // Properties
    
    // Constructors
    public Document()
    {
        root = null;
    }

    // Methods
    public void parse(String filePath) throws IOException
    {
        try (FileReader in = new FileReader(filePath)) {
            int ch;
            while ((ch = in.read()) != -1) {
                if (Character.isWhitespace(ch)) {
                    // Do Nothing - keep going
                } else if (ch == '<') {
                    root = new Element();
                    root.parse(in);
                    break;
                } else {
                    throw new IOException("Invalid character: " + ch);
                }
            }
        }
        catch (IOException ex)
        {
            throw ex;
        }        
    }
}
