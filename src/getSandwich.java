public class getSandwich {
    public static void main(String[] args) {
        System.out.println(TASK15getSandwich("breadjambread"));        // jam
        System.out.println(TASK15getSandwich("xxbreadjambreadyy"));    // jam
        System.out.println(TASK15getSandwich("xxbreadyy"));            // ""
    }

    public static String TASK15getSandwich(String str) {
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");

        if (first == -1 || first == last) {
            return "";
        }

        return str.substring(first + 5, last);
    }
}
