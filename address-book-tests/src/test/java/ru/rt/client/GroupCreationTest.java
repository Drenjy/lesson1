package ru.rt.client;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        navToGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupDate("groupName", "header test", "group footer"));
        submitGroupCreation();
    }

}
