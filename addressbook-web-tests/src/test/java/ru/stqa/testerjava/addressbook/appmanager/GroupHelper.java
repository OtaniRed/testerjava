package ru.stqa.testerjava.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.testerjava.addressbook.model.GroupData;

public class GroupHelper extends HelperBase
{

  public GroupHelper(FirefoxDriver wd)
  {
    super(wd);
  }

  public void initGroupCreation()
  {
    click(By.name("new"));
  }

  public void fillGroupForm(GroupData groupData)
  {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
  }

  public void submitGroupCreation()
  {
    click(By.name("submit"));
  }

  public void returnToGroupPage()
  {
    click(By.linkText("groups"));
  }

  public void checkFistGroup()
  {
    click(By.name("selected[]"));
  }

  public void deleteCheckingGroup()
  {
    click(By.name("delete"));
  }
}
