package com.company;

public class Main {

    public static void main(String[] args) {
        /**
        Балык, Попугай, мышык жана ит деген класс тузунуз.
        Алардын свойстваларын ойлоп табыныз.
        Бир канча объектилерин тузуп жана аларга маанилерин бериниз.
        Аларды консольго чыгарыныз.
        Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек.*/

        Parrot parrot = new Parrot();
        parrot.setWeight(2);
        parrot.setColor("yellow");

        Parrot parrot1 = new Parrot();
        parrot1.setWeight(1);
        parrot1.setColor("white");

        Parrot[] parrots = {parrot,parrot1};

        for (Parrot par:parrots) {
            System.out.println(par);
        }
        System.out.println("* * * * * * * * * * * * * * *  * * * *");

        Fish fish = new Fish();
        fish.setName("forel");
        fish.setLength(3);

        Fish fish1 = new Fish();
        fish1.setName("dolphin");
        fish1.setLength(90);


        Fish[] fish2 = {fish,fish1};

        for (Fish fish3:fish2) {
            System.out.println(fish3);

        }
        System.out.println("* * * * * * * * *  * * * *  * *  * * * * * ");

        Cat cat = new Cat();
        cat.setName("Moni");
        cat.setAge(5);

        System.out.println("Cat:"+ " " +cat.getName()+ ", " +cat.getAge() + "yaer");

        Cat cat1 = new Cat();
        cat1.setAge(8);
        cat1.setName("Vika");

        System.out.println("Cat1: "+cat1.getName()+ " " +cat1.getAge() + "year");

        System.out.println("* * * * * * * * * * * * * * * * * * * ");

        Dog dog = new Dog();
        dog.setName("Reks");
        dog.setAge(7);

        System.out.println("Dog:" + " " + dog.getName()+ ", " + dog.getAge()+"yaer");

        Dog dog1 = new Dog();
        dog1.setAge(4);
        dog1.setName("Taygan");

        System.out.println("Dog1: "+ dog1.getName()+ " " + dog1.getAge()+ "year" );
    }
}
