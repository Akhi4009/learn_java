public class Main extends Object {
    public static void main(String[] args){

        Student max = new Student("max",21);
        System.out.println(max);

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("jimmy", 12, "ankush");
        System.out.println(jimmy);
    }
}
class Student {
    private String name;
    private int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
//    public String toString(){
//        return super.toString();
//    }


    @Override
    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
        return name + " is " + age;
    }
}

class PrimarySchoolStudent extends Student {
    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName){
        super(name,age);
        this.parentName = parentName;
    }
    public String toString(){
        return parentName + "'s kid " + super.toString();
    }
}


