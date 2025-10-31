import threads.ThreadsRunnable;

public class App{
    public static void main(String [] args) throws Exception{
        Thread t1= new Thread(new ThreadsRunnable("ThreadA"));
        Thread t2= new Thread(new ThreadsRunnable("ThreadB"));

        t1.start();
        t2.start();
        t1.join();
        t2.join(); 

        System.out.println("threads finalizadas");
    }
}