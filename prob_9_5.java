import java.util.GregorianCalendar;
/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (9.5)
 */
public class prob_9_5 {
    
	public static void main (String[] args)
        {
            
          int day, month, year;
          GregorianCalendar date = new GregorianCalendar();
          
          day = date.get(GregorianCalendar.DAY_OF_MONTH);
          month = date.get(GregorianCalendar.MONTH);
          year = date.get(GregorianCalendar.YEAR);


          System.out.println("Today's date: " +(month+1)+"/"+day+"/"+year);
          
          long start = 1234567898765L;
          
          date.setTimeInMillis(start);
          
          day = date.get(GregorianCalendar.DAY_OF_MONTH);
          month = date.get(GregorianCalendar.MONTH);
          year = date.get(GregorianCalendar.YEAR);  
          
          System.out.println("Reset Date: " +(month+1)+"/"+day+"/"+year);     
                
		
        }
        
        
}
