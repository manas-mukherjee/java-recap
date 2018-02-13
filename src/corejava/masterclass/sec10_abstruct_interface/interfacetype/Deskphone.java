package corejava.masterclass.sec10_abstruct_interface.interfacetype;

public class Deskphone implements ITelephone{
    private int myNumber;
    private boolean isRinging;

    public Deskphone(int myNumber, boolean isRinging) {
        this.myNumber = myNumber;
        this.isRinging = isRinging;
    }

    @Override
    public void powerOn() {
        System.out.println("No power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.format("Now ringing %d \n", phoneNumber);
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Now answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == this.myNumber){
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
