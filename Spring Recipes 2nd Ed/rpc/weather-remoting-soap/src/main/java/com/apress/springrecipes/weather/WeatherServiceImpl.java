package com.apress.springrecipes.weather;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService(serviceName = "WeatherService", endpointInterface = "com.apress.springrecipes.weather.WeatherService")
public class WeatherServiceImpl implements WeatherService {
    @WebMethod(operationName = "getTemperatures")
    public List<TemperatureInfo> getTemperatures(String city, List<Date> dates) {
        List<TemperatureInfo> temperatures = new ArrayList<TemperatureInfo>();

        for (Date date : dates) {
            temperatures.add(new TemperatureInfo(city, date, 5.0, 10.0, 8.0));
        }

        return temperatures;
    }
}
