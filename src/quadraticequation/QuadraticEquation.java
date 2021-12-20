package quadraticequation;

public class QuadraticEquation {
    public static Roots findRoots(double a, double b, double c) {
        double d = Math.sqrt(Math.pow(b,2) - (4 * a * c));
        double bExact = Math.negateExact((long) b);

        double positiveCheck =  ((bExact + d) / (2 * a));
        double maxRoot = (bExact-d)/(2*a);
        Roots roots = new Roots(positiveCheck,maxRoot);
        return roots;
    }

    public static void main(String[] args) {
        Roots roots = QuadraticEquation.findRoots(2, 10, 8);

        System.out.println("Roots: " + roots.x1 + ", " + roots.x2);

        roots.toString();
    }
}

class Roots {
    public final double x1, x2;

    public Roots(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    @Override
    public String toString() {
        return "Roots{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                '}';
    }
}
