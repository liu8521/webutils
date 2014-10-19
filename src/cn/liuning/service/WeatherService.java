package cn.liuning.service;

import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;

import cn.liuning.domain.WeatherInf;
import cn.liuning.utils.WebUtils;

public class WeatherService {
	private String city;
	
	public WeatherService(String city){
		this.city=city;
	}
	public WeatherService() {

	}
	
	public WeatherInf getWeather() throws Exception{
		try {
			URL url = new URL("http://php.weather.sina.com.cn/xml.php?city="+city+"&password=DJOYnieT8234jlsK&day=0");
			Map<String ,String> map = WebUtils.parseXML(url.openStream());
			WeatherInf weatherInf = new WeatherInf();
			weatherInf.setCity(map.get("city"));
			weatherInf.setDirection1(map.get("direction1"));
			weatherInf.setDirection2(map.get("direction2"));
			
			weatherInf.setShuoming1(map.get("chy_shuoming"));
			weatherInf.setShuoming2(map.get("ssd_s"));
			weatherInf.setShuoming3(map.get("gm_s"));
			
			weatherInf.setShuoming4(map.get("yd_s"));
			weatherInf.setStatus1(map.get("status1"));
			weatherInf.setStatus2(map.get("status2"));
			weatherInf.setTemperature1(map.get("temperature1"));
			weatherInf.setTemperature2(map.get("temperature2"));
			weatherInf.setUpdatetime(map.get("savedate_weather"));
			return weatherInf;
		} catch (Exception e) {
			throw new Exception(e);
		}

	}
	
	
}
