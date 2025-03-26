package com.learning.programming;

import static java.lang.Integer.parseInt;

import java.util.List;

public class Modules {
    public static void main(String[] args) {
        var list = List.of("7123123173","712312311", "21474836482", "00681251126", "02000006256", "03000012050", "03000012304", "03000012260", "03000012256", "03000012245",
            "03000011976", "03000012223", "03000012131", "01000001682", "00539073721", "00455311861", "00643514561", "00669076446",
            "00607351360");
        for (var data : list) {
            var l = Long.parseLong(data.substring(0, data.length() - 1));
            var e = Integer.parseInt(data.substring(data.length() - 1));
            if (l % 7 == e && ekLogic(l) == e) {
                System.out.println("Success : " + (l % 7));
            } else {
                System.err.println("Error : " + data + " : " + (l % 7));
            }
        }
    }

    private static int ekLogic(long l) {
        return (int)(l - (7 * Math.abs(l/7)));
    }

    private static void checking(String memberId) {
        var member = memberId.substring(memberId.length() - 9);
        System.out.println("Members : " + member);
        var eightDigit = parseInt(member.substring(0, member.length() - 1));
        var nineDigit = parseInt(member.substring(member.length() - 1));

        if (eightDigit % 7 == nineDigit)
            System.out.println("Success");
        else
            System.err.println("Failure : " + memberId);

    }
}
