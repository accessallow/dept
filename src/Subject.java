
public class Subject {
    private String subjectCode;
    private int semester;
    private String subjectName;

    public Subject(String subjectCode, int semester, String subjectName) {
        this.subjectCode = subjectCode;
        this.semester = semester;
        this.subjectName = subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    
    public void load(){
        
    }
    
}
