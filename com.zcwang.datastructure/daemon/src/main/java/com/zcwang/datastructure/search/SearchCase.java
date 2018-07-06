package com.zcwang.datastructure.search;


/**
 * 功能 :
 * date : 2018/7/5
 *
 * @author : zcwang@wisdombud.com
 * @version : 0.0.4-snapshot
 * @creed : code is card for me
 * @since : JDK 1.8
 */
public class SearchCase {

    public static void main(String args[]) {
        SearchCase searchCase=new SearchCase();
        searchCase.findDuplicateEle();
    }

    /**
     * 在给定的数组中发现两个重复出现的元素：
     * 给定一个含有n+2个元素的数组，每个元素的取值范围是1～n，并且除了两个元素出现两次外，其他元素均出现一次，求这两个重复的元素
     */
    public void findDuplicateEle(){
        int elements[]=new int[]{4,2,4,5,2,3,1};
        for (int i = 0; i < elements.length; i++) {
            for (int j = i+1; j < elements.length; j++) {
                if (elements[i]==elements[j]){
                    System.out.println(elements[i]);
                }
            }
        }
    }
}
