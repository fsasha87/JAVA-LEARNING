package _Tasks.task6;

public class Task6 {
    public static void main(String[] args) throws InterruptedException {
//6-1: Thread: 1сп: MyThread extends +@run{sout(getName();)} => fori{myThread.start()}
//=> 2сп: new Thread(){@run(){sout}}.start(); => fori
//=> 3сп: new Thread(->sout).start(); => fori
        for (int i = 0; i < 10; i++) {
            MyThread myThread = new MyThread();
            myThread.start();
        }
        for (int i = 0; i < 10; i++) {
            new Thread() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread());
                }
            }.start();
        }
        for (int i = 0; i < 10; i++) {
            new Thread(()-> System.out.println(Thread.currentThread())).start();
         }

//6-2: Thread: создать нить (sout(thread started); while (!isInterrupted()){sout(counter)+sleep(catch(break))}) => thread.start
//=> sout(MainThread started) => fori{sout(i)+sleep} => прервать нить => sout(thread/main finished)
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.printf("%s started... \n", Thread.currentThread().getName());
                int counter = 1;
                while (!isInterrupted()) {
                    System.out.println("Loop " + counter);
                    counter++;
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        System.out.printf("%s is interrupted\n", Thread.currentThread().getName());
                        break;
                    }
                }
                System.out.printf("%s finished... \n", Thread.currentThread().getName());
            }
        };
        thread.start();
        System.out.println(Thread.currentThread().getName()+" started");
        for (int i = 0; i < 5; i++) {
            System.out.println("sec="+ i);
            Thread.sleep(1000);
        }
        thread.interrupt();
        System.out.println(Thread.currentThread().getName() + " finished");


//6-3: Thread wait: Message(C)=>S_message=> p_sy_S_getter + p_sy_S_setter(+notify)
//=> psvm: message => Thread{sy(message){sout+message.wait()+sout(getter)+sleep+sout(thread.getName)}} => start => main.sleep => setter => join => sout(mainThread)
        Message message = new Message();
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                synchronized (message) {
                    System.out.println("Waiting");
                    try {
                        message.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Received:" + message.getMessage());
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Finished: " + Thread.currentThread().getName());
                }
            }
        };
        thread2.start();
        Thread.sleep(2000);
        message.setMessage("Some message");
        thread.join();
        System.out.println("Finished: " + Thread.currentThread().getName());

    }
}
