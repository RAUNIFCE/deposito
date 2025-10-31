package threads;

import java.util.Random;

public class ThreadsRunnable implements Runnable{
    private String name;
    static int contador=0;

    public  ThreadsRunnable(String name){
        this.name=name;
    }
    public static synchronized void incremetar(){
        contador++;
    }
    @Override
    public void run() {
        System.out.println(this.name+"inicializado");

        for (int i=0;i<10;i++){
            incremetar();
            //System.out.println(this.name+"Número:"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }



        System.out.println(this.name+"finalizada!");
        System.out.println(this.name+"o valor global é "+contador);

    }
}
