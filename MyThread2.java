public class MyThread2 extends  Thread{
    public MyThread2(String name){
        super(name);
    }
    @Override
    public void run(){
//        System.out.print("thread is running.......");
        for (int i=0;i<5;i++){
            String a = "";
//            Simulate CPU usage, so the scheduler has something to manage.
            for(int j=0;j<100000;j++){
                a+='a';
            }
            System.out.println(Thread.currentThread().getName() + " - priority: "+ Thread.currentThread());
            try{
             Thread.sleep(10);
            }catch (InterruptedException e){
                System.out.print(e);
            }
//            catch (Exception e){
//            System.out.print(e);
//            }
        }
    }
    public static void main(String[] args) {
     //creating Threads and set their priority
        MyThread2 l = new MyThread2("Low priority thread");
        MyThread2 m = new MyThread2("Medium priority thread");
        MyThread2 h = new MyThread2("High priority thread");
     l.setPriority(Thread.MIN_PRIORITY);
     m.setPriority(Thread.NORM_PRIORITY);
     h.setPriority(Thread.MAX_PRIORITY);

//     NOTE:-> Thread priority is NOT a guarantee.
//        It is only a hint to the OS scheduler.
     l.start();
     m.start();
     h.start();
     //interrupting m thread
        m.interrupt();
    }
}
