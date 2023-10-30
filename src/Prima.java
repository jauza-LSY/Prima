import java.util.Scanner;

public class Prima {
    /**
     * Metode untuk menguji apakah bilangan prima atau bukan
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();

        if (isPrima(bilangan)) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }

        input.close();
    }

    /**
     * Method untuk menentukan apakah sebuah bilangan adalah bilangan prima atau bukan.
     *
     * @param bilangan Bilangan yang akan dicek.
     * @return True jika bilangan adalah bilangan prima, dan False jika bukan.
     */
    public static boolean isPrima(int bilangan) {
        if (bilangan <= 1) {
            return false;
        }
        if (bilangan <= 3) {
            return true;
        }
        if (bilangan % 2 == 0 || bilangan % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= bilangan; i += 6) {
            if (bilangan % i == 0 || bilangan % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
