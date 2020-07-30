/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmdlineargs;

/**
 *
 * @author steph
 */
public class CmdLineArgs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Number of args: " + args.length);
        System.out.println("You typed this as the first argument: " + args[0]);
        System.out.println("You typed this as the second argument: " + args[1]);
    }
}
