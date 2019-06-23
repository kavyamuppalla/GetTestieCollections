package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    @Test
    public void add() {
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(1);
        int actual = hashSet.size();
        Assert.assertEquals(1,actual);
    }
    @Test
    public void getTest() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        Iterator<Integer> it = hashSet.iterator();
        int actual =999;
        while(it.hasNext()) {
            actual = it.next();
        }
        Assert.assertEquals(1,actual);
    }
    @Test
    public void removeTest() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.remove(1);
        Assert.assertEquals(0,hashSet.size());
    }
}
