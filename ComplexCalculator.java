import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// Пример использования калькулятора комплексных чисел
public class ComplexCalculator {

    private static final Logger LOGGER = Logger.getLogger(ComplexCalculator.class.getName());

    public static void main(String[] args) {
        FileHandler fileHandler;
        try {
            try {
                fileHandler = new FileHandler("ComplexCalculator.log");
                LOGGER.addHandler(fileHandler);

                SimpleFormatter formatter = new SimpleFormatter();
                fileHandler.setFormatter(formatter);

                LOGGER.info("Задаём два комплексных числа.");
                ComplexNumber num1 = new ComplexNumber(-3.5, -3);
                ComplexNumber num2 = new ComplexNumber(1, 3);

                LOGGER.info("Проводим действия над двумя комплексными числами: " + num1 + "; " + num2);

                LOGGER.info("Вычисляем сумму");
                ComplexNumber sum = num1.add(num2);
                System.out.println("Сумма: " + sum);

                LOGGER.info("Вычисляем разность");
                ComplexNumber difference = num1.subtract(num2);
                System.out.println("Разность: " + difference);

                LOGGER.info("Вычисляем произведение");
                ComplexNumber product = num1.multiply(num2);
                System.out.println("Произведение: " + product);

                LOGGER.info("Вычисляем деление");
                ComplexNumber quotient = num1.divide(num2);
                System.out.println("Частное: " + quotient);


            } catch (ArithmeticException e) {
                LOGGER.severe("Столкнулись с ошибкой из-за невозможности поделить на ноль.");
                System.out.println("Ошибка арифметики: " + e.getMessage());
            }
        } catch (IOException e) {
            LOGGER.severe("Ошибка при создании лог файла.");
        }
    }
}