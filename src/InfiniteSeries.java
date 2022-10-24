public class InfiniteSeries {

    public static double myexp(double x, int n)  {
        int i = 1;
        double p = 1.0;

        while (i < n){
            p += (Math.pow(x,i))/factorial(i);
            i++;
        }
        return (p);
    }

    private static int factorial(int u) {
        int i = 1;
        int f = 1;
        while (i < u+1) {
            f *= i;
            i++;
        }
        return(f);
    }
    public static void check(double x){
        System.out.println("\nMy method = "+myexp(x,8)+"\nMath. = "+Math.exp(x));
    }


    // All are pretty accurate except for 10.
    public static void main(String[] args) {
        for (double i =0.1; i < 100; i *= 10 ){
            check(i);
            System.out.println("i = "+i);
        }

// All are pretty accurate except for -10.
        for (double i = -0.1; -i < 100; i *= 10 ){
            check(i);
            System.out.println("i = "+i);
        }
        check(1);
    }
}
