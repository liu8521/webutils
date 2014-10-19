package cn.liuning.action;


import java.net.URLEncoder;

import org.apache.struts2.ServletActionContext;
import cn.liuning.domain.WeatherInf;
import cn.liuning.service.WeatherService;
import com.opensymphony.xwork2.ActionSupport;
public class FindWeatherAction extends ActionSupport {

	private String city;
	private WeatherInf weather;
	
	public WeatherInf getWeather() {
		return weather;
	}

	public void setWeather(WeatherInf weather) {
		this.weather = weather;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String execute() throws Exception  {
		String method=ServletActionContext.getRequest().getMethod();
		String type=ServletActionContext.getRequest().getCharacterEncoding();
		System.out.println(type);
		String aaa=city;
		if(method.equals("POST")){
			aaa = URLEncoder.encode(city);
		}
		
		WeatherService service = new WeatherService(aaa);
		WeatherInf info = service.getWeather();
		setWeather(info);
		return SUCCESS;
		
		
	}
	
	
}
