public class Main {
    public static void main(String[] args){

        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal,"slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie",10 );
        doAnimalStuff(yorkie,"fast");

        Dog retriever = new Dog("Labrador Retriever", 60,
                "Floppy", "Swimmer");
        doAnimalStuff(retriever,"medium");
    }
    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("---------");
    }
}
