package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * @Author: Thina Mbiza
 * Student Number: 217217095
 * Date: 16 May 2020
 * This class is the List Collection Class.
 */
public class ListTest {

    List dogName = new ArrayList();

    @Test
    void ListAdd(){
        dogName.add(0,"Spooky");
        dogName.add(1,"Mickey");
        dogName.add(2,"Spotty");
        dogName.add(3,"Blacks");

        System.out.println("Before adding another dog name " + dogName);

        dogName.add(3,"Doggy");

        System.out.println("After adding another dog name " + dogName);
    }

    @Test
    void ListRemove(){
        dogName.add(0,"Spooky");
        dogName.add(1,"Mickey");
        dogName.add(2,"Spotty");
        dogName.add(3,"Blacks");

        System.out.println("Before removing a dog name: " + dogName);

        dogName.remove(2);

        System.out.println("After removing a dog name: " + dogName);

    }

    @Test
    void ListFind(){

        dogName.add(0,"Spooky");
        dogName.add(1,"Mickey");
        dogName.add(2,"Spotty");
        dogName.add(3,"Blacks");
        System.out.println("Dog names are " + dogName);

        assertEquals(4, dogName.size());
        System.out.println("Dog name " + dogName.get(2) + " is found");
    }
}

