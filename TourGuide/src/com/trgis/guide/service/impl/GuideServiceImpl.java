/**
 * 
 */
package com.trgis.guide.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trgis.guide.dao.GuideDAO;
import com.trgis.guide.entity.GuideScore;
import com.trgis.guide.service.GuideService;

/**
 * @author bmy
 * 
 */
@Service
@Transactional
public class GuideServiceImpl implements GuideService {

	@Autowired
	private GuideDAO guideDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.trgis.guide.service.GuideService#getGuideScore(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public GuideScore getGuideScore(String name, String identiftcation,
			String examnum) {
		String hql = "from GuideScore where name = ? and identification = ? and examnum = ?";
		return guideDAO.findUnique(hql, name, identiftcation, examnum);
	}

	@Override
	public void addGuideScore(GuideScore entity) {
		guideDAO.save(entity);
	}

}
