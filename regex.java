class regex {
    public static void main(String[] args) {
        String str1 = "abcdef";
        System.out.println(str1.matches(".*"));
        String str2 = "abcdef";
        System.out.println(str2.matches("[a-z]*"));
        String str3 = "abcd6ef";
        System.out.println(str3.matches("[a-z]*"));
        String str4 = "abcdef";
        System.out.println(str4.matches("[a-z]+"));
        String str5 = "aaaaabbbbccccdddd";
        System.out.println(str5.matches("[abcd]*"));
        String str6 = "abc";
        System.out.println(str6.matches("[abc]{3}"));
        String str7 = "aabbcc";
        System.out.println(str7.matches("[abc]{2}"));
        String str8 = "aabbbcccc";
        System.out.println(str8.matches("[abc]{3,11}"));
        String str9 = "eddy@gmail.com";
        System.out.println(str9.matches(".*gmail.*"));
        String str10 = "eddy@gmail.com";
        System.out.println(str10.matches("\\w*gmail(.*)"));
        String str11 = "eddy-@gmail.com";
        System.out.println(str11.matches("\\w*gmail(.*)"));
    }
}
