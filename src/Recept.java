import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recept {

    public Set<Loot> setR = new HashSet<>();
    public Set<Loot>setS=new HashSet<>();
    int price;
    String name;

    public Recept (int price,String name) {
    //    this.setR=setR;
        this.price=price;
        this.name=name;

    }
    public void add(Loot loot) throws Exception {
        if (!setR.contains(loot)) {
            setR.add(loot);
        } else {
            throw new RuntimeException(" такой продукт в рецепте  уже есть");
        }
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Set<Loot> getSetR() {
        return setR;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recept recept = (Recept) o;
        return price == recept.price && Objects.equals(setR, recept.setR) && Objects.equals(setS, recept.setS) && Objects.equals(name, recept.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(setR, setS, price, name);
    }

    @Override
    public String toString() {
        return "Recept{" +
                "setR=" + setR +
                ", setS=" + setS +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
