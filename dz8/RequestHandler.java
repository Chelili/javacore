package AccuWeather;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class RequestHandler {

    private static final OkHttpClient okHttpClient = new OkHttpClient();
    private static final ObjectMapper objectMapper = new ObjectMapper();




    public static String getCityID() throws IOException {
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("locations")
                .addPathSegment("v1")
                .addPathSegment("search")
                .addQueryParameter("apikey", "GUiO1nGnjk4kPoZL1FVAX5jFiMGdeOKR")
                .addQueryParameter("q", "Moscow")
                .build();

        Request request = new Request.Builder()
                .addHeader("Accept", "application/json")
                .url(httpUrl)
                .build();

        Response response = okHttpClient.newCall(request).execute();

        String jsonOfCities = response.body().string();

        String cityId = objectMapper.readTree(jsonOfCities).get(0).at("/Key").asText();

        return cityId;
    }

    public static String getForecastForday(String cityId) throws IOException {

        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("1day")
                .addPathSegment("294021")
                .addQueryParameter("apikey", "GUiO1nGnjk4kPoZL1FVAX5jFiMGdeOKR")
                .addQueryParameter("language", "en")
                .build();

        Request request = new Request.Builder()
                .addHeader("Accept", "application/json")
                .url(httpUrl)
                .build();

        Response response = okHttpClient.newCall(request).execute();

        String jsonOfForecasts = response.body().string();

        String getForecastForday = objectMapper.readTree(jsonOfForecasts).get(0).at("/DailyForecasts/Date/EpochDate/Temperature/Minimum/Value/Unit/UnitTyp").asText();

        return null;
    }
}
