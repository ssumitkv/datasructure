import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class SahityWork 
{
	String[] schedule = new String[5];
	SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
	Date date = new Date();
	String time;
	
	public void addSchedule()
	{
		schedule[0] = "morning";
		schedule[1] = "afternoon";
		schedule[2] = "evening";
		schedule[3] = "night";				
	}
	
	public  SahityWork()
	{
		String time1 = "08:00:00";
		String time2 = "10:00:00";
		String time3 = "15:00:00";
		String time4 = "18:00:00";
		String time5 = "20:00:00";
		
		time = format.format(date);
		
		
		int t = time2.compareTo(time1);
		System.out.println(time);
	}
	
	
	
	
	
	public static void main(String[] args) {
		new SahityWork();
	}
	
	

}
