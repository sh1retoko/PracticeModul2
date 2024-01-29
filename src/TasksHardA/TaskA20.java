package TasksHardA;

public class TaskA20 {
    public static void main(String[] args) {
        TaskA20 taskA20 = new TaskA20();
        taskA20.drawRectangle(6,10,"+");
    }

    public void drawRectangle(int n, int m, String s) {
        for (int i = 0; i < n; i++) {

            String string = "";

            if (i == 0 || i == n - 1) {

                for (int j = 0; j < m; j++) {

                    string += s;
                }

            } else {

                string += s;

                for (int j = 1; j < m - 1; j++) {

                    string += " ";
                }

                if (m != 1) {
                    string += s;
                }
            }

            System.out.println(string);
        }
    }
}
