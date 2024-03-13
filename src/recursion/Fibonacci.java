package src.recursion;

class Fibonacci {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(fibonacciRecur(n));
    }
    private static int fibonacciRecur(int n) {
        if(n < 2) {
            return n;
        }
        return fibonacciRecur(n-1) + fibonacciRecur(n-2);
    }
}
