package domain;

import java.util.Date;

public class Schedule {

	private int scheduleId;
	private Date startDate;
	private Date endDate;
	private String title;
	private String place;
	private String contents;

	
	
	public int getScheduleId() {
		return scheduleId;
	}
	
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		endDate = endDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public int getDay() {
		int day = startDate.getDate();
		return day;
	}

}
