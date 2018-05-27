package com.example.demo;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Team {
	
	@Id
	String id;
	String teamName,projectName,startDate,endDate,status;
	List<TeamMember> memberList;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<TeamMember> getMemberList() {
		return memberList;
	}
	public void setMemberList(List<TeamMember> memberList) {
		this.memberList = memberList;
	}
	
	

}
