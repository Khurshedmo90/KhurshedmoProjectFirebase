package com.example.acer01.khurshedmoprojectfirebase;

/**
 * Created by ACER 01 on 28.01.2017.
 */
public class Grant {
    private String grantName;
    private String grantDescription;

    public Grant() {}

    public Grant(String grantName, String grantDescription) {
        this.grantName = grantName;
        this.grantDescription = grantDescription;
    }
    public  String getGrantName(){
        return grantName;
            }

    public void setGrantName(String grantName) {
        this.grantName = grantName;
    }

    public String getgrantDescription() {
        return grantDescription;
    }
    public void setGrantDescription(String grantDescription){this.grantDescription = grantDescription;}
}
