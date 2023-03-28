package Seminar7;

public interface BatteryLevel {
    /**
     *
     * @return возвращает значение заряда батареи в % от 1 до 100
     */
    int getBatteryLevel();

    /**
     *
     * @return процесс зарядки батареи
     */
    void chargeBattery();
}