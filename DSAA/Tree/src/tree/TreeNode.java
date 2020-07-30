/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import java.util.*;
        
/**
 *
 * @author steph
 */
public class TreeNode {
    private final int data;
    private final LinkedList<TreeNode> children;

    protected TreeNode(int _data)
    {
        data = _data;
        children = new LinkedList<>();
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
    
    public TreeNode addChild(int _data)
    {
        TreeNode childNode = new TreeNode(_data);
        children.add(childNode);
        return childNode;
    }

    protected TreeNode find(int _data, Tree.SearchMode mode)
    {
        if (data == _data)
        {
            return this;
        }
        switch (mode)
        {
            case DEPTHFIRST:
                for (TreeNode childNode : children) {
                    TreeNode node = childNode.find(_data, mode);
                    if (node != null)
                    {
                        return node;
                    }
                }
                break;
            case BREADTHFIRST:
                for (TreeNode childNode : children) {
                    if (childNode.getData() == _data) {
                        return childNode;
                    }
                }
                for (TreeNode childNode : children) {
                    TreeNode node = childNode.find(_data, mode);
                    if (node != null)
                    {
                        return node;
                    }
                }
                break;
            default:
                break;
        }
        return null;
    }

    protected void remove (int _data)
    {
        for (TreeNode childNode : children) {
            if (childNode.getData() == _data)
            {
                children.remove(childNode);
                break;
            }
            childNode.remove(_data);
        }
    }
    
    protected void print(Tree.TraversalMode mode)
    {
        switch(mode)
        {
            // Parent - Children from Left to Right
            case PREORDER:
                System.out.println(toString());
                children.forEach((childNode) -> {
                    childNode.print(mode);
                });
                break;
                
            case POSTORDER:
                children.forEach((childNode) -> {
                    childNode.print(mode);
                });
                System.out.println(toString());
                break;
                
            case LEVELORDER:
                children.forEach((childNode) -> {
                    System.out.println(childNode);
                });
                children.forEach((childNode) -> {
                    childNode.print(mode);
                });
                break;

            default:
                break;
        }
    }
}
