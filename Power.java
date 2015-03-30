public class Power {
    public static double PowerWithExponent(double base, int exponent) {
        double result = 1.0;
        for (int i = 1; i <= exponent; ++i) {
            result *= base;
        }
        return result;
    }

    public static boolean equal(double num1, double num2) {
        if ((num1 - num2 > -0.0000001) && (num1 - num2) < 0.0000001) {
            return true;
        }
        return false;
    }

    public static double power(double base,int exponent){

        if(equal(base, 0.0) && (exponent < 0)){
            return 0.0;
        }
        int absExponent = 0;
        if(exponent < 0)
            absExponent = Math.abs(exponent);
        double result = PowerWithExponent(base, absExponent);

        if(exponent < 0)
            result = 1.0 / result;

        return result;
    }
}
