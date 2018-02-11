package sec10_abstruct_interface.interfacetype;

public class ITelephoneMain {
    public static void main(String[] args) {
        ITelephone phone = new Deskphone(9831, true);
        phone.powerOn();
        phone.dial(535353);
        phone.answer();
        phone.callPhone(23423423);
        System.out.println(phone.isRinging());

        phone = new Mobilephone(2343);
        phone.callPhone(2343);
    }
}
