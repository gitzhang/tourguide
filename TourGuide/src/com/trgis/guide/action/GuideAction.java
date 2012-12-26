/**
 * 
 */
package com.trgis.guide.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.trgis.guide.entity.GuideScore;
import com.trgis.guide.service.GuideService;

/**
 * @author bmy
 * 
 */
@Component
public class GuideAction extends ActionSupport implements RequestAware,
		ServletRequestAware {

	@Autowired
	private GuideService guideService;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger log = Logger.getLogger(GuideAction.class);

	private Map<String, Object> request;

	private String name;

	private String identification;

	private String examnum;

	private GuideScore guideScore;

	private String basePath;

	public String getScoreAction() {
		log.info("开始查询考生成绩");
		log.info("查询参数【" + name + " , " + identification + "," + examnum + "】");
		guideScore = guideService.getGuideScore(name, identification, examnum);
		if (guideScore == null) {
			log.info("未找到该考生");
			addActionError("查询失败，请准确填写您的考生信息。");
			return INPUT;
		} else {
			log.info("找到该考生");
			request.put("guideScore", guideScore);
		}
		log.info("正常返回");
		return SUCCESS;
	}

	@Override
	public void validate() {
		this.clearErrorsAndMessages();
		super.validate();
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public void setExamnum(String examnum) {
		this.examnum = examnum;
	}

	public String getName() {
		return name;
	}

	public String getIdentification() {
		return identification;
	}

	public String getExamnum() {
		return examnum;
	}

	public void setGuideScore(GuideScore guideScore) {
		this.guideScore = guideScore;
	}

	public GuideScore getGuideScore() {
		return guideScore;
	}

	public String getBasePath() {

		return basePath;
	}

	public void setBasePath(String basePath) {
		this.basePath = basePath;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		String path = request.getContextPath();
		basePath = request.getScheme() + "://" + request.getServerName() + ":"
				+ request.getServerPort() + path + "/";
	}

}
