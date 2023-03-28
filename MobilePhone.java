package Seminar7;

import java.awt.*;
import java.util.Random;

public class MobilePhone extends Phone implements PhoneInterface, BatteryLevel, StrengthOfSignal {

    /**
     * уровень заряда батареи на мобильном телефоне
     */
    private int batteryLevel;
    /**
     * количество свободной памяти на мобильном телефоне
     */
    private int memoryLevel;
    public MobilePhone(String phoneNumber, int batteryLevel, int memoryLevel) {
        super(phoneNumber);
        this.batteryLevel = batteryLevel;
        this.memoryLevel = memoryLevel;
    }
    public int getMemoryLevel() {
        return memoryLevel;
    }

    public void setMemoryLevel(int memoryLevel) {
        this.memoryLevel = memoryLevel;
    }
    public int getBatteryLevel() {
        return batteryLevel;
    }
    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    /**
     * звонок с мобильного телефона
     * @param number - номер, на который звоним
     */
    @Override
    public void callTo(String number) {
        System.out.println("Звонок на телефон "+ number +" с мобильного " + getPhoneNumber());
    }

    /**
     * отвечаем на входящий звонок
     */
    @Override
    public void answer() {
        System.out.println("Ответ на звонок на мобильном" + getPhoneNumber());
    }

    /**
     * отправить сообщение с мобильного телефона;
     * @param message - текст отправляемого сообщения;
     * @param number - номер абонента, которому будет направлено сообщение
     */
    @Override
    public void sendMessage(String message, String number) {
        System.out.println("Отправить сообщение" + message + " на " + number + " с мобильного " + getPhoneNumber());
    }

    /**
     * получить сообщение на мобильный телефон
     */
    @Override
    public void getMessage() {
        if (getMemoryLevel() > 100){
        System.out.println("Получить сообщение на мобильный");}
        else System.out.println("Необходимо освободить память телефона для загрузки сообщения");
    }

    /**
     * отправить мультимедийное сообщение на номер
     * @param picture - отправляемое изображение;
     * @param number - номер абонента, которому будет направлено
     */
    @Override
    public void sendMMS(Image picture, String number) {System.out.println("Отправляем фотографию на номер " + number);
    }

    /**
     * получить мультимелийное сообщение на мобильный телефон
     */
    @Override
    public void getMMS() {
        if (getMemoryLevel() > 100){
        System.out.println("Загрузка mms-общения на мобильный");}
        else System.out.println("Необходимо освободить память телефона для загрузки сообщения");
    }

    /**
     * зарядка батареи мобильного телефона
     */
    @Override
    public void chargeBattery() {
        batteryLevel = 100;
    }

    /**
     *
     * @return отображает уровень сигнала сотовой сети
     */
    @Override
    public String signalStrengthShow() {
        return "Уровень сигнала сотовой сети" + signalStrengthCheck();
    }

    /**
     *
     * @return определяет уровень сигнала сотовой сети по шкале от 1 до 5
     */
    @Override
    public int signalStrengthCheck() {
        int result = new Random().nextInt(0,5);
        return result;
    }
}
