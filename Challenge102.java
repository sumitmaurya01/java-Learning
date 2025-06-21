class TrafficLight{
    public synchronized void play(Traffic t){
//        System.out.printf("\n %s , WAIT for 5 sec...\n",t.getLight());
        if(t.getLight() == "RED"){
     System.out.printf("\n %s 🔴 , WAIT for 5 sec...\n",t.getLight());
       check();
        } else if (t.getLight() == "GREEN") {
            System.out.printf("\n %s 🟢, GO >> you have 5 sec...\n",t.getLight());
            check();
        }
        else{
            System.out.printf("\n %s 🟡, Stay alert...\n",t.getLight());
            check();
        }

    }
    private  void check() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
class Traffic extends Thread{
    TrafficLight t1;
    private final String light;
    public Traffic(String light , TrafficLight t){
        this.t1=t;
        this.light=light;
    }
    public void run() {
            t1.play(this);

    }

    public String getLight(){
        return light;
    }
}
public class Challenge102 {
    public static void main(String[] args) throws InterruptedException{
        TrafficLight first = new TrafficLight();
        Traffic t1 = new Traffic("RED",first);
        Traffic t2 = new Traffic("YELLOW",first);
        Traffic t3 = new Traffic("GREEN",first);

    t1.start();
    t2.start();
    t3.start();



    }
}