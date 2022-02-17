package AccuWeather.DB;

import AccuWeather.Cityweather;
import org.sqlite.JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Weather {

    private final static String Path_DB =
            "jdbc:sqlite:C:\\Users\\asd\\Desktop\\javacore\\mav1\\src\\main\\resources\\weatherMoscow.db";

    private Connection connection;


    public Weather() throws SQLException {
        DriverManager.registerDriver(new JDBC());
        this.connection = DriverManager.getConnection(Path_DB);
    }

    public void addCityweather(Cityweather cityweather) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("" + "INSERT INTO InfoOfWeather('cityname', 'day', 'weather') " +
                "VALUES(?, ?, ?)");

        statement.setObject(1,cityweather.getCityname());
        statement.setObject(2,cityweather.getDay());
        statement.setObject(3,cityweather.getWeather());

        public List(Cityweather) getAllCityweather throws SQLException {
            List<Cityweather> cityweathers = new ArrayList<>();
            Statement statement = this.connection.createStatement();
           ResultSet resultSet = statement.executeQuery("SELECT * FROM InfoOfWeather");

           while (resultSet.next()) {
               String cityname = resultSet.getString("cityname");
               String day = resultSet.getString("day");
               String weather = resultSet.getString("weather");

               Cityweather cityweather = new Cityweather(cityname, day, weather);
               cityweathers.add(cityweather);
           }
             statement.close();

             return cityweathers;


        }





    }
}
