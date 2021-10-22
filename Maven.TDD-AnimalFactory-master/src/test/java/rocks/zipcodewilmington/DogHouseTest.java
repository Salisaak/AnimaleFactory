package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {

    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addDogTest(){

        DogHouse.clear();
        String name = "Joda ";
        Date date = new Date("4/32/2010");
        Dog dog = AnimalFactory.createDog(name, date);


        DogHouse.add(dog);

        int actual = DogHouse.getNumberOfDogs();
        Assert.assertTrue(actual > 0);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeDogTest1(){

        DogHouse.clear();
        String name = "Joda";
        Date date = new Date();
        Dog dog = AnimalFactory.createDog(name, date);
        DogHouse.add(dog);


        DogHouse.remove(0);
        Assert.assertEquals(0, (int) DogHouse.getNumberOfDogs());

    }

    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDogTest2(){

        DogHouse.clear();
        String name = "Joda";
        Date date = new Date();
        Dog dog = AnimalFactory.createDog(name, date);
        DogHouse.add(dog);

        Integer expected = DogHouse.getNumberOfDogs() - 1;


        DogHouse.remove(dog);
        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest(){

        DogHouse.clear();
        String name = "Joda";
        Date date = new Date();
        Dog dog = AnimalFactory.createDog(name, date);


        DogHouse.add(dog);
        Assert.assertNotNull(DogHouse.getDogById(0));
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberOfDogTest(){

        DogHouse.clear();
        String name = "Joda";
        Date date = new Date();
        Dog dog1 = AnimalFactory.createDog(name, date);
        Dog dog2 = AnimalFactory.createDog(name, date);


        DogHouse.add(dog1);
        DogHouse.add(dog2);

        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(2, actual);
    }

    @Test
    public void testGetNumberOfDogs() {

        DogHouse.clear();
        String name = "Joda";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();


        DogHouse.add(animal);

        DogHouse.getNumberOfDogs();
    }
}
