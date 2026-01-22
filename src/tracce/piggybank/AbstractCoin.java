package tracce.piggybank;

public abstract class AbstractCoin implements Coin {

    @Override
    public int hashCode() {
        return (int)(this.value() * 100);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Coin)) return false;
        Coin c = (Coin) o;
        return (int)(this.value() * 100) == (int)(c.value() * 100);
    }
}