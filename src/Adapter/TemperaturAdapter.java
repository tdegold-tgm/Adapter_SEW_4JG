package Adapter;

import Adapter.SensorAdapter;
import Sensor.TemperaturSensor;

public class TemperaturAdapter implements SensorAdapter {

    private TemperaturSensor tempS;

    public TemperaturAdapter(TemperaturSensor sensor){
        this.tempS = sensor;
    }

    @Override
    public double getTemperatur() {
        double tempFahrenheit = this.tempS.getTemperatur();
        double tempCelsius = convertToCelsius(tempFahrenheit);
        return tempCelsius;
    }

    private double convertToCelsius(double tempFahrenheit) {
        double tempCelsius = (5.0/9.0)*(tempFahrenheit-32.0);
        return (double)Math.round(tempCelsius * 100) / 100;
    }
}
