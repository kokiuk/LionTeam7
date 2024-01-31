package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main20001 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        Stack<String> stringStack= new Stack<>();

        if (input.equals("고무오리 디버깅 시작")){
            String choice = reader.readLine();
            while (true){
                if (choice.equals("문제")){
                    stringStack.push(choice);
                    choice = reader.readLine();
                } else if (choice.equals("고무오리")) {
                    if (stringStack.empty()){
                        stringStack.push(choice);
                        stringStack.push(choice);
                        choice = reader.readLine();
                    }else {
                        stringStack.pop();
                        choice = reader.readLine();
                    }
                } else if (choice.equals("고무오리 디버깅 끝")) {
                    break;
                }
            }//while end
        }//if end

        if(stringStack.empty()){
            System.out.println("고무오리야 사랑해");
        }else {
            System.out.println("힝구");
        }
//        System.out.println("stringStack = " + stringStack);


    }//main end
}//class end
