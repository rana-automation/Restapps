package com.cengage.stefdefinitions;

import com.cengage.actions.HealthCheckerLcxtx;
import cucumber.api.java.en.*;

public class StefDefLcstx extends HealthCheckerLcxtx {
    @When("^We Launch lcstx Services$")
    public void we_Launch_lcstx_Services()  {
        launchLcstxServices();
    }

    @And("^Validate orchestration Endpoint Address$")
    public void validate_orchestration_Endpoint_Address()  {
        validateOrchestrationEndPoint();

    }

    @And("^Validate lcstxtools Endpoint Address$")
    public void validate_lcstxtools_Endpoint_Address()  {
        validateLcstxToolsEndPoint();

    }
}
