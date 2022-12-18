import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recept {

    public HashSet<Loot> setR = new HashSet<>();
    public Set<Loot>setS=new HashSet<>();
    public HashMap<Loot,Integer>recipt=new HashMap<>();
    int price;
    String name;
    int count;

    public Recept (int price,String name,int count) {
    //    this.setR=setR;
        this.price=price;
        this.name=name;
        this.count=count;

    }
    public void add(Loot loot, int count) throws Exception {
        if (!recipt.containsKey(loot)) {
            recipt.put(loot,count);
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
    public int  riceptCoast(Integer price,Integer count){
        int allprice =0;
        allprice=recipt.get(price)*count;
        return  allprice;

    }
}
