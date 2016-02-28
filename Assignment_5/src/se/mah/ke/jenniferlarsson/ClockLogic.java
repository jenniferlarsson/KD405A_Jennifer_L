package se.mah.ke.jenniferlarsson;

import java.text.DecimalFormat;
import java.util.Calendar;

public class ClockLogic {
	
	private DigitalClockGUI digitalClockGUI;
	private int alarmHour;
	private int alarmMinute;

	public ClockLogic(DigitalClockGUI digitalClockGUI){
		this.digitalClockGUI= digitalClockGUI;
		new ClockThread().start();
	}
	
	public void setAlarm(int hours, int minute){
		alarmHour = hours;
		alarmMinute= minute;
	}
	
	public void clearAlarm(){
		alarmHour = -1;
		alarmMinute = -1;
		
	}
private class ClockThread extends Thread {
		
		@Override
		public void run(){
			
			DecimalFormat decimalFormat = new DecimalFormat("00");
			
			
			while (true){
				
				Calendar calendar= Calendar.getInstance();
				int hour= calendar.get(Calendar.HOUR_OF_DAY);
				int minute= calendar.get(Calendar.MINUTE);
				int second = calendar.get(Calendar.SECOND);
				
				digitalClockGUI.setTimeOnLabel(decimalFormat.format(hour)+ ":" + decimalFormat.format(minute) + ":" + decimalFormat.format(second));
				
				if(alarmHour == hour && alarmMinute == minute){
					digitalClockGUI.activateAlarm(true);
					
				} else {
				
					digitalClockGUI.activateAlarm(false);
				}
				try {
					Thread.sleep(900);
				} catch (InterruptedException e) {
					e.printStackTrace();
					return;
				}
			} 
}

}

}