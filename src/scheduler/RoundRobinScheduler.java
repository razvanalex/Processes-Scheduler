package scheduler;

/**
 * RoundRobinScheduler class implements a Round Robin Scheduler where the PID
 * (the index in process list) is generated by applying modulo number of
 * processes to the index of current input. Therefore, the processes are run in
 * order. This will make that between any two processes, the difference of runs
 * will be maximum one.
 * 
 * @author razvan
 *
 */
public class RoundRobinScheduler extends ProcessScheduler {

	/**
	 * Create a new instance of Round Robin Scheduler.
	 * 
	 * @param numProcesses
	 *            the number of processes
	 * @param cacheType
	 *            the type of cache
	 * @param cacheSize
	 *            the size of cache
	 */
	public RoundRobinScheduler(int numProcesses, String cacheType, int cacheSize) {
		super(numProcesses, cacheType, cacheSize);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see scheduler.ProcessScheduler#generatePID()
	 */
	@Override
	protected int generatePID() {
		return this.getCrtInputIndex() % this.getNumProcesses();
	}
}