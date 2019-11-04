package com.cg.fms.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Audited
public class TrainingCoordinator {
	
	private Integer coordinatorId;
	private String userName;
	private String loginName;
	private String userPassword;
	
	@OneToMany(mappedBy = "trainingCoordinator",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	List<TrainingParticipant> participantList;
	
	@OneToMany(mappedBy = "trainingCoordinator",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	List<TrainingCourse> courseList;

	public TrainingCoordinator() {
		super();
	}

	public TrainingCoordinator(Integer coordinatorId, String userName, String loginName, String userPassword,
			List<TrainingParticipant> participantList, List<TrainingCourse> courseList) {
		super();
		this.coordinatorId = coordinatorId;
		this.userName = userName;
		this.loginName = loginName;
		this.userPassword = userPassword;
		this.participantList = participantList;
		this.courseList = courseList;
	}

	public Integer getCoordinatorId() {
		return coordinatorId;
	}

	public void setCoordinatorId(Integer coordinatorId) {
		this.coordinatorId = coordinatorId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public List<TrainingParticipant> getParticipantList() {
		return participantList;
	}

	public void setParticipantList(List<TrainingParticipant> participantList) {
		this.participantList = participantList;
	}

	public List<TrainingCourse> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<TrainingCourse> courseList) {
		this.courseList = courseList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coordinatorId == null) ? 0 : coordinatorId.hashCode());
		result = prime * result + ((courseList == null) ? 0 : courseList.hashCode());
		result = prime * result + ((loginName == null) ? 0 : loginName.hashCode());
		result = prime * result + ((participantList == null) ? 0 : participantList.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userPassword == null) ? 0 : userPassword.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrainingCoordinator other = (TrainingCoordinator) obj;
		if (coordinatorId == null) {
			if (other.coordinatorId != null)
				return false;
		} else if (!coordinatorId.equals(other.coordinatorId))
			return false;
		if (courseList == null) {
			if (other.courseList != null)
				return false;
		} else if (!courseList.equals(other.courseList))
			return false;
		if (loginName == null) {
			if (other.loginName != null)
				return false;
		} else if (!loginName.equals(other.loginName))
			return false;
		if (participantList == null) {
			if (other.participantList != null)
				return false;
		} else if (!participantList.equals(other.participantList))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userPassword == null) {
			if (other.userPassword != null)
				return false;
		} else if (!userPassword.equals(other.userPassword))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TrainingCoordinator [coordinatorId=" + coordinatorId + ", userName=" + userName + ", loginName="
				+ loginName + ", userPassword=" + userPassword + ", participantList=" + participantList
				+ ", courseList=" + courseList + "]";
	}
	
	
	
	

}
