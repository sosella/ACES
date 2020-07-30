/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlist;

/**
 *
 * @author steph
 */
public class LinkedList
{
    private Node first;
    private Node last;

    public LinkedList()
    {
        first = null;
        last = null;
    }

    public Node getFirst()
    {
        return first;
    }

    public Node getLast()
    {
        return last;
    }

    public Node Append(int _data)
    {        
        Node node = new Node(_data);

        if (first == null)
        {
            first = node;            
        }
        if (last != null)
        {
            last.setNext(node);
        }
        last = node;

        return node;
    }

    public Node Prepend(int _data)
    {        
        Node node = new Node(_data);

        if (last == null)
        {
            last = node;
        }
        if (first != null)
        {
            node.setNext(first);
        }
        first = node;

        return node;
    }

    public Node InsertBefore(Node nodeToInsertBefore, int _data)
    {
        if (nodeToInsertBefore == null)
        {
            return null;
        }
        
        Node node = first;
        Node previous = null;
        while (node != null)
        {
            if (nodeToInsertBefore == node)
            {
                Node newNode = new Node(_data);
                if (previous == null)
                {
                    first = newNode;
                }
                else
                {
                    previous.setNext(newNode);
                }
                newNode.setNext(node);
                
                return newNode;
            }
            previous = node;
            node = node.getNext();
        }
        
        return null;
    }

    public Node InsertAfter(Node nodeToInsertAfter, int _data)
    {
        if (nodeToInsertAfter == null)
        {
            return null;
        }
        
        for (Node node = first; node != null; node = node.getNext())
        {
            if (nodeToInsertAfter == node)
            {
                Node newNode = new Node(_data);
                newNode.setNext(node.getNext());
                node.setNext(newNode);
                if (last == nodeToInsertAfter)
                {
                    last = newNode;
                }
                
                return newNode;
            }
        }
        
        return null;
    }

    public void Remove(int _data)
    {
        Node node = first;
        Node previous = null;
        while (node != null)
        {
            if (_data == node.getData())
            {
                RemoveNode(node, previous);
                return;
            }
            previous = node;
            node = node.getNext();
        }
    }

    public void Remove(Node nodeToRemove)
    {
        if (nodeToRemove == null)
        {
            return;
        }
        
        Node node = first;
        Node previous = null;
        while (node != null)
        {
            if (nodeToRemove == node)
            {
                RemoveNode(node, previous);
                return;
            }
            previous = node;
            node = node.getNext();
        }
    }

    private void RemoveNode(Node node, Node previous)
    {
        if (previous == null)
        {
            first = node.getNext();
        }
        else
        {
            previous.setNext(node.getNext());
        }
        if (last == node)
        {
            last = previous;
        }
    }

    public boolean Contains(int _data)
    {
        return (Find(_data) != null);
    }

    public Node Find(int _data)
    {
        for (Node node = first; node != null; node = node.getNext())
        {
            if (node.getData() == _data)
            {
                return node;
            }
        }
        return null;
    }
}
