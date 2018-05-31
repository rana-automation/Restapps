package com.cengage.actions;
import junit.framework.Assert;
public class HealthCheckerLcxtx extends  Basic {
    Basic Lcstx = new Basic();

    public void launchLcstxServices()
    {
        Lcstx.selectEnvTestData();
        Lcstx.readServicesEndPoints(Lcstx.lcstxServicesUrl);
    }


    public void validateOrchestrationEndPoint(){
        boolean flag = false;
        String endPoint =Lcstx.lcstxServicesUrl + "/lcs-tx/orchestration";
               for (int i = 0; i < Lcstx.strArray.length; i++) {
            if (Lcstx.strArray[i].equals(endPoint)) {
                flag = true;
            }
        }
        Assert.assertTrue("****** Orchestration EndPoint Not Found ******", flag);
    }
    public void validateLcstxToolsEndPoint(){
        boolean flag = false;
        String endPoint = Lcstx.lcstxServicesUrl + "/tools";
        for (int i = 0; i < Lcstx.strArray.length; i++) {
            if (Lcstx.strArray[i].equals(endPoint)) {
                flag = true;
            }
        }
        Assert.assertTrue("****** Lcstx Tools EndPoint Not Found ******", flag);

    }


}
