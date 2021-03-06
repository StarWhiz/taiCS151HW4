package taiCS151HW4;

import java.io.Serializable;
import java.util.GregorianCalendar;

public class Event implements Serializable {
    private static final long serialVersionUID = 1L;
    private String title;
    private String date;
    private int startTimeHours;
    private int startTimeMins;
    private int endTimeHours;
    private int endTimeMins;
    private GregorianCalendar calendar;
    
	public Event(String title, String date, int startTimeHours, int startTimeMins, int endTimeHours, int endTimeMins) {
		super();
		this.title = title;
		this.date = date;
		this.startTimeHours = startTimeHours;
		this.startTimeMins = startTimeMins;
		this.endTimeHours = endTimeHours;
		this.endTimeMins = endTimeMins;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getStartTimeHours() {
		return startTimeHours;
	}
	public void setStartTimeHours(int startTimeHours) {
		this.startTimeHours = startTimeHours;
	}
	public int getStartTimeMins() {
		return startTimeMins;
	}
	public void setStartTimeMins(int startTimeMins) {
		this.startTimeMins = startTimeMins;
	}
	public int getEndTimeHours() {
		return endTimeHours;
	}
	public void setEndTimeHours(int endTimeHours) {
		this.endTimeHours = endTimeHours;
	}
	public int getEndTimeMins() {
		return endTimeMins;
	}
	public void setEndTimeMins(int endTimeMins) {
		this.endTimeMins = endTimeMins;
	}
	public GregorianCalendar getCalendar() {
		return calendar;
	}
	public void setCalendar(GregorianCalendar calendar) {
		this.calendar = calendar;
	}
}
