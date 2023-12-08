package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        //spilt은 주어진 인자를 정규 표현식으로 활용해서 기준으로 삼아
        //문자열을 나눈 배열로 반환한다
        String[] splitString = input.split(" ");

        int N = Integer.parseInt(splitString[0]);
        int M = Integer.parseInt(splitString[1]);

        //행렬의 크기 정보 받기
        int[][] matrix = new int[N][M];


        //2중 반복문을 수행하면서,
        for (int i = 0; i < N; i++) {
            //각 줄을 입력받는다
            String[] rowInfo = reader.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                //i번 줄의 j번 칸에 rowInfo[j]를 정수로 할당한다
                matrix[i][j] = Integer.parseInt(rowInfo[j]);
            }
        }

        //1. 다른 2차원 배열을 만들어 할당 뒤 연산

        //2. 입력을 받으며 바로 연산
        for (int i = 0; i < N; i++) {
            //반대 행렬 줄을 입력받는다
            String[] rowInfo = reader.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                //matrix[i][j]에 rowInfo[j]를 더해준다
                matrix[i][j] += Integer.parseInt(rowInfo[j]);
            }
        }

        //출력 만들기
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < N; i++) {
            //각 줄 출력
            for (int j = 0; j < M; j++) {
                answer.append(matrix[i][j]);
                answer.append(" ");
            }
            //개행문자 출력
            answer.append("\n");
        }

        System.out.println(answer);

    }
}
