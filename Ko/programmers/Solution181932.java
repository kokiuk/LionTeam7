package programmers;

public class Solution181932 {
    public String solution(String code) {
        StringBuilder answerBuilder = new StringBuilder();
        //181932 코드 처리하기
        //기본 모드 설정
        int mode = 0;
        //code를 앞에서부터 읽자
        for (int i = 0; i < code.length(); i++) {
            //현재 문자를 가져오고,
            char letter = code.charAt(i);
            //현재 문자가 1이면 : 모드 변경
            if (letter == '1'){
                if (mode == 0) mode = 1;
                else mode = 0;
            }
        //햔제 믄지기 1이 아니면
            else {
                //모드가 1이고, i가 홀수이면 answerBuilder에 추가
                if (mode == 1 && i%2 == 1)
                    answerBuilder.append(letter);
                //모드가 0이고, i가 짝수이면 answerBuilder에 추가
                if (mode == 0 && i%2 == 0)
                    answerBuilder.append(letter);

            }

        }

        String answer = answerBuilder.toString();
        return answer.isEmpty() ? "EMPTY" : answer;
    }
}
