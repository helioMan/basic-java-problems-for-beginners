import java.util.Scanner;

class studentProblem_2 {
    /*
     * 1. Remove the special characters from string
     * Remove extra spaces from the string
     * Find the number of words in the string in Java
     */
    public static void main(String[] args) {
        // we have to remove the special char, but we cannot delete anything, but we can
        // definitely replace the values using replace and using the regular expressions
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to perform operations on: ");
        String userInput = sc.nextLine();

        System.out.println("Enter the another string you want to perform replace the spaces operations on: ");
        String anotherUserInput = sc.nextLine();

        System.out.println("Your new string after removing the special characters is: ");
        System.out.println(userInput.replaceAll("[^a-zA-Z0-9]", ""));

        System.out.println("Your new string after removing the spaces is: ");
        System.out.println(anotherUserInput.replaceAll("\\s+", " "));

        System.out.println("Enter another string to perform trim and split on: ");
        String trimCount = sc.nextLine();

        trimCount = trimCount.replaceAll("\\s+", " ").trim();
        String wordCount[] = trimCount.split("\\s");

        System.out.println("The string after counting the words is: " + wordCount.length);
        sc.close();
    }
}
