package com.hr.weather_client.test;

import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;

/**
 *  调用免费的web service(天气预报)
 * @Name  : ClientTest
 * @Author : LH
 * @Date : 2018年5月12日 下午4:08:33
 * @Version : V1.0
 * 
 * @Description :  客户端编码方式访问(天气预报)web service
 * 
 */
public class ClientTest {

			public static void main(String[] args) {
				WeatherWS weatherWS = new  WeatherWS();
				WeatherWSSoap weatherWSSoap =weatherWS.getWeatherWSSoap();
				ArrayOfString weather =  weatherWSSoap.getWeather("上海", null);
			    List<String> cityList = weather.getString();
			    System.out.println(cityList);
			}

}
