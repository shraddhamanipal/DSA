package src.recursion;

import java.util.HashMap;
import java.util.Map;

class Factorial {

    static Map<Integer, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        int n = 10;
        System.out.println(factorialRecur(n));
        System.out.println(factorialIter(n));
    }
    private static int factorialRecur(int n) {
        if(map.containsKey(n))
            return map.get(n);

        if(n <= 1)
            return 1;

        int res = n * factorialRecur(n-1);
        map.put(n, res);
        return res;
    }

    private static int factorialIter(int n) {
        int res = 1;
        for(int i = 1; i <=n; i++) {
            res = res * i;
        }
        return res;
    }
}