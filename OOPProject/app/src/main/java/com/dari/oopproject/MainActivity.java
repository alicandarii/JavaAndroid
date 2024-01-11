package com.dari.oopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User("Ali","Engineer");
        System.out.println(user.information());


        User newUser = new User("Can","Musician");


        System.out.println(user.name);

        //Encapsulation
        Musician james = new Musician("james","klarnet ",19);

        james.setAge(30,"Ali");
        System.out.println(james.getAge());

        //Inheritance
        SuperMusician lars = new SuperMusician("Lars","Drums", 55);
        System.out.println(lars.sing());
        System.out.println(lars.getAge());

        //Polymorphism

        //Static Polymorphism
        Math math = new Math();
        System.out.println(math.sum());
        System.out.println(math.sum(2,3));
        System.out.println(math.sum(3,4,5));

        //Dynamic Polymorphism
        Animal myAnimal = new Animal();
        myAnimal.sing();
        Dog dog = new Dog();
        dog.test();
        dog.sing();
        //Abstract
        Piano myPiano = new Piano();
        myPiano.brand = "Yamaha";
        myPiano.digital= true;
        myPiano.info();



    }
}