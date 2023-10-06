import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car;

    @BeforeEach
    void setUp() {
        Engine engine = new Engine(150);
        car = new Car(engine);
    }

    @Test
    void shouldCloneCarAndEngine() throws CloneNotSupportedException {
        Car clonedCar = car.clone();
        assertNotSame(car, clonedCar);
        assertNotSame(car.getEngine(), clonedCar.getEngine());
    }
}