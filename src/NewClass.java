
import java.sql.ResultSet;
import java.util.ArrayList;


public class NewClass {
    public static void main(String[] args){
//        try{
//            ResultSet r = SQLConnector.sql("select * from student where semester = '"+1+"';");
//            System.out.println(r);
//            while(r.next()){
//                System.out.println(r.getObject("roll_no")+" "+r.getObject("name"));
//            }
//        }catch(Exception ex){
//            
//        }
        
//        ArrayList<String> a = new ArrayList<>();
//        a.add("My");a.add("name");a.add("is");a.add("Pankaj");a.add(" :)");
//        System.out.println(a.get(0)+a.get(1)+a.get(2)+a.get(3)+a.get(4));
        
        Student s = new Student();
//        s.setRoll_number("0105cs111085");
//        s.setName("Adam Kirk");
//        s.setSemester(6);
//        s.setAddress("Patel Nagar");
//        s.setContact_number("90ujh09090");
//        s.set_all_stats_zero();
        DataManager d = new DataManager();
       // d.add_a_student(s);
        s = d.get_a_student("0105cs111082");
        System.out.println(s.getName());
        //s.getAttendance_list().add(1, 60);
       System.out.println(s.getAttendance_grid()[1][1]);
       // d.update_a_student(s);
    }
    
}
