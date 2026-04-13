package Method_overloading;

public class Method_overloading {

    public class cbnits {
        void sum(int x, int y) {
            int d = x + y;
            System.out.println(d);
        }

        void mul(int u, int v, double w) {
            double f = u * v * w;
            System.out.println(f);
        }

        void division(int l, int p) {
            int t = l - p;
            System.out.println(t);
        }

        public static void main(String[] args) {
            Method_overloading  c = new Method_overloading ();
            c.sum(5, 3);
            c.mul(3, 5, 88);
            c.division(6, 3);
        }

    }
}
