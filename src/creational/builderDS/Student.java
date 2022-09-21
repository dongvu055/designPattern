package creational.builderDS;

public class Student {
    private String name;
    private Integer age;
    private String address;

    public Student(StudentBuilder studentBuilder)
    {
        this.name = studentBuilder.name;
        this.age = studentBuilder.age;
        this.address = studentBuilder.address;
    }

    @Override
    public String toString() {
        return "name:" + name + " age:" + age + " address:" + address;
    }

    public static class StudentBuilder {
        private String name;
        private Integer age;
        private String address;

        public StudentBuilder(){

        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public StudentBuilder address(String address) {
            this.address = address;
            return this;
        }

        public Student build()
        {
            Student student = new Student(this);
            return student;
        }
    }
}
