/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5;

/**
 *
 * @author steph
 */
public class HW5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Need to enter 2 arguments.");
            return;
        }
        int num0 = Integer.parseInt(args[0]);
        int num1 = Integer.parseInt(args[1]);
        if (num0 > num1)
        {
            System.out.println(num0 + " is greater than " + num1);
        }
        else if (num0 == num1)
        {
            System.out.println(num0 + " is equal to " + num1);
        }
        else // must be less than
        {
            System.out.println(num0 + " is less than " + num1);
        }
    }
}
