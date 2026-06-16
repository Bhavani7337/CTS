public class Main {
    public static void main(String[] args) {

        Notifier notifier = new EmailNotifier();

        System.out.println("=== Email Only ===");
        notifier.send("Hello User");

        notifier = new SMSNotifierDecorator(notifier);
        System.out.println("\n=== Email + SMS ===");
        notifier.send("Hello User");

        notifier = new SlackNotifierDecorator(notifier);
        System.out.println("\n=== Email + SMS + Slack ===");
        notifier.send("Hello User");
    }
}