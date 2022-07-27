package ceng306.hw1;


public class Key {
	public Lock lock;

    public Key(Lock lock) {
        this.lock = lock;
    }

	public static boolean isValidLock(Lock lock)
	{
		return Lock.codeMatches(lock);
               
	}
}
