package com.trgis.guide.service;

import com.trgis.guide.entity.GuideScore;

public interface GuideService {

	public void addGuideScore(GuideScore entity);

	public GuideScore getGuideScore(String name, String identification,
			String examnum);

}
