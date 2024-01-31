package programmers;

import java.util.HashMap;
import java.util.Map;

public class Solution178871 {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        Map<String, Integer> rank = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            rank.put(players[i], i);
        }

        for (String player :
                callings) {
            //순위 가져옴
            //등수
            int playerRank = rank.get(player);
            //앞서 가던 사람
            String frontPlayer = players[playerRank - 1];

            //순위조정 (배열)
            players[playerRank - 1] = player;
            players[playerRank] = frontPlayer;

            //Map 갱신
            rank.put(player, playerRank-1);
            rank.put(frontPlayer, playerRank);
        }

        return players;
    }
}
