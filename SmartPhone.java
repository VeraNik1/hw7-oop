package Seminar7;

public class SmartPhone extends MobilePhone {
    /**
     * оперативная система смартфона
     */
    private String operatingSystem;

    public SmartPhone(String phoneNumber, int batteryLevel, int memoryLevel, String operatingSystem) {
        super(phoneNumber, batteryLevel, memoryLevel);
        this.operatingSystem = operatingSystem;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * использование интернет браузера
     */
    public void browseInternet() {
        System.out.println("Посещение веб-сайтов и просмотр контента в Интернете на "
                + getPhoneNumber() + " под ОС " + operatingSystem);
    }

    /**
     * установить приложение
     */
    public void addApp(){
        System.out.println("Установка мобильного приложения на "
                + getPhoneNumber() + " для ОС " + operatingSystem);
    }

    /**
     * обновить приложение
     */
    public void updateApp(){
        System.out.println("Обновление мобильного приложения на "
                + getPhoneNumber() + " для ОС " + operatingSystem);
    }

    /** удалить приложение
     *
     */
    public void removeApp(){
        System.out.println("Удаление мобильного приложения на "
                + getPhoneNumber() + " для ОС " + operatingSystem);
    }

    /**
     * получить звонок из мессенджера
     * @param messenger - наименование мессенджера из списка
     */
    public void getCallFromMessenger(Application messenger){
        System.out.println("Ответ на входящий звонок из мессенджера "
                + messenger + "абоненту" + getPhoneNumber());
    }

    /**
     * позвонить из мессенджера
     * @param messenger - наименование мессенджера из списка
     * @param number - номер, на который звоним
     */
    public void makeCallFromMessenger(Application messenger, String number){
        System.out.println("Ответ на входящий звонок из мессенджера" + messenger + " на "
                + number);
    }

    /**
     * звоним со смартфона
     * @param number - номер, на который звоним
     */
    @Override
    public void callTo(String number) {
        System.out.println("Звонок на" + number + " со смартфона " + getPhoneNumber());
    }

    /**
     * отвечаем на звонок на смартфоне
     */
    @Override
    public void answer() {
        System.out.println("Ответ на входящий звонок на смартфоне " + getPhoneNumber());
    }

    /**
     * Отправка текстового сообщения со смартфона
     * @param message - текст отправляемого сообщения;
     * @param number - номер абонента, которому будет направлено сообщение
     */
    @Override
    public void sendMessage(String message, String number) {
        System.out.println("Отправить сообщение" + message + " на " + number + " со смартфона " + getPhoneNumber());}

    /**
     * получение текстового сообщения на смартфон
     */
    @Override
    public void getMessage() {
        System.out.println("Получение сообщения на смартфон " + getPhoneNumber());
    }

    /**
     * список приложений на смартфоне для звонков и сообщений
     */
    private enum Application {
        telegram,
        whatsup,
        viber

    }
}