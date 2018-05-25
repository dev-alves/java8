package cap03;

import cap02.Usuario;

/**
 * O conceito de interfaces funcionais vale para versões anteriores ao Java 8!
 * @author dev
 *
 */

public class LambdaRunnable {
	
	public static void main(String[] args) {
		
		Runnable run = ()-> {
			for(int i=0; i<500; i++) {
				System.out.println(i);
			}
		};
		new Thread().start();
		run.run();
		
		// ou
		
		new Thread(()-> {
			for(int i = 0; i< 500; i++) {
				System.out.println(i);
			}
		}).start();
		
		
	}

}
