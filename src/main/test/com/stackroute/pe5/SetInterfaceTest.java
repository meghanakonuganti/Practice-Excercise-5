package main.test.com.stackroute.pe5;

import main.java.com.stackroute.pe5.SetInterface;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class SetInterfaceTest {

    SetInterface st;
    String str = "Harry Olive Alice Bluto Eugene";
    String str1 = "Harry Olive Alice Bluto";
    Set<String> set = new TreeSet<String>();

    {
        set.add("Alice");
        set.add("Bluto");
        set.add("Eugene");
        set.add("Harry");
        set.add("Olive");
    }

    @Before
    public void setUp() throws Exception {
        st = new SetInterface();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setInterfaceSuccess() {
        assertEquals(set, st.setInterface(str));

    }

    @Test
    public void setInterfaceFailure() {
        assertNotEquals(set, st.setInterface(str1));

    }


}