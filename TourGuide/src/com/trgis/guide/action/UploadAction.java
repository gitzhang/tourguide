package com.trgis.guide.action;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.trgis.guide.service.GuideService;

@Component
public class UploadAction extends ActionSupport {

	@Autowired
	private GuideService guideService;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private File file;

	private String fileFileName;

	private String fileContentType;

	@Override
	public String execute() throws Exception {
		int result = guideService.importGuideScore(file);
		if (result != -1) {
			addActionMessage("成功添加" + result + "条数据。");
			return SUCCESS;
		} else {
			addActionError("添加失败，请联系运维人员。QQ44056919");
			return ERROR;
		}
	}

	@Override
	public void validate() {
		super.validate();
		clearErrorsAndMessages();
	}
	
	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	public void setGuideService(GuideService guideService) {
		this.guideService = guideService;
	}

}
