public class StudentManager extends UserManager {

    public void showLastCourseTaken(Student student) {
        System.out.println(student.getUserName() + "'s last course he/she took " + student.getLastCourseTaken());
    }
}
