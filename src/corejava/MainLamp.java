package corejava;
class Lamp {
	 
	  boolean isOn;
	  void turnOn() {
	    isOn = true;
	    System.out.println("Light on? " + isOn);

	  }

	  void turnOff() {
	    isOn = false;
	    System.out.println("Light on? " + isOn);
	  }
	}
public class MainLamp {

	public static void main(String[] args) {
		 Lamp led = new Lamp();
		    Lamp halogen = new Lamp();

		 
		    led.turnOn();

		    halogen.turnOff();
		  }
		

	}


