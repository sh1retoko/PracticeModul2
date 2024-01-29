package TasksEasyA;

public class TaskA2 {
    public static void main(String[] args) {
        TaskA2 turtle = new TaskA2();
        turtle.setName("Arkadiy Ivanovich");
        System.out.println(turtle.name);
    }

    String name = "";

    public void setName(String n) {
        name = n;
    }
}
