package com.logicode.coffee;

import org.junit.*;

/**
 * Created by jjenkins on 1/6/2017.
 */
public class CafeTest {

    public static final int REQUIRED_MILK = CoffeeType.Espresso.getRequiredMilk();
    public static final int REQUIRED_BEANS = CoffeeType.Espresso.getRequiredBeans();
    public static final int NO_BEANS = 0;
    public static final int EXPRESSO_BEANS = 7;

    private Cafe cafe;
    /**
     * Runs at the beginning if the test class
     * @throws Exception
     */
    @BeforeClass
    public static void beforeClass() throws Exception {


    }

    /**
     * Runs at the end of the test class
     */
    @AfterClass
    public static void afterClass(){


    }

    /**
     * Runs before all methods
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        cafe = new Cafe();
    }

    /**
     * Runs after all methods
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void canBrewEspresso() throws Exception {
        //get a cafe object
        withBeans();
        //brew an expresso
        Coffee coffee = cafe.brew(CoffeeType.Espresso);

        //assert it is an expresso
        //no milk
        //we have enough coffee
        Assert.assertEquals("Wrong coffee type",CoffeeType.Espresso, coffee.getType());
        Assert.assertEquals("Wrong amount of milk", REQUIRED_MILK, coffee.getMilk());
        Assert.assertEquals("Wrong number of beans", REQUIRED_BEANS, coffee.getBeans());
    }
    @Test
    public void brewingExpressoConsumesBeans() throws Exception {
        //get a cafe object
        withBeans();
        //brew an expresso
        Coffee coffee = cafe.brew(CoffeeType.Espresso);
        //test for no beans since we used them in expresso
        Assert.assertEquals("To many beans", NO_BEANS, cafe.getBeansInStock());

    }

    //add the IllegalStateException.class to annotation so the test will pass if exception is thrown
    //we everybit expect an exception to be thrown because we are not restocking the milk
    @Test(expected = IllegalStateException.class)
    public void latteRequireMilk() throws Exception {
        withBeans();

        cafe.brew(CoffeeType.Latte);
    }

    @Test
    public void testRestockMilk() throws Exception {

    }

    @Test
    public void testGetBeansInStock() throws Exception {

    }

    @Test
    public void testGetMilkInStock() throws Exception {

    }

    /**
     * Utility method to restock beans
     */
    private void withBeans() {

        //add beans
        cafe.restockBeans(EXPRESSO_BEANS);

    }



}