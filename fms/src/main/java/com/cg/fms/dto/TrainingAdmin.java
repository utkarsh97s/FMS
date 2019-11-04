package com.cg.fms.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@Entity
@EntityListeners(AuditingEntityListener.class)
@EnableJpaAuditing
@Audited
public class TrainingAdmin {
	
	
	private String userName;
	private String loginName;
	private String userPassword;
	
	@OneToMany(mappedBy = "trainingAdmin",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	List<TrainingCoordinator> coordinatorList;
	
	@OneToMany(mappedBy = "trainingAdmin",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	List<TrainingCourse> courseList;

	public TrainingAdmin() {
		super();
	}

	public TrainingAdmin(String userName, String loginName, String userPassword,
			List<TrainingCoordinator> coordinatorList, List<TrainingCourse> courseList) {
		super();
		this.userName = userName;
		this.loginName = loginName;
		this.userPassword = userPassword;
		this.coordinatorList = coordinatorList;
		this.courseList = courseList;
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

	public List<TrainingCoordinator> getCoordinatorList() {
		return coordinatorList;
	}

	public void setCoordinatorList(List<TrainingCoordinator> coordinatorList) {
		this.coordinatorList = coordinatorList;
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
		result = prime * result + ((coordinatorList == null) ? 0 : coordinatorList.hashCode());
		result = prime * result + ((courseList == null) ? 0 : courseList.hashCode());
		result = prime * result + ((loginName == null) ? 0 : loginName.hashCode());
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
		TrainingAdmin other = (TrainingAdmin) obj;
		if (coordinatorList == null) {
			if (other.coordinatorList != null)
				return false;
		} else if (!coordinatorList.equals(other.coordinatorList))
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
		return "TrainingAdmin [userName=" + userName + ", loginName=" + loginName + ", userPassword=" + userPassword
				+ ", coordinatorList=" + coordinatorList + ", courseList=" + courseList + "]";
	}
	
	
	
	

}
