import java.util.HashSet;
import java.util.Set;

public class Corz {
    public Set<Loot> sett = new HashSet<>();

    public Corz () {

    }

    // аргумент не должен быть типа  сет, он должен быть лут мы же в сет лут добавляем
    public void add(Loot loot) throws Exception {
        if (!sett.contains(loot)) {
            sett.add(loot);
        } else {
            throw new RuntimeException(" такой продукт уже есть");
        }
    }

    @Override
    public String toString() {
        return "Corz{" +
                "sett=" + sett +
                '}';
    }
}
