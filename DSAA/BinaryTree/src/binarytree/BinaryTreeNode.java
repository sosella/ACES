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
public class BinaryTreeNode
{
    private final int data;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    protected BinaryTreeNode(int _data)
    {
        data = _data;
        left = null;
        right = null;
    }

    public int getData()
    {
        return data;
    }

    @Override
    public String toString()
    {
        return Integer.toString(data);
    }

    protected void insert(int _data) throws Exception
    {
        if (_data == data)
        {
            throw new Exception(data + " is already in the tree.");
        }
        if (_data < data) // go left
        {
            if (left == null)
            {
                left = new BinaryTreeNode(_data);
            }
            else
            {
                left.insert(_data);
            }
        }
        else // > go right
        {
            if (right == null)
            {
                right = new BinaryTreeNode(_data);
            }
            else
            {
                right.insert(_data);
            }
        }
    }

    protected void print(BinaryTree.TraversalMode mode)
    {
        switch (mode)
        {
            case INORDER:   // Left, Parent, Right
                if (left != null)
                {
                    left.print(mode);
                }
                System.out.println(toString());
                if (right != null)
                {
                    right.print(mode);
                }
                break;
                
            case PREORDER:  // Parent, Left, Right
                System.out.println(toString());
                if (left != null)
                {
                    left.print(mode);
                }
                if (right != null)
                {
                    right.print(mode);
                }
                break;

            case POSTORDER: // Left, Right, Parent
                if (left != null)
                {
                    left.print(mode);
                }
                if (right != null)
                {
                    right.print(mode);
                }
                System.out.println(toString());
                break;
                
            case LEVELORDER:
                if (left != null)
                {
                    System.out.println(left);                    
                }
                if (right != null)
                {
                    System.out.println(right);                    
                }
                if (left != null)
                {
                    left.print(mode);
                }
                if (right != null)
                {
                    right.print(mode);
                }
                break;
                
            default:
                break;
        }
    }

    protected BinaryTreeNode find(int _data)
    {
        if (_data == data)
        {
            return this;
        }
        if (_data < data) // go left
        {
            if (left != null)
            {
                BinaryTreeNode node = left.find(_data);
                if (node != null)
                {
                    return node;
                }
            }
        }
        else // > go right
        {
            if (right != null)
            {
                BinaryTreeNode node = right.find(_data);
                if (node != null)
                {
                    return node;
                }
            }
        }
        return null;
    }

    protected void remove(int _data)
    {
        if (_data < data) // go left
        {
            if (left != null)
            {
                if (left.getData() == _data)
                {
                    left = null;
                }
                else
                {
                    left.remove(_data);
                }
            }
        }
        else // > go right
        {
            if (right != null)
            {
                if (right.getData() == _data)
                {
                    right = null;
                }
                else
                {
                    right.remove(_data);
                }
            }
        }
    }
}
