import java.nio.charset.Charset;
import java.util.*;

public class Sawo {
    public Sawo() {

    }

    @Override
    public String toString() {
        return "Sawo{" +
                ", massiv=" + massive +
                '}';
    }

    HashMap<String, List<Integer>> massive = new HashMap<>();
    Random random = new Random(10);

    public void add() {
        for (int a = 0; a < 5; a++) {
            String generatedString = "string" + a;
            List<Integer> very = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                very.add(random.nextInt(1000));
            }
            massive.put(generatedString, very);
        }
    }

    public HashMap<String, Integer> calcSumOfValues() {
        var calcd = new HashMap<String, Integer>();

        for (Map.Entry<String, List<Integer>> entry : massive.entrySet()) {
            int resoult = 0;
            for (int i = 0; i < 3; i++) {
                resoult += entry.getValue().get(i);
            }
            calcd.put(entry.getKey(), resoult);

        }
        return calcd;

    }

    public LinkedHashMap<Integer, String> zadanievtorie() {
        var vtoroe = new LinkedHashMap<Integer, String>();
        for (int z = 1; z <=10; z++) {
            Integer generatedKey = z;
            String generatedSrt = random.nextInt()+" ___";
            vtoroe.put(generatedKey, generatedSrt);
        }
        return vtoroe;
    }


}






