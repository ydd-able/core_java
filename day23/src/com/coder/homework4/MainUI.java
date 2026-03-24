package com.coder.homework4;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * @author N1357
 * @date 2026/3/24
 * @project core_java
 */
public class MainUI {
    public static void main(String[] args) throws IOException {
        System.out.println("请选择操作");
        System.out.println("1.生成人员名单");
        System.out.println("2.生成签到表");
        System.out.println("3.生成缺席表");
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        switch (c) {
            case 1:
                List<String> nameFromKey = FileUtil.getNameFromKey();
                FileUtil.write(nameFromKey,"d:/aa/人员名单.txt");
                break;
            case 2:
                List<String> nameFromKey1 = FileUtil.getNameFromKey();
                FileUtil.write(nameFromKey1,FileUtil.getFileName("d:/aa","签到表"));
                break;
            case 3:
                List<String> namelist1 = FileUtil.read("d:/aa/人员名单.txt");
                List<String> signlist1 = FileUtil.read(FileUtil.getFileName("d:/aa/","签到表"));
                namelist1.removeAll(signlist1);
                FileUtil.write(namelist1,FileUtil.getFileName("d:/aa","缺席表"));

                break;

        }
    }
}
