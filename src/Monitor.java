public class Monitor {
    private CentralQueue queue;

    public Monitor(CentralQueue queue) {
        this.queue = queue;
    }

    public void display() {
        System.out.println("[Monitor] Current ticket: " + queue.getCurrentNumber());
    }
}