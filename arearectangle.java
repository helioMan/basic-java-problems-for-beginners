import java.util.*;

class arearectangle {
    public static void main(String[] args) {
        float area, height, base;
        System.out.println("Enter the values of height and base ");
        try (Scanner sc = new Scanner(System.in)) {
            height = sc.nextFloat();
            base = sc.nextFloat();
        }

        area = base * height / 2;
        float area1 = 1f / 2f * base * height;

        System.out.println("The are of rectangle is " + area);
        System.out.println("The another area of rectangle is " + area1);
    }
}