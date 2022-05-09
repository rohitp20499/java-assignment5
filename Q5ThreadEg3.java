package my.com.assignments;

class MyThreadEg3 implements Runnable {
	String str = "Hello All Developers";
	public void run() {
		for (int i = 0; i < str.length() ; i++) {
			System.out.println("MyThread "+str.charAt(i));
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

class Q5ThreadEg3 {
	public static void main(String[] args) {
		String str = "Hello All Developers";
		MyThreadEg3 myThEg = new MyThreadEg3();
		Thread th =  new Thread(myThEg);
		th.start();
		
		for(int i=0 ; i<str.length() ; i++) {
			System.out.println("MainThread "+str.charAt(i));
			try {
				Thread.sleep(75);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}//end main
}//end class
