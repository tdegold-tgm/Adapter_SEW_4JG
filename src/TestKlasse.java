public class TestKlasse {
    public static void main(String[] args) {
        TemperaturSensor sensor = new TemperaturSensor();
        TemperaturAnzeige anzeige = new TemperaturAnzeige(sensor);
        anzeige.displayData();
    }
}
