package neebalgurukul.day11;


class CreateThread2 extends Thread{
	int num;
	public CreateThread2(int n){
		super("NewThread");
		this.num=n;
	}
	

	public void run() {
		
			if(num==2) {
				for(int i=1;i<=20;i+=2) {
					System.out.print(i+" ");
				}
			}
			else {
				for(int i=2;i<=20;i+=2) {
					System.out.print(i+" ");
				}
			}
			
		
	}
}

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateThread2 ct1=new CreateThread2(1);
		CreateThread2 ct2=new CreateThread2(2);
		try {
			ct1.start();
			ct1.join();
			ct2.start();
			ct2.join();
		}catch(InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		
	}

}
