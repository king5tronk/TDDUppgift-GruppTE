public class Car {

    private String lights;
    private boolean lightsOn;
    private boolean halfLight;
    private String backLights;
    private boolean carStarted;


    public Car(String lights, boolean lightsOn, boolean halfLight, String backLights, boolean carStarted) {
        this.lights = lights;
        this.lightsOn = false;
        this.halfLight = true;
        this.backLights = backLights;
        this.carStarted = false;
    }

    public String getLights() {
        return lights;
    }

    public boolean isLightsOn() {
        return lightsOn;
    }

    public boolean isHalfLight() {
        return halfLight;
    }

    public void setLightsOn(boolean lightsOn) {
        this.lightsOn = true;
    }

    public void setFullLight(boolean halfLight) {
        this.halfLight = false;

    }

    public String getBackLights() {
        return backLights;
    }

    public boolean isStarted() {
        return carStarted;
    }

    public void startCar() {
        this.carStarted = true;
    }
}

