package example.steps.context;


import io.cucumber.spring.ScenarioScope;
import org.springframework.stereotype.Component;


@ScenarioScope
@Component
public class ScenarioContext {

    public ScenarioContext() {
    }

    public final String someProp = "a ScenarioContext";

}
