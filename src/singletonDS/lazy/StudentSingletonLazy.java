package singletonDS.lazy;

import java.util.Objects;

public class StudentSingletonLazy {
    private static StudentSingletonLazy studentSingletonLazy = null;
    private StudentSingletonLazy(){}
    public static StudentSingletonLazy getStudentSingletonLazy()
    {
        if (Objects.isNull(studentSingletonLazy))
        {
            synchronized (StudentSingletonLazy.class)
            {
                if (Objects.isNull(studentSingletonLazy)){
                    studentSingletonLazy = new StudentSingletonLazy();
                }
            }
        }

        return studentSingletonLazy;
    }
}
