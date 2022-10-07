public class Display1 implements Observer, DisplayElement {
    private WeatherData weatherData;
    private float temp;
    private float hum;

    public Display1(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    public void update() {
        temp = weatherData.temperature;
        hum = weatherData.humidity;
        display();
    }
    public void display() {
        System.out.println("Current conditions: " + temp + "F degrees and " + hum + "% humidity");
    }
}