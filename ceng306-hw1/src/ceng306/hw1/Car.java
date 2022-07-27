package ceng306.hw1;


public class Car {
	public Door doors[];
	public ControlPanel controlPanel;
        


    public Car(Door[] doors, ControlPanel controlPanel) {
        this.doors = doors;
        this.controlPanel = controlPanel;
    }
	
       
	public static boolean isOpen()
	{
		if(Door.isLocked())
                    return false;
                else
                    return true;
	}
	
	public  ControlPanel getControlPanel()
	{
                   return controlPanel;         
	}
        
        
	
}
