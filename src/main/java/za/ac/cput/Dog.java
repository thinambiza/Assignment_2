package za.ac.cput;

/*
 *@Author: Thina Mbiza
 * Student Number: 217217095
 * Date: 16 May  2021
 * This program identifies the type of dogs in store.
 */

import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Dog {

    private int dogTag;
    private String dogName;
    private String dogBreed;
    private String gender;

    public Dog(int dogTag, String dogName, String dogBreed, String gender) {
        this.dogTag = dogTag;
        this.dogName = dogName;
        this.dogBreed = dogBreed;
        this.gender = gender;
    }

    public Dog() {
    }


    public int getDogTag() {
        return dogTag;
    }

    public void setDogTag(int dogTag) {
        this.dogTag = dogTag;
    }

    public String getName() {
        return dogName;
    }

    public void setName(String name) {
        this.dogName = name;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogType(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogTag=" + dogTag +
                ", dogName='" + dogName + '\'' +
                ", dogBreed='" + dogBreed + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
    public class CollectionTest{
        public Collection  CollectionAdd(){
            Collection dog = new ArrayList();

            dog.add("Spooky");
            dog.add("Mickey");
            dog.add("Spotty");
            dog.add("Blacks");

            return dog;
        }


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return dogTag == dog.dogTag;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dogTag);
    }
}