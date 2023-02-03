package com.java.assignment;


public class MultiThreadingProgram {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Thread1 thread1Object = new Thread1();
			Thread2 thread2Object = new Thread2();
			
			thread1Object.start();
			thread2Object.start();
		}

	}

	class Thread1 extends Thread{
		
		public void run() {
			
			for(int i=1;i<=5;i++) {
				System.out.println("Thread 1 is running for "+i+" times");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	class Thread2 extends Thread{
		
		public void run() {
			
			for(int i=1;i<=5;i++) {
				System.out.println("Thread 2 is running for "+i+" times");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}


