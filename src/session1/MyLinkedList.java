package session1;

import edu.princeton.cs.algs4.Queue;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class MyLinkedList {
    public static void main(String args[])
    {
        MyStack<String> sta = new MyStack<String>();
        sta.push("a");
        sta.push("b");
        sta.push("c");
        sta.push("d");
        sta.push("e");
        sta.push("f");
        while (sta.iterator().hasNext())
        {
            System.out.println(sta.iterator().next());
            sta.pop();
        }
        System.out.println("=== ==== ==== ==== ====");
        MyQueue<String> que = new MyQueue<String>();
        que.enqueue("a");
        que.enqueue("b");
        que.enqueue("c");
        que.enqueue("d");
        que.enqueue("e");
        que.enqueue("f");
        while (que.iterator().hasNext())
        {
            System.out.println(que.iterator().next());
            que.dequeue();
        }
        System.out.println("hello");
    }
}


class MyStack<Item> implements Iterable{

    private int N;

    private Node<Item> first;

    private class Node<Item> {
        Item item;
        Node next;
    }

    public boolean isEmpty() { return first == null; }

    public int size() {
        return N;
    }

    public void push(Item item)
    {
        Node oldfirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    public Item pop()
    {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator<Item>(first);
    }

    private class ListIterator<Item> implements Iterator<Item> {
        private Node<Item> current;
        public ListIterator(Node<Item> first) {current = first;}

        public boolean hasNext()
        {
            return current != null;
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }

        public Item next()
        {
            if(!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}

class MyQueue<Item> implements Iterable
{
    private Node<Item> first;
    private Node<Item> last;
    private int N;
    private class Node<Item>
    {
        Item item;
        Node next;
    }
    public boolean isEmpty()
    {
        return first == null;
    }

    public int size()
    {
        return N;
    }

    public void enqueue(Item item)
    {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty()) first = last;
        else          oldlast.next = last;
        N++;
    }

    public Item dequeue()
    {
        Item item = first.item;
        first = first.next;
        if (isEmpty()) last = null;
        N--;
        return item;
    }

    @Override
    public Iterator iterator() {
        return new ListIterator<Item>(first);
    }
    private class ListIterator<Item> implements Iterator<Item> {

        private Node<Item> current;

        public ListIterator(Node<Item> first) {
            current = first;
        }

        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}



