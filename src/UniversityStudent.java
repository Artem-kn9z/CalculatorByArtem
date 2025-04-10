public class UniversityStudent extends Student implements ScholarshipEligible {
    private String university;
    private int studentId;

    public UniversityStudent(String name, int age, double averageScore, String university, int studentId) throws InvalidStudentDataException {
        super(name, age, averageScore);
        this.university = university;
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean canReceiveScholarship() {
        return getAverageScore() >= 4.5;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", university='" + university + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}
