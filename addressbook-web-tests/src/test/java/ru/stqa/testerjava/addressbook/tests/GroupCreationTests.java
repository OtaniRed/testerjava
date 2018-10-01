package ru.stqa.testerjava.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.testerjava.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
    public void testGroupCreationTests() {

    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test11", "test22", "test33"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }


}
