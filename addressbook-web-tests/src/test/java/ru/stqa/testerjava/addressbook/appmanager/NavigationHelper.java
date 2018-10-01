package ru.stqa.testerjava.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper
{
  FirefoxDriver wd;

  NavigationHelper(FirefoxDriver wd)
  {
    this.wd = wd;
  }

  public void gotoGroupPage()
  {
   wd.findElement(By.linkText("groups")).click();
  }
}
