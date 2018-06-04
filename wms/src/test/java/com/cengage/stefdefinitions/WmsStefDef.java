package com.cengage.stefdefinitions;

import com.cengage.actions.HealthCheckerWms;
import cucumber.api.java.en.*;

 class WmsStefDef extends HealthCheckerWms {


    @When("^We Launch wms Services$")
    public void we_Launch_wms_Services() {
        launchWmsServices();

    }

    @And("^Validate wms-tools Endpoint Address$")
    public void validate_wms_tools_Endpoint_Address()  {
        validateToolsEndPoint();
    }

    @And("^Validate wms Endpoint Address$")
    public void validate_wms_Endpoint_Address()
    {
        validateWmsEndPoint();

    }

    @And("^Validate ws Endpoint Address$")
    public void validate_ws_Endpoint_Address()
    {

        validateWsEndPoint();
    }

}
