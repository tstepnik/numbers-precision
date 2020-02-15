import java.util.Scanner;

public class TaskNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = 0;
        System.out.println("Podaj liczbę:");
        double usersNumber = sc.nextDouble();

        if (usersNumber>0){
            double xx=0;
            while (x<usersNumber+0.1){
                System.out.print(xx + " ");
                x+=0.1;
                xx= (double)Math.round(x*10)/10;
            }
        }else if (usersNumber<0){
            double y = 0;
            double yy = 0;
            while (y>=usersNumber-0.1){
                System.out.print(yy + " ");
                y-=0.1;
                yy = round(y,1);
            }
        }else
            System.out.println("Podałeś zero");



    }
    private static double round (double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }
}
