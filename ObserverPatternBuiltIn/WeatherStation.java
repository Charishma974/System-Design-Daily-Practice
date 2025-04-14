public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        // Create display elements and register them as observers
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        // First update: all displays active
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("\n--- HeatIndexDisplay is removed ---\n");

        // Remove heatIndexDisplay observer
        weatherData.deleteObserver(heatIndexDisplay);

        // Second update: heat index display won't receive this update
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("\n--- Final update ---\n");

        // Third update
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
