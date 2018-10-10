public class Main {
    public static void main(String[] args) {
        int myVal = 5;
        System.out.println(++myVal);
        System.out.println(myVal);
        System.out.println(--myVal);

        int myVal2 = 5;
        System.out.println(myVal2++);
        System.out.println(myVal2);

        int myVal3 = 50;
        myVal3 -= 5;
        System.out.println(myVal3);

        int result = 100;
        int val1 = 5;
        int val2 = 10;
        result /= val1 * val2;
        System.out.println(result);
    }
}
