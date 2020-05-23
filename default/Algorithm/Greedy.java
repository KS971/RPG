package Algorithm;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Greedy {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        int pay = Integer.parseInt(bfr.readLine());
        int change = 1000 - pay;
        int cnt = 0;
        int coin[] = {500, 100, 50, 10, 5, 1};

        for(int i = 0; i < coin.length; i++) {
            if(change > coin[i]) {
                cnt += change / coin[i];
                change %= coin[i];
            }
        }
        System.out.println(cnt);
    }
}