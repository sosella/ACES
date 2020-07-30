/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author steph
 */
public class Tree
{
    public enum TraversalMode {
        PREORDER, POSTORDER, LEVELORDER
    }
    public enum SearchMode {
        DEPTHFIRST, BREADTHFIRST
    }
    
    private TreeNode root;

    public Tree()
    {
        root = null;
    }

    public Tree(int _data)
    {
        root = new TreeNode(_data);
    }

    public TreeNode getRoot()
    {
        return root;
    }
    
    public TreeNode addRoot(int _data) throws Exception
    {
        if (root != null)
        {
            throw new Exception("Tree already has a root node");
        }
        root = new TreeNode(_data);
        return root;
    }

    public void remove (int _data)
    {
        if (root == null) {
            return;
        }
        if (root.getData() == _data) {
            root = null;
        }
        else {
            root.remove(_data);
        }
    }

    public TreeNode find (int _data, Tree.SearchMode mode)
    {
        return (root == null) ? null : root.find(_data, mode);
    }

    public void print(TraversalMode mode)
    {
        System.out.println("Print in " + mode + " mode:");
        if (root != null)
        {
            System.out.println(this);                    
            root.print(mode);
        }
    }
}
