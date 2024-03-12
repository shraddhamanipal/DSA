class Fibonacci {
    private static int sum = 0;
    public static void main(String[] args) {
        int n = 10, res;
        if(n == 0) {
            res = 0;
        } else if(n == 1) {
            res = 1;
        } else {
            res = fibonacciRecur(0, 1, n-1);
        }
        System.out.println(res);
    }
    private static int fibonacciRecur(int n1, int n2, int n) {
        if(n>0) {
            sum = n1 + n2;
            n--;
            return fibonacciRecur(n2, sum, n);
        }
        return sum;
    }
}