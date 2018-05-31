package com.cengage.actions;

import java.util.Properties;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import junit.framework.Assert;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Basic {
    public String csgServicesUrl, wmsServicesUrl, bulkUploadServicesUrl, fvsServicesUrl, ifvsServicesUrl, omnibusServicesUrl, parkerServicesUrl, lcstxServicesUrl, mlsServicesUrl, lcszipServicesUrl, lcsv2ServicesUrl;
    protected File file;
    protected String Tier;
    protected Properties P;
    protected String userDirctionary = System.getProperty("user.dir");
    protected String strArray[];

    protected void selectEnvTestData() {
        Tier = readTier();
        if (Tier.equalsIgnoreCase("INT")) {
            readPropertiesFiles("INTEnv.properties");
        } else if (Tier.equalsIgnoreCase("Stage")) {
            readPropertiesFiles("StageEnv.properties");
        } else if (Tier.equalsIgnoreCase("Test")) {
            readPropertiesFiles("TestEnv.properties");
        }

    }

    protected String readTier() {
        return (System.getProperty("Tier"));
    }


    protected void readPropertiesFiles(String FilePath) {
        try {
            String filepath = userDirctionary + "\\src\\test\\resources\\testData\\" + FilePath;
            file = new File(filepath);
            FileInputStream fileInput = new FileInputStream(file);
            P = new Properties();
            P.load(fileInput);
            csgServicesUrl = P.getProperty("csg");
            wmsServicesUrl = P.getProperty("wms");
            bulkUploadServicesUrl =P.getProperty("BulkUpload");
            fvsServicesUrl= P.getProperty("FVS");
            omnibusServicesUrl= P.getProperty("OMNIBUS");
            parkerServicesUrl=P.getProperty("PARKER");
            ifvsServicesUrl=P.getProperty("iFVS");
            lcstxServicesUrl=P.getProperty("LCSTX");
            mlsServicesUrl=P.getProperty("MLS");
            lcszipServicesUrl=P.getProperty("LCSzip");
            lcsv2ServicesUrl= P.getProperty("LCSv2");



        } catch (IOException e) {
            System.out.println("File Not Found");
        }

    }


    protected void readServicesEndPoints(String url) {

        Response resp = RestAssured
                .get(url);
        String response = resp.getBody().asString();
        int statusCode = resp.getStatusCode();
        Assert.assertEquals(statusCode, 200);
        Document doc = Jsoup.parse(response);

        Elements endPoint = doc.getElementsByClass("value");
        String servicesEndPoints = endPoint.toString().replaceAll("\\<.*?\\>", "");
        strArray = servicesEndPoints.split("\n");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        System.out.println("***************************************************");
    }
}
