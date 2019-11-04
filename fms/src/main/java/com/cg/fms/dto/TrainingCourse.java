package com.cg.fms.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Audited
public class TrainingCourse {
	
	private Integer courseId;
	private String courseName;
	private Double courseDuration;
	private TrainingFeedback feedback;
	
	@ManyToMany(mappedBy = "trainingCourse",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	List<TrainingParticipant> participantList;
	
	
	private TrainingCoordinator coordinator;


	public TrainingCourse() {
		super();
	}


	public TrainingCourse(Integer courseId, String courseName, Double courseDuration, TrainingFeedback feedback,
			List<TrainingParticipant> participantList, TrainingCoordinator coordinator) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.feedback = feedback;
		this.participantList = participantList;
		this.coordinator = coordinator;
	}


	public Integer getCourseId() {
		return courseId;
	}


	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public Double getCourseDuration() {
		return courseDuration;
	}


	public void setCourseDuration(Double courseDuration) {
		this.courseDuration = courseDuration;
	}


	public TrainingFeedback getFeedback() {
		return feedback;
	}


	public void setFeedback(TrainingFeedback feedback) {
		this.feedback = feedback;
	}


	public List<TrainingParticipant> getParticipantList() {
		return participantList;
	}


	public void setParticipantList(List<TrainingParticipant> participantList) {
		this.participantList = participantList;
	}


	public TrainingCoordinator getCoordinator() {
		return coordinator;
	}


	public void setCoordinator(TrainingCoordinator coordinator) {
		this.coordinator = coordinator;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coordinator == null) ? 0 : coordinator.hashCode());
		result = prime * result + ((courseDuration == null) ? 0 : courseDuration.hashCode());
		result = prime * result + ((courseId == null) ? 0 : courseId.hashCode());
		result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
		result = prime * result + ((feedback == null) ? 0 : feedback.hashCode());
		result = prime * result + ((participantList == null) ? 0 : participantList.hashCode());
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
		TrainingCourse other = (TrainingCourse) obj;
		if (coordinator == null) {
			if (other.coordinator != null)
				return false;
		} else if (!coordinator.equals(other.coordinator))
			return false;
		if (courseDuration == null) {
			if (other.courseDuration != null)
				return false;
		} else if (!courseDuration.equals(other.courseDuration))
			return false;
		if (courseId == null) {
			if (other.courseId != null)
				return false;
		} else if (!courseId.equals(other.courseId))
			return false;
		if (courseName == null) {
			if (other.courseName != null)
				return false;
		} else if (!courseName.equals(other.courseName))
			return false;
		if (feedback == null) {
			if (other.feedback != null)
				return false;
		} else if (!feedback.equals(other.feedback))
			return false;
		if (participantList == null) {
			if (other.participantList != null)
				return false;
		} else if (!participantList.equals(other.participantList))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "TrainingCourse [courseId=" + courseId + ", courseName=" + courseName + ", courseDuration="
				+ courseDuration + ", feedback=" + feedback + ", participantList=" + participantList + ", coordinator="
				+ coordinator + "]";
	}
	
	
}
