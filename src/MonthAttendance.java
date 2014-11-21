
import java.util.ArrayList;


public class MonthAttendance {

    public ArrayList attendance;
    public MonthAttendance(){
        attendance = new ArrayList<>();
    }
    public void setAttendance(int subject,float attendance){
        this.attendance.add(subject, attendance);
    }
    public float getAttendance(int subject){
        return (float)this.attendance.get(subject);
    }
}
