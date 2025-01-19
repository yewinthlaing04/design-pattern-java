package com.ye.designpattern.creational.factory.project2.document;

public class Report implements Document{

    private String content;

    public Report(String content) {
        this.content = content;
    }

    @Override
    public String content() {
        return content;
    }

    @Override
    public void render() {
        System.out.println("Report content " + content);
    }

    public void generatePdfReport(){
        System.out.println("Generating pdf report...");
    }
}
