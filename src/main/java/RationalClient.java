public class RationalClient {
    
    public static void main(String[] args) {
        Rational r = new Rational(1, 2);
        System.out.println(r); // 1/2

        // We can use dot notation to access the integer values
        // of the numerator and denominator directly
        System.out.println(r.numerator); // 1
        System.out.println(r.denominator); // 2

//        // A basic test for adding Rationals
        Rational s = new Rational(1, 3);
        System.out.println(s); // 1/3

        Rational t = Rational.add(r, s);
        System.out.println(t); // 5/6

        Rational a = Rational.subtract(r, s);
        System.out.println(a); // 1/6

        Rational b = Rational.multiply(r, s);
        System.out.println(b); // 1/6

        Rational c = Rational.divide(r, s);
        System.out.println(c); // 3/2


       // A more advanced test for adding Rational that won't work
        // until the greatestCommonFactor and simplify methods work
        Rational x = new Rational(1, 6);
        Rational y = Rational.add(t, x);
        System.out.println(Rational.simplify(y)); // 1/1
    }
}
