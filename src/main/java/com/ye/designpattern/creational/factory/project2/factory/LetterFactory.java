package com.ye.designpattern.creational.factory.project2.factory;

import com.ye.designpattern.creational.factory.project2.document.Document;

import com.ye.designpattern.creational.factory.project2.document.Letter;



public class LetterFactory extends DocumentFactory{
    @Override
    public Document createDocument(String content) {
        return new Letter(content);
    }
}
