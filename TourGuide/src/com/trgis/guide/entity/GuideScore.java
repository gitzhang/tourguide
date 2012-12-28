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
	private String serializableNumber;

	@Column
	private String name;

	@Column
	private String gender;

	@Column
	private String workCompany;

	@Column
	private String identification;

	@Column
	private String examnum;

	@Column
	private String leader;

	@Column
	private String tourPlace;

	@Column
	private String leaderEnglish;

	@Column
	private String score;

	public GuideScore() {
	}

	public GuideScore(String id, String serializableNumber, String name,
			String gender, String workCompany, String identification,
			String examnum, String leader, String tourPlace,
			String leaderEnglish, String score) {
		this.id = id;
		this.serializableNumber = serializableNumber;
		this.name = name;
		this.gender = gender;
		this.workCompany = workCompany;
		this.identification = identification;
		this.examnum = examnum;
		this.leader = leader;
		this.tourPlace = tourPlace;
		this.leaderEnglish = leaderEnglish;
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

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getSerializableNumber() {
		return serializableNumber;
	}

	public void setSerializableNumber(String serializableNumber) {
		this.serializableNumber = serializableNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getWorkCompany() {
		return workCompany;
	}

	public void setWorkCompany(String workCompany) {
		this.workCompany = workCompany;
	}

	public String getLeader() {
		return leader;
	}

	public void setLeader(String leader) {
		this.leader = leader;
	}

	public String getTourPlace() {
		return tourPlace;
	}

	public void setTourPlace(String tourPlace) {
		this.tourPlace = tourPlace;
	}

	public String getLeaderEnglish() {
		return leaderEnglish;
	}

	public void setLeaderEnglish(String leaderEnglish) {
		this.leaderEnglish = leaderEnglish;
	}

}
