package taiCS151HW4;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.event.ChangeListener;

public class Model {
    public static String[] arrayMonths = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	EventManager eventManager; //Manages our TreeMap events data structure
	GregorianCalendar c; //For capturing current day
	
	int currentDay;
	
	private ArrayList<ChangeListener> aListOfChangeListeners;

	
	Model () {
		aListOfChangeListeners = new ArrayList<ChangeListener> ();
		eventManager = new EventManager();
		c = new GregorianCalendar();
		c = (GregorianCalendar) GregorianCalendar.getInstance();
		currentDay = c.get(Calendar.DATE);
		System.out.println(currentDay);
		
		//eventManager.createEvent("Tai's second event", "11/14/17", 17, 30, 23, 59);
		//eventManager.createEvent("Tai's third event", "11/15/17", 17, 30, 23, 59);
		//eventManager.saveEvents();
		
		eventManager.loadEvents();
		eventManager.displayEventBasedOnDate("11/14/17");


	}
	public void initializeCalendar() {
		String currentYear = new SimpleDateFormat("YYYY").format(c.getTime());
		String currentMonth= new SimpleDateFormat("MMM").format(c.getTime());
		int firstDayOfMonth = c.get(Calendar.DAY_OF_WEEK);
		int totalDaysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		//System.out.println("This is the current Month: " + currentMonth);
		//System.out.println("This is the current Year: " + currentYear);
		//System.out.println("This is the first day of the month: " + arrayDays[firstDayOfMonth]);
		//System.out.println("This is total days of the month: " + totalDaysInMonth);
	}
	
	// if arrow button is pressed do this...
	public void setCurrentMonth(int month) {
		c.set(Calendar.MONTH, month);
	}
	
	public int getTotalDaysOfCurrentMonth () {
		return (c.getActualMaximum(Calendar.DAY_OF_MONTH));
	}
	public int getFirstDayOfWeekOfCurrentMonth () {
		c.set(Calendar.DAY_OF_MONTH, 1);
		return (c.get(Calendar.DAY_OF_WEEK));
	}
	public int getMonth() {
		//String currentMonth= new SimpleDateFormat("MMM").format(c.getTime());
		int currentMonth = c.get(Calendar.MONTH);
		return currentMonth;
	}
	public int getDay() {
		return currentDay;
	}
	public void setDay(int day) {
		c.set(Calendar.DATE, day);
		currentDay = c.get(Calendar.DATE);
		//System.out.println(c.get(Calendar.DATE));
	}
	public void saveNquit() {
		eventManager.saveEvents();
		System.out.println("Program will now save events to file & quit");
	}
}