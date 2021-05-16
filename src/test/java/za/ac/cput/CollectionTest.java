package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {

    Collection dogName = new ArrayList();

    @Test
    void collectionAddTest() {
        //Collection dog = new ArrayList();

        dogName.add("Spooky");
        dogName.add("Mickey");
        dogName.add("Spotty");
        dogName.add("Blacks");

        System.out.println("The dogs that have been added " + dogName);

    }
    @Test
    void collectionRemoveTest(){

        dogName.add("Spooky");
        dogName.add("Mickey");
        dogName.add("Spotty");
        System.out.println("Before a dog is removed" + dogName);

        dogName.remove("Mickey");

        System.out.println("After a dog is removed " + dogName);
    }

    @Test
    void CollectionFindTest(){

        String dogName = "Blacks is my dog()";

        if(dogName.contains("Blacks")){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }
}

