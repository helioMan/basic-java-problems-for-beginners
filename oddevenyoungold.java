import java.util.Scanner;

class oddevenyoungold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("a is even");
        } else {
            System.out.println("a is odd");
        }

        System.out.println("Enter age");
        int ageHere = sc.nextInt();

        if (ageHere < 18) {
            System.out.println("young");
        } else if (ageHere >= 18) {
            System.out.println("adult");
        } else {
            System.out.println("old ");
        }

        sc.close();
    }
}
