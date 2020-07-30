/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5;

import java.util.*;

/*
    1) Open a command / terminal window
    2) cd to the project directory (i.e., the one with src, build.xml, etc.)
    3) Build the project in NetBeans
    4) java -cp .\build\classes hw5.Main
*/

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<Integer,Account> accounts = new HashMap<>();
        
        while(true)
        {
            int selection = GetMenuSelection();
            switch (selection) {
                case 0:
                    return;
                case 1:
                    CreateAccount(accounts);
                    break;
                case 2:
                    PrintAccount(accounts);
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }    

    private static int GetMenuSelection()
    {
        System.out.println("Menu:");
        System.out.println();
        System.out.println("\tExit: 0");
        System.out.println("\tCreate Account: 1");
        System.out.println("\tPrint Account: 2");
        System.out.println();
        System.out.print("Enter Selection: ");
        Scanner input = new Scanner(System.in);
        String selection = input.next();
        return Integer.parseInt(selection);
    }

    private static void CreateAccount(HashMap<Integer, Account> accounts)
    {
        // 1) Get First Name and Last Name from User
        // 2) create Account object and using first and last names
        // 3) Put the account in the accounts map
    }

    private static void PrintAccount(HashMap<Integer, Account> accounts)
    {
    }
}
