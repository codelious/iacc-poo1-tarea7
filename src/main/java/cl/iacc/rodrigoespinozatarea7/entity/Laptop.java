package cl.iacc.rodrigoespinozatarea7.entity;


public class Laptop extends Device {
    private String processor;
    private String operatingSystem;

    public Laptop() {
        super();
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
