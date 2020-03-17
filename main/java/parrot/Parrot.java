package parrot;

public class Parrot {

    private ParrotTypeEnum type;
    private int numberOfCoconuts = 0;
    private double voltage;
    private boolean isNailed;


    public Parrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = _type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
    	SpeedCalculator speedCalculator;
        switch(type) {
            case EUROPEAN:
                speedCalculator = new EuropeanSpeedCalculator();
                return speedCalculator.calculateSpeed(this);
            case AFRICAN:
            	speedCalculator = new EuropeanSpeedCalculator();
            	return speedCalculator.calculateSpeed(this);
            case NORWEGIAN_BLUE:
            	speedCalculator = new EuropeanSpeedCalculator();
            	return speedCalculator.calculateSpeed(this);
        }
        throw new RuntimeException("Should be unreachable");
    }

    public double getNumberOfCoconut() {
    	return numberOfCoconuts;
    }
    public boolean getIsNailed() {
    	return isNailed;
    }
    public double getVoltage() {
    	return voltage;
    }

}
