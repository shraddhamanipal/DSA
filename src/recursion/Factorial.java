package src.recursion;

class Factorial {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(factorialRecur(n));
        System.out.println(factorialIter(n));
    }
    private static int factorialRecur(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecur(n-1);
    }

    private static int factorialIter(int n) {
        int res = 1;
        for(int i = 1; i <=n; i++) {
            res = res * i;
        }
        return res;
    }
}