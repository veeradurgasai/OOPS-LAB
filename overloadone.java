import java.util.Scanner;

class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    protected int add(int a, int b, int c) {
        return a + b + c;
    }

    private double add(double a, double b) {
        return a + b;
    }

    public void showDecimalAddition(double a, double b) {
        System.out.println(add(a, b));
    }
}

public class overloadone {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(calc.add(a, b));

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println(calc.add(x, y, z));

        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        calc.showDecimalAddition(d1, d2);
    }
}