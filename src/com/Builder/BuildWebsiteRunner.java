package com.Builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new VisitCardWebsiteBuilder()); // or EnterpriceWebsiteBuilder
        Website website = director.buildWebsite();

        System.out.println(website);
    }
}
