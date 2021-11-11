package utils;
import custom_exceptions.SpeedOutOfRangeException;

public class SpeedUtils {

	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
		
	static {
		MIN_SPEED=30;
		MAX_SPEED=80;
	}
	public static void validateSpeed(int speed) throws SpeedOutOfRangeException {
		if(speed<MIN_SPEED) {
			throw new SpeedOutOfRangeException("You are driving too slow causing the traffic jam.");
		}else if(speed > MAX_SPEED) {
			throw new SpeedOutOfRangeException("You are driving too fast : FATAL");
		}else
			System.out.println("Speed within the range....");
	}
}
