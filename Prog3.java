package neebalgurukul.day11;

class CreateThread3 extends Thread{
	String name;
	Thread t;
	int num;
	public CreateThread3(String s,int n){
		super(s);
		this.num=n;
		t=new Thread(this,s);
		t.start();
	}
	

	public void run() {
		System.out.println("Thread "+num+" has entered the run method");
		try {
			if(num==2) {
				for(int i=2;i<=20;i+=2) {
					System.out.print(i+" ");
					Thread.sleep(1000);
				}
				System.out.println();
			}
			else {
				for(int i=1;i<=20;i+=2) {
					System.out.print(i+" ");
					Thread.sleep(1000);
				}
				System.out.println();
			}
		}catch(InterruptedException e) {
			System.out.println("Child thread "+num +" interrupted.");
		}
			
			
		System.out.println("Thread "+num+" is exiting the run method");
	}
}

/*
 *Threads traced on their entry and exit from the main method. 
 */
public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateThread3 ct1=new CreateThread3("Thread1",1);
		CreateThread3 ct2=new CreateThread3("Thread2",2);
		try {
			
			if(ct1.t.isAlive()) {
				System.out.println("Thread1 is alive");
			}
			else {
				System.out.println("Thread1 is dead");
			}
			if(ct2.t.isAlive()) {
				System.out.println("Thread2 is alive");
			}
			else {
				System.out.println("Thread2 is dead");
			}
			ct1.t.join();
			ct2.t.join();
			System.out.println();
			if(ct1.t.isAlive()) {
				System.out.println("Thread1 is alive");
			}
			else {
				System.out.println("Thread1 is dead");
			}
			
			if(ct2.t.isAlive()) {
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
