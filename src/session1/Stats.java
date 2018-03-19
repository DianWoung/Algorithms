package session1;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Bag;

public class Stats
{
    public static void main(String[] args)
    {
        Bag<Double> numbers = new Bag<Double>();
        numbers.add(123.0);
        numbers.add(123.0);
        numbers.add(123.0);
        numbers.add(123.0);
        numbers.add(123.0);
        numbers.add(123.0);
        numbers.add(123.0);
        int N = numbers.size();
        double sum = 0.0;
        for (double x : numbers)
            sum += x;
        double mean = sum/N;
        StdOut.printf("Mean: %.2f\n", mean);
        sum = 0.0;
        for (double x : numbers)
            sum += (x - mean)*(x - mean);
        double std = Math.sqrt(sum/(N-1));


        StdOut.printf("Std dev: %.2f\n", std);
    }
}
