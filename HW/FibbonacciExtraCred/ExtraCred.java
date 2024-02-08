
public class ExtraCred {
    public static void main(String[] args) {
        int n = 10;
        int start1 = 0;
        int start2 = 1;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println("The " + (i + 1) + "th Fibonacci number is " + start1);
            } else if (i == 1) {
                System.out.println("The " + (i + 1) + "th Fibonacci number is " + start2);
            } else {
                int start3 = start1 + start2;
                start1 = start2;
                start2 = start3;
                System.out.println("The " + (i + 1) + "th Fibonacci number is " + start3);
            }
        }
    }
}
