package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //최댓값
        int max = 0;
        //최댓값의 행열
        int row = 1;
        int col = 1;

        //행열 입력
        for (int i = 1; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            for (int j = 1; j < 10; j++) {
                int n = Integer.parseInt(st.nextToken());

                if (max < n){
                    max = n;
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(row + " " + col);
    }
}
