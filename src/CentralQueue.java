public class CentralQueue {
    private int currentNumber = 0;

    public synchronized int getNextNumber() {
        currentNumber++;
        return currentNumber;
    }

    public synchronized int getCurrentNumber() {
        return currentNumber;
    }

    public synchronized void resetNumber(int newNumber) {
        currentNumber = newNumber;
    }
}