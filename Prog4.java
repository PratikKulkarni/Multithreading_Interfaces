package neebalgurukul.day11;

class CreateThread4 implements Runnable{
	String name;
	Thread t;
	int num;
	int count=1;
	String course[];
	public CreateThread4(String s,int n,String c[]){
		this.name=s;
		this.num=n;
		t=new Thread(this,s);
		course = c;
	}
	

	public void run() {
		try {
			
				for(int i=1;i<=3;i++)
				{
					System.out.println(name+" : " +course[i-1]);
					if(i==1) {
						Thread.sleep((int) ((Math.random() * (1000 - 500)) + 500));
					}
				}
				
			
			
		}catch(InterruptedException e) {
			System.out.println("Child thread "+name +" interrupted.");
		}
			
			
		
	}
}

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] course ={"Java", "J2EE", "Spring"};
		CreateThread4 ct1=new CreateThread4("Thread 1",1,course);
		CreateThread4 ct2=new CreateThread4("Thread 2",2,course);
		CreateThread4 ct3=new CreateThread4("Thread 3",3,course);
		ct1.t.start();
		ct2.t.start();
		ct3.t.start();
		try {
			ct1.t.join();
			ct2.t.join();
			ct3.t.join();
		} catch(InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
	}

}
