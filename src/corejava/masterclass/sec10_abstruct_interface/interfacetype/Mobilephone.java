package corejava.masterclass.sec10_abstruct_interface.interfacetype;

public class Mobilephone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public Mobilephone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        this.isOn = true;
        System.out.println("No power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.format("Now ringing %d \n", phoneNumber);
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Now answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == this.myNumber && isOn){
            isRinging = true;
            System.out.println("Melody ring");
        } else {
            System.out.println("Mobile phone is not on or number is different");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
