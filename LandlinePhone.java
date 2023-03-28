package Seminar7;

public class LandlinePhone extends Phone{
    public LandlinePhone(String phoneNumber) {
        super(phoneNumber);
    }

    /**
     * Звонок со стационарного телефона
     * @param number - номер, на который звоним
     */
    @Override
    public void callTo(String number) {
        System.out.println("Звонок" + number + " со стационарного телефона " + getPhoneNumber());
    }

    /**
     * Ответ на звонок на стационарном телефоне
     *
     */
    @Override
    public void answer() {
        System.out.println("Ответ на вызов на стационарном телефоне" + getPhoneNumber());
    }

}