import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {
        Loot pomidor = new Loot(7, 9, "pomidor");
        Loot kokos = new Loot(43, 8, "kokos");
        Loot milk = new Loot(3876, 9, "milk");
        Loot fish = new Loot(1, 3, "fish");
        Loot kish = new Loot(8, 3, "kish");
        Loot ice = new Loot(35, 3678, "ice");
        Loot ice2 = new Loot(35, 3678, "ice");
        Corz corz = new Corz();

        corz.add(pomidor);
        corz.add(kokos);
        corz.add(milk);
        corz.add(fish);
        corz.add(ice);
        //   corz.add(ice2);
        System.out.println(corz);
        Recept salat = new Recept(145, "блины", 2);
        Recept ragu = new Recept(6545, "рагу", 2);
        salat.add(pomidor, 2);
        salat.add(ice, 2);
        Random random = new Random(20);
        int number = random.nextInt(10);
        Randa randa = new Randa();
        randa.add("nbgv", random.nextInt(7));
        randa.add("ikjhnbg8765tgv", random.nextInt(10));
        randa.add("ikdcjhnbgv", random.nextInt(10));
        randa.add("ikjkjhgbhnbgv", random.nextInt(10));
        System.out.println(randa);
        randa.add("dfvb ", random.nextInt(10));
        randa.add("dfvb ", random.nextInt(1));
       // randa.add("dfvb ", random.nextInt(1));
        Sawo sawo = new Sawo();
        sawo.add();

        System.out.println(sawo.massive);
        System.out.println(sawo.calcSumOfValues());
        System.out.println(sawo.zadanievtorie());



    }


    // salat.add(ice2,1);
    //   System.out.println(salat);
    //  salat.riceptCoast(3,5);
    //System.out.println(  salat.riceptCoast(3,5));

}
