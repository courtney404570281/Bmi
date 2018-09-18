package teresa.com.bmi;

import teresa.com.bmi.hello.Student;

public class Tester {
    public static void main(String[] args) {
//        System.out.println("Hello World!");

        Student stu = new Student("001", "Teresa", 90, 100);
        Student stu1 = new Student("002", "Monica", 10, 10);
        stu.print();
        stu1.print();




        /* stu.setId("001");
         stu.setName("Teresa");
         stu.setEnglish(90);
         stu.setMath(100);*/


       /* Person person = new Person();
        person.hello();
        person.hello("Teresa");

        person.setWeight(66);
        person.setHeight(1.7f);

        System.out.println(person.bmi());*/


    }
}
