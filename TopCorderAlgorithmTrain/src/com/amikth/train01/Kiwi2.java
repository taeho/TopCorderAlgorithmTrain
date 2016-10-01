package com.amikth.train01;

/*
 * topCorderTrainning - exm01 - kiwi juice
 * http://falkeadler2.blogspot.kr/2014/10/topcoder-1.html
 * 문제 :
 * 0~N-1 까지 N개의 병에 키위주스가 들어있음. 
 * capacities[i] 는 각 병의 최대 용량, bottles[i]는 각 병에 들어있는 키위주스의 양이다.
 * 0~M-1 까지 M 회 조작시, i 번째 조작은 fromId[i] 병에서 toId[i] 병으로 키위주스를 옮기는 것을 의미한다. 
 * fromId[i] 병이 비거나, toId[i]병이 꽉 차면 i 번째 조작은 끝난다.
 * 예제는 아래와 같다
 * int[] caps = { 700000, 800000, 900000, 1000000 };
 * int[] bots = { 478478, 478478, 478478, 478478 };
 * int[] from = { 2, 3, 2, 0, 1};
 * int[] to = { 0, 1, 1, 3, 2 };
 * 결과는 아래와 같다.
 * {0, 156956, 900000, 856956}
 * 
 * */

public class Kiwi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cap = { 700000, 800000, 900000, 1000000 };
		int[] bot = { 478478, 478478, 478478, 478478 };
		int[] bot2 = { 478478, 478478, 478478, 478478 };
		int[] from 	= { 2, 3, 2, 0, 1};
		int[] to 	= { 0, 1, 1, 3, 2 };
		bot2= thePouring(cap, bot, from ,to );
		
		for(int i=0 ; i<bot2.length; i++)
			System.out.printf(bot2[i] + " " );
	}
	
	public static int[] thePouring(int[] capas, int[] bottles, int[] fromId, int[] toId){
		for(int i=0; i< fromId.length; i++){	// 5 repeat
			// 처음 이동량을 생각햇을 때 조건 분기에서 실수 발생 가능
			// 이동량 무시 -> 옮길 주스와 기존 주스 양의 총합이 일정하다는 것과 옮길주스는 주스 총량과
			// 기존 주스병의 용량중에 작은 값이 된다는 것을 이용
			// 기존 주스 : "옮길 주스와 기존 주스의 총합" 과 "기존 주스 병의 용량"에서 작은 값.
			// 옮길 주스 : "옮길 주스와 기준 주스의 총합"에서 위의 값을 제외한 값
			int sum = bottles[fromId[i]] + bottles[toId[i]];
			bottles[toId[i]] = Math.min(sum, capas[toId[i]]);
			bottles[fromId[i]] = sum - bottles[toId[i]];
		}		
		return bottles;
	}

}
