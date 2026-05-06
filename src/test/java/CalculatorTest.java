import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void add() {
        assertEquals(5, calc.add(2, 3), "2 + 3 должно равняться 5");
        assertEquals(0, calc.add(-1, 1), "-1 + 1 должно равняться 0");
        assertEquals(-5, calc.add(-2, -3), "-2 + -3 должно равняться -5");
    }

    @Test
    void dif() {
        assertEquals(1, calc.dif(4, 3), "4 - 3 должно равняться 1");
        assertEquals(-5, calc.dif(2, 7), "2 - 7 должно равняться -5");
        assertEquals(0, calc.dif(5, 5), "5 - 5 должно равняться 0");
    }

    @Test
    void div() {
        assertEquals(3, calc.div(9, 3), "9 / 3 должно равняться 3");
        assertEquals(0, calc.div(1, 2), "1 / 2 (целочисленное) должно равняться 0");

        // Проверка исключения при делении на ноль
        assertThrows(ArithmeticException.class, () -> calc.div(5, 0),
                "Деление на ноль должно вызывать ArithmeticException");
    }

    @Test
    void times() {
        assertEquals(6, calc.times(2, 3), "2 * 3 должно равняться 6");
        assertEquals(0, calc.times(0, 100), "0 * 100 должно равняться 0");
        assertEquals(-12, calc.times(3, -4), "3 * -4 должно равняться -12");
    }

    @Test
    void solver() {
        // Проверяем результат формулы: (10 + 5) * 2 - 8 / 4 = 28
        assertEquals(28, calc.solver(), "Результат solver() должен быть 28");
    }
}


//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//class CalculatorTest {
//
//    Calculator calc = new Calculator();
//
//    @Test
//    void add() {
//        assertEquals(5, calc.add(2, 3));
//    }
//
//    @Test
//    void dif() {
//        assertEquals(1, calc.dif(3, 2));
//    }
//
//    @Test
//    void div() {
//        assertEquals(2, calc.div(4, 2));
//    }
//
//    @Test
//    void times() {
//        assertEquals(6, calc.times(2, 3));
//    }
//
//    @Test
//    void solver() {
//        assertEquals(25, calc.solver());
//    }
//}