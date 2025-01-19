package com.ye.designpattern.creational.factory.project2;

import com.ye.designpattern.creational.factory.project2.document.Document;
import com.ye.designpattern.creational.factory.project2.document.Report;
import com.ye.designpattern.creational.factory.project2.factory.DocumentFactory;
import com.ye.designpattern.creational.factory.project2.factory.ReportFactory;

public class MainDocument {

    public static void main(String[] args) {
        DocumentFactory reportFactory = new ReportFactory();
        Document report =  reportFactory.createDocument(": Report Content fiancial 2024");
        report.render();

        if ( report instanceof Report ) {
            Report report2024 = (Report) report;
            report2024.generatePdfReport();
        } // else if for other type of document when we want to call
    }

}
