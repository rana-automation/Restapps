package com.cengage.stefdefinitions;
import com.cengage.actions.HealthCheckerCsg;
import cucumber.api.java.en.*;

 class CsgStefDef  extends HealthCheckerCsg {

    HealthCheckerCsg csg = new HealthCheckerCsg();

    @When("^We Launch CSG Services$")
    public void we_Launch_CSG_Services()  {
        csg.launchServices();
    }

    @Then("^Validate mls Endpoint Address$")
    public void validate_mls_Endpoint_Address()
    {
        csg.validateMlsEndPoint();

    }

    @And("^Validate metadata Endpoint Address$")
    public void validate_metadata_Endpoint_Address()
    {
        csg.validateMetadataEndPoint();
    }

    @And("^Validate geyser Endpoint Address$")
    public void validate_geyser_Endpoint_Address()
    {
        csg.validateGeyserEndPoint();

    }

    @And("^Validate CSGtools Endpoint Address$")
    public void validate_tools_Endpoint_Address()
    {
        csg.validateToolsEndPoint();

    }

    @And("^Validate cgiregistry Endpoint Address$")
    public void validate_cgiregistry_Endpoint_Address()
    {
        csg.validateCGIRegistoryEndPoint();
    }

    @And("^Validate ulr Endpoint Address$")
    public void validate_ulr_Endpoint_Address()
    {
        csg.validateUlrEndPoint();

    }

    @And("^Validate csg Endpoint Address$")
    public void validate_csg_Endpoint_Address()
    {
        csg.validateCsgEndPoint();
    }


    @And("^Validate mds Endpoint Address$")
    public void validate_mds_Endpoint_Address()
    {
        csg.validatemdsEndPoint();
    }


}
