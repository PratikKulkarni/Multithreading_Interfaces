package neebalgurukul.day11;

class CreateThread extends Thread{
	int num;
	public CreateThread(int n){
		super("NewThread");
		this.num=n;
	}
	

	public void run() {
		try {
			if(num==1) {
				for(int i=1;i<=26;i++) {
					System.out.print(""+((char)('a'+(i-1)))+" ");
				}
				Thread.sleep(1000);
			}
			else {
				for(int i=1;i<=10;i++) {
					System.out.print(i+" ");
				}
				Thread.sleep(500);
			}
			
		}catch(InterruptedException e) {
			System.out.println("Child Thread "+num+" iterrupted");
		}
	}
}

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateThread ct1=new CreateThread(1);
		CreateThread ct2=new CreateThread(2);
		ct1.start();
		ct2.start();
		try {
			System.out.println("Waiting for the child threads to finish");
			ct1.join();
			ct2.join();
		}catch(InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		
	}

}
