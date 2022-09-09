package StepDefinitions;


import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {

    @Before
    public void before()
    {
        System.out.println("Senaryo başladı");
    }

    @After
    public void after(Scenario scenario)
    {
        System.out.println("Senaryo Bitti");
        System.out.println("scenario sonucu="+ scenario.getStatus());
        System.out.println("scenario isFailed ?="+ scenario.isFailed());


        GWD.quitDriver();
    }



}
