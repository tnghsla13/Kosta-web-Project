package domain;

import java.sql.Date;
import java.util.List;

public class Team {

	private String name;
	private String cycle;
	private Date endDate;
	private int code;
	private List<Member> memberList;
	private String leaderId;
	private Date genDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCycle() {
		return cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public List<Member> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
	}

	public String getLeaderId() {
		return leaderId;
	}

	public void setLeaderId(String leaderId) {
		this.leaderId = leaderId;
	}

	public Date getGenDate() {
		return genDate;
	}

	public void setGenDate(Date genDate) {
		this.genDate = genDate;
	}

}
