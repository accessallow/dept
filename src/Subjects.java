
import java.util.ArrayList;

public class Subjects {

    public static ArrayList<String> getSubjects(int semester) {
        ArrayList<String> subjects = new ArrayList<>();
        switch (semester) {
            case 1:
                subjects.add("Sub-1");
                subjects.add("Sub-2");
                subjects.add("Sub-3");
                subjects.add("Sub-4");
                subjects.add("Sub-5");
                break;
        }

        return subjects;
    }

}
