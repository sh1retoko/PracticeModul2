public class Task13 {
    public static void main(String[] args) {
        int bucket = 30;
        int emptyBucket = 0;

        for (int i = 0; i < 30; i++) {
            bucket--;
            System.out.println("Убавляется: " + bucket);

            if (bucket % 10 != 0) {
                emptyBucket++;
            }

            System.out.println("Пополняется: " + emptyBucket);
        }
    }
}
