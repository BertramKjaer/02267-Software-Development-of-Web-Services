package stepdefs;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helloworld.HelloWorld;

public class HelloWorldStepDefs {

    private String message;

    @When("I ask for the hello world message")
    public void i_ask_for_the_hello_world_message() {
        message = HelloWorld.getMessage();
    }

    @Then("I should get {string}")
    public void i_should_get(String expected) {
        assertEquals(expected, message);
    }
}
