import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Numbers numbers = new Numbers();

        Scanner scanner = new Scanner(System.in);
        int usersN = scanner.nextInt();
        int[] numb = Integer.toString(usersN).chars().map(c -> c - '0').toArray();

        numbers.allNumb(numb);

    }


}


