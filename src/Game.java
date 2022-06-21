import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random r = new Random();
        int tryNumber = 0;
        int intervalMax = 20;
        int justprix = r.nextInt(intervalMax);
        int price = 0;
        while(justprix != price) {
            System.out.println("entrez un numéro entre 0 et " + intervalMax);
            Scanner scan = new Scanner(System.in);

            if(justprix > price){
                System.out.println("C'est plus");
            }else {
                System.out.println("c'est moins");
            }
            price = scan.nextInt();
            tryNumber++;

        }
        System.out.println("Bravo le justprix est : " + justprix);
        System.out.println("Nombre d'essai : " + tryNumber);
    }
}
