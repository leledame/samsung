import java.util.Scanner;

public class While {
    public static void main(String[] args) throws InterruptedException {
        int x = 6;

        while (x < 60) {
            System.out.println(x);
            x++;
//            Thread.sleep(500);
        }
        x = 4;
            do {
            System.out.println("True");
        } while(x > 5);

        for(int i = 0; i < 10; i++){
            System.out.println("i = " + i);

        }

    }
}
