package parrot;

public class NorwegiaBlueSpeedCalculator implements SpeedCalculator{

	@Override
	public double calculateSpeed(Parrot parrot) {
		return (parrot.getIsNailed()) ? 0 : Math.min(24.0, parrot.getVoltage()*baseSpeed);
	}

}
