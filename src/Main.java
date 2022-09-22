import structural.bridgeDS.*;

public class Main {
    public static void main(String[] args) {
        //PrototypeDS
//        AAccount aAccount = new AAccount();
//        AAccount clone = (AAccount) aAccount.clone();
//        System.out.println(aAccount);
//        aAccount.accountType();
//        System.out.println(clone);
//        clone.accountType();
        //BuilderDS
//        Student student = new Student.StudentBuilder().name("Dong").age(20).address("Nam Dinh").build();
//        System.out.println(student);
        //Factory
//        Plants plants= new PlantsFactory().getPlants("vegetable");
//        plants.type();
//        Plants plants1 = new PlantsFactory().getPlants("weed");
//        plants1.type();
//        Plants plants2 = new PlantsFactory().getPlants("weed112121");
//        plants2.type();
        //AbstractFactory
//        Animal animal = new AbstractFactory().getFactory("animal").getAnimal("dog");
//        Animal animal2 = new AbstractFactory().getFactory("animal").getAnimal("cat");
//        Plants plants = new AbstractFactory().getFactory("plants").getPlants("weed");
//        Plants plants1 = new AbstractFactory().getFactory("plants").getPlants("catausdahjsd");
//        animal.type();
//        animal2.type();
//        plants.type();
//        plants1.type();
        //Singleton
//        System.out.println(StudentSingletonEarly.getStudentSingletonEarly());
//        System.out.println(StudentSingletonEarly.getStudentSingletonEarly());
//        System.out.println(StudentSingletonEarly.getStudentSingletonEarly());
//        System.out.println(StudentSingletonLazy.getStudentSingletonLazy());
//        System.out.println(StudentSingletonLazy.getStudentSingletonLazy());
//        System.out.println(StudentSingletonLazy.getStudentSingletonLazy());
        //Adapter
//        OldObject oldObject = new OldHello();
//        NewObject newObject = new NewHelloAdapter(oldObject);
//        newObject.sayXinchao("12asd121");
        //Bridge
//        Computer computer = new Desktop(new DecorTypeOne("vang","viet nam"));
//        computer.run();
//        Computer computer1 = new Laptop(new DecorTypeTwo("do","my"));
//        computer1.run();
    }
}