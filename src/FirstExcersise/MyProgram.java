package FirstExcersise;

public class MyProgram{
    public static void main(String[] args) {
        Animal objectFirst = new Animal();
        objectFirst.setName("Teofil");
        System.out.println(objectFirst.getName());


        Animal objectSecond = new Animal();
        objectSecond.setAge(9);
        System.out.println(objectSecond.getAge());

        Pet objectThird = new Pet(); //1.2
        objectThird.setName("Leia");
        System.out.println(objectThird.getName());

        Animal objectFifth = new Animal();//1.3

        Zebra objectSixth = new Zebra();//1.3

        Zebra objectSeventh = new Zebra();
        objectSeventh.setName("Leokadia");
        objectSeventh.displayAnimalName();


    }
}




