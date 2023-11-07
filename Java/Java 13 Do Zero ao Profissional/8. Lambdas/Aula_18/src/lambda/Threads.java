package lambda;


public class Threads {
	
	public static void main(String[] args) {
		
		Runnable t1 = new Trabalho1();
		
		Runnable t2 = new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					System.out.println("Tarefa 02");
//					try {
//						Thread.sleep(100);
//					} catch (Exception e) {						
//					}
				}			
			}
		};
		
		Runnable t3 = Threads::trabalho3;
//				() -> {
//			for (int i = 0; i < 10000; i++) {
//				System.out.println("Tarefa 03");
//				try {
//					Thread.sleep(100);
//				} catch (Exception e) {					
//				}
//			}
//		};
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		Thread th3 = new Thread(t3);
		
		th1.start();
		th2.start();
		th3.start();
	}
	
	static void trabalho3() {
		for (int i = 0; i < 10000; i++) {
			System.out.println("Tarefa 03");
//			try {
//				Thread.sleep(100);
//			} catch (Exception e) {					
//			}
		}
	}
}
