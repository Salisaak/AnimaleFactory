package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    //ensure that when .setName is invoked on an instance of Dog, the name field is being set to the respective value.
    @Test
    public void newDogTest(){
        // Given (Dog data)
        String givenName = "LeVania";
        Date givenBirthDate = new Date("12/10/2012");
        Integer givenId = 0;

        // When, create a new Dog (a Dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Assert.assertNotNull(dog);

    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    //ensure that when .setBirthDate is invoked on an instance of Dog, the birthDate field is being set to the respective value.
    public void setBirthDateTest(){
        // Given (Dog data)
        String givenName = "LeVania";
        Date givenBirthDate = new Date("12/10/2012");
        Integer givenId = 0;

        // When (a Dog is constructed)
        Dog dog = new Dog(givenName, null, givenId);
        dog.setBirthDate(givenBirthDate);
        Assert.assertEquals(givenBirthDate, dog.getBirthDate());
    }

    // TODO - Create tests for `speak`
    //ensure that when .speak is invoked on an instance of Dog, the value "bark!" is returned.
    @Test
    public void speakTest(){
        // Given (Dog data)
        String givenName = "LeVania";
        Date givenBirthDate = new Date("12/10/2012");
        Integer givenId = 0;

        // When (a Dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Assert.assertEquals("bark!", dog.speak());
    }

    // TODO - Create tests for `void eat(Food food)`
    //ensure that when .eat is invoked on an instance of Dog, the numberOfMealsEaten is increased by 1.
    @Test
    public void eatFoodTest(){
        // Given (Dog data)
        String givenName = "LeVania";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Food steak = new Food();

        // When (a Dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Assert.assertNotNull(steak);
        Assert.assertNotNull(dog);
        dog.eat(steak);

    }

    // TODO - Create tests for `Integer getId()`
    //ensure that when .getId is invoked on an instance of Dog, the respective id value is returned.
    @Test
    public void getIdTest(){
        // Given (Dog data)
        String givenName = "LeVania";
        Date givenBirthDate = new Date("2/29/2011");
        Integer givenId = 0;

        // When (a Dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Assert.assertEquals(givenId, dog.getId());
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    //ensure that a Dog is an instanceof an Animal
    @Test
    public void animalInheritanceTest(){
        // Given (Dog data)
        String givenName = "LeVania";
        Date givenBirthDate = new Date("2/29/2011");
        Integer givenId = 0;

        // When (a Dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Assert.assertTrue(dog instanceof Animal);

    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    //ensure that a Dog is an instanceof an Mammal
    @Test
    public void mammalInheritanceTest(){
        // Given (Dog data)
        String givenName = "LeVania";
        Date givenBirthDate = new Date("2/29/2011");
        Integer givenId = 0;

        // When (a Dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Assert.assertTrue(dog instanceof Mammal);

    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "LeVania";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
