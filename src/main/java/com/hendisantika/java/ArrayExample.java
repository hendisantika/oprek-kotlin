package com.hendisantika.java;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by hendisantika on 7/2/17.
 */
public class ArrayExample {
    public int sumValues(int[] nums) {
        int res = 0;

        for (int x:nums) {
            res += x;
        }

        return res;
    }

    public void writeList() throws IOException {
        File file = new File("/Users/hendisantika/Documents/testing/hammer.txt");
        FileReader fr = new FileReader(file);
        fr.close();
    }
}
