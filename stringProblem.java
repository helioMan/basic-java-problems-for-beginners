class stringProblem {
    public static void main(String[] args) {
        String str = "johnmayers@gmail.com";
        // get index of @ symbol
        int indexTrack = str.indexOf("@");
        // substring the string
        String getUsername = str.substring(0, indexTrack);
        String getDomainName = str.substring(indexTrack + 1, str.length());

        System.out.println("Username : " + getUsername);
        System.out.println("Domain : " + getDomainName);

        // check whether the domain name matches with google.com
        System.out.println(getDomainName.startsWith("gmail"));
    }
}
