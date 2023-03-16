package treads.exThread3;

public class TreadsMain {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t);//Thread[main,5,main] [имя потока/ приоритет/ имя группы потоков]

        JThread tr = new JThread("JThread");
        tr.start();

//        try {
//            tr.join();//этот поток закончится раньше главного
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

//        for (int i = 0; i < 5; i++) {
//            new JThread("JTHread"+i).start();//создаем несколько дочерних потоков
//        }

//        System.out.printf("%s tread finished\n", Thread.currentThread().getName());// не выполняется

        //2 способ (интерфейс runnable)
        Thread myThread = new Thread(new MyThread(), "MyTHread");//2й способ создания потока через итерейбл
        myThread.start();

        //3 способ
        Runnable r = ()->{
            System.out.printf("%s started\n", Thread.currentThread().getName());
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println("Thread has been interrupted");
            }
            System.out.printf("%s finished\n", Thread.currentThread().getName());
        };
        Thread rThread = new Thread(r,"RThread");
        rThread.start();


    }
}
