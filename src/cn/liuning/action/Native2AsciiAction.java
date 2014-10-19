package cn.liuning.action;

import java.net.URLEncoder;

import com.opensymphony.xwork2.ActionSupport;

public class Native2AsciiAction extends ActionSupport {
	private String donttransfer;
	private String alreadytransfer;
	public String getDonttransfer() {
		return donttransfer;
	}
	public void setDonttransfer(String donttransfer) {
		this.donttransfer = donttransfer;
	}
	public String getAlreadytransfer() {
		return alreadytransfer;
	}
	public void setAlreadytransfer(String alreadytransfer) {
		this.alreadytransfer = alreadytransfer;
	}
	@Override
	public String execute() throws Exception {
		if(donttransfer!=null){
			setAlreadytransfer(getUnicode(donttransfer));			
		}else{
			setAlreadytransfer("«Î ‰»Îƒ⁄»›£°");
		}
		
		return SUCCESS;
	}
	
	public String getUnicode(String s){
		String unicode = "";
        char[] charAry = new char[s.length()];
        for(int i=0; i<charAry.length; i++) {
          charAry[i] = (char)s.charAt(i);
           unicode+="\\u" + Integer.toString(charAry[i], 16);
        }
        return unicode;
	}
}
