class threadEx extends Thread{

    String empName;
    threadEx(String emp)
    {
        empName=emp;
    }
    public void run()
    {
        for(int i=0;i<=3;i++)
        {
            System.out.println(Thread.currentThread().getName());
            System.out.println(empName);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Secondthread implements Runnable{
    String empname;
    Secondthread(String name)
    {
        empname=name;
    }
    @Override
    public void run() {
        for(int i=0;i<=3;i++)
        {
            System.out.println("Thread is Running");
            System.out.println(Thread.currentThread().getName());
            System.out.println(empname);
        }
    }
}
//SYNCHRONIZED TESTING //SYNCHRONIZED KEYWORD ,BLOCK,METHOD
class PrintTest {
    int bankbalance=1500;
    public  void Withdrawbalance(int Withdrawamount)
    {
        // i used  for synchronized block thread safety
        synchronized (this) {
            if (bankbalance >= Withdrawamount) {
                System.out.println("withdraw succesfully ");
                bankbalance = bankbalance - Withdrawamount;
            } else {
                System.out.println("Insuffiect fund ");
            }
        }
    }
    //     synchronized method used
    synchronized    public void print() {
        System.out.println("Thread running");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class Thread1 extends Thread{
    PrintTest p;
    Thread1(PrintTest printtest)
    {
        this.p=printtest;
    }
    public void run(){
        for(int i=0;i<=4;i++)
        {
            p.print();
        }
        p.Withdrawbalance(1000);
    }
}
class Thread2 extends Thread {
    PrintTest p;

    Thread2(PrintTest printtest) {
        this.p = printtest;
    }
    public void run() {
        for (int i = 0; i <= 4; i++) {
            p.print();
            p.Withdrawbalance(1000);
        }
    }
}
//volatile keyword testing
class volatiletest{
    boolean BusseatAvaliable = true;
    void busSEATbook()
    {
        while (BusseatAvaliable)
        {
            System.out.println("bus seat avalible");
        }
        System.out.println("bus seat not avalible");
    }
    void busseatbookstop(){
        BusseatAvaliable=false;
    }
}
public class threadpracticejava {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("thread run");
        threadEx t1 = new threadEx("john");
        t1.setName("First Thread");
        t1.start();
        t1.join();
        Secondthread t2=new Secondthread("sanjay");
        Thread thread2=new Thread(t2);
        thread2.start();
        // SYNCHRONIZED TESTING
        PrintTest printTest=new PrintTest();
        Thread1 thread1=new Thread1(printTest);
        thread1.start();
        Thread2 thread3=new Thread2(printTest);
        thread3.start();
        volatiletest v1=new volatiletest();
        //volatile testing
        Thread user1=new Thread(()->
                v1.busSEATbook()
        );

        Thread user2=new Thread(()->
                v1.busseatbookstop());
        user1.start();
        user2.start();
    }
}

