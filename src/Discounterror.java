import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Discounterror {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to see our discount(1) or sales(2)?");
        String scannerInput = scanner.nextLine();

        if (scannerInput.equals("1")) {
            dayOfWeek();
        } else if (scannerInput.equals("2")) {
            monthOfYear();
        }

        scanner.close();
    }

    public static void dayOfWeek() {
        Date date = new Date();

        System.out.println(date);

        SimpleDateFormat curDate = new SimpleDateFormat ("MM");
        String curDateString = curDate.format(date);

        if (curDateString.equals("April")) {
            System.out.println("It's December! Happy New Year! You have a discount!");
        } else {
            System.out.println("It's not a December! Not sales for you!");
        }
    }

    public static void monthOfYear() {

    }
}
