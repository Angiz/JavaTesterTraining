package com.test.webdriver;

public class ChromeDriver implements Webdriver{
    @Override
    public void get() {
        System.out.println("I'm getting ChromeDriver");
    }

    @Override
    public void findElementBy() {
        System.out.println("I'm finding element by FirefoxDriver's element");
    }
}
