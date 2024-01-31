import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int H = 0;
        int M = 0;
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        M = sc.nextInt();
        int H2 = 0;
        int M2 = 0;

        if(M - 45 < 0){
            if(H == 0){
                H2 = 23;
                M2 = M + 60 - 45;
            }
            else {
                H2 = H - 1;
                M2 = M + 60 - 45;
            }
        }
        else{
            H2 = H;
            M2 = M - 45;
        }
        System.out.println(H2 + " " + M2);
    }
}
