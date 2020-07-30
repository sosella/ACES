/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw7;

/**
 *
 * @author steph
 */
public class HW7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length != 2)
        {
            System.out.println("The program needs 2 arguments.");
            return;
        }
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);

        int sum = add(n, m);
        System.out.println("The sum of " + n + " and " + m + " is " + sum);
    }    

    private static int add(int n, int m)
    {
        return n + m;
    }
}
