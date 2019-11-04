package com.cg.fms.dto;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;

import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Audited
public class TrainingFeedback {
	
	private Integer presentationSkill;
	private Integer doubtClarification;
	private Integer timeManagement;
	private Integer handoutProvided;
	private Integer resourceAvailability;
	
	private Double averageRating;
	
	private TrainingCourse course;

	public TrainingFeedback() {
		super();
	}

	public TrainingFeedback(Integer presentationSkill, Integer doubtClarification, Integer timeManagement,
			Integer handoutProvided, Integer resourceAvailability, Double averageRating, TrainingCourse course) {
		super();
		this.presentationSkill = presentationSkill;
		this.doubtClarification = doubtClarification;
		this.timeManagement = timeManagement;
		this.handoutProvided = handoutProvided;
		this.resourceAvailability = resourceAvailability;
		this.averageRating = averageRating;
		this.course = course;
	}


	public TrainingCourse getCourse() {
		return course;
	}

	public void setCourse(TrainingCourse course) {
		this.course = course;
	}

	public Integer getPresentationSkill() {
		return presentationSkill;
	}

	public void setPresentationSkill(Integer presentationSkill) {
		this.presentationSkill = presentationSkill;
	}

	public Integer getDoubtClarification() {
		return doubtClarification;
	}

	public void setDoubtClarification(Integer doubtClarification) {
		this.doubtClarification = doubtClarification;
	}

	public Integer getTimeManagement() {
		return timeManagement;
	}

	public void setTimeManagement(Integer timeManagement) {
		this.timeManagement = timeManagement;
	}

	public Integer getHandoutProvided() {
		return handoutProvided;
	}

	public void setHandoutProvided(Integer handoutProvided) {
		this.handoutProvided = handoutProvided;
	}

	public Integer getResourceAvailability() {
		return resourceAvailability;
	}

	public void setResourceAvailability(Integer resourceAvailability) {
		this.resourceAvailability = resourceAvailability;
	}

	public Double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(Double averageRating) {
		this.averageRating = averageRating;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((averageRating == null) ? 0 : averageRating.hashCode());
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + ((doubtClarification == null) ? 0 : doubtClarification.hashCode());
		result = prime * result + ((handoutProvided == null) ? 0 : handoutProvided.hashCode());
		result = prime * result + ((presentationSkill == null) ? 0 : presentationSkill.hashCode());
		result = prime * result + ((resourceAvailability == null) ? 0 : resourceAvailability.hashCode());
		result = prime * result + ((timeManagement == null) ? 0 : timeManagement.hashCode());
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
		TrainingFeedback other = (TrainingFeedback) obj;
		if (averageRating == null) {
			if (other.averageRating != null)
				return false;
		} else if (!averageRating.equals(other.averageRating))
			return false;
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		if (doubtClarification == null) {
			if (other.doubtClarification != null)
				return false;
		} else if (!doubtClarification.equals(other.doubtClarification))
			return false;
		if (handoutProvided == null) {
			if (other.handoutProvided != null)
				return false;
		} else if (!handoutProvided.equals(other.handoutProvided))
			return false;
		if (presentationSkill == null) {
			if (other.presentationSkill != null)
				return false;
		} else if (!presentationSkill.equals(other.presentationSkill))
			return false;
		if (resourceAvailability == null) {
			if (other.resourceAvailability != null)
				return false;
		} else if (!resourceAvailability.equals(other.resourceAvailability))
			return false;
		if (timeManagement == null) {
			if (other.timeManagement != null)
				return false;
		} else if (!timeManagement.equals(other.timeManagement))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TrainingFeedback [presentationSkill=" + presentationSkill + ", doubtClarification=" + doubtClarification
				+ ", timeManagement=" + timeManagement + ", handoutProvided=" + handoutProvided
				+ ", resourceAvailability=" + resourceAvailability + ", averageRating=" + averageRating + ", course="
				+ course + "]";
	}
	
	
	

}
