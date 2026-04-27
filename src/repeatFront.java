public class repeatFront {
    public static void main(String[] args) {
        System.out.println(TASK11repeatFront("Chocolate", 4)); // ChocChoChC
        System.out.println(TASK11repeatFront("Chocolate", 3)); //"ChoChC
        System.out.println(TASK11repeatFront("Ice Cream", 2)); //IcI
    }

    public static String TASK11repeatFront(String str, int n) {
        String result = "";

        for (int i = n; i > 0; i--) {
            result += str.substring(0, i);
        }

        return result;
    }
}

