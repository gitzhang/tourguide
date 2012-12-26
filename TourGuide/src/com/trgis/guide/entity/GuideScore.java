package com.trgis.guide.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.StringUtils;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "t_guidescore")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class GuideScore {

	@Id
	@GeneratedValue(generator = "UIDGenerator")
	@GenericGenerator(name = "UIDGenerator", strategy = "com.trgis.common.utils.entity.UIDGenerator")
	private String id;

	@Column
	private String name;

	@Column
	private String identification;

	@Column
	private String examnum;

	@Column
	private Double score;

	public GuideScore() {
	}

	public GuideScore(String id, String name, String identification,
			String examnum, Double score) {
		this.id = id;
		this.name = name;
		this.identification = identification;
		this.examnum = examnum;
		this.score = score;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExamnum() {
		return examnum;
	}

	public void setExamnum(String examnum) {
		this.examnum = examnum;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}
	
}
