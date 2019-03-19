package ru.rt.client.tests;

import org.testng.annotations.Test;
import ru.rt.client.model.GroupDate;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().navToGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupDate("groupName", "header test", "group footer"));
        app.getGroupHelper().submitGroupCreation();
    }

}
