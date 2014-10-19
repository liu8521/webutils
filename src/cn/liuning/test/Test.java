package cn.liuning.test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

import cn.liuning.utils.WebUtils;

public class Test {

	public static void main(String[] args) {
		String unicode = "";
		String s="ÓÃ»§Ãû";
	    char[] charAry = new char[s.length()];
	    for(int i=0; i<charAry.length; i++) {
	      charAry[i] = (char)s.charAt(i);
	       unicode+="\\u" + Integer.toString(charAry[i], 16);
	    }
	    System.out.println(unicode);
	}
}
