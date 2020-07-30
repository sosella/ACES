/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlist;

/**
 *
 * @author steph
 */
public class DoublyLinkedList
{
    private Node first;
    private Node last;

    public DoublyLinkedList()
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
        Node newNode = new Node(_data);

        if (first == null)
        {
            first = newNode;            
        }
        if (last != null)
        {
            newNode.setPrevious(last);
            last.setNext(newNode);
        }
        last = newNode;

        return newNode;
    }

    public Node Prepend(int _data)
    {        
        Node newNode = new Node(_data);

        if (last == null)
        {
            last = newNode;
        }
        if (first != null)
        {
            first.setPrevious(newNode);
            newNode.setNext(first);
        }
        first = newNode;

        return newNode;
    }

    public Node InsertBefore(int nodeData, int _data)
    {
        return InsertBefore(Find(nodeData), _data);
    }

    public Node InsertBefore(Node node, int _data)
    {
        if (node == null)
        {
            return null;
        }
        
        Node newNode = new Node(_data);

        if (first == node)
        {
            first = newNode;
        }
        else
        {
            node.getPrevious().setNext(newNode);
        }
        newNode.setPrevious(node.getPrevious());
        newNode.setNext(node);
        node.setPrevious(newNode);

        return newNode;
    }

    public Node InsertAfter(int nodeData, int _data)
    {
        return InsertAfter(Find(nodeData), _data);
    }

    public Node InsertAfter(Node node, int _data)
    {
        if (node == null)
        {
            return null;
        }
        
        Node newNode = new Node(_data);
        
        if (last == node)
        {
            last = newNode;
        }
        else
        {
            node.getNext().setPrevious(newNode);
        }
        newNode.setNext(node.getNext());
        newNode.setPrevious(node);
        node.setNext(newNode);

        return newNode;
    }

    public void Remove(int _data)
    {
        RemoveNode(Find(_data));        
    }

    private void RemoveNode(Node node)
    {
        if (node == null)
        {
            return;
        }
        
        if (first == node)
        {
            first = node.getNext();
        }
        else
        {
            node.getPrevious().setNext(node.getNext());
        }
        if (last == node)
        {
            last = node.getPrevious();
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

    @Override
    public String toString()
    {
        String listStr = "";
        for (Node node = first; node != null; node = node.getNext())
        {
            if (node != first)
            {
                listStr += ", ";
            }
            listStr += node.getData();
        }
        return listStr;
    }
}
