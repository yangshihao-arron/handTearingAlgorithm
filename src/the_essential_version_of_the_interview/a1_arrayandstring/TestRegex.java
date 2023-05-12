package the_essential_version_of_the_interview.a1_arrayandstring;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestRegex {

    public static void main(String[] args) {
        /**
         *   1:要求必须是 5-15 位数字
         *  2:0 不能开头
         */
//        String qq = "604154942";
//        String qqRegex = "[1-9][0-9]{4,14}";
//        boolean qqFlag = qq.matches(qqRegex);
//        System.out.println(qqFlag);

        /**
         *  1：要求为 11 位数字
         * 2：第 1 位为 1，第 2 位为 3、4、5、7、8 中的一个，后面 9 位为 0 到 9 之间的任意数字。
         */
//        String phone = "18810022666";
//        String phoneRegex = "1[3-8][0-9]{9}";
//        boolean phoneFlag = phone.matches(phoneRegex);
//        System.out.println(phoneFlag);
//
//        /**
//         * 将字符串中的数字全部替换成！
//         */
//        String str = "1a2b3c4d";
//        str = str.replaceAll("\\d", "!");
//        System.out.println(str);
//
//        /**
//         *  根据空格切割字符串
//         */
//
//        String str1 = "我     很  帅";
//        String[] arr1 = str1.split("\\s+");
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }
        //根据.切割 IP 地址
        String str2 = "192.168.11.88";
        String[] arr2 = str2.split(".");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);

        }
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String test = scanner.nextLine();
            test = test.trim();
            String[] res = test.split("\\s+");
            double sum = 0;
            for(String s : res){
                sum += s.length();
            }
            double ans = sum / res.length;
            DecimalFormat df = new DecimalFormat("#.00");
            System.out.println(df.format(ans));
        }


    }

}
