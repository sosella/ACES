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
public class Stack {
    // Fields
    private StackEntry top;
    
    // Properties
    public StackEntry getTop()
    {
        return top;
    }
    
    // Constructor
    public Stack()
    {
        top = null;
    }

    // Methods
    public void Push(int _data)
    {
        StackEntry entry = new StackEntry(_data);

        entry.setNext(top);
        top = entry;
    }

    public void Pop()
    {
        if (top != null)
        {
            top = top.getNext();
        }
    }

    @Override
    public String toString()
    {
        String s = "";
        for (StackEntry entry = top; entry != null; entry = entry.getNext())
        {
            if (entry != top)
            {
                s += ", ";
            }
            s += entry.getData();
        }
        return s;
    }
}
