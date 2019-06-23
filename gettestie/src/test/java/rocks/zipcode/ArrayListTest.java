package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListTest {

    @Test
    public void addTest() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        Assert.assertEquals(1,list.size());
    }
    @Test
    public void getTest() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int actual = list.get(0);
        Assert.assertEquals(1,actual);

    }
    @Test
    public void removeTest() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.remove(0);
        Assert.assertEquals(0,list.size());
    }

    @Test
    public void vectorTest() {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        Assert.assertEquals(1,vector.size());
    }
}

