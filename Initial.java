import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    private final String name;
    private final double score;

    Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    String getName() {
        return name;
    }

    double getScore() {
        return score;
    }
}

public class StudentRanking {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 91.5));
        students.add(new Student("Brian", 84.0));
        students.add(new Student("Clara", 97.2));
        students.add(new Student("David", 88.8));

        students.sort(Comparator.comparingDouble(Student::getScore).reversed());

        System.out.println("Student Ranking");
        System.out.println("===============");

        int position = 1;

        for (Student student : students) {
            System.out.printf("%d. %s - %.1f%n", position++, student.getName(), student.getScore());
        }
    }
}
