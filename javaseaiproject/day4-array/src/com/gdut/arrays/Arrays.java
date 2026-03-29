package com.gdut.arrays;


public class Arrays {
    public static void main(String[] args) {
        int [] arrays = {4,30,34,7,12,2};
        //数组的复制
        int [] arrays1 = arrays;
        for(int n:arrays1){
            System.out.print(" "+n);
        }
        System.out.println(" ");
        int[] arrays2 = new  int[arrays.length];
        //               原数组  原起始位置  后数组  后起始位置  长度
        System.arraycopy(arrays,0,arrays2,0,arrays.length);
        for(int n : arrays2){
            System.out.print(" " +n);
        }
        System.out.println(" ");
        int[] arrays3 = new int[arrays.length];
        System.arraycopy(arrays,3,arrays3,0,arrays.length-3);
        for(int n : arrays3){
            System.out.print( " "+n);
        }
        System.out.println("\n===================");
        //数组的排序
       java.util.Arrays.sort(arrays,0,arrays.length);
       for(int n : arrays){
           System.out.print(" " + n);
       }
       var i = java.util.Arrays.binarySearch(arrays,34);
       System.out.println(" ");
       System.out.println("34在数组中的索引为："+i);


        //数组的比较
        System.out.println("\n===================");
        int[] a = new int[5];
        int[] b = new int[5];
        java.util.Arrays.fill(a,30);
        java.util.Arrays.fill(b,30);
        System.out.println(java.util.Arrays.equals(a,b));//比较的是内容
        System.out.println(a.equals(b));//比较的是地址

        b[2] = 40;
        System.out.println(java.util.Arrays.equals(a,b));

        //数组的填充
        System.out.println("\n===================");
        int[] c = new int [8];
        for (int i1 = 0; i1 < c.length; i1++) {
            int num = (int)(Math.random() * 100);
            java.util.Arrays.fill(c,i1,i1+1,num);
        }
        for(int j=0; j<c.length;j++){
            System.out.print(" "+c[j]);
        }
    }
}
