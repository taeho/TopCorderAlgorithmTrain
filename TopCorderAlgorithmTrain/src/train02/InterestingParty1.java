package train02;

import java.util.HashMap;
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

public class InterestingParty1 {

	public static int bestInvitation(String[] first, String[] second){
		HashMap<String, Integer> dic = new HashMap<String, Integer>();
		
		for(int i=0; i<first.length; i++){
			dic.put(first[i], 0);
			dic.put(second[i], 0);
		}
		
		for(int i=0; i<first.length; i++){
			dic.put(first[i], dic.get(first[i])+1);
			dic.put(second[i], dic.get(second[i])+1);
		}
		
		int ans = 0;
		for(String key: dic.keySet()){
			ans = Math.max(ans, dic.get(key));
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
