package task_3;

public class Main {
    public static void main(String[] args) {

        Player player = new Player();

        System.out.println("Воспроизведение: ");
        player.play();
        player.pause();
        player.play();
        player.stop();

        System.out.println("\nЗапись: ");
        player.record();
        player.pause();
        player.record();
        player.stop();
    }
}
