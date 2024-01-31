package programmers;

public class Solution {

    public int[] solution(String[] wallpaper) {

        int minX;
        int minY;
        int maxX;
        int maxY;

        minX = minY = Integer.MAX_VALUE;
        maxX = maxY = Integer.MIN_VALUE;

        int x = wallpaper.length;
        int y = wallpaper[0].length();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (wallpaper[i].charAt(j) == '#');{
                    minX = Math.min(minX, x);
                    minY = Math.min(minX, y);
                    maxX = Math.max(maxX, x);
                    maxY = Math.max(maxY, y);
                }
            }
        }


        return new int[]{minX, minY, maxX + 1, maxY + 1};
    }

}
