/**
 * 
 */
package com.trgis.guide.service.impl;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trgis.guide.dao.GuideDAO;
import com.trgis.guide.entity.GuideScore;
import com.trgis.guide.service.GuideService;
import com.trgis.utils.xls.poi.XLSUtils;

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

	@Override
	public int importGuideScore(File file) {
		int count = 0;
		try {
			List<List<String>> result = XLSUtils.getExcelRecords(file, null,
					null);
			for (int i = 1, size = result.size(); i < size; i++) {
				List<String> list = result.get(i);
				GuideScore gs = new GuideScore();
				if (list.isEmpty() || list.size() < 10
						|| StringUtils.isEmpty(list.get(0))) {
					continue;
				}
				count++;
				gs.setSerializableNumber(list.get(0));
				gs.setName(list.get(1));
				gs.setGender(list.get(2));
				gs.setWorkCompany(list.get(3));
				gs.setIdentification(list.get(4));
				gs.setExamnum(list.get(5));
				gs.setLeader(list.get(6));
				gs.setTourPlace(list.get(7));
				gs.setLeaderEnglish(list.get(8));
				gs.setScore(list.get(9));
				guideDAO.save(gs);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return -1;
		}
		return count;
	}

}
