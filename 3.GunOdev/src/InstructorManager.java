public class InstructorManager extends UserManager{

    public void showLastCourseGiven(Instructor instructor) {
        System.out.println(instructor.getUserName() + "'s last course he/she gave " + instructor.getLastCourseGiven());
    }
}
