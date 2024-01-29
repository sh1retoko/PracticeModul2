import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Ork ork = new Ork();
        Elf elf = new Elf();

        while (true) {
            if (!ork.isOrkAlive && elf.isElfAlive) {
                System.out.println(ork.name + " умер!");
                break;
            } else if (ork.isOrkAlive && !elf.isElfAlive) {
                System.out.println(elf.name + " умер!");
                break;
            } else if (!ork.isOrkAlive && !elf.isElfAlive) {
                System.out.println("Погибли оба!");
                break;
            }

            if (elf.hp < 0) {
                elf.isElfAlive = false;
            } else {
                elf.hp -= ork.strange;
            }

            if (ork.hp < 0) {
                ork.isOrkAlive = false;
            } else {
                ork.hp -= elf.strange;
            }
        }
    }
}

class Ork {
    Random random = new Random();

    String name = "Ork";
    int hp = random.nextInt(80, 100);
    int strange = random.nextInt(15, 20);

    boolean isOrkAlive = true;
}

class Elf {
    Random random = new Random();

    String name = "Elf";

    int hp = random.nextInt(80,90);

    int strange = random.nextInt(17, 22);

    boolean isElfAlive = true;
}
