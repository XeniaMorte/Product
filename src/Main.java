import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {






    public static void main(String[] args) throws Exception {
        Loot pomidor=new Loot(7,9,"pomidor");
        Loot kokos=new Loot(43,8,"kokos");
        Loot milk=new Loot(3876,9,"milk");
        Loot fish=new Loot(1,3,"fish");
        Loot ice=new Loot(35,3678,"ice");
        Loot ice2=new Loot(35,3678,"ice");
        Corz corz =new Corz();

        corz.add(pomidor);
        corz.add(kokos);
        corz.add(milk);
        corz.add(fish);
        corz.add(ice);
     //   corz.add(ice2);
        System.out.println(corz);
        Recept salat=new Recept(145,"блины");
        Recept ragu=new Recept(6545,"рагу");
        salat.add(pomidor);
        salat.add(ice);
        salat.add(ice2);
        System.out.println(salat);

    }
}