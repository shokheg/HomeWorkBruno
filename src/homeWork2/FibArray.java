package homeWork2;

import java.math.BigInteger;

public class FibArray {

    public static void main(String[] args) {
        BigInteger[] fib = new BigInteger[100];
        for (int i = 0; i < 100; i++){
            if (i<2){
                fib[i]= BigInteger.valueOf(1);
                System.out.println(fib[i]);
            } else {
                fib[i]=fib[i-1].add(fib[i-2]);
                System.out.println(fib[i]);
            }
        }

    }

}
