package com.ckandspace;

import com.ckandspace.api.ApiUtils;

import java.io.*;
import java.util.Properties;

public class Main {


    public static void main(String[] args) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream input = loader.getResourceAsStream("application.properties");
        Properties prop = new Properties();

        try {
            prop.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");
        ApiUtils.setAPIS(prop);
        if(args.length != 1) {
            System.out.println("One of the commands: listA, listB or migrate are needed as parameters");
            return;
        } else {
            if(args[0].equals("listA")) {
                System.out.println("CONTENT OF CKAN REPO:");
                ApiUtils.listA();
            }else  if(args[0].equals("listB")) {
                System.out.println("CONTENT OF DSPACE REPO:");
                ApiUtils.listB(username, password);
            } else if(args[0].equals("migrate")) {
                System.out.println("STARTED MIGRATION FROM CKAN TO DSPACE");
                ApiUtils.migrate(username, password);
                System.out.println("FINISHED MIGRATION");
            }  else {
                System.out.println("listA, listB and migrate are the only valid commands");
                return;
            }
        }

    }
}
