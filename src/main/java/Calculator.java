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

        int sum = add(a, b);
        int product = times(sum, c);
        int quotient = div(d, e);
        int result = dif(product, quotient);

        return result;
    }
}

        int sum = add(a, b);              // 10 + 5 = 15
        int product = times(sum, c);      // 15 * 2 = 30
        int quotient = div(d, e);         // 8 / 4 = 2
        int result = dif(product, quotient); // 30 - 2 = 28

        return result;
    }
}
