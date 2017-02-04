package clazz.encapsulation.good;

/**
 * This class is also hidden (encapsulated).
 * 
 * @author jlombardo
 */
public class Engine {
    private int cylinderCount;
    private boolean running;
    private CarReportService report;

    // No validation necessary because it's done in Car
    public Engine(int numOfCylinders, CarReportService report) {
        cylinderCount = numOfCylinders;
        this.report = report;
        report.outputEngineType();
    }

    public CarReportService getReport() {
        return report;
    }

    public void setReport(CarReportService report) {
        this.report = report;
    }

    public void startEngine() {
        if(!running) {
            running = true;
        }
    }

    public void stop() {
        if(running) {
            running = false;
        }
    }

    public int getCylinderCount() {
        return cylinderCount;
    }

    public boolean isRunning() {
        return running;
    }


}
