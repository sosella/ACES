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
public class Node
{
    private final int data;
    private Node next;

    public int getData()
    {
        return data;
    }
    
    public Node getNext()
    {
        return next;
    }
    protected void setNext(Node node)
    {
        next = node;
    }
    
    public Node(int _data)
    {
        data = _data;
        next = null;
    }
}
