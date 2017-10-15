package com.aliscuse.selenium.tests;

public class Element {
    String url;
    String browser;
    String method;

    public Element(){
        this.url = "";
        this.browser = "";
        this.method = "";
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
