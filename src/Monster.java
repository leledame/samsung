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

    @Override
    public String getImage() {
        return "\uD83D\uDC80";
    }

    @Override
    public boolean taskMonster(int difficultGame) {
        System.out.println("Решите задачу:");
        int x = 15 + r.nextInt(9) * 5; // (число 0 до 8 * 5 + 15)
        int y = r.nextBoolean() ? 5 : 10; // (случайное булевое значие, от которого зависит  выбор 5 или 10)
        int trueAnswer = x - y;
        System.out.println("Реши пример: " + x + " - " + y + " = ?");
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

    @Override
    public String getImage() {
        return "\uD83D\uDC79";
    }

    @Override
    public boolean taskMonster(int difficultGame) {
        System.out.println("Решите задачу:");
        int x;
        int y;
        // Условие которое зависит от выбора сложности в начале игры
        if (difficultGame == 1 || difficultGame == 2) {
            // Диапазон 5 10
            x = r.nextInt(6) + 5;
            y = r.nextInt(6) + 5;
        } else if (difficultGame == 3 || difficultGame == 4) {
            // Диапазон 10 15
            x = r.nextInt(6) + 10;
            y = r.nextInt(6) + 10;
        } else {
            // Диапазон 15 - 25
            x = r.nextInt(11) + 15;
            y = r.nextInt(11) + 15;
        }
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