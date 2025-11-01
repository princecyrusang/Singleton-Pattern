public class HelpDeskStation {
    private String id;
    private CentralQueue queue;

    public HelpDeskStation(String id, CentralQueue queue) {
        this.id = id;
        this.queue = queue;
    }

    public void serveNextCustomer() {
        int num = queue.getNextNumber();
        System.out.println("Station " + id + " serving ticket #" + num);
    }

    public void resetQueue(int newNumber) {
        queue.resetNumber(newNumber);
        System.out.println("Station " + id + " reset queue to #" + newNumber);
    }
}