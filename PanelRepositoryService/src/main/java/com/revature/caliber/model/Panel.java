package com.revature.caliber.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Panel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/** columns */
	@Id
	@Column(name = "PANEL_ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PANEL_ID_SEQUENCE")
	@SequenceGenerator(name = "PANEL_ID_SEQUENCE", sequenceName = "PANEL_ID_SEQUENCE")
	private Integer panelId;

	@Column(name = "TRAINEE_ID", nullable = false)
	private Integer traineeId;

	@Column(name = "PANELIST_ID", nullable = false)
	private Integer panelist;

	@Column(name = "INTERVIEW_DATE")
	private Date interviewDate;

	@Column(name = "DURATION")
	private String duration;

	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name = "INTERVIEW_FORMAT")
	private Integer formatId;

	@Column(name = "INTERNET_CONNECTIVITY")
	private String internet;

	@Min(value = 1)
	@Column(name = "PANEL_ROUND", nullable = false)
	private Integer panelRound;

	@Column(name = "RECORDING_CONSENT")
	private boolean recordingConsent;

	@Column(name = "RECORDING_LINK")
	private String recordingLink;

	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name = "PANEL_STATUS")
	private Integer statusId;

	@Column(name = "ASSOCIATE_INTRO", nullable = true)
	private String associateIntro;

	@Column(name = "PROJECT_ONE_DESCRIPTION", nullable = true)
	private String projectOneDescription;

	@Column(name = "PROJECT_TWO_DESCRIPTION", nullable = true)
	private String projectTwoDescription;

	@Column(name = "PROJECT_THREE_DESCRIPTION", nullable = true)
	private String projectThreeDescription;

	@Column(name = "COMMUNICATION_SKILLS", nullable = true)
	private String communicationSkills;

	@Column(name = "OVERALL_FEEDBACK", nullable = true)
	private String overall;

	/** constructors */
	public Panel() {
		super();
		this.interviewDate = new Date();
	}

	public Panel(Integer panelId, Integer traineeId, Integer panelist, Date interviewDate, String duration,
			Integer formatId, String internet, Integer panelRound, boolean recordingConsent, String recordingLink,
			Integer statusId, String associateIntro, String projectOneDescription, String projectTwoDescription,
			String projectThreeDescription, String communicationSkills, String overall) {
		super();
		this.panelId = panelId;
		this.traineeId = traineeId;
		this.panelist = panelist;
		this.interviewDate = interviewDate;
		this.duration = duration;
		this.formatId = formatId;
		this.internet = internet;
		this.panelRound = panelRound;
		this.recordingConsent = recordingConsent;
		this.recordingLink = recordingLink;
		this.statusId = statusId;
		this.associateIntro = associateIntro;
		this.projectOneDescription = projectOneDescription;
		this.projectTwoDescription = projectTwoDescription;
		this.projectThreeDescription = projectThreeDescription;
		this.communicationSkills = communicationSkills;
		this.overall = overall;
	}

	/** getters and setters */

	public Integer getPanelId() {
		return panelId;
	}

	public void setPanelId(Integer panelId) {
		this.panelId = panelId;
	}

	public Integer getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(Integer traineeId) {
		this.traineeId = traineeId;
	}

	public Integer getPanelist() {
		return panelist;
	}

	public void setPanelist(Integer panelist) {
		this.panelist = panelist;
	}

	public Date getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Integer getFormatId() {
		return formatId;
	}

	public void setFormatId(Integer formatId) {
		this.formatId = formatId;
	}

	public String getInternet() {
		return internet;
	}

	public void setInternet(String internet) {
		this.internet = internet;
	}

	public Integer getPanelRound() {
		return panelRound;
	}

	public void setPanelRound(Integer panelRound) {
		this.panelRound = panelRound;
	}

	public boolean isRecordingConsent() {
		return recordingConsent;
	}

	public void setRecordingConsent(boolean recordingConsent) {
		this.recordingConsent = recordingConsent;
	}

	public String getRecordingLink() {
		return recordingLink;
	}

	public void setRecordingLink(String recordingLink) {
		this.recordingLink = recordingLink;
	}

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public String getAssociateIntro() {
		return associateIntro;
	}

	public void setAssociateIntro(String associateIntro) {
		this.associateIntro = associateIntro;
	}

	public String getProjectOneDescription() {
		return projectOneDescription;
	}

	public void setProjectOneDescription(String projectOneDescription) {
		this.projectOneDescription = projectOneDescription;
	}

	public String getProjectTwoDescription() {
		return projectTwoDescription;
	}

	public void setProjectTwoDescription(String projectTwoDescription) {
		this.projectTwoDescription = projectTwoDescription;
	}

	public String getProjectThreeDescription() {
		return projectThreeDescription;
	}

	public void setProjectThreeDescription(String projectThreeDescription) {
		this.projectThreeDescription = projectThreeDescription;
	}

	public String getCommunicationSkills() {
		return communicationSkills;
	}

	public void setCommunicationSkills(String communicationSkills) {
		this.communicationSkills = communicationSkills;
	}

	public String getOverall() {
		return overall;
	}

	public void setOverall(String overall) {
		this.overall = overall;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/** hashcode */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((associateIntro == null) ? 0 : associateIntro.hashCode());
		result = prime * result + ((communicationSkills == null) ? 0 : communicationSkills.hashCode());
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((formatId == null) ? 0 : formatId.hashCode());
		result = prime * result + ((internet == null) ? 0 : internet.hashCode());
		result = prime * result + ((interviewDate == null) ? 0 : interviewDate.hashCode());
		result = prime * result + ((overall == null) ? 0 : overall.hashCode());
		result = prime * result + ((panelId == null) ? 0 : panelId.hashCode());
		result = prime * result + ((panelRound == null) ? 0 : panelRound.hashCode());
		result = prime * result + ((panelist == null) ? 0 : panelist.hashCode());
		result = prime * result + ((projectOneDescription == null) ? 0 : projectOneDescription.hashCode());
		result = prime * result + ((projectThreeDescription == null) ? 0 : projectThreeDescription.hashCode());
		result = prime * result + ((projectTwoDescription == null) ? 0 : projectTwoDescription.hashCode());
		result = prime * result + (recordingConsent ? 1231 : 1237);
		result = prime * result + ((recordingLink == null) ? 0 : recordingLink.hashCode());
		result = prime * result + ((statusId == null) ? 0 : statusId.hashCode());
		result = prime * result + ((traineeId == null) ? 0 : traineeId.hashCode());
		return result;
	}

	/** equals */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Panel other = (Panel) obj;
		if (associateIntro == null) {
			if (other.associateIntro != null)
				return false;
		} else if (!associateIntro.equals(other.associateIntro))
			return false;
		if (communicationSkills == null) {
			if (other.communicationSkills != null)
				return false;
		} else if (!communicationSkills.equals(other.communicationSkills))
			return false;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (formatId == null) {
			if (other.formatId != null)
				return false;
		} else if (!formatId.equals(other.formatId))
			return false;
		if (internet == null) {
			if (other.internet != null)
				return false;
		} else if (!internet.equals(other.internet))
			return false;
		if (interviewDate == null) {
			if (other.interviewDate != null)
				return false;
		} else if (!interviewDate.equals(other.interviewDate))
			return false;
		if (overall == null) {
			if (other.overall != null)
				return false;
		} else if (!overall.equals(other.overall))
			return false;
		if (panelId == null) {
			if (other.panelId != null)
				return false;
		} else if (!panelId.equals(other.panelId))
			return false;
		if (panelRound == null) {
			if (other.panelRound != null)
				return false;
		} else if (!panelRound.equals(other.panelRound))
			return false;
		if (panelist == null) {
			if (other.panelist != null)
				return false;
		} else if (!panelist.equals(other.panelist))
			return false;
		if (projectOneDescription == null) {
			if (other.projectOneDescription != null)
				return false;
		} else if (!projectOneDescription.equals(other.projectOneDescription))
			return false;
		if (projectThreeDescription == null) {
			if (other.projectThreeDescription != null)
				return false;
		} else if (!projectThreeDescription.equals(other.projectThreeDescription))
			return false;
		if (projectTwoDescription == null) {
			if (other.projectTwoDescription != null)
				return false;
		} else if (!projectTwoDescription.equals(other.projectTwoDescription))
			return false;
		if (recordingConsent != other.recordingConsent)
			return false;
		if (recordingLink == null) {
			if (other.recordingLink != null)
				return false;
		} else if (!recordingLink.equals(other.recordingLink))
			return false;
		if (statusId == null) {
			if (other.statusId != null)
				return false;
		} else if (!statusId.equals(other.statusId))
			return false;
		if (traineeId == null) {
			if (other.traineeId != null)
				return false;
		} else if (!traineeId.equals(other.traineeId))
			return false;
		return true;
	}
}