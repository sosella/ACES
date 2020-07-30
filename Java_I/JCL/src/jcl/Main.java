/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcl;

import java.io.*;
import java.util.*;

/**
 *
 * @author steph
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RollDice(10);
        GeneratePoints(100);
    }

    private static void RollDice(int times) {
        Date now = new Date();
        System.out.println("Seed = " + now.getTime());
        Random rand = new Random(now.getTime());    // Create random number generator with seed
        for (int i = 0; i < times; i++) {
            int randomNbr = rand.nextInt();
            int absRandomNbr = Math.abs(randomNbr);
            int side = absRandomNbr % 6;    // get value between 0 and 5
            System.out.println(side);
        }
    }

    private static void GeneratePoints(int nbrPoints) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("points.csv"));
            for (int i = 0; i < nbrPoints; i++) {
                double x = Math.random();   // random number between 0.0 and 1.0
                double y = Math.random();
                out.write(Double.toString(x) + ", " + Double.toString(y));
                out.newLine();
            }
            out.close();
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
