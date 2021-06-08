package kyu5;

public class HumanReadableTime {
    
    public static final int MAX_SECONDS = 359999;
    public static final int SECONDS_IN_HOUR = 3600;
    public static final int SECONDS_IN_MINUTE = 60;
    
    public static String makeReadable(int seconds) {
        
        if(seconds > MAX_SECONDS) seconds = MAX_SECONDS;
        
        int iHours = 0;
        int iMinutes = 0;
        int iSeconds = 0;
        int rest;
        
        iHours = seconds / SECONDS_IN_HOUR;
        rest = seconds % SECONDS_IN_HOUR;
        
        iMinutes = rest / SECONDS_IN_MINUTE;
        rest = seconds % SECONDS_IN_MINUTE;
        iSeconds = rest;
        
        String readableTime = String.format("%02d:%02d:%02d", iHours, iMinutes, iSeconds);
        return readableTime;
  }
    
}
