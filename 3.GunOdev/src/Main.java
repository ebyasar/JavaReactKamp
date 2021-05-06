public class Main {
    public static void main(String[] args) {

        Instructor instructor1 = new Instructor();

        instructor1.setUserID(55);
        instructor1.setUserName("EnginDemiroğ");
        instructor1.setEmail("engin@engin.com");
        instructor1.setPassword("454545");
        instructor1.setLastCourseGiven("Java");



        Student student1 = new Student();

        student1.setUserID(66);
        student1.setUserName("EmirBekir");
        student1.setEmail("emirbekir97@hotmail.com");
        student1.setPassword("1321321");
        student1.setLastCourseTaken("Java");



        User[] users = {student1, instructor1};

        UserManager userManager = new UserManager();
        userManager.printALlEmail(users);



        InstructorManager instructorManager = new InstructorManager();
        instructorManager.showLastCourseGiven(instructor1);

        StudentManager studentManager = new StudentManager();
        studentManager.showLastCourseTaken(student1);


    }
}
