package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {

    @Test
    public void addTest() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        Assert.assertEquals(1,list.size());
    }

    @Test
    public void getTest() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        int actual = linkedList.get(0);
        Assert.assertEquals(1,actual);
    }

    @Test
    public void removeTest() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.remove();
        Assert.assertEquals(0,linkedList.size());
    }
}
