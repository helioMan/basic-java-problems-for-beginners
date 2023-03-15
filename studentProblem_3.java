class studentProblem_3 {
    public static void main(String[] args) {
        int b = 10111010;
        String str = String.valueOf(b);
        System.out.println(str.matches("[01]+"));

        String str1 = "2345ABCDE";
        System.out.println(str1.matches("[0-9A-F]+"));

        String str2 = "33/03/2023";
        System.out.println(str2.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
    }
}
