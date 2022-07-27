package ceng306.hw1;


public class CarDesignTest {
	
	// https://twistedsifter.files.wordpress.com/2016/05/worlds-smallest-car-peel-p50-5.jpg
	public static void main(String[] args) {
		CarDesignTest carDesignTest = new CarDesignTest();
		carDesignTest.test();
	}
	
	void test()
	{
                CarFactory carFactory = new CarFactory();

		// car is created in a factory and given to you with a key ()
		System.out.println("Car is constructed and given to you with an actual key");
		ConcreteCar concreteCar = carFactory.produce();		
		Car car = concreteCar.car;
		Key key = concreteCar.key;
		
		System.out.println("Is car open: " + car.isOpen());
                if(car.isOpen()){
		System.out.println("Access to control panel: " +  car.getControlPanel().toString());
                }
                else
                    System.out.println("Access to control panel:"+"null");
                System.out.println();

		
		// let try to open the car with a fake key
		Lock fakeLock = new Lock("fakePassword");		
		Key fakeKey = new Key(fakeLock);
		System.out.println("Let try to open the car with a fake key"); 
		car.doors[0].unlock(fakeKey);
		System.out.println("Is car open: " + car.isOpen());
		 if(car.isOpen()){
		System.out.println("Access to control panel: " +  car.getControlPanel().toString());
                }
                else
                    System.out.println("Access to control panel:"+"null");
		System.out.println();
		
		Lock trueLock = new Lock("password");
		Key trueKey = new Key(trueLock);
		// let try to open the car with actual key
		System.out.println("Let try to open the car with actual key"); 
		car.doors[0].unlock(trueKey);
		System.out.println("Is car open: " + car.isOpen());
		 if(car.isOpen()){
		System.out.println("Access to control panel: " +  car.getControlPanel().toString());
                }
                else
                    System.out.println("Access to control panel:"+"null");
		System.out.println();
		
		
		// let use the car since we have access to the control panel
		ControlPanel controlPanel = car.getControlPanel();
				
		controlPanel.turnOnEngine();
		System.out.println("Is car open: " + car.isOpen());
		
		double accelerationPressure = 1.5;
		while (controlPanel.pushAccelerator(accelerationPressure) > 0) {
			System.out.println("Car speed is " + controlPanel.getSpeed());
		}
		System.out.println();
		
		
		// let try to lock the car with a fake key
		System.out.println("Let try to lock the car with a fake key");
		Lock fakeLock1 = new Lock("fakePassword");		
		Key fakeKey1 = new Key(fakeLock1);
		car.doors[0].lock(fakeKey1);
		System.out.println("Is car open: " + car.isOpen());
		 if(car.isOpen()){
		System.out.println("Access to control panel: " +  car.getControlPanel().toString());
                }
                else
                    System.out.println("Access to control panel:"+"null");
		System.out.println();
		
		
		double breakPressure = 25.0;
		do 
		{
			System.out.println("Car speed is " + controlPanel.getSpeed());
			controlPanel.pushBrakePedal(breakPressure);
		} 
		while (controlPanel.getSpeed() > 0);
		System.out.println("Car speed is " + controlPanel.getSpeed() + " (car is stopped)");
		System.out.println();		
		
		
		// let try to lock the car with actual key
		System.out.println("Let try to lock the car with actual key"); 
		Lock trueLock1 = new Lock("password");		
		Key trueKey1 = new Key(trueLock);
		car.doors[0].lock(trueKey1);
		System.out.println("Is car open: " + car.isOpen());
		 if(car.isOpen()){
		System.out.println("Access to control panel: " +  car.getControlPanel().toString());
                }
                else
                    System.out.println("Access to control panel:"+"null");	
		System.out.println();
	}

}
