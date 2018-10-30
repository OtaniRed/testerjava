package ru.stqa.testerjava.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.testerjava.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase
{
  @Test
  public void testGroupModification()
  {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().checkFistGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("test11", "test22", "test33"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
  }
}
