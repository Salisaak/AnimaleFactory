package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {

    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void testCreateDog(){

        String name = "LeVania";
        Date birthDate = new Date("2/29/2011");

        Dog dog = AnimalFactory.createDog(name, birthDate);
        DogHouse.add(dog);

        Assert.assertEquals( (Integer) 1 , DogHouse.getNumberOfDogs());
    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void testCreateCat(){

        String name = "Griff";
        Date birthDate = new Date("7/11/2009");

        Cat cat = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(cat);

        Assert.assertEquals((Integer) 1, CatHouse.getNumberOfCats());

    }

}