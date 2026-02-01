package homework;

import java.util.Scanner;

public class UnSecurityCouncil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入一个国家名字");
        String country = scanner.next();
        boolean b = isMember(country);
        System.out.println(b?"是常任理事国":"不是常任理事国");

    }

    public static boolean isMember(String country) {
        String[] members = {"中国", "美国", "俄罗斯", "英国", "法国"};
        for (String member : members) {
            if (member.equals(country)) {

                return true;
            }
        }
        return false;
    }
}