package or.test.springboot.hook;

/**
 * @Title ShutdownHookThread.java
 * @Package: com.gil.springbootjar
 * @Description: 关闭进程时执行的线程
 *
 * @Author: lgc
 * @Date: 2016年3月28日 下午2:40:17
 *
 *        Copyright @ 2016 Corpration Name
 * 
 */
public class ShutdownHookThread implements Runnable {

	@Override
	public void run() {
		System.out.println("要被kill......");
		System.exit(0);
	}

}
