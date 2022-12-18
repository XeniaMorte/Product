import java.util.HashMap;
import java.util.Objects;

public class Randa {
    public HashMap<String, Integer> ower = new HashMap<>();

    public Randa() {
    }

    public void add(String key, Integer value) {
        if (!ower.containsKey(key)) {
            ower.put(key, value);
        } else {
            if (ower.get(key).equals(value)) {
                throw new RuntimeException("такое значение уже есть");
            } else if (ower.containsKey(key) && (!ower.get(key).equals(value))) {
                ower.replace(key, value);
            }
        }

    }

    @Override
    public String toString() {
        return "Randa{" +
                "ower=" + ower +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Randa randa = (Randa) o;
        return Objects.equals(ower, randa.ower);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ower);
    }

    public HashMap<String, Integer> getOwer() {
        return ower;
    }
}
