package ru.stqa.testerjava.addressbook;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase
{


  @Test
  public void testGroupCreationTests()
  {

    gotoGroupPage();
    checkFistGroup();
    deleteCheckingGroup();
    returnToGroupPage();
  }


}

