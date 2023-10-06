public class Car implements Cloneable {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        Car car = (Car) super.clone();
        car.engine = engine.clone();
        return car;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
