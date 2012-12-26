package com.trgis.guide.dao;

import org.springframework.stereotype.Repository;

import com.trgis.common.utils.entity.hibernate.SimpleHibernateDao;
import com.trgis.guide.entity.GuideScore;

@Repository
public class GuideDAO extends SimpleHibernateDao<GuideScore, String> {

}
