package cn.liuning.utils;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class WebUtils {

	public static String chageFromInputStream(InputStream in) throws Exception{
		 ByteArrayOutputStream baos = new ByteArrayOutputStream();
	     byte[] buffer = new byte[1024];
	     int len = -1;
	     while ((len = in.read(buffer)) != -1) {
	         baos.write(buffer, 0, len);
	     }
	     baos.close();
	     in.close();
	     
	     byte[] lens = baos.toByteArray();
	     String result = new String(lens,"UTF-8");//内容乱码处理
	     
	     return result;
	}
	public static  Map<String,String> parseXML(InputStream input){
		try {
			
			Map<String ,String> map = new HashMap<String,String>();
			SAXReader reader = new SAXReader();
			Document document = reader.read(input);
			Element root = document.getRootElement();
			Element root2 = root.element("Weather");
			List <Element> elementList = root2.elements();
			System.out.println(elementList.size());
			for(Element e:elementList){
				map.put(e.getName(), e.getText());
				System.out.println(e.getText());
			}
			//释放资源
			input.close();
			input=null;
			return map;
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return null;
	}
}
