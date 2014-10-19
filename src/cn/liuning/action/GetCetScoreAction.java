package cn.liuning.action;

import cn.liuning.domain.Score;
import cn.liuning.service.CetScoreService;

import com.opensymphony.xwork2.ActionSupport;

public class GetCetScoreAction extends ActionSupport {
	
	private String number;
	private String name;
	private Score score;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}
	@Override
	public String execute() throws Exception {
		CetScoreService service = new CetScoreService();
		try{
			Score score = service.find_GetofCet(number,name);
			setScore(score);
			return SUCCESS;
		}catch (Exception e){
			setScore(null);
			throw new Exception("准考证或者姓名填写错误！");
		}	
		
	}
	
}
