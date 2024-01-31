package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        boolean result = false;

        int left = 0;
        int right = input.length()-1;
        
        while (left <= right){
            if (input.charAt(left) == input.charAt(right)){
                left ++;
                right --;
            }else {
                result = false;
                break;
            }
            result = true;
        }
        if (!result){
            System.out.println(0);
        }else {
            System.out.println(1);
        }
    }
}
