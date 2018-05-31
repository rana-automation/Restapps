package com.cengage.actions;

import junit.framework.Assert;

public class HealthCheckerOmnibus extends Basic{

    Basic omnibus = new Basic();

    public void launchOmnibusServices()
    {
        omnibus.selectEnvTestData();
        omnibus.readServicesEndPoints(omnibus.omnibusServicesUrl);
    }


    public void validateOmnibusToolsEndPoint(){
        boolean flag = false;
        String endPoint =omnibus.omnibusServicesUrl + "/tools";
        System.out.println("end ponit value"+endPoint);
        for (int i = 0; i < omnibus.strArray.length; i++) {
            System.out.println("loops value"+omnibus.strArray[i]);
            if (omnibus.strArray[i].equals(endPoint)) {
                flag = true;
            }
        }

        Assert.assertTrue("****** Omnibus TOOL EndPoint Not Found ******", flag);
    }
    public void validateWmsEndPoint(){
        boolean flag = false;
        String endPoint = omnibus.omnibusServicesUrl + "/omnibus";
        for (int i = 0; i < omnibus.strArray.length; i++) {
            if (omnibus.strArray[i].equals(endPoint)) {
                flag = true;
            }
        }
        Assert.assertTrue("****** Omnibus EndPoint Not Found ******", flag);

    }

}
