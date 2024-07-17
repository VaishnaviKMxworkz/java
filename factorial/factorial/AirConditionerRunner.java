class AirConditionerRunner{
public static void main(String air[]){
	System.out.println("Main Started");
	AirConditioner.getFeatures();
	AirConditioner.onOrOff();
	AirConditioner.increaseTemperature();
	AirConditioner.decreaseTemperature();
	System.out.println("Main Ended");
}
}
