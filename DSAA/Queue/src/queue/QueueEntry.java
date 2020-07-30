/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author steph
 */
public class QueueEntry {
    // Fields
    private final int data;
    private QueueEntry previous;
    private QueueEntry next;
    
    // Properties
    public int getData() {
        return data;
    }

    public QueueEntry getNext()
    {
        return next;
    }
    public void setNext(QueueEntry _next)
    {
        next = _next;
    }

    public QueueEntry getPrevious()
    {
        return previous;
    }
    public void setPrevious(QueueEntry _previous)
    {
        previous = _previous;
    }
    
    // Constructors
    public QueueEntry(int _data)
    {
        data = _data;
        next = null;
        previous = null;
    }       
    
    // Methods
    @Override
    public String toString()
    {
        return String.valueOf(data);
    }
}
