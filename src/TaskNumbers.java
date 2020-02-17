import java.util.Scanner;

public class TaskNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int userNumber = sc.nextInt();

        if (userNumber > 0) {
            double x = 0;
            while (x < userNumber + 0.1) {
                System.out.printf("%.1f" + " ", x);
                x += 0.1;
            }
        } else if (userNumber < 0) {
            double y = 0;
            while (y >= userNumber - 0.1) {
                System.out.printf("%.1f" + " ", y);
                y -= 0.1;
            }
        } else
            System.out.println("Podałeś zero");
    }
}
