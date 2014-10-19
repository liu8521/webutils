package cn.liuning.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import cn.liuning.domain.Book;
import cn.liuning.utils.PublicUtils;

public class LibraryService {

	CloseableHttpClient httpclient= HttpClients.createDefault();

	public List<Book> find_Book() throws Exception, IOException {
		 HttpGet httpGet = new HttpGet("http://222.206.65.12/reader/book_lst.php");
         CloseableHttpResponse response1 = httpclient.execute(httpGet);
         try {
            String str = EntityUtils.toString(response1.getEntity());
            str = new String(str.getBytes("iso8859-1"), "utf-8");
            PublicUtils book_html=new PublicUtils();
            List<Book> list = book_html.changeTobean(str);
            return list;
         } finally {
             response1.close();
         }
	}
	public List<Book> find_library(String number, String password) throws IOException, Exception{
		login(number,password);
		return find_Book();
	}
	public void login(String number,String password) throws Exception{
		 HttpPost httpPost = new HttpPost("http://222.206.65.12/reader/redr_verify.php");
         List <NameValuePair> nvps = new ArrayList <NameValuePair>();
         nvps.add(new BasicNameValuePair("number", number));
         nvps.add(new BasicNameValuePair("passwd", password));
         nvps.add(new BasicNameValuePair("select", "cert_no"));
         nvps.add(new BasicNameValuePair("returnUrl", ""));
         httpPost.setEntity(new UrlEncodedFormEntity(nvps));
         CloseableHttpResponse response2 = httpclient.execute(httpPost);
         try {
             EntityUtils.toString(response2.getEntity());
         } finally {
             response2.close();
         }
	}
}
