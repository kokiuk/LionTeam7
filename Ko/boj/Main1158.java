package boj;

//124567


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class Main1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] quiz = reader.readLine().split(" ");
        int num = Integer.parseInt(quiz[0]);
        int kill = Integer.parseInt(quiz[1]);
//        System.out.println(Arrays.toString(quiz));

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        //사람 넣기
        for (int i = 1; i <= num; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()){
            for (int i = 0; i < kill-1; i++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll());
            sb.append(", ");
        }
        String substring = sb.substring(0, sb.length() - 2);

        substring += ">";

        System.out.println(substring);


    }
}
