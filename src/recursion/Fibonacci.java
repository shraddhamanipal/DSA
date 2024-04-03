package src.recursion;

import java.util.HashMap;
import java.util.Map;

class Fibonacci {
    static Map<Integer, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        int n = 45;
        System.out.println(fibonacciRecur(n));
    }
    private static int fibonacciRecur(int n) {
        if(map.containsKey(n))
            return map.get(n);
        if(n <= 1) {
            return n;
        }
        int res = fibonacciRecur(n-1) + fibonacciRecur(n-2);
        map.put(n, res);
        return res;
    }
}
