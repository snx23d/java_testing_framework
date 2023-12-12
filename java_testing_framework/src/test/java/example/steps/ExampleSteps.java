package example.steps;


import example.steps.context.ScenarioContext;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;


public class ExampleSteps {

    private final ScenarioContext context;

    @Autowired
    public ExampleSteps( ScenarioContext context) {
        this.context = context;
    }

    @Given("I search for {string}")
    public void iSearchFor(String arg0) {
        System.out.println(context.someProp);
    }
}