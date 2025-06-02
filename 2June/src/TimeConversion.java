class customException extends Exception{
    public customException(String msg) {
        super(msg);
    }
}

public class TimeConversion{

    public static void main(String[] args) throws customException {
        String time24 = "00:10";

        String[] parts = time24.split(":");
        int hour = Integer.parseInt(parts[0]);
        String minute = parts[1];
        String meridian="";
        if(hour<=24)
        {
             meridian = (hour >= 12) ? "PM" : "AM";

            hour = hour % 12;
            if (hour == 0) {
                hour = 12;
            }
        }else {
              throw new customException("Not Valid Input");
        }


        System.out.println("12-hour format: " + hour +":"+minute+" "+meridian);
    }
}
