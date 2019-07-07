package fan;

public class main {
    public static void main(String[] args) {
        fan fan1 = new fan();
        fan fan2 = new fan();
        fan1.setSpeed(fan.MEDIUM);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        fan2.setSpeed(fan.FAST);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(fan1.toString());
    }
}
