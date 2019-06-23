package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import javax.swing.*;
import java.util.Deque;
import java.util.Stack;

public class ArrayDeque {

    @Test
    public void addTest() {
        Deque<Integer> deque = new java.util.ArrayDeque<>();
        deque.add(1);
        Assert.assertEquals(1,deque.size());
    }

    @Test
    public void getTest() {
        Deque<Integer> deque = new java.util.ArrayDeque<>();
        deque.add(1);
        int actual = deque.peek();
        Assert.assertEquals(1,actual);
    }

    @Test
    public void removeTest() {
        Deque<Integer> deque = new java.util.ArrayDeque<>();
        deque.add(1);
        deque.remove();
        Assert.assertEquals(0,deque.size());
    }

    @Test
    public void stack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.peek();
        stack.pop();
        Assert.assertEquals(0,stack.size());
    }
}
