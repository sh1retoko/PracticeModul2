package TasksMiddleA;

public class TaskA12 {
    public static void main(String[] args) {
        isPow(64);
    }

    public static void isPow(int n) {
        int count = 0, now = 1;

        while (now < n){
            now *= 2;
            count++;
        }

        if (now == n){
            System.out.println(count);
        }else {
            System.out.println("NO");
        }
    }
}
