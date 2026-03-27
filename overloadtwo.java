import java.util.Scanner;

class Notifier {

    public void send(String msg) {
        System.out.println("General: " + msg);
    }

    protected void send(String msg, String email) {
        System.out.println("Email: " + msg + " -> " + email);
    }

    void send(String msg, long phone) {
        System.out.println("SMS: " + msg + " -> " + phone);
    }

    private void send(int code) {
        System.out.println("Private Notification Code: " + code);
    }

    public void accessPrivate(int code) {
        send(code);
    }
}

class AppNotifier extends Notifier {

    public void useMethods(String msg, String email, long phone, int code) {
        send(msg);
        send(msg, email);
        send(msg, phone);
        accessPrivate(code);
    }
}

public class overloadtwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String msg = sc.nextLine();
        String email = sc.nextLine();
        long phone = sc.nextLong();
        int code = sc.nextInt();

        AppNotifier app = new AppNotifier();
        app.useMethods(msg, email, phone, code);
    }
}