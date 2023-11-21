import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor

public class Student {

    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        grades = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    // returns the student's id
    public long getId() {
        return id;
    }

// returns the student's name
    public String getName() {
        return name;
    }

// adds the given grade to the grades list
    public void addGrade(int grade){
        grades.add(grade);
    };

// returns the list of grades
    public ArrayList<Integer> getGrades() {
        return grades;
    }

// returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum/grades.size();
    };

//    public static void main(String[] args) {
//
//        Student mickey = new Student(1, "Mickey");
//        mickey.addGrade(80);
//        mickey.addGrade(89);
//        mickey.addGrade(90);
//        mickey.addGrade(78);
//
//        System.out.println(mickey.getGradeAverage());
//        System.out.println(mickey.getId());
//        System.out.println(mickey.getName());
//        System.out.println(mickey.getGrades());
//
//    }

}
