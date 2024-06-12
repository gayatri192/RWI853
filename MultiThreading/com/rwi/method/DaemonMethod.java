package com.rwi.method;

class ThreadDemo extends Thread{
	public void run(){
		for(int i = 0; i<3; i++){
			System.out.println("Hello");
		}
	}
}

public class DaemonMethod {

	public static void main(String[] args) {
		
		ThreadDemo t = new ThreadDemo();
		ThreadDemo daemonThread = new ThreadDemo();
		daemonThread.setDaemon(true);
		daemonThread.start();
		t.start();
		

		System.out.println("Daemon: "+Thread.currentThread().isDaemon());  
	}

}
