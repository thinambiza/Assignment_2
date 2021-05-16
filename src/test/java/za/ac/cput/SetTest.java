package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class SetTest {


    Set<Integer> dogTag = new HashSet<>();

    @Test
    void setAddTest() {
        //Collection dog = new ArrayList();

        dogTag.add(10);
        dogTag.add(40);
        dogTag.add(35);
        dogTag.add(25);

        System.out.println("Dog breeds added are: " + dogTag);

    }

    @Test
    void setRemoveTest() {

        dogTag.add(10);
        dogTag.add(35);
        dogTag.add(25);
        System.out.println("Before removing a dog tag: " + dogTag);

        dogTag.remove(35);

        System.out.println("After removing a dog tag" + dogTag);

    }

    @Test
    void setFind(){


        dogTag.add(10);
        dogTag.add(35);
        dogTag.add(25);

        System.out.println("Dog Tags are :" + dogTag);

        int find = 35;

        System.out.println("Dog Tag Contains : " + find + " " +  dogTag.contains(find));
    }

}
