class ThreadIntro extends Thread { 
@Override
public void run() { 
try{ 
//Moving thread to Timed Waiting state 
Thread.sleep(150); 
} 
catch (InterruptedException e) {System.out.println(e);} 
}

public static void main(String[] args) throws InterruptedException { 
    System.out.println("State after completion "+Thread.currentThread().getState());
    System.out.println(Thread.currentThread());
    ThreadIntro t1 = new ThreadIntro(); 
    System.out.println("State when created "+t1.getState()); 
    t1.start(); 
    System.out.println("State when started "+t1.getState()); 
    //waiting for thread to die 
    t1.join(); 
    System.out.println("State after thread ended its task "+t1.getState());


}
}

