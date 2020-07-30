/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import binarytree.*;

/**
 *
 * @author steph
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Test1();
        Test2();
        Test3();
    }    

    private static void Test1()
    {
        System.out.println("Test 1");
        try
        {
            BinaryTree tree = new BinaryTree();

            tree.insert(27);
            tree.insert(14);
            tree.insert(19);
            tree.insert(35);
            tree.insert(31);
            tree.insert(10);
            tree.insert(42);

            tree.print(BinaryTree.TraversalMode.INORDER);
            tree.print(BinaryTree.TraversalMode.PREORDER);
            tree.print(BinaryTree.TraversalMode.POSTORDER);
            tree.print(BinaryTree.TraversalMode.LEVELORDER);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    private static void Test2()
    {
        System.out.println("Test 2");
        try
        {
            BinaryTree tree = new BinaryTree();

            tree.insert(27);
            tree.insert(14);
            tree.insert(19);
            tree.insert(35);
            tree.insert(31);
            tree.insert(10);
            tree.insert(42);

            BinaryTreeNode node31 = tree.find(31);
            System.out.println(Integer.toString(31) + " " + ((node31 == null) ? "not found" : "found"));

            BinaryTreeNode node36 = tree.find(36);
            System.out.println(Integer.toString(36) + " " + ((node36 == null) ? "not found" : "found"));

            BinaryTreeNode node19 = tree.find(19);
            System.out.println(Integer.toString(19) + " " + ((node19 == null) ? "not found" : "found"));

            BinaryTreeNode node15 = tree.find(15);
            System.out.println(Integer.toString(15) + " " + ((node15 == null) ? "not found" : "found"));
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }    

    private static void Test3()
    {
        System.out.println("Test 3");
        try
        {
            BinaryTree tree = new BinaryTree();

            tree.insert(27);
            tree.insert(14);
            tree.insert(19);
            tree.insert(35);
            tree.insert(31);
            tree.insert(10);
            tree.insert(42);

            tree.print(BinaryTree.TraversalMode.LEVELORDER);

            System.out.println("Removing " + Integer.toString(19));
            tree.remove(19);
            
            System.out.println("Removing " + Integer.toString(15));
            tree.remove(15);
            
            System.out.println("Removing " + Integer.toString(35));
            tree.remove(35);
            
            tree.print(BinaryTree.TraversalMode.LEVELORDER);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }    
}
