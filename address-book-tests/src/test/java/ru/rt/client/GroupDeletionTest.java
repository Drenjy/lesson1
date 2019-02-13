package ru.rt.client;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {

    @Test
    public void testGroupDeletion() throws Exception {
        navToGroupPage();
        selectGroup();
        clickDeleteBtn();
    }

}
