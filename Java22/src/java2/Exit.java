package java2;

public class Exit {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i==5) {
				//System.exit(i); //프로젝트 자체를 종류
				break; //for문에 대한 종료 
			}
		}
		System.out.println("프로젝트 종료");
		
		//systemtime
		long time1=System.nanoTime();
		int sum=0;
		for (int i = 0; i < 1000000; i++) {
			sum+=i;
		}
		long time2=System.nanoTime();
		System.out.println("1~1000000까지의 합 : " + sum);
		System.out.println("계산에 " +(time2-time1) + "나노초가 소요되었다");

	
		//박싱과 언박싱
		//박싱 >>기본값을 객체화 시키는것
		Integer obj1=new Integer(100);
		Integer obj2=new Integer("200");
		//Integer obj3=new Integer.valueOf("300" );
	
		//언박싱 >>객체를 기본타입으로 
		int val1=obj1.intValue();
		int val2=obj2.intValue();
		System.out.println(val1);
		System.out.println(val2);
	}
}
