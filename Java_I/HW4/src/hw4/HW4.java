/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;

/**
 *
 * @author steph
 */
public class HW4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] strArray = new String[args.length];
        for (int i = 0; i < args.length; i++)
        {
            strArray[i] = args[i];
        }
        for (int i = 0; i < strArray.length; i++)
        {
            System.out.println(strArray[i]);
        }
    }
}
