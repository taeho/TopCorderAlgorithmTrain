package com.amikth.train01;

/*
 * topCorderTrainning - exm01 - kiwi juice
 * http://falkeadler2.blogspot.kr/2014/10/topcoder-1.html
 * ���� :
 * 0~N-1 ���� N���� ���� Ű���ֽ��� �������. 
 * capacities[i] �� �� ���� �ִ� �뷮, bottles[i]�� �� ���� ����ִ� Ű���ֽ��� ���̴�.
 * 0~M-1 ���� M ȸ ���۽�, i ��° ������ fromId[i] ������ toId[i] ������ Ű���ֽ��� �ű�� ���� �ǹ��Ѵ�. 
 * fromId[i] ���� ��ų�, toId[i]���� �� ���� i ��° ������ ������.
 * ������ �Ʒ��� ����
 * int[] caps = { 700000, 800000, 900000, 1000000 };
 * int[] bots = { 478478, 478478, 478478, 478478 };
 * int[] from = { 2, 3, 2, 0, 1};
 * int[] to = { 0, 1, 1, 3, 2 };
 * ����� �Ʒ��� ����.
 * {0, 156956, 900000, 856956}
 * 
 * */

public class Kiwi1 {

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
			
			int f = fromId[i];
			int t = toId[i];
			
			// if ���ǹ��� �ƴ� �ּҰ� �Լ� ��� java.lang.Math
			int vol = Math.min(bottles[f], capas[t] - bottles[t]);
			bottles[f] -= vol;
			bottles[t] += vol;
		}		
		return bottles;
	}

}
