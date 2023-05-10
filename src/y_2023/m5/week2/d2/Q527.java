package y_2023.m5.week2.d2;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Q527 {

    public List<String> wordsAbbreviation(List<String> dict) {
        int len = dict.size();

        List<String> ans = new ArrayList<>(len);  // 创建一个包含给定大小的字符串列表
        int[] prefix = new int[len];  // 定义一个整数数组用于存储前缀数量
        Map<String, Integer> count = new HashMap<>();  // 创建一个哈希表用于存储缩写和它们出现的次数

        // 遍历输入列表中的每个单词
        for(int i=0; i<len; i++) {
            prefix[i] = 1;  // 初始情况下，所有单词都有一个前缀
            ans.add(getAbbr(dict.get(i), 1));  // 对当前单词进行缩写并将其添加到答案列表中
            count.put(ans.get(i), count.getOrDefault(ans.get(i), 0)+1); // 将缩写添加到哈希表中并更新它出现的次数
        }

        // 当同一缩写被使用超过一次时，为其增加前缀
        while (true) {
            boolean unique = true;  // 用于检查是否存在重复的缩写

            for(int i=0; i<len; i++) {
                if (count.get(ans.get(i)) > 1) {  // 如果当前缩写被使用了多次
                    prefix[i]++;  // 为单词添加前缀
                    ans.set(i, getAbbr(dict.get(i), prefix[i]));  // 更新缩写
                    count.put(ans.get(i), count.getOrDefault(ans.get(i), 0)+1);  // 更新哈希表中该缩写的出现次数
                    unique = false;
                }
            }

            if (unique) {
                break;  // 如果所有单词都有唯一的缩写，则退出循环
            }
        }

        return ans;  // 返回经过缩写处理后的字符串列表
    }

    // 用于对单词进行缩写处理
    private String getAbbr(String s, int p) {
        if (p >= s.length() - 2) {
            return s;  // 如果前缀数量大于等于单词长度减去2，则不进行缩写
        }

        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(0, p));  // 添加前缀
        sb.append(s.length()-p-1);  // 添加单词缩写中间的数字（即单词长度减去前缀和末尾字母）
        sb.append(s.charAt(s.length()-1));  // 添加末尾字母
        return sb.toString();  // 返回缩写后的单词
    }

}
