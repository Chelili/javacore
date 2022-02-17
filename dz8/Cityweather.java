package AccuWeather;

public class Cityweather {

    public Cityweather(String cityname, String day, String weather) {
        this.cityname = cityname;
        this.day = day;
        this.weather = weather;
    }

       public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    private String cityname;
    private String day;
    private String weather;

    @Override
    public String toString() {
        return "Cityweather{" +
                "cityname='" + cityname + '\'' +
                ", day='" + day + '\'' +
                ", weather='" + weather + '\'' +
                '}';
    }
}
