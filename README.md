# LightValuteAppPrivatApiBank
Приложение построено с использованием архитектуры MVVM, сделан частичный рефакторинг на основе MVP

Запрос Api взят из Приватбанка: 
https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5 наличный расчет
https://api.privatbank.ua/p24api/pubinfo?exchange&json&coursid=11 безналичный расчет

Используемые библиотеки: retrofit (и gson-converter), viewmodel, livedata, coroutines. С использованием android-extensions

На данный момент, отсутствует проверка валидности запроса (например, в случае отсутствия интернета, будет краш)

Так же, отсутствует вменяемый дизайн приложения
