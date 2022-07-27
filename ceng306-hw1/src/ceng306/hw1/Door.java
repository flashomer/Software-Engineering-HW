package ceng306.hw1;


public class Door {
	public static Lock lock;
	public static boolean locked=true;

    public Door(Lock lock) {
        this.lock = lock;
    }
   
	
	public static boolean isLocked()
	{
		return locked;           
	}
	
	public static boolean lock(Key key)
	{
		
		 if(key.isValidLock(key.lock))
                     locked=true;
                 
                 
                 
                 return locked;
	}

	public static boolean unlock(Key key)
	{
		if(key.isValidLock(key.lock))
                     locked=false;
                 
                return locked;
	}
	
}
