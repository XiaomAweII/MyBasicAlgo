/**
 * @author xiaoweii
 * @create 2025-01-05 22:55
 */
public class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student another) {
        return this.score - another.score;
    }

    @Override
    public boolean equals(Object student) {
        if (this == student) {
            return true;
        }

        if (student == null) {
            return false;
        }

        if (this.getClass() != student.getClass()) {
            return false;
        }

        Student another = (Student) student;
        return this.score == another.score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
