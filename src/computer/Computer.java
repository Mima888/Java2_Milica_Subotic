package computer;

public class Computer {

    private double processTact;
    private double memory;
    private int hardDrive;

    public Computer(double processTact, double memory, int hardDrive) {
        
        this.processTact = processTact;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }
    
    public void showData() {
        
        System.out.println("Process tact is: " + getProcessTact() + " GHz.");
        System.out.println("Memory is: " + getMemory() + " GB.");
        System.out.println("Hard drive is: " + getHardDrive() + " GB.");
    }

    public double getProcessTact() {
        return processTact;
    }

    public void setProcessTact(double processTact) {
        this.processTact = processTact;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }

}
