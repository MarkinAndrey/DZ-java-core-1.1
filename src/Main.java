import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);
        //необходимо проверять знаменатель на 0.
        //В моем случае если знаменатель не равен нулю то выполняем деление, если знаменатель 0 то возвращаем null
    }
}
