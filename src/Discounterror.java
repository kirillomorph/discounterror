import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Discounterror {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to see our discount(1) or sales(2)? ");
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
        SimpleDateFormat dateFormilized = new SimpleDateFormat("EEEE");
        String dateFormilizedString = dateFormilized.format(date);

        if (dateFormilizedString.equals("Friday")) {
            System.out.println("It's Friday! Happy weekend! You have sales!");
        } else {
            System.out.println("It's not a Friday! No sales for you! It's " + dateFormilizedString + " now!");
        }
    }

    public static void monthOfYear() {
        Date date = new Date();

        SimpleDateFormat curDate = new SimpleDateFormat ("MMMM"); 
        String curDateString = curDate.format(date);

        if (curDateString.equals("December")) {
            System.out.println("It's December! Happy New Year! You have a discount!");
        } else {
            System.out.println("It's not a December! No sales for you! It's " + curDateString + " now!");
        }
    }
}