package com.ye.designpattern.creational.factory.project2.document;

public class Letter implements Document{

    private String content;

    public Letter(String content) {
        this.content = content;
    }
    @Override
    public String content() {
        return content;
    }

    @Override
    public void render() {
        System.out.println("Letter content: " + content);
    }

    public void generatePdf(){
        System.out.println("Generating PDF for Letter...");
    }
}
