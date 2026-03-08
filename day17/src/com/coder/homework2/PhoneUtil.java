package com.coder.homework2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author N1357
 * @date 2026/3/8
 * @project core_java
 */
public class PhoneUtil {
    public static String getPhoneNumber(Random random) {
        String prefix1 = "1";
        List<String> list1 = Arrays.asList("3", "5", "7", "8", "9");
        int index = random.nextInt(list1.size());
        return prefix1 + list1.get(index) + getSuffix(random);

    }

    private static String getSuffix(Random random) {
        String suffix = "";
        for (int i = 0; i < 9; i++) {
            suffix += random.nextInt(10);
        }
        return suffix;
    }
}
