package ceng306.hw1;


public class Lock {
	public static int lockCounter = 0;
	public static  String code;

    public Lock(String code) {
        this.code = code;
        this.lockCounter++;
    }
    
    public Lock() {
    	this.lockCounter++;
    }

	public static boolean codeMatches(Lock lock)
	{
		if(lock.code=="password") {
			return true;
		}else {
			return false;
		}
	}
	
}
