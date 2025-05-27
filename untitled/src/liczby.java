import java.util.Scanner;

public class liczby {
    public int[] tab = new int[10];


    public int readNumber() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = scanner.nextInt();

        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        return number;
    }

    public void fillArray() {
        for (int i = 0; i < tab.length; i++) {
            try {
                tab[i] = readNumber();
            } catch (NegativeNumberException e) {
                tab[i] = 0;
            }
        }
    }
    public void pokazTablice() {
        for (int number : tab) {
            System.out.print(number + " ");
        }
    }
}
