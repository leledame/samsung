import java.util.Random;
import java.util.Scanner;

public class Monster {
    private final int x, y;
    Random r = new Random();

    Monster(int sizeBoard) {
        this.y = r.nextInt(sizeBoard - 1);
        this.x = r.nextInt(sizeBoard);
    }

    public String getImage() {
        return "\uD83E\uDDDF\u200D";
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public boolean conflictPerson(int perX, int perY) {
        return perY - 1 == this.y && perX - 1 == this.x;
    }

    public boolean taskMonster(int difficultGame) {
        System.out.println("Решите задачу:");
        int x = r.nextInt(100);
        int y = r.nextInt(100);
        int trueAnswer = x + y;
        System.out.println("Реши пример: " + x + " + " + y + " = ?");
        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();
        if (trueAnswer == ans) {
            System.out.println("Верно! Ты победил монстра");
            return true;
        }
        System.out.println("Ты проиграл эту битву!");
        return false;
    }
}

class SmallMonster extends Monster {
    SmallMonster(int sizeBoard) {
        super(sizeBoard);
    }

    public String getImage() {
        return "\uD83D\uDC80";
    }

    public boolean taskMonster(int difficultGame) {
        System.out.println("Решите задачу:");
        int x = r.nextInt(100);

        int trueAnswer = x + 10;
        System.out.println("Реши пример: " + x + " + " + 10 + " = ?");
        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();
        if (trueAnswer == ans) {
            System.out.println("Верно! Ты победил монстра");
            return true;
        }
        System.out.println("Ты проиграл эту битву!");
        return false;
    }

}

class BigMonster extends Monster {
    BigMonster(int sizeBoard) {
        super(sizeBoard);
    }

    public String getImage() {
        return "\uD83D\uDC79";
    }

    public boolean taskMonster(int difficultGame) {
        System.out.println("Решите задачу:");
        int x = r.nextInt(25);
        int y = r.nextInt(25);
        int trueAnswer = x * y;
        System.out.println("Реши пример: " + x + " * " + y + " = ?");
        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();
        if (trueAnswer == ans) {
            System.out.println("Верно! Ты победил монстра");
            return true;
        }
        System.out.println("Ты проиграл эту битву!");
        return false;
    }

}