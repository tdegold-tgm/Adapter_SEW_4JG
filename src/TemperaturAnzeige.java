public class TemperaturAnzeige implements SensorAnzeige{

    private SensorAdapter adapter;
    private double current_temperatur;

    public TemperaturAnzeige(TemperaturSensor s){
        this.adapter = new TemperaturAdapter(s);
        this.current_temperatur = this.adapter.getTemperatur();
    }

    @Override
    public void displayData() {
        System.out.println(adapter.getTemperatur()+" Celsius");
    }

    @Override
    public double getData() {
        return this.current_temperatur;
    }
}
