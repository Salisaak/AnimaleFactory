package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    //ensure that when .setName is invoked on an instance of Cat, the name field is being set to the respective value.
    @Test
    public void setNameTest(){
        // Given (cat data)
        String givenName = "Griff";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(null, givenBirthDate, givenId);
        cat.setName(givenName);
        Assert.assertEquals(givenName, cat.getName());
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    //ensure that when .speak is invoked on an instance of Cat, the value "meow!" is returned.
    @Test
    public void setBirthDateTest(){
        // Given (cat data)
        String givenName = "Griff";
        Date givenBirthDate = new Date("7/11/2009");
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, null, givenId);
        cat.setBirthDate(givenBirthDate);
        Assert.assertEquals(givenBirthDate, cat.getBirthDate());
    }

    // TODO - Create tests for `speak`
    //ensure that when .setBirthDate is invoked on an instance of Cat, the birthDate field is being set to the respective value.
    @Test
    public void speakTest(){
        // Given (cat data)
        String givenName = "Griff";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat("", givenBirthDate, givenId);
        Assert.assertEquals("meow!", cat.speak());
    }


    // TODO - Create tests for `void eat(Food food)`
    //ensure that when .eat is invoked on an instance of Cat, the numberOfMealsEaten is increased by 1.
    @Test
    public void eatFoodTest(){
        // Given (cat data)
        String givenName = "Griff";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Food fish = new Food();

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Assert.assertNotNull(fish);
        Assert.assertNotNull(cat);
        cat.eat(fish);

    }

    // TODO - Create tests for `Integer getId()`
    //ensure that when .getId is invoked on an instance of Cat, the respective id value is returned.
    @Test
    public void getIdTest(){
        // Given (cat data)
        String givenName = "Griff";
        Date givenBirthDate = new Date("7/11/2009");
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Assert.assertEquals(givenId, cat.getId());

    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    //ensure that a Cat is an instanceof an Animal
    public void animalInheritanceTest(){

        String givenName = "Griff";
        Date givenBirthDate = new Date("7/11/2009");
        Integer givenId = 0;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Assert.assertTrue(cat instanceof Animal);

    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    //ensure that a Cat is an instanceof a Mammal
    public void mammalInheritanceTest(){

        String givenName = "Griff";
        Date givenBirthDate = new Date("7/11/2009");
        Integer givenId = 0;


        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Assert.assertTrue(cat instanceof Mammal);

    }
    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Griff";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}