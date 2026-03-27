import java.util.Scanner;

class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    protected void display() {
        System.out.println("Base Calculator Display");
    }

    private void show() {
        System.out.println("Private Method in Calculator");
    }

    public void accessPrivate() {
        show();
    }
}

class AdvancedCalculator extends Calculator {

    public int add(int a, int b) {
        return a + b + 10;
    }

    protected void display() {
        System.out.println("Advanced Calculator Display");
    }

    public void show() {
        System.out.println("Show Method in AdvancedCalculator");
    }
}

public class overrideone {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Calculator c = new Calculator();
        System.out.println(c.add(a, b));
        c.display();
        c.accessPrivate();

        AdvancedCalculator ac = new AdvancedCalculator();
        System.out.println(ac.add(a, b));
        ac.display();
        ac.show();

        Calculator ref = new AdvancedCalculator();
        System.out.println(ref.add(a, b));
        ref.display();
        ref.accessPrivate();
    }
}