
package testthreads59;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService es=Executors.newFixedThreadPool(3);
        
        es.execute(new PrintChar('a', 10));
        es.execute(new PrintChar('b', 10));
        es.execute(new PrintNum(10));
        
        es.shutdown();
        
    }
}
