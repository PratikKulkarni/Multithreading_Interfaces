package neebalgurukul.day11;

class CreateThread3 extends Thread{
	String name;
	Thread t;
	int num;
	public CreateThread3(String s,int n){
		super(s);
		this.num=n;
		t=new Thread(this,s);
		
	}
	

	public void run() {
		try {
			if(num==2) {
				for(int i=2;i<=20;i+=2) {
					System.out.print(i+" ");
					Thread.sleep(1000);
				}
			}
			else {
				for(int i=1;i<=20;i+=2) {
					System.out.print(i+" ");
					Thread.sleep(1000);
				}
			}
		}catch(InterruptedException e) {
			System.out.println("Child thread "+num +" interrupted.");
		}
			
			
		
	}
}


public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateThread3 ct1=new CreateThread3("Thread1",1);
		CreateThread3 ct2=new CreateThread3("Thread2",2);
		try {
			ct1.start();
			if(ct1.isAlive()) {
				System.out.println("Thread1 is alive");
			}
			else {
				System.out.println("Thread1 is dead");
			}
			ct2.start();
			if(ct2.isAlive()) {
				System.out.println("Thread2 is alive");
			}
			else {
				System.out.println("Thread2 is dead");
			}
			ct1.join();
			ct2.join();
			System.out.println();
			if(ct1.isAlive()) {
				System.out.println("Thread1 is alive");
			}
			else {
				System.out.println("Thread1 is dead");
			}
			
			if(ct2.isAlive()) {
				System.out.println("Thread2 is alive");
			}
			else {
				System.out.println("Thread2 is dead");
			}
			
		}catch(InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
	}

}
