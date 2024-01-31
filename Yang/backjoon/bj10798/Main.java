import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String word;
        List<String> msg = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < 5; i++){
            word = br.readLine();
            for (int j = 0; j < word.length(); j++){
                if(msg.size() > j) {
                    msg.set(j, msg.get(j) + word.charAt(j));
                }
                else msg.add(word.charAt(j) + "");
            }
        }

        String str = String.join("",msg);
        bw.write(str);
        bw.flush();
        bw.close();
        br.close();
    }
}
