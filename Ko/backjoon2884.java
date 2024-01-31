import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int min = scanner.nextInt();

        int newMin;

        newMin = min + 15;
        if (newMin >= 60){
            newMin -= 60;
            if (hour > 24){
                hour -=24;
            }
        }else {
            hour -= 1;
            if (hour < 0){
                hour += 24;
            }
        }
        System.out.printf("%d %d",hour,newMin);
    }
}