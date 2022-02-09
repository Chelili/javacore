package AccuWeather;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
       System.out.println(RequestHandler.getCityID());

       RequestHandler.getForecastForday( RequestHandler.getCityID());
    }
}
