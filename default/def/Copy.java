package def;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Copy {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        String temp;

        while(H-- > 0) {
            int arr[] = new int[W];
            temp = br.readLine();

            for (int i = 0; i < W; i++) {
                if (temp.charAt(i) == 'c') {
                    bw.write(0 + " ");
                }
                else {
                    if(i != 0 && arr[i - 1] >= 0) {
                        arr[i] = arr[i - 1] + 1;
                        bw.write(arr[i] + " ");
                    }
                    else {
                        arr[i] = -1;
                        bw.write(arr[i] + " ");
                    }
                }
            }
            bw.write("\n");
        }
        br.close();
        bw.close();
    }
}
/*
 */