package Sort;

import java.util.*;
import java.io.*;
class QuickSort {
    static int[][] Int_Arr;
    static int count = 0;
    public static void main (String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Int_Arr = new int[N][2];
        for(int i = 0 ; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            Int_Arr[i][0] = Integer.parseInt(st.nextToken());//Int_Arr[0] = x
            Int_Arr[i][1] = Integer.parseInt(st.nextToken());//Int_Arr[0] = y
        }
        QuickSort(Int_Arr,0,N);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ; i < N ; i++){
            bw.write(Int_Arr[i][0] + " " + Int_Arr[i][1] + "\n");
        }
        br.close();
        bw.close();
    }
    static void QuickSort(int[][] arr, int left , int right) throws Exception{
        if(left>=right) return;

        int pivot = Partition(arr,left,right);
        QuickSort(arr, left, pivot);
        QuickSort(arr, pivot+1, right);
    }
    static int Partition(int[][] arr, int left, int right){
        int xtemp = arr[left][0];
        int ytemp = arr[left][1];
        int low = left;
        int high = right;
        while(true){
            do{
                low++;
                if(low < right){
                    if(arr[low][0] == xtemp && arr[low][1] > ytemp)
                        break;
                }
            } while (low < right && arr[low][0]<=xtemp);
            do{
                high--;
                if(high > left){
                    if(arr[high][0] == xtemp && arr[high][1] < ytemp)
                        break;
                }
            } while (high > left  && arr[high][0]>=xtemp);
            if(low>high) break;
            int[] t = arr[low];
            arr[low] = arr[high];
            arr[high] = t;
        }
        int[] t = arr[left];
        arr[left] = arr[high];
        arr[high] = t;
        return high;
    }
}