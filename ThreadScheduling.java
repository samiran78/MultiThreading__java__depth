public class ThreadScheduling extends Thread{
    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+ " is running........");
            //after, Each iteration we shoukd tell  a scheduler is trying to hint a Thread to run
            Thread.yield();
        }
    }
    public static void main(String[] args) {
    ThreadScheduling t1 = new ThreadScheduling();
    ThreadScheduling t2 = new ThreadScheduling();
    t1.start();
    t2.start();
    }
}
