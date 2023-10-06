public class Engine implements Cloneable {
    private int horsePower;

    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        return (Engine) super.clone();
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
