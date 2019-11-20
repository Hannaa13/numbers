import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int usersN = scanner.nextInt();
        Paint paint = new Paint();

        String[][] newString = paint.allNumb(usersN);

        for (String[] array : newString) {
            System.out.println(Arrays.toString(array));
        }


    }
}






