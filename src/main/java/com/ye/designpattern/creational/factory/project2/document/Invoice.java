package com.ye.designpattern.creational.factory.project2.document;

public class Invoice implements Document {

    private String content;

    public Invoice(String content) {
        this.content = content;
    }

    @Override
    public String content() {
        return content;
    }

    @Override
    public void render() {
        System.out.println("Invoice Content " + this.content);
    }

    public void generatePdf(){
        System.out.println("Invoic Pdf is generating");
    }
}
