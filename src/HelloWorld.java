import session1.BinarySearch;

public class HelloWorld {

    public static void main(String []args)
    {
        System.out.println("Hello World");

        System.out.println(gcd(99,11));
        HelloWorld.arrFuncs();
        BinarySearch.say("this is bs"+" maybe");
        System.out.println(4.1 > 4);
        System.out.println(1 + 2 + "3");
    }

    public static int gcd(int p, int q)
    {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

    public static void arrFuncs()
    {
        int N = 6;
        //a = new double[N];
        double[] a = {1.0, 2.0, 4.0, 6.0, 9.0, 11.11};
        a[3] = 18.3;
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }
}
