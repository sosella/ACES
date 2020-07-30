/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author steph
 */
public class BinaryTree
{
    public enum TraversalMode {
        INORDER, PREORDER, POSTORDER, LEVELORDER
    }
    
    private BinaryTreeNode root;

    public BinaryTree()
    {
        root = null;
    }

    public void insert(int _data) throws Exception
    {
        if (root == null)
        {
            root = new BinaryTreeNode(_data);
        }
        else
        {
            root.insert(_data); // throws an exception that we are not catching
        }
    }

    public BinaryTreeNode find(int _data)
    {
        if (root == null)
        {
            return null;
        }
        return root.find(_data);
    }

    public void remove(int _data)
    {
        if (root == null)
        {
            return;
        }
        if (_data == root.getData())
        {
            root = null;
            return;
        }
        root.remove(_data);
    }

    public void print(TraversalMode mode)
    {
        System.out.println("Print in " + mode + " mode:");
        if (root != null)
        {
            System.out.println(root);
            root.print(mode);
        }
    }
}
