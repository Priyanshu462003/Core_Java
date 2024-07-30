package METHOD;

public class Sumofallnumbers {
    static int sum(int... a) {
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            s = s + a[i];
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3) + " is the sum of all number");
        System.out.println(sum(3, 5, 7, 9, 2) + " is the sum of all number");
        System.out.println(sum(3, 6, 9, 4, 3) + " is the sum of all number");
    }

}