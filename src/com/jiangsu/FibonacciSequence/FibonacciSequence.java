package com.jiangsu.FibonacciSequence;

public class FibonacciSequence {

	/**
	 * 不死神兔-----斐波那契数列
	 * 意大利青年斐波那契在书中提出一个有趣的问题：假设一对刚出生的小兔子，一个月后能长成大兔，并且此后每个月能生一对小兔子，一年内没有发生死亡
	 * 问：一对刚出生的兔子，一年内繁殖成多少对兔子
	 * 1 1 2 3 5 8 13 
	 * 第一个月一对小兔子										1
	 * 第二个月一对大兔子										1
	 * 第三个月一对大兔子生了一对小兔子							2
	 * 第四个月一对大兔子又生了一对小兔子，之前的小兔子长成一对大兔子		3
	 * 第五个月两对大兔子生了两对小兔子，一对小兔子长成大兔子			5
	 * .													.
	 * .													.
	 * .													.
	 * 第 n 个月...........................................第 n-1个月的兔子数量+第 n-2个月的兔子数量
	 * @param args	
	 */
	public static void main(String[] args) {

	}
	
	/**
	 * 方法一：用用数组来做
	 */
	public static void method1(){
		 int[] arr = new int[8];
		 arr[0] = 1;
		 arr[1] = 1;
		 for(int i = 2;i<arr.length;i++){
			 arr[i] = arr[i-2] + arr[i-1];
		 }
		 System.out.println(arr[arr.length - 1]);
	}
	
	/**
	 * 方法二：用递归方式
	 */
	public static int method2(int num){
		if(num==1||num==2){
			return 1;
		}else{
			return method2(num-2) + method2(num-1);
		}
	}
	

}
















