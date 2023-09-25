import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
 @Test
    public void testCarLights() {
        Car car = new Car("LED", false, true, "LED", false);
        assertEquals("LED", car.getLights());
    }

    @Test
    public void testCarLightsOnOff() {
        Car car = new Car("LED", false, true, "LED", false   );
        assert !car.isLightsOn();
        car.setLightsOn(true);
        assert car.isLightsOn();
    }

    @Test
    public void testCarLightsHalfOrFullLight() {
        Car car = new Car("LED", false, true, "LED", false);
        assert car.isHalfLight();
        car.setFullLight(false);
        assert !car.isHalfLight();
    }

    @Test
    public void testCarBackLights() {
        Car car = new Car("LED", false, true, "LED", false);
        assertEquals("LED", car.getBackLights());
    }

    @Test
    public void testCarStart() {
        Car car = new Car("LED", false, true, "LED", false);
        assert !car.isStarted();
        car.startCar();
        assert car.isStarted();
        System.out.println("Car is started");
    }
}