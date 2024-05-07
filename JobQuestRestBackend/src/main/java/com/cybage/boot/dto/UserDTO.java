package com.cybage.boot.dto;

import java.util.List;

import com.cybage.boot.models.UserEducationModel;
import com.cybage.boot.models.UserWorkExperience;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	private int id;
	private String userName;
	private String userEmail;
	private String userPassword;
	private String userContactNo;
	private boolean workStatus;
	private String userLocation;
	private String primaryRole;
	private int yearsOfExpInPrimaryRole;
	private String openToFollowingRoles;
	private String userBio;
	private String userGender;
	private String websiteUrl;
	private String linkedInUrl;
	private String githubUrl;
	private String twitterUrl;
	private String userSkills;
	private String userOTP;
	
	List<UserWorkExperience> workExpList;
	List<UserEducationModel> userEducationList;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserContactNo() {
		return userContactNo;
	}
	public void setUserContactNo(String userContactNo) {
		this.userContactNo = userContactNo;
	}
	public boolean isWorkStatus() {
		return workStatus;
	}
	public void setWorkStatus(boolean workStatus) {
		this.workStatus = workStatus;
	}
	public String getUserLocation() {
		return userLocation;
	}
	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}
	public String getPrimaryRole() {
		return primaryRole;
	}
	public void setPrimaryRole(String primaryRole) {
		this.primaryRole = primaryRole;
	}
	public int getYearsOfExpInPrimaryRole() {
		return yearsOfExpInPrimaryRole;
	}
	public void setYearsOfExpInPrimaryRole(int yearsOfExpInPrimaryRole) {
		this.yearsOfExpInPrimaryRole = yearsOfExpInPrimaryRole;
	}
	public String getOpenToFollowingRoles() {
		return openToFollowingRoles;
	}
	public void setOpenToFollowingRoles(String openToFollowingRoles) {
		this.openToFollowingRoles = openToFollowingRoles;
	}
	public String getUserBio() {
		return userBio;
	}
	public void setUserBio(String userBio) {
		this.userBio = userBio;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getWebsiteUrl() {
		return websiteUrl;
	}
	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}
	public String getGithubUrl() {
		return githubUrl;
	}
	public void setGithubUrl(String githubUrl) {
		this.githubUrl = githubUrl;
	}
	public String getLinkedInUrl() {
		return linkedInUrl;
	}
	public void setLinkedInUrl(String linkedInUrl) {
		this.linkedInUrl = linkedInUrl;
	}
	public String getTwitterUrl() {
		return twitterUrl;
	}
	public void setTwitterUrl(String twitterUrl) {
		this.twitterUrl = twitterUrl;
	}
	public String getUserSkills() {
		return userSkills;
	}
	public void setUserSkills(String userSkills) {
		this.userSkills = userSkills;
	}
	public String getUserOTP() {
		return userOTP;
	}
	public void setUserOTP(String userOTP) {
		this.userOTP = userOTP;
	}
}
