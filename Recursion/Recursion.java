// print 5 4 3 2 1 0
public class Recursion {
    static int practice(int a) {
        if (a == 0) {
            return 0;
        } else {
            System.out.print(a + " ");
            return practice(a - 1);
        }
    }

    public static void main(String[] args) {
        int p = practice(5);
        // System.out.println(p);
    }
}

// factorial of 5---> 5*4*3*2*1 using recursion

// class Recursion {
// static int factorial(int num) {

// if (num == 1) {
// return 1;
// } else

// {

// return num * factorial(num - 1);
// }
// }

// public static void main(String[] args) {
// int a = factorial(5);
// System.out.println(a);
// }
// }

