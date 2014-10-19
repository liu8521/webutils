package cn.liuning.utils;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import cn.liuning.domain.Book;
import cn.liuning.domain.Score;

public class PublicUtils {

	 public static Score getList_CetHtmltojavabean(String str)
	 {

		Document doc = Jsoup.parse(str);
		Element table = doc.getElementsByTag("table").get(1);
		Elements trs = table.getElementsByTag("tr");
		Score score = new Score();
		for (int i = 0; i < trs.size(); i++) 
		{
			Element current_tr = trs.get(i);
			Element td=current_tr.getElementsByTag("td").get(0);
			String text=td.text();
			if(i==0){
				score.setName(text);
			}else if(i==1){
				score.setSchool(text);
			}else if(i==2){
				score.setCategory(text);
			}else if(i==3){
				score.setExamnumber(text);
			}else if(i==4){
				score.setTestTime(text);
			}else if(i==5){
				score.setTotalScore(text.substring(0, 3));
				score.setListen(text.substring(8, 11));
				score.setReading(text.substring(16, 20));
				score.setTranslate(text.substring(27, 30));
			}
		}
		return score;
	}
	 
	 public List<Book> changeTobean(String str){
			
			Document doc = Jsoup.parse(str);
			Element table = doc.getElementsByTag("table").get(0);
			Elements trs = table.getElementsByTag("tr");
			ArrayList<Book> list=new ArrayList<Book>();
			
			for (int i = 1; i < trs.size(); i++)
			{
				Element tr1 = trs.get(i);
				Elements tds = tr1.getElementsByTag("td");
				Book book = new Book();
				for (int j = 0; j < tds.size() - 2; j++)
				{	
					Element td = tds.get(j);
					String text = td.text();
					System.out.println(text);
					if(j==0) {
						book.setBarcode(text);
					}
					else if(j==1) {
						book.setBookname(text);
					}
					else if(j==2) {
						book.setAuthor(text);
					}
						
					else if(j==3) {
						book.setBorrowdate(text);
					}
					else if(j==4) {
						book.setReturndate(text);
					}
					else if(j==5) {
						book.setCollectplace(text);
					}
				}
				list.add(book);
			}
		
			return list;
		}
}
