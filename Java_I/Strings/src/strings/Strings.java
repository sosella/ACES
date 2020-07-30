/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author steph
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Characters
        char c1 = 'a';
        System.out.println("c1=" + c1);
        
        // Strings: characters strung together
        String greeting = "Hello, world!";  // from String literal
        System.out.println("greeting=" + greeting);

        char[] ca = {'a', 'b', 'c'};
        String castr = new String(ca);  // from char array
        System.out.println("castr=" + castr);

        // Strings are immutable - once created created, they can't be change
        String s1 = "Hello";
        System.out.println("s1=" + s1);
        String s2 = s1.replace('e', 'a');   // s1 is not changed, a new String is created and assigned to s2
        System.out.println("s1=" + s1);
        System.out.println("s2=" + s2);

        // Concatenation
        String s3 = s1 + s2;
        System.out.println("s3=" + s3);

        // Formatting
        // %s gets replaced with World!
        // %c gets replaced with a
        // %d gets replaced with 10
        // %f gets replaced with 1.23
        //                        Format String w/ Format Codes   Arguments
        String s4 = String.format("Hello, %s - %c - %d - %f %% ", "World!", 'a', 10, 1.23);
        System.out.println("s4=" + s4);

        // Comparing - lexigraphic (compares letters)
        String s5 = "Hello";
        String s6 = "There";
        String s7 = "Hello";
        System.out.println(s5.equals(s6));  // false
        System.out.println(s5.equals(s7));  // true
        System.out.println(s6.equals(s7));  // false

        // Locating
        System.out.println(s5.indexOf('e'));  // 1 is the index of the character 'e' zero-based
        System.out.println(s5.indexOf('o'));  // 4 is the index of the character 'o' zero-based
    }    
}
