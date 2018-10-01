package ru.stqa.testerjava.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase
{


  @Test
  public void testGroupCreationTests()
  {

    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().checkFistGroup();
    app.getGroupHelper().deleteCheckingGroup();
    app.getGroupHelper().returnToGroupPage();
  }


}

