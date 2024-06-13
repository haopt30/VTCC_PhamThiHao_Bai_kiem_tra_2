package com.haopt30.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

    private static final ExtentReports extentReports = new ExtentReports();

    public synchronized static ExtentReports getExtentReports() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("exports/reports/extentreport/extentreport.html");
        reporter.config().setReportName("Extent Report | Haopt30");
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Framework Name", "Selenium Java | Haopt30");
        extentReports.setSystemInfo("Author", "Haopt30");
        return extentReports;
    }

}

