$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("csghealthChecker.feature");
formatter.feature({
  "line": 1,
  "name": "Validate CSG Services Health",
  "description": "",
  "id": "validate-csg-services-health",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Validate CSG EndPoints",
  "description": "",
  "id": "validate-csg-services-health;validate-csg-endpoints",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@csgHealthChecker"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "We Launch CSG Services",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Validate mls Endpoint Address",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Validate metadata Endpoint Address",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Validate geyser Endpoint Address",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Validate CSGtools Endpoint Address",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Validate cgiregistry Endpoint Address",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Validate ulr Endpoint Address",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Validate csg Endpoint Address",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Validate mds Endpoint Address",
  "keyword": "And "
});
formatter.match({
  "location": "CsgStefdef.we_Launch_CSG_Services()"
});
formatter.result({
  "duration": 2837210738,
  "status": "passed"
});
formatter.match({
  "location": "CsgStefdef.validate_mls_Endpoint_Address()"
});
formatter.result({
  "duration": 52907,
  "status": "passed"
});
formatter.match({
  "location": "CsgStefdef.validate_metadata_Endpoint_Address()"
});
formatter.result({
  "duration": 25316,
  "status": "passed"
});
formatter.match({
  "location": "CsgStefdef.validate_geyser_Endpoint_Address()"
});
formatter.result({
  "duration": 24178,
  "status": "passed"
});
formatter.match({
  "location": "CsgStefdef.validate_tools_Endpoint_Address()"
});
formatter.result({
  "duration": 21903,
  "status": "passed"
});
formatter.match({
  "location": "CsgStefdef.validate_cgiregistry_Endpoint_Address()"
});
formatter.result({
  "duration": 19342,
  "status": "passed"
});
formatter.match({
  "location": "CsgStefdef.validate_ulr_Endpoint_Address()"
});
formatter.result({
  "duration": 42098,
  "status": "passed"
});
formatter.match({
  "location": "CsgStefdef.validate_csg_Endpoint_Address()"
});
formatter.result({
  "duration": 51769,
  "status": "passed"
});
formatter.match({
  "location": "CsgStefdef.validate_mds_Endpoint_Address()"
});
formatter.result({
  "duration": 21333,
  "status": "passed"
});
});