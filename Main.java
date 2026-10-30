public class Main {

    public static void main(String[] args) {

        Thread[] threads = new Thread[1000];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new CounterThread();
        }

    }

    static class CounterThread extends Thread {

	    @Override
	    public void run() {

	        long sum = 0;

	        for (long number = 1; number <= 1000000; number++) {
	            sum += number;
	        }

	    }
}
}