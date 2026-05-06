public class Calculator {

    public int add(int a, int b){
        return a + b;
    }

    public int dif(int a, int b){
        return a - b;
    }

    public int div(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    public int times(int a, int b){
        return a * b;
    }

    // Формула: (a + b) * c - d / e
    public int solver(){
        int a = 10, b = 5, c = 2, d = 8, e = 4;

        int sum = add(a, b);              // 10 + 5 = 15
        int product = times(sum, c);      // 15 * 2 = 30
        int quotient = div(d, e);         // 8 / 4 = 2
        int result = dif(product, quotient); // 30 - 2 = 28

        return result;
    }
}

//public class Calculator {
//
//    public int add(int a, int b){
//        return a + b;
//    }
//
//    public int dif(int a, int b){
//        return a - b;
//    }
//
//    public int div(int a, int b){
//        if (b == 0) {
//            throw new ArithmeticException("Деление на ноль!");
//        }
//        return a / b;
//    }
//
//    public int times(int a, int b){
//        return a * b;
//    }
//
//    public int solver(){
//        int a = 10;
//        int b = 5;
//        int c = 2;
//        int d = 20;
//        int e = 4;
//
//        int result = dif(times(add(a, b), c), div(d, e));
//
//        return result;
//    }
//}

//public class Calculator {
//    public int add(int a, int b){
//        //TODO inser your realisation in method add
//    }
//    public int dif(int a, int b){
//        //TODO inser your realisation in method dif
//    }
//    public int div(int a, int b){
//        //TODO inser your realisation in method div
//    }
//    public int times(int a, int b){
//        //TODO inser your realisation in method times
//    }
//    public int solver(){
//        //TODO inser your realisation in method solver
//    }
//}


//public class Calculator {
//    public int add(int a, int b){
//        return a + b;
//    }
//    public int dif(int a, int b){
//        return a - b;
//    }
//
//    public int div(int a, int b){
//        if (b == 0) {
//            throw new ArithmeticException("Division by zero is not allowed");
//        }
//        return a / b;
//    }
//
//    public int times(int a, int b){
//        return a * b;
//    }
//
//    public String solver(){
//        int a = 4;
//        int b = -12;
//
//        if (a == 0 && b == 0) {
//            return "Infinite solutions";
//        }
//
//        if (a == 0) {
//            return "No solution";
//        }
//
//        int negativeB = dif(0, b);
//
//        double x = (double) negativeB / a;
//
//        return String.format("Solution of %d*x + (%d) = 0 → x = %.2f", a, b, x);
//    }
//
//}