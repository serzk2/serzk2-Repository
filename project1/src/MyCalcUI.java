import java.util.Scanner;
// This is UI class
public class MyCalcUI {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
             System.out.println("Введите первое число и нажмите Enter:");
                double x1 = sc.nextDouble();
             System.out.println("Введите оператор (+, -, *, /) и нажмите Enter:");
                String op = sc.next();
            System.out.println("Введите второе число и нажмите Enter:");
             double x2 = sc.nextDouble();

             sc.close();

        System.out.println("Результат:" + Calc.methodCalc(x1, op, x2));
    }
}
