/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw6;

/**
 *
 * @author steph
 */
public class HW6
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        {
            System.out.println("for loop");
            for (int i = 0; i < args.length; i++)
            {
                System.out.println(args[i]);
            }
        }

        {
            System.out.println("while loop");
            int i = 0;
            while (i < args.length)
            {
                System.out.println(args[i]);
                i++;
            }
        }

        {
            System.out.println("do-while loop");
            if (args.length > 0)
            {
                int i = 0;
                do
                {
                    System.out.println(args[i]);
                    i++;
                } while (i < args.length);
            }
        }
        
        System.out.println("for each");
        for (String arg : args)
        {
            System.out.println(arg);
        }
    }
}
