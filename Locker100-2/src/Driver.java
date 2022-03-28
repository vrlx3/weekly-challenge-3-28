import java.util.HashMap;

public class Driver {
	public static void main(String[] args) {
		HashMap<Integer, Boolean> lockers = new HashMap<>();
		for (int i =1; i <= 100; i++) {
			lockers.put(i, false);
		}
		for(int pass = 1; pass <= 100; pass++ ) {
			for (int locker = 1; locker <= 100; locker++) {
				if (locker % pass == 0) {
					lockers.put(locker,!lockers.get(locker));
					
				}
			}
			int openLockers = 0;
			for (int locker = 1; locker <= 100; locker++) {
				if (lockers.get(locker) == true) {
					openLockers++;
				}
			}
			System.out.println("For pass " + pass + " open lockers are " + openLockers);
		}
	}
}
