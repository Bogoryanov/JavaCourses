import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;




public class main {
    public static void main(String[] args) {
        Random newRandom = new Random();
        int randomNumber = newRandom.nextInt(5);
        System.out.println("Загадано число от 0 до 100");
        Scanner newScanner = new Scanner(System.in);
        int scanNumber = newScanner.nextInt();


    for (int count1 = 8; count1 > 0; --count1) {
        if (scanNumber > randomNumber) {
            System.out.println("число больше загаданного , количество попыток " + count1);
            Scanner newscanner2 = new Scanner(System.in);
            int scanner2 = newscanner2.nextInt();
            scanNumber = scanner2;

        } else if (scanNumber < randomNumber) {
            System.out.println("Число меньше загаданного, количество попыток" + count1);
            Scanner newscanner3 = new Scanner(System.in);
            int scanner3 = newscanner3.nextInt();
            scanNumber = scanner3;

        }

        if (scanNumber == randomNumber) {
            System.out.println("YAHOOOO!");
        }


    }









    }
}
