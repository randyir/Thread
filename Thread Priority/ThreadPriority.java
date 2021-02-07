package threadpriority;

public class ThreadPriority extends Thread {
    private int hitungmundur = 5;
    private volatile double d = 0;
    
    public ThreadPriority(int priority){
        setPriority(priority);
        start();
    }
    
    @Override
    public void run(){
        while (true){
            for (int i=1; i<10000000; i++){
                d = d + (Math.PI + Math.E)/(double)i;
            }
            System.out.println(this.toString() + ":" + hitungmundur + "-->" + d);
            if(--hitungmundur == 0){
                return;
            }
        }
    }
}
