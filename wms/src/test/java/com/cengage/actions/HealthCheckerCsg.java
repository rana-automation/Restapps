package com.cengage.actions;
import junit.framework.Assert;

public class HealthCheckerCsg extends Basic {

   Basic b = new Basic();

public void launchServices()
{
   b.selectEnvTestData();
    b.readServicesEndPoints(b.csgServicesUrl);

}

    public void validateMetadataEndPoint() {
        boolean flag = false;
        String endPoint = b.csgServicesUrl + "/metadata";
        for (int i = 0; i < b.strArray.length; i++) {
            if (b.strArray[i].equals(endPoint)) {
                flag = true;
            }
        }
        Assert.assertTrue("****** MetaData EndPoint Not Found ******", flag);
    }

    public void validateMlsEndPoint() {

            boolean flag = false;
        String endPoint =  b.csgServicesUrl + "/mls";
               for (int i = 0; i < b.strArray.length; i++) {
            if (b.strArray[i].equals(endPoint)) {
                flag = true;
            }
        }
        Assert.assertTrue("****** MLS EndPoint Not Found ******", flag);
    }

    public void validateGeyserEndPoint() {
        boolean flag = false;
        String endPoint = b.csgServicesUrl + "/geyser";
        for (int i = 0; i < b.strArray.length; i++) {
            if (b.strArray[i].equals(endPoint)) {
                flag = true;
            }
        }
        Assert.assertTrue("****** Geyser EndPoint Not Found ******", flag);
    }


    public void validateToolsEndPoint() {
        boolean flag = false;
        String endPoint =  b.csgServicesUrl + "/tools";
        for (int i = 0; i < b.strArray.length; i++) {
            if (b.strArray[i].equals(endPoint)) {
                flag = true;
            }
        }
        Assert.assertTrue("****** Tools EndPoint Not Found ******", flag);
    }


    public void validateCGIRegistoryEndPoint() {
        boolean flag = false;
        String endPoint =  b.csgServicesUrl + "/cgiregistry";
        for (int i = 0; i < b.strArray.length; i++) {
            if (b.strArray[i].equals(endPoint)) {
                flag = true;
            }
        }
        Assert.assertTrue("****** CGIRegistory EndPoint Not Found ******", flag);
    }

    public void validateUlrEndPoint() {
        boolean flag = false;
        String endPoint =  b.csgServicesUrl + "/ulr";
        for (int i = 0; i < b.strArray.length; i++) {
            if (b.strArray[i].equals(endPoint)) {
                flag = true;
            }
        }
        Assert.assertTrue("****** ULR EndPoint Not Found ******", flag);
    }

    public void validateCsgEndPoint() {
        boolean flag = false;
        String endPoint =  b.csgServicesUrl + "/csg";

        for (int i = 0; i < b.strArray.length; i++) {
            if (b.strArray[i].equals(endPoint)) {
                flag = true;
            }
        }
        Assert.assertTrue("****** Csg EndPoint Not Found ******", flag);
    }


    public void validatemdsEndPoint() {
        boolean flag = false;
        String endPoint =  b.csgServicesUrl + "/mds";

        for (int i = 0; i < b.strArray.length; i++) {
            if (b.strArray[i].equals(endPoint)) {
                flag = true;
            }
        }
        Assert.assertTrue("****** mds EndPoint Not Found ******", flag);
    }

}





