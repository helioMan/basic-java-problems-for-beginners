import java.util.Scanner;

class ifelse {
    public static void main(String[] args) {
        System.out.println("Enter the three numbers: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("a is greater then b and c ");
        } else if (b > a && b > c) {
            System.out.println("b is greater than a and c ");
        } else {
            System.out.println("c is greater than a and b");
        }
        sc.close();
    }
}
