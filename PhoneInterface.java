package Seminar7;

import java.awt.*;

public interface PhoneInterface {

    /**
     * отправка текстового сообщения
     * @param message - текст отправляемого сообщения;
     * @param number - номер абонента, которому будет направлено сообщение
     */
    void sendMessage(String message, String number);

    /**
     * получение текстового сообщения
     */
    void getMessage();

    /**
     * отправка mms сообщения
     * @param picture - отправляемое изображение;
     * @param number - номер абонента, которому будет направлено
     */
    void sendMMS(Image picture, String number);

    /**
     * получение мультимедийного сообщения
     */
    void getMMS();
}