/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 吉彬
 */
public class Solution {
    public static void main(String[] args){
        
    }
    /*
    问题：
    请实现一个函数，将一个字符串中的空格替换成“%20”。
    例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
    */
    
    /*
    解决思路：
    先遍历一遍字符串获取字符串中空格的数量num，
    由题意知每替换一个空格，原来的字符串长度加2。
    定义一个长度为str.length()+num*2大小的字符数组，
    遍历原来的字符串并将字符添加到字符数组中，
    如果遇到空格，则将'%','2','0'这三个字符依次添加到字符数组中，
    最后将字符数组以参数的形式传给String的构造器生成新的字符串。
    */
    public String replaceSpace(StringBuffer str) {
        int num = 0;//记录空格的数量
        for(int i=0;i<str.length();++i){
            if(str.charAt(i)==' ')
                num++;
        }
        char[] chars = new char[num*2+str.length()];
        int index = 0;//chars数组下标
        for(int i=0;i<str.length();++i){
            if(str.charAt(i)==' '){
                chars[index++] = '%';
                chars[index++] = '2';
                chars[index++] = '0';
            }
            else
                chars[index++] = str.charAt(i);
        }
    	return new String(chars);
    }
}
