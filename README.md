Абстрактный класс **Phone** - базовый класс, содержащий свойство phoneNumber и методы getPhoneNumber(), setPhoneNumber(), call() и answer(). Методы call() и answer() объявлены как абстрактные, что позволяет им быть определеными в дочерних классах.

Интерфейс **PhoneInterface** - содержит методы sendMessage() и getMessage() для отправки и получения текстовых и sendMMS() и getMMS() для получения мультимедийных сообщений сообщений.

Интерфейс **BatteryLevel** - содержит методы getBatteryLevel() и chargeBattery() для получения уровня заряда батареи и зарядки телефона соответственно.

Интерфейс **StrengthOFSignal** - содержит методы signalStrengthShow() и signalStrengthCheck() для получения уровня сигнала сети и вывода его на экран для пользователя.

Класс **MobilePhone** - наследует класс Phone и реализует интерфейсы PhoneInterface, BatteryLevel и StrengthOFSignal. Кроме того, он содержит свойства batteryLevel и  memoryLevel - для уровня батареи и свободной памяти в телефоне соответственно.

Класс **SatellitePhone** - также наследует класс Phone и реализует интерфейс BatteryLevel и StrengthOFSignal. Класс содержит свойство batteryLevel.

Класс **SmartPhone** - наследует класс MobilePhone и добавляет свойство operatingSystem и методы browseInternet() для посещения веб-сайтов, работы с мобильными приложениями addApp(), removeApp(), updateUp(), прием входящих и осуществление исходящих вызовов через установленные мессенджеры getCallFromMessenger(), makeCallFromMessenger(). 

Класс **LandlinePhone** - наследует класс Phone и реализует методы call() и answer() для стационарного телефона.
