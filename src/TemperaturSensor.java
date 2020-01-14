public class TemperaturSensor {
    // typical range of room temperatur in Fahrenheit
    private final double MIN_TEMP = 68.0;
    private final double MAX_TEMP = 77.0;

    public TemperaturSensor(){ }

    public double getTemperatur(){
        // random temperature
        double random_temp = (double) (Math.random() * ((MAX_TEMP - MIN_TEMP) + 1)) + MIN_TEMP;
        // round temperature to 4 decimal places
        System.out.println(random_temp);
        return (double)Math.round(random_temp * 10000) / 10000;
    }
}
