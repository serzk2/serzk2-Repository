// This is API class
 class Calc {
    public static double methodCalc(double a1, String op, double a2)
    {
        double result = 0;
        switch(op)
        {
            case "+" : result = a1 + a2;
                break;
            case "-" : result = a1 - a2;
                break;
            case "*" : result = a1 * a2;
                break;
            case "/" : result = a1 / a2;
                break;
        }
        return result;
    }
}
