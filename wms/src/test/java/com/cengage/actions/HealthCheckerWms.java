package com.cengage.actions;
import junit.framework.Assert;

public class HealthCheckerWms extends Basic {
    Basic wms = new Basic();

    public void launchWmsServices()
    {
        wms.selectEnvTestData();
        wms.readServicesEndPoints(wms.wmsServicesUrl);
    }


   public void validateToolsEndPoint(){
       boolean flag = false;
       String endPoint =wms.wmsServicesUrl + "/tools";
       for (int i = 0; i < wms.strArray.length; i++) {
           if (wms.strArray[i].equals(endPoint)) {
               flag = true;
           }
       }
       Assert.assertTrue("****** TOOL EndPoint Not Found ******", flag);
    }
    public void validateWmsEndPoint(){
        boolean flag = false;
        String endPoint = wms.wmsServicesUrl + "/wms";
        for (int i = 0; i < wms.strArray.length; i++) {
            if (wms.strArray[i].equals(endPoint)) {
                flag = true;
            }
        }
        Assert.assertTrue("****** WMS EndPoint Not Found ******", flag);

    }
    public void validateWsEndPoint(){
        boolean flag = false;
        String endPoint = wms.wmsServicesUrl + "/ws";
        for (int i = 0; i < wms.strArray.length; i++) {
            if (wms.strArray[i].equals(endPoint)) {
                flag = true;
            }
        }
        Assert.assertTrue("****** WS EndPoint Not Found ******", flag);

    }

}