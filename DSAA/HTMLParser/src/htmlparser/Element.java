/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htmlparser;

import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author steph
 */
public class Element
{
    // Fields
    private String name;
    private final LinkedList<Attribute> attributes;
    private String content;
    private final LinkedList<Element> subelements;
    
    // Properties
    
    // Constructors
    public Element()
    {
        name = null;
        attributes = new LinkedList<>();
        content = null;
        subelements = new LinkedList<>();
    }
    
    // Methods

    // Called when a start element's '<' character is read
    public void parse(FileReader in) throws IOException
    {
        int ch = parseElementName(in);
        if (name.length() == 0) {
            throw new IOException("The element name cannot be empty.");
        }
        if (elementClosed(in, ch)) { return; }
        ch = parseAttributes(in);
        if (elementClosed(in, ch)) { return; }
        ch = parseContent(in);
        if (elementClosed(in, ch)) { return; }
    }
    
    private int parseElementName(FileReader in) throws IOException
    {
        name = "";
        int ch;
        while ((ch = in.read()) != -1) {
            if (validElementNameCharacter(ch)) {
                name += ch;
            } else {
                return ch;
            }
        }
        throw new IOException("End of file reached prematurely");
    }

    private int parseAttributes(FileReader in) throws IOException
    {
        int ch;
        while ((ch = in.read()) != -1) {
            if (Character.isWhitespace(ch)) {            
                // Do Nothing - keep going
            }
            else if (validElementNameCharacter(ch)) {
                parseAttribute(in, ch);
            }
            else if (ch == '>') {
                return ch;
            } else if (ch == '/') {
                return ch;
            } else {
                throw new IOException("Invalid character: " + ch);
            }
        }
        throw new IOException("End of file reached prematurely");
    }

    private int parseContent(FileReader in) throws IOException
    {
        content = "";
        int ch;
        while ((ch = in.read()) != -1) {
            if (ch == '<') {
                ch = in.read();
                if (ch == '/') {
                    // Verify end element name is the same
                }
                else {
                    Element subelement = new Element();
                    subelement.parse(in);
                    subelements.add(subelement);
                }
            }
            else {
                content += ch;
            }
        }
        throw new IOException("End of file reached prematurely");
    }

    private void parseAttribute(FileReader in, int ch) {
    }

    private boolean elementClosed(FileReader in, int ch) throws IOException
    {
        if (ch == '/') {
            ch = in.read();
            if (ch == '>') {
                return true;
            }
            else {
                throw new IOException("Invalid character: " + ch);                    
            }
        }
        else {
            return false;
        }
    }

    private boolean validElementNameCharacter(int ch) {
        return Character.isLetterOrDigit(ch) || (ch == '_');
    }
}
