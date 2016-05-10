package train03;

import java.util.Arrays;

/*
 *  ��ȣ 
 *  ����: �Է� ����Ʈ���� 1���� ���� �����ϰ� ���� 1 ����, �̶� ����Ʈ ������ ��� ���� ���� ���� Ŀ������.
 *      int[] numbers ���·� ���� �迭�� �־����� ���� �ִ��� �����ϼ���. ���ϰ��� 2(62��)�� ���� ����
 *  
 *  ����: public long encrypt
 *  ��������: capacities = 2~50���� ��Ұ� �ִ� �迭�̸� �� ����� ���� 1~1000�Դϴ�
 *         ���ϰ� : 2(62��) �� ���� ����.
 *         
 *  ���� 0 ) numbers = { 1, 2, 3 }
 *  		return : 12
 *  ���� 1 ) numbers = { 1, 3, 2, 1, 1, 3}
 *  		return : 36
 *  ���� 2 ) numbers = { 1000, 999, 998, 997, 996, 995 }
 *  		return : 986074810223904000
 *  ���� 3 ) numbers = { 1, 1, 1, 1 }
 *  		return : 2
 *  
 *  ���� 0 )�� ���÷� ����
 *  	numbers[0] ��ġ�� 1�� ���� +1 �ϴ� ��� 2 * 2 * 3 = 12
 *  	numbers[1] ��ġ�� 2�� ���� +1 �ϴ� ��� 1 * 3 * 3 = 9
 *  	numbers[2] ��ġ�� 3�� ���� +1 �ϴ� ��� 1 * 2 * 4 = 8
 *  	=> �̷���� 12�� �ִ� �׷��� ��ȣ�� 223 �Դϴ�. ������ ��ȣ�� �����ϴ°� �ƴ� �� �����̴ϱ� 12
 *  
 *  * +1 �ϴ� ���ڸ� ���մϴ�
 *  * �׸��� ��� ���� ����ϰ� �ִ밪�� ����
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
