package cn.liuning.service;

import java.io.IOException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import cn.liuning.domain.Score;
import cn.liuning.utils.PublicUtils;

public class CetScoreService {

	CloseableHttpClient httpclient= HttpClients.createDefault();
	public Score find_GetofCet(String number,String name) throws Exception{
		Score score;
		try {
    		HttpGet httpGet1 = new HttpGet("http://www.chsi.com.cn/cet/query?zkzh="+number+"&xm="+name);
    		httpGet1.setHeader("Referer", "http://www.chsi.com.cn/cet/");
    		CloseableHttpResponse response3 = httpclient.execute(httpGet1);
    		try {
	               String str = EntityUtils.toString(response3.getEntity(),"utf-8");
	               score = PublicUtils.getList_CetHtmltojavabean(str);
             } finally {
                 response3.close();     
             }
        } finally {
            httpclient.close();
        }
		 return score;
	}

	
}
