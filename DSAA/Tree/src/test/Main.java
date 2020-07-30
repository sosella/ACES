/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import tree.*;

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
        try
        {
            Tree tree = new Tree(1);
            TreeNode root = tree.getRoot();
            
            TreeNode child2 = root.addChild(2);
            TreeNode child4 = child2.addChild(4);
            TreeNode child5 = child2.addChild(5);

            TreeNode child3 = root.addChild(3);

            tree.print(Tree.TraversalMode.PREORDER);
            tree.print(Tree.TraversalMode.POSTORDER);
            tree.print(Tree.TraversalMode.LEVELORDER);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    private static void Test2()
    {
        try
        {
            Tree tree = new Tree(1);
            TreeNode root = tree.getRoot();
            
            TreeNode child2 = root.addChild(2);
            TreeNode child4 = child2.addChild(4);
            TreeNode child5 = child2.addChild(5);

            TreeNode child3 = root.addChild(3);

            tree.remove(5);
            
            tree.print(Tree.TraversalMode.LEVELORDER);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    private static void Test3()
    {
        try
        {
            Tree tree = new Tree(1);
            TreeNode root = tree.getRoot();
            
            TreeNode child2 = root.addChild(2);
            TreeNode child4 = child2.addChild(4);
            TreeNode child5 = child2.addChild(5);

            TreeNode child3 = root.addChild(3);

            TreeNode node = tree.find(5, Tree.SearchMode.DEPTHFIRST);
            System.out.println((node == null) ? "Not found" : ("Found: " + node.getData()));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
