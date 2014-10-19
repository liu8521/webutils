package cn.liuning.action;

import java.net.URLEncoder;

import com.opensymphony.xwork2.ActionSupport;

public class URLEncodingAction extends ActionSupport {
	
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
			setAlreadytransfer(URLEncoder.encode(donttransfer, "GB2312"));			
		}else{
			setAlreadytransfer("«Î ‰»Îƒ⁄»›£°");
		}
		
		return SUCCESS;
	}
	
	
}
