/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3_1;

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
            System.out.println("Invalid number of arguments.");
            return;
        }
        long num1 = 0;
        try {
            num1 = Long.parseLong(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid argument: " + args[0]);
        }
        long num2 = 0;
        try {
            num2 = Long.parseLong(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid argument: " + args[1]);
        }
        long result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}
