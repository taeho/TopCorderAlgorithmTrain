package train03;

import java.util.Arrays;

/*
 *  암호 
 *  내용: 입력 리스트에서 1개의 값을 선택하고 값을 1 증가, 이때 리스트 내부의 모든 숫자 곱이 가장 커져야함.
 *      int[] numbers 형태로 숫자 배열이 주어질때 곱의 최댓값을 리턴하세요. 리턴값이 2(62승)를 넘지 않음
 *  
 *  정의: public long encrypt
 *  제약조건: capacities = 2~50개의 요소가 있는 배열이며 각 요소의 값은 1~1000입니다
 *         리턴값 : 2(62승) 을 넘지 않음.
 *         
 *  예시 0 ) numbers = { 1, 2, 3 }
 *  		return : 12
 *  예시 1 ) numbers = { 1, 3, 2, 1, 1, 3}
 *  		return : 36
 *  예시 2 ) numbers = { 1000, 999, 998, 997, 996, 995 }
 *  		return : 986074810223904000
 *  예시 3 ) numbers = { 1, 1, 1, 1 }
 *  		return : 2
 *  
 *  예시 0 )의 샘플로 보면
 *  	numbers[0] 위치인 1의 값을 +1 하는 경우 2 * 2 * 3 = 12
 *  	numbers[1] 위치인 2의 값을 +1 하는 경우 1 * 3 * 3 = 9
 *  	numbers[2] 위치인 3의 값을 +1 하는 경우 1 * 2 * 4 = 8
 *  	=> 이럴경우 12가 최댓값 그래서 암호는 223 입니다. 하지만 암호를 리턴하는게 아닌 값 리턴이니까 12
 *  
 *  * +1 하는 숫자를 정합니다
 *  * 그리고 모든 곱을 계산하고 최대값을 선택
 *  
 * */

public class Cryptography1 {
	public static long encrypt(int[] numbers){
		long ret = 1;
		Arrays.sort(numbers);
		numbers[0]++;
		for(int i=0; i<numbers.length; i++){
			ret *= numbers[i];
		}
		return ret;
	}
	
	public static void main(String[] args){
		int[] input =  { 1, 3, 2, 1, 1, 3};
		long retn = 0;
		retn = encrypt(input);
		System.out.println("Test return: " + retn);
	}
}
