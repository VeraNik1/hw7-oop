package Seminar7;

public abstract class Phone {
    /**
     * номер телефона, привязанный к конкретному телефону
     */
    private String phoneNumber;

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * абстрактный метод, звонок по номеру телефона
     * @param number - номер, на который звоним
     */
    public abstract void callTo(String number);

    /**
     * абстрактный метод, прием входящего звонка
     */
    public abstract void answer();
}

