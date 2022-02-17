package AccuWeather;
import AccuWeather.DB.Weather;

import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) throws IOException, SQLException {
        System.out.println(RequestHandler.getCityID());

        RequestHandler.getForecastForday( RequestHandler.getCityID());

        try {
            Weather weather = new Weather();
            Cityweather cityweather = new Cityweather("Moscow", "1", "-12");
            weather.addCityweather(cityweather);

            System.out.println(Weather.getAllCityweather());

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
