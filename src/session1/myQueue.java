package session1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;

public class myQueue {
    public static int[] readInts(String name)
    {
        In in = new In(name);
        Queue<Integer> q = new Queue<Integer>();
        while (!in.isEmpty())
            q.enqueue(in.readInt());
        int N = q.size();
        int[] a = new int[N];
        for (int i = 0; i < N; i++)
        {
            a[i] = q.dequeue();
        }
        return a;
    }

    public static void main(String args[])
    {
        ResizingArrayStack<String> res = new ResizingArrayStack<String>();
        res.push("a");
        res.push("b");
        res.push("c");
        res.push("d");
        //res.pop();
        while(res.iterator().hasNext())
        {
            String entr = res.iterator().next();
            System.out.println(entr);
            res.pop();
        }
        System.out.println(res.size());
    }
}
