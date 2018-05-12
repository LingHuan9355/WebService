package com.hr.weather_client.test;

import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;

/**
 *  ������ѵ�web service(����Ԥ��)
 * @Name  : ClientTest
 * @Author : LH
 * @Date : 2018��5��12�� ����4:08:33
 * @Version : V1.0
 * 
 * @Description :  �ͻ��˱��뷽ʽ����(����Ԥ��)web service
 * 
 */
public class ClientTest {

			public static void main(String[] args) {
				WeatherWS weatherWS = new  WeatherWS();
				WeatherWSSoap weatherWSSoap =weatherWS.getWeatherWSSoap();
				ArrayOfString weather =  weatherWSSoap.getWeather("�Ϻ�", null);
			    List<String> cityList = weather.getString();
			    System.out.println(cityList);
			}

}
