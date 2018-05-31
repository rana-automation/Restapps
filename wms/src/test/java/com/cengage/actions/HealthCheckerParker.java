package com.cengage.actions;

import junit.framework.Assert;

public class HealthCheckerParker extends Basic {


    Basic parker = new Basic();

    public void launchParkerServices()
    {
        parker.selectEnvTestData();
        parker.readServicesEndPoints(parker.parkerServicesUrl);
    }


    public void validateParkerToolsEndPoint(){
        boolean flag = false;
        String endPoint =parker.parkerServicesUrl + "/tools";
        for (int i = 0; i < parker.strArray.length; i++) {
            if (parker.strArray[i].equals(endPoint)) {
                flag = true;
            }
        }
        Assert.assertTrue("****** Parker Tools EndPoint Not Found ******", flag);
    }
    public void validateParkerEndPoint(){
        boolean flag = false;
        String endPoint = parker.parkerServicesUrl + "/lcs/v2/parker";
        for (int i = 0; i < parker.strArray.length; i++) {
            if (parker.strArray[i].equals(endPoint)) {
                flag = true;
            }
        }
        Assert.assertTrue("****** Parker EndPoint Not Found ******", flag);

    }


}
