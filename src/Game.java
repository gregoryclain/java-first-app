import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Random r = new Random();
        int justprix = r.nextInt(200);
        int prix = 0;
        System.out.println("Le justprix : " + justprix);
    }
}
