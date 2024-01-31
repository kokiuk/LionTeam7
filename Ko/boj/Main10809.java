package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String result = "";
        Map<Character, Integer> alphabetMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
           if (!alphabetMap.containsKey(s.charAt(i))){
               alphabetMap.put(s.charAt(i), i);
           }
        }


        for (int i = 97; i < 123; i++) {
            if (alphabetMap.containsKey((char)i)){
                result += alphabetMap.get((char)i) + " ";
            }
            else {
                result += "-1" + " ";
            }
        }
        System.out.println(result);
    }
}
