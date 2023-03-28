package Seminar7;

import java.util.Random;

public class SatellitePhone extends Phone implements BatteryLevel, StrengthOfSignal {
    /**
     * уровень зараяда батареи
     */
    private int batteryLevel;

    public SatellitePhone(String phoneNumber, int batteryLife) {
        super(phoneNumber);
        this.batteryLevel = batteryLife;

    }
    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    /**
     * звонок со спутникового телефона
     * @param number - номер, на который звоним
     */
    @Override
    public void callTo(String number) {
        System.out.println("Звонок на" + number + " со спутникового телефона " + getPhoneNumber() +
                " сила сигнала  " + signalStrengthShow());
    }
    /**
     * прием звонка на спутниковый телефон
     *
     */
    @Override
    public void answer() {
        System.out.println("Ответ на вызов по спутниковому телефону " + getPhoneNumber() +
                "  сила сигнала " + signalStrengthShow());
    }

    /**
     * зарядка спутникового телефона
     */
    @Override
    public void chargeBattery() {
        batteryLevel = 100;
    }

    /**
     *
     * @return отображает уровень сигнала спутника
     */
    @Override
    public String signalStrengthShow() {
        return "Уровень сигнала спутника" + signalStrengthCheck();
    }

    /**
     * проверка уровня сигнала
     * @return - возвращает значение уровня сигнала спутника от 0 до 100%
     */
    @Override
    public int signalStrengthCheck() {
        int result = new Random().nextInt(0,100);
        return result;
    }
}