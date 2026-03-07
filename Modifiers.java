	class Demo {
    public int a = 10;
    protected int b = 20;
    int c = 30;
    private int d = 40;

    public void showPublic() {
        System.out.println(a);
    }

    protected void showProtected() {
        System.out.println(b);
    }

    void showDefault() {
        System.out.println(c);
    }

    private void showPrivate() {
        System.out.println(d);
    }

    public void displayAll() {
        showPublic();
        showProtected();
        showDefault();
        showPrivate();
    }
}

public class Modifiers {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.displayAll();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
    }
}