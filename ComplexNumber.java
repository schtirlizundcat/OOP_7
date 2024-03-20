// Класс комплексного числа
class ComplexNumber {
    double real;
    double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {return real;}

    public double getImaginary() {return imaginary;}

    // Метод сложения комплексных чисел
    public ComplexNumber add(ComplexNumber num) {
        return new ComplexNumber(this.real + num.real, this.imaginary + num.imaginary);
    }

    // Метод вычитания комплексных чисел
    public ComplexNumber subtract(ComplexNumber num) {
        return new ComplexNumber(this.real - num.real, this.imaginary - num.imaginary);
    }

    // Метод умножения комплексных чисел
    public ComplexNumber multiply(ComplexNumber num) {
        double newReal = this.real * num.real - this.imaginary * num.imaginary;
        double newImaginary = this.real * num.imaginary + this.imaginary * num.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    // Метод деления комплексных чисел
    public ComplexNumber divide(ComplexNumber num) {
        double denominator = num.real * num.real + num.imaginary * num.imaginary;
        if (denominator == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        double newReal = (this.real * num.real + this.imaginary * num.imaginary) / denominator;
        double newImaginary = (this.imaginary * num.real - this.real * num.imaginary) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }

    @Override
    public String toString() {
        String imaginarySign = " + ";
        if (imaginary < 0.0) imaginarySign = " ";
        return real + imaginarySign + imaginary + " i";
    }
}