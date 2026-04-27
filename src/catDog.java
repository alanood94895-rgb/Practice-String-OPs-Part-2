public class catDog {
    public static void main (String[] args){
        System.out.println( TASK3catDog("catdog")); //True
        System.out.println(TASK3catDog ("catcat"));//False
        System.out.println(TASK3catDog ("1cat1cadodog"));//True

    }
    public static boolean TASK3catDog(String str) {
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 3);

            if (sub.equals("cat")) {
                catCount++;
            }

            if (sub.equals("dog")) {
                dogCount++;
            }
        }

        return catCount == dogCount;
    }

}
