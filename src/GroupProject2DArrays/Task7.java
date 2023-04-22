package GroupProject2DArrays;

public class Task7 {
    public static void main(String[] args) {
        /*
         Write a Java Program to print the first 10 numbers of
         Fibonacci series.
        */
        int a = 0, b = 1, c = 0;
        System.out.println(a + " " + b);
        for (int i = 2; i < 10; i++) {
            c = a + b;
            System.out.println(" " + c);
            a = b;
            b = c;
        }
    }
}

