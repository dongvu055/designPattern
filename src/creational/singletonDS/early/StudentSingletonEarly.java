package creational.singletonDS.early;

public class StudentSingletonEarly {
    private static final StudentSingletonEarly studentSingleton = new StudentSingletonEarly();
    private StudentSingletonEarly(){}

    public static StudentSingletonEarly getStudentSingletonEarly(){
        return studentSingleton;
    }
}
