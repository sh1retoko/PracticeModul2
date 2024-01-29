package TasksMiddleA;

public class TaskA15 {
    public static void main(String[] args) {
        TaskA15 taskA15 = new TaskA15();
        taskA15.years(350);
    }

    public void years(int year) {

        if (year % 400 == 0 || year % 4 == 0){
            System.out.println("This year is a leap year");
        } else if (year % 100 != 0) {
            System.out.println("This year is a leap year");
        } else {
            System.out.println("This year is not a leap year");
        }

    }
}
