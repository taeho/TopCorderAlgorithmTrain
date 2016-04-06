package train01;

/*
 * topCorderTrainning - exm01 - kiwi juice
 * http://falkeadler2.blogspot.kr/2014/10/topcoder-1.html
 * 문제 :
 * 0~N-1 까지 N개의 병에 키위주스가 들어있음. 
 * capacities[i] 는 각 병의 최대 용량, bottles[i]는 각 병에 들어있는 키위주스의 양이다.
 * 0~M-1 까지 M 회 조작시, i 번째 조작은 fromId[i] 병에서 toId[i] 병으로 키위주스를 옮기는 것을 의미한다. 
 * fromId[i] 병이 비거나, toId[i]병이 꽉 차면 i 번째 조작은 끝난다.
 * 예제는 아래와 같다
 * int[] cap = { 700000, 800000, 900000, 1000000 };
 * int[] bot = { 478478, 478478, 478478, 478478 };
 * int[] from = { 2, 3, 2, 0, 1};
 * int[] to = { 0, 1, 1, 3, 2 };
 * 결과는 아래와 같다.
 * {0, 156956, 900000, 856956}
 * 
 * */

public class Kiwi {

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
	
	public static int[] thePouring(int[] capa, int[] bottle, int[] fromId, int[] toId){
		for(int i=0; i< fromId.length; i++){	// 5 repeat
			int from = fromId[i];	
				// 0=> from 2	
				// 1=> from 3	
				// 2=> from 2
				// 3=> from 0
				// 4=> from 1
			int to = toId[i];		
				// 0=> to 0		
				// 1=> to 1		
				// 2=> to 1
				// 3=> to 3
				// 4=> to 2
			int sum = bottle[from] + bottle[to];	
			// bottle[2] + bottle[0] => 956956 (sum)
			// bottle[3] + bottle[1] => 956956 (sum)
			// bottle[2] + bottle[1] => 256956 + 800000 = 1056956 (sum)
			// bottle[0] + bottle[3] => 700000 + 156956 = 856956  (sum)
			// bottle[1] + bottle[2] => 800000 + 256956 = 1056956 (sum)
				
			int nam = sum - capa[to];				
			// 956956 - 700000 		(capa[0]) => 256956 (nam)
			// 956956 - 800000 		(capa[1]) => 156956 (nam)
			// 1056956 - 800000 	(capa[1]) => 256956 (nam)
			// 856956 -  1000000 	(capa[3]) => -143044 (nam)
			// 1056956 - 900000 	(capa[2]) => 156956 (nam)
			
			if( nam > 0) {
				bottle[from] = nam;					
					// bottle[2] = 256956
					// bottle[3] = 156956
					// bottle[2] = 256956
					// bottle[1] = 156956
				bottle[to] = capa[to];				
					// bottle[0] = 700000
					// bottle[1] = 800000
					// bottle[1] = 800000
					// bottle[2] = 900000
			} else {
				bottle[from] = 0;
					// bottle[0] = 0;
				bottle[to] = sum;
					// bottle[3] = 856956;
			}			
		}		
		return bottle;
	}

}
