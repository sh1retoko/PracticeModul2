package TasksEasyA;

public class TaskA8 {
    public static void main(String[] args) {
        TaskA8 taskA8 = new TaskA8();
        taskA8.numbers();
    }

    public void numbers() {
        for (int i = 1; i <= 100; i++) {

            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
