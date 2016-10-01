package com.amikth.train02;

/*
 * 즐거운파티 : 문자열 배열 first, second 가 주어집니다. 화이트씨의 i번째 친구가 흥미 있는 화제는
 *    first[i]와 second[i]입니다. 즐거운 파티가 되려면 화이트씨가 초대할 수 있는 친구는 최대 몇명인지 리턴하세요.
 *    
 * - 제약조건 : 
 *    first :  1 ~ 50개의 요소를 갖는 배열입니다.
 *    second : first와 같은 크기의 배열입니다.
 *    first, second 공통 : 각 요소는 1 ~ 15개의 문자이며, 각 문자는 영어 소문자입니다.
 *    i 번째 요소 first[i] 와 second[i]의 내용은 다릅니다.
 *    
 *  - 예시 1 :
 *    first = { "fishing", "gardening", "swimming", "fishing"};
 *    second = { "hunting", "fishing", "fishing", "biting"};
 * 	  return : 4
 * 
 *  - 예시 2 :
 *    first = { "variety", "diversity", "loquacity", "courtesy"};
 *    second = { "talking", "speaking", "discussion", "meeting"};
 * 	  return : 1   
 *   
 *  - 예시 3 :
 *    first = { "snakes", "programming", "cobra", "monty"};
 *    second = { "python", "python", "anaconda", "python"};
 * 	  return : 3   
 *    
 *  
 * */

public class InterestingParty {
	
	public static int bestInvitation(String[] first, String[] second){
		int i, j;
		int ans = 0;
		
		for(i =0; i<first.length; i++){
			int f = 0;
			int s = 0;
			
			for(j=0; j<first.length; j++){
				if(first[i].equals(first[j])) f++;
				if(first[i].equals(second[j])) f++;
				if(second[i].equals(first[j])) s++;
				if(second[i].equals(second[j])) s++;
			}
			
			ans = Math.max(f, ans);
			ans = Math.max(s, ans);
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] first = { "fishing", "gardening", "swimming", "fishing"};
		String[] second = { "hunting", "fishing", "fishing", "biting"};
		
		int res = 0;
		res = bestInvitation(first, second);
		
		System.out.println("Resut = " + res);
	}

}
