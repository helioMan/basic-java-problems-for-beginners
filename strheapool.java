class strheapool {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1 == str2);

        char c[] = { 'A', 'B', 'C', 'D' };
        System.out.println(c);
        char d[] = { 67, 68, 69, 70 };
        System.out.println(d);
    }
}
