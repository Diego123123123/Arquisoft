package parrot;

public class AfricanSpeedCalculator implements SpeedCalculator{

	@Override
	public double calculateSpeed(Parrot parrot) {
		return Math.max(0, baseSpeed - loadFactor * parrot.getNumberOfCoconut());
	}

}
