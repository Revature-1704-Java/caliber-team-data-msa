package com.revature.caliber.model;

import java.io.Serializable;
import java.util.Date;

//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonManagedReference;
//import com.fasterxml.jackson.annotation.JsonProperty;/**


public class SimpleBatch implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 6433997711397981988L;
	private Integer batchId;
	private String resourceId;
	private String trainingName;
	private Integer trainerId;
	private Integer coTrainerId;
	private SkillType skillType;
	private TrainingType trainingType;
	private Date startDate;
	private Date endDate;
	private String location;
	private Integer addressId;
	/**
	 * Anything above this grade is GREEN
	 */
	private Short goodGradeThreshold;
	/**
	 * Anything above this grade but below goodGradeThreshold is YELLOW Anything
	 * below this grade is RED
	 */
	private Short borderlineGradeThreshold;
	private Integer weeks;
	private Integer gradedWeeks;

	public SimpleBatch() {
		super();
		this.weeks = 1;
		this.gradedWeeks = 7;
		this.goodGradeThreshold = 80;
		this.borderlineGradeThreshold = 70;
		this.trainingType = TrainingType.Revature;
	}

	/**
	 * Constructor mostly used for testing. Defaults TrainingType - Revature,
	 * SkillType - J2EE, Good grade - 80, and Borderline grade - 70
	 *
	 * * * * *
	 */
	public SimpleBatch(String trainingName, Integer trainerId, Date startDate, Date endDate, String location) {
		this();
		this.trainingName = trainingName;
		this.trainerId = trainerId;
		this.skillType = SkillType.J2EE;
		this.startDate = startDate;
		this.endDate = endDate;
		this.location = location;
	}

	public int getBatchId() {
		return batchId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

	public Integer getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(Integer trainerId) {
		this.trainerId = trainerId;
	}

	public Integer getCoTrainerId() {
		return coTrainerId;
	}

	public void setCoTrainerId(Integer coTrainerId) {
		this.coTrainerId = coTrainerId;
	}

	public SkillType getSkillType() {
		return skillType;
	}

	public void setSkillType(SkillType skillType) {
		this.skillType = skillType;
	}

	public TrainingType getTrainingType() {
		return trainingType;
	}

	public void setTrainingType(TrainingType trainingType) {
		this.trainingType = trainingType;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public short getGoodGradeThreshold() {
		return goodGradeThreshold;
	}

	public void setGoodGradeThreshold(short goodGradeThreshold) {
		this.goodGradeThreshold = goodGradeThreshold;
	}

	public short getBorderlineGradeThreshold() {
		return borderlineGradeThreshold;
	}

	public void setBorderlineGradeThreshold(short borderlineGradeThreshold) {
		this.borderlineGradeThreshold = borderlineGradeThreshold;
	}

	public int getWeeks() {
		return weeks;
	}

	public void setWeeks(int weeks) {
		this.weeks = weeks;
	}

	public int getGradedWeeks() {
		return gradedWeeks;
	}

	public void setGradedWeeks(int gradedWeeks) {
		this.gradedWeeks = gradedWeeks;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addressId == null) ? 0 : addressId.hashCode());
		result = prime * result + batchId;
		result = prime * result + borderlineGradeThreshold;
		result = prime * result + ((coTrainerId == null) ? 0 : coTrainerId.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + goodGradeThreshold;
		result = prime * result + gradedWeeks;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((resourceId == null) ? 0 : resourceId.hashCode());
		result = prime * result + ((skillType == null) ? 0 : skillType.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((trainerId == null) ? 0 : trainerId.hashCode());
		result = prime * result + ((trainingName == null) ? 0 : trainingName.hashCode());
		result = prime * result + ((trainingType == null) ? 0 : trainingType.hashCode());
		result = prime * result + weeks;
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
		SimpleBatch other = (SimpleBatch) obj;
		if (addressId == null) {
			if (other.addressId != null)
				return false;
		} else if (!addressId.equals(other.addressId))
			return false;
		if (batchId != other.batchId)
			return false;
		if (borderlineGradeThreshold != other.borderlineGradeThreshold)
			return false;
		if (coTrainerId == null) {
			if (other.coTrainerId != null)
				return false;
		} else if (!coTrainerId.equals(other.coTrainerId))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (goodGradeThreshold != other.goodGradeThreshold)
			return false;
		if (gradedWeeks != other.gradedWeeks)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (resourceId == null) {
			if (other.resourceId != null)
				return false;
		} else if (!resourceId.equals(other.resourceId))
			return false;
		if (skillType != other.skillType)
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (trainerId == null) {
			if (other.trainerId != null)
				return false;
		} else if (!trainerId.equals(other.trainerId))
			return false;
		if (trainingName == null) {
			if (other.trainingName != null)
				return false;
		} else if (!trainingName.equals(other.trainingName))
			return false;
		if (trainingType != other.trainingType)
			return false;
		if (weeks != other.weeks)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SimpleBatch [batchId=" + batchId + ", resourceId=" + resourceId + ", trainingName=" + trainingName
				+ ", trainerId=" + trainerId + ", coTrainerId=" + coTrainerId + ", skillType=" + skillType
				+ ", trainingType=" + trainingType + ", startDate=" + startDate + ", endDate=" + endDate + ", location="
				+ location + ", addressId=" + addressId + ", goodGradeThreshold=" + goodGradeThreshold
				+ ", borderlineGradeThreshold=" + borderlineGradeThreshold + ", weeks=" + weeks + ", gradedWeeks="
				+ gradedWeeks + "]";
	}
}