package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapTest {

    @Test
    public void putTest() {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"value");
        Assert.assertEquals(1,hashMap.size());
    }

    @Test
    public void getTest() {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"value");
        hashMap.get(1);
        Assert.assertEquals(1,hashMap.size());
    }

    @Test
    public void removeTest() {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"value");
        hashMap.remove(1);
        Assert.assertEquals(0,hashMap.size());
    }

    @Test
    public void treeMapTest() {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1,"add");
        Assert.assertEquals(1,treeMap.size());
    }

}
