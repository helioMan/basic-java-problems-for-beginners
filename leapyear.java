import java.util.Scanner;

class leapyear {
    public static void main(String[] args) {
        System.out.print("Enter the year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        boolean yearToCheck = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    yearToCheck = true;
                }
            } else {
                yearToCheck = true;
            }
        }

        if (yearToCheck) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        sc.close();
    }
}
