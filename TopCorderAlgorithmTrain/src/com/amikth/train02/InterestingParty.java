package com.amikth.train02;

/*
 * ��ſ���Ƽ : ���ڿ� �迭 first, second �� �־����ϴ�. ȭ��Ʈ���� i��° ģ���� ��� �ִ� ȭ����
 *    first[i]�� second[i]�Դϴ�. ��ſ� ��Ƽ�� �Ƿ��� ȭ��Ʈ���� �ʴ��� �� �ִ� ģ���� �ִ� ������� �����ϼ���.
 *    
 * - �������� : 
 *    first :  1 ~ 50���� ��Ҹ� ���� �迭�Դϴ�.
 *    second : first�� ���� ũ���� �迭�Դϴ�.
 *    first, second ���� : �� ��Ҵ� 1 ~ 15���� �����̸�, �� ���ڴ� ���� �ҹ����Դϴ�.
 *    i ��° ��� first[i] �� second[i]�� ������ �ٸ��ϴ�.
 *    
 *  - ���� 1 :
 *    first = { "fishing", "gardening", "swimming", "fishing"};
 *    second = { "hunting", "fishing", "fishing", "biting"};
 * 	  return : 4
 * 
 *  - ���� 2 :
 *    first = { "variety", "diversity", "loquacity", "courtesy"};
 *    second = { "talking", "speaking", "discussion", "meeting"};
 * 	  return : 1   
 *   
 *  - ���� 3 :
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
