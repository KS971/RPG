package def;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Lamda {
    public static void main(String[] args) throws Exception {
        String str[] = {"banana", "pineapple", "apple"};

        PriorityQueue queue1 = new PriorityQueue(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.length() > s2.length()) {
                    return 1;
                }
                else if(s1.length() < s2.length()) {
                    return -1;
                }
                return 0;
            }
        });

        PriorityQueue<String> queue2 = new PriorityQueue<>(((s1, s2) -> s1.length() - s2.length()));

    }
}
/*
 */