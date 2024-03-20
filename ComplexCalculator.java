import java.util.InputMismatchException;

// Пример использования калькулятора комплексных чисел
public class ComplexCalculator {
    public static void main(String[] args) {
        System.Logger logger;
        try {


            ComplexNumber num1 = new ComplexNumber(-3.5, -3);
            ComplexNumber num2 = new ComplexNumber(1, 0);

            ComplexNumber sum = num1.add(num2);
            System.out.println("Сумма: " + sum);

            ComplexNumber difference = num1.subtract(num2);
            System.out.println("Разность: " + difference);

            ComplexNumber product = num1.multiply(num2);
            System.out.println("Произведение: " + product);

            ComplexNumber quotient = num1.divide(num2);
            System.out.println("Частное: " + quotient);

//        } catch (InputMismatchException e) {
//            System.out.println("Ошибка ввода: Пожалуйста, введите корректные значения для комплексных чисел.");
//        }
        }
        catch (ArithmeticException e) {
            System.out.println("Ошибка арифметики: " + e.getMessage());
        }
    }
}