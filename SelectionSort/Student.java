public class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    @Override
    public int compareTo(Student another) {
//        return this.score-another.score;//分数从小到大排列
        return another.score-this.score;//分数从大到小排列
    }

    @Override
    public boolean equals(Object student) {
        if (this == student) {
            return true;
        }
        if (student == null || getClass() != student.getClass()) {
            return false;
        }

        Student another = (Student) student;

        return score == another.score;
    }

    @Override
    public int hashCode() {
        return score;
    }

    @Override
    public String toString() {
        return String.format("Student(name: %s, score: %d)", name, score);
    }
}
