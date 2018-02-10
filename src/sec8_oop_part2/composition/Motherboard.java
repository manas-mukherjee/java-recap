package sec8_oop_part2.composition;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlot;
    private int cardSlot;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlot, int cardSlot, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlot = ramSlot;
        this.cardSlot = cardSlot;
        this.bios = bios;
    }

    public void loadProgram(String programname) {
        System.out.println("Porgram : " + programname + " is not loading");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getRamSlot() {
        return ramSlot;
    }

    public void setRamSlot(int ramSlot) {
        this.ramSlot = ramSlot;
    }

    public int getCardSlot() {
        return cardSlot;
    }

    public void setCardSlot(int cardSlot) {
        this.cardSlot = cardSlot;
    }

    public String getBios() {
        return bios;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", ramSlot=" + ramSlot +
                ", cardSlot=" + cardSlot +
                ", bios='" + bios + '\'' +
                '}';
    }
}
