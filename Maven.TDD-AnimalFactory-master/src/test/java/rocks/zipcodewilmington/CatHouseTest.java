package rocks.zipcodewilmington;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import java.util.Date;


/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addCatTest(){
        //ensure that when .add is invoked on the CatHouse, a respective Cat object can be retrieved from the house.
        CatHouse.clear();
        String name = "Cat Den";
        Date date = new Date("9/21/2017");
        Cat cat = AnimalFactory.createCat(name, date);

        CatHouse.add(cat);

        int actual = CatHouse.getNumberOfCats();
        Assert.assertTrue(actual > 0);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    //ensure that when .remove is invoked on the CatHouse, a respective Cat object can no longer be retrieved from the house.
    public void removeCatTest1(){
        CatHouse.clear();
        String name = "Cat Den";
        Date date = new Date("9/21/2017");
        Cat cat = AnimalFactory.createCat(name, date);
        CatHouse.add(cat);


        CatHouse.remove(0);
        Assert.assertTrue(CatHouse.getNumberOfCats() == 0);
    }


    // TODO - Create tests for `void remove(Cat cat)`
    //ensure that when .remove is invoked on the CatHouse, a Cat object with the respective id can no longer be retrieved from the house.
    @Test
    public void removeCatTest2(){

        CatHouse.clear();
        String name = "Cat Den";
        Date date = new Date("9/21/2017");
        Cat cat = AnimalFactory.createCat(name, date);
        CatHouse.add(cat);

        Integer expected = CatHouse.getNumberOfCats() - 1;


        CatHouse.remove(cat);
        Assert.assertEquals(expected, CatHouse.getNumberOfCats());
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    //ensure that when .getCatById is invoked on the CatHouse, a Cat with the respective id is returned.
    @Test
    public void getCatByIdTest(){

        CatHouse.clear();
        String name = "Cat Den";
        Date date = new Date("9/21/2017");
        Cat cat = AnimalFactory.createCat(name, date);

        CatHouse.add(cat);
        Assert.assertNotNull(CatHouse.getCatById(0));
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    //ensure that when .getNumberOfCats() is invoked on the CatHouse, the respective number of Cat objects is returned.
    @Test
    public void getNumberOfCatsTest(){

        CatHouse.clear();
        String name = "Cat Den";
        Date date = new Date("9/21/2017");
        Cat cat1 = AnimalFactory.createCat(name, date);
        Cat cat2 = AnimalFactory.createCat(name, date);

        CatHouse.add(cat1);
        CatHouse.add(cat2);
        int actual = CatHouse.getNumberOfCats();
        Assert.assertTrue(actual == 2);
    }

}