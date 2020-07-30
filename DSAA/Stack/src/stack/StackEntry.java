/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author steph
 */
public class StackEntry {
    // Fields
    private final int data;
    private StackEntry next;

    // Properties
    public int getData()
    {
        return data;
    }

    public StackEntry getNext()
    {
        return next;
    }
    public void setNext(StackEntry entry)
    {
        next = entry;
    }
    
    // Constructor
    public StackEntry(int _data)
    {
        data = _data;
        next = null;
    }
}
