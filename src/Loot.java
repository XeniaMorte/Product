import java.util.Objects;

public class Loot {
    String name;
    int cost;
    int coutn;

    public Loot(int cost, int coutn, String name) throws Exception {
        if (cost == 0) {
            throw new Exception("Заполните карточку товара полностью");
        }
        this.cost = cost;
        if (coutn == 0) {
            throw new Exception("Заполните карточку товара полностью");
        }
        this.coutn = coutn;
        if (Objects.equals(name, "")) {
            throw new Exception("Заполните карточку товара полностью");

        }
        this.name = name;

    }

    @Override
    public String toString() {
        return "Loot{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", coutn=" + coutn +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Loot loot = (Loot) o;
        return cost == loot.cost && coutn == loot.coutn && Objects.equals(name, loot.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, coutn);
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getCoutn() {
        return coutn;
    }

    public float getWeight() {
    }
}
