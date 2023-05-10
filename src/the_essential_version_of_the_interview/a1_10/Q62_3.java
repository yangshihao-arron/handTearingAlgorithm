package the_essential_version_of_the_interview.a1_10;

public class Q62_3 {
    public String reverseWords(String s) {
        // 删除首尾空格
        s = s.trim();
        int j = s.length() - 1;
        int i = j;
        StringBuilder res = new StringBuilder();
        while (i >= 0) {
            // 搜索首个空格
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            // 添加单词
            // 注意subString函数含头不含尾，而且beginIndex必须>0，endIndex必须<= length
            res.append(s.substring(i + 1, j + 1) + " ");
            // 跳过单词间空格
            while(i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            j = i; // j 指向下个单词的尾字符
        }
        // 转化为字符串并返回
        return res.toString().trim();
    }
}
