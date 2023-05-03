package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinOpsTest {
    BinOps bins = new BinOps();

    @Test
    void sum() {
        String actual = bins.sum("10101","10000001");
        String expectid = "10010110";
        Assertions.assertEquals(expectid, actual);
    }

    @Test
    void mult() {
        String actual = bins.mult("10101","100000");
        String expectid = "1010100000";
        System.out.println(Integer.parseInt(expectid, 2));
        System.out.println(Integer.parseInt(actual, 2));
        Assertions.assertEquals(expectid, actual);
    }
}