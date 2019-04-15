package challenges;

public class NumberThree {

    public String timeConversion(String s) {
        String hour24 = "";
        int time=0;
        if (s.contains ("AM")){
            hour24= s.substring(0, 8);
            if (s.substring(0, 2).equals("12")){
                hour24= "00" + s.substring (2,8);
            }
            return hour24;
        }
        if (s.contains ("PM")){
           time= Integer.parseInt (s.substring (0,2));
           if (time==12)
          {return s.substring (0,8);}
           time+=12;
           hour24= time + s.substring(2,8);
           return hour24;

        }
        return hour24;
    }
}
