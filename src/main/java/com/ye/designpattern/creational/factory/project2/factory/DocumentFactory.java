package com.ye.designpattern.creational.factory.project2.factory;

import com.ye.designpattern.creational.factory.project2.document.Document;


public abstract class  DocumentFactory {

     public abstract Document createDocument(String content);
}
