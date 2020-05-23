package def;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Copy2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        while(N-- > 0) {
            long temp = Integer.parseInt(br.readLine());
            System.out.println(Long.toString(function(temp)));
        }
    }
    public static long function(long n) {
        if(n < 2)
            return 1;
        if(n == 2)
            return 2;
        if(n == 3)
            return 4;
        else
            return function(n - 1) + function(n - 2) + function(n - 3) + function(n - 4);
    }
}
/*
 */