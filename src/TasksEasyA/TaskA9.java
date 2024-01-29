package TasksEasyA;

public class TaskA9 {
    public static void main(String[] args) {
        TaskA9 taskA9 = new TaskA9();
        taskA9.findMedian(5,10,20);
    }

    public void findMedian(int a, int b, int c) {

        if((a >= b && a <= c) || (a >= c && a <= b)){
            System.out.println(a);
        } else if ((b >= a && b <= c) || (b >= c && b <= a)) {
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }
}
