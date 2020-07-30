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
public class Queue {
    // Fields
    private QueueEntry front;
    private QueueEntry back;
    
    // Properties
    public QueueEntry getFront()
    {
        return front;
    }
    public void setFront(QueueEntry entry)
    {
        front = entry;
    }

    public QueueEntry getBack()
    {
        return back;
    }
    public void setBack(QueueEntry entry)
    {
        back = entry;
    }

    // Constructors
    public Queue()
    {
        front = null;
        back = null;
    }
    
    // Methods
    public void Enqueue(int _data)
    {
        QueueEntry queueEntry = new QueueEntry(_data);

        queueEntry.setNext(back);

        if (front == null)
        {
           front = queueEntry;
        }
        else
        {
            back.setPrevious(queueEntry);
        }
        
        back = queueEntry;
    }

    public void Dequeue()
    {
        if (front == null)  // empty queue
        {
            return;
        }
        if (front == back) // only one entry
        {
            front = null;
            back = null;
        }
        else // more than one
        {
            front.getPrevious().setNext(null);
            front = front.getPrevious();
        }
    }

    @Override
    public String toString()
    {
        String s = "";
        for (QueueEntry queueEntry = back; queueEntry != null; queueEntry = queueEntry.getNext())
        {
            if (queueEntry != back)
            {
                s += ", ";
            }
            s += queueEntry;
        }
        return s;
    }
}
