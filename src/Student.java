
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    private String roll_number;
    private String name;
    private int semester;
    private String contact_number;
    private String address;

    private ArrayList midsem1_marks_list;
    private ArrayList midsem2_marks_list;
    private float[][] attendance_grid;

    Student() {
        midsem1_marks_list = new ArrayList<Float>();
        midsem2_marks_list = new ArrayList<Float>();
        attendance_grid = new float[5][5];
    }

    public float[][] getAttendance_grid() {
        return attendance_grid;
    }

    public void setAttendance_grid(float[][] attendance_grid) {
        this.attendance_grid = attendance_grid;
    }

    public ArrayList getMidsem1_marks_list() {
        return midsem1_marks_list;
    }

    public void setMidsem1_marks_list(ArrayList midsem1_marks_list) {
        this.midsem1_marks_list = midsem1_marks_list;
    }

    public ArrayList getMidsem2_marks_list() {
        return midsem2_marks_list;
    }

    public void setMidsem2_marks_list(ArrayList midsem2_marks_list) {
        this.midsem2_marks_list = midsem2_marks_list;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(String roll_number, String name, int semester) {
        this.roll_number = roll_number;
        this.name = name;
        this.semester = semester;
    }

    public String getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(String roll_number) {
        this.roll_number = roll_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void set_all_stats_zero() {
        for (int i = 0; i < 5; i++) {
            midsem1_marks_list.add(i, 0);
            midsem2_marks_list.add(i, 0);
            
            for (int j = 0; j < 5; j++) {
                attendance_grid[i][j]=0;
            }
        }
    }

}
