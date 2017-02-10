
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class DateImpl implements DateInterface{
    // using the Adapter pattern. For this, use the
    //GregorianCalendar class. 
    private GregorianCalendar calendar=new GregorianCalendar();
    

    @Override
    public int getYear() {
        return calendar.get(Calendar.YEAR);
    }

    @Override
    public boolean setYear(int year) {
        calendar.set(Calendar.YEAR, year);
        return true;
    }
    
    @Override
    public int getMonth() {
        return calendar.get(Calendar.MONTH);
    }
    /**
     * Sets the month, provided it is between 0 and 11; otherwise no changes are
     * made. month must be consistent with the year and day of month. For
     * example, if month is 1 (Februray), but year is 2016 and day of month is
     * 30 as stored in the DateInterface object, the month stored in the
     * DateInterface object must not be changed. The client must do some extra
     * work to effect the change: for example, change the day to 1 and then
     * change month. Anther example is changing month to 3 (April) when day of
     * month is 31. 2
     *
     * @param month should be between 0 and 11
     * @return returns true if month is valid and a change could be made
     */
    @Override
    public boolean setMonth(int month) {
        try {
            GregorianCalendar tempCalendar =(GregorianCalendar) calendar.clone();
            tempCalendar.setLenient(false);        
            tempCalendar.set(Calendar.MONTH, month);
            tempCalendar.getTime();
        }
        catch (Exception e) {
            return false;
        }
        calendar.set(Calendar.MONTH, month);      
        return true;
    }
    

    @Override
    public int getDayOfMonth() {
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    @Override
    public boolean setDayOfMonth(int date) {
        try {
            GregorianCalendar tempCalendar =(GregorianCalendar) calendar.clone();
            tempCalendar.setLenient(false);        
            tempCalendar.set(Calendar.DAY_OF_MONTH,date);
            tempCalendar.getTime();
        }
        catch (Exception e) {
            return false;
        }
        calendar.set(Calendar.DAY_OF_MONTH,date);      
        return true;
    }

    @Override
    public int getHours() {
        return calendar.get(Calendar.HOUR);
    }
    /**
     * Sets the hour. Should be between 0 and 23 or no action is taken
     *
     * @param hours between 0 and 23
     * @return true only if hours is valid and a change could be made
     */

    @Override
    public boolean setHours(int hours) {
        if(hours<0||hours>23)
        {
            return false;
        }
        calendar.set(Calendar.HOUR_OF_DAY, hours);
        return true;
    }

    @Override
    public int getMinutes() {
        return calendar.get(Calendar.MINUTE);
    }

    @Override
    public boolean setMinutes(int minutes) {
        if(minutes<0||minutes>59)
        {
            return false;
        }
        calendar.set(Calendar.MINUTE,minutes);
        return true;
    }

    @Override
    public int getSeconds() {
        return calendar.get(Calendar.SECOND);
    }

    @Override
    public boolean setSeconds(int seconds) {
        if(seconds<0||seconds>59)
        {
            return false;
        }
        calendar.set(Calendar.SECOND,seconds);
        return true;        
    }

    @Override
    public boolean isLeapYear() {
        return calendar.isLeapYear(this.getYear());
    }   
}
