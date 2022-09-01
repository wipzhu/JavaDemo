package com.wipzhu.apidemo;

public class StringDemo7 {
    public static void main(String[] args) {
        //取身份证内的出生年月日和性别
        String idCardNo = "412726199812084915";

        String year = idCardNo.substring(6, 10);
        String month = idCardNo.substring(10, 12);
        String day = idCardNo.substring(12, 14);

        int gender = Integer.parseInt(idCardNo.substring(16, 17));

        System.out.println("出生日期：" + year + "-" + month + "-" + day);
        System.out.println("性别：" + ((gender % 2 == 0) ? "女" : "男") );

        // 替换敏感词
        String[] arr = {"TMD", "CNM", "SB", "MLGB"};
        String talk = "你玩的真好，下次不要再玩了, TMD，SB";
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
        }
        System.out.println(talk);
    }
}
