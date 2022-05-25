# Автоматизированное тестирование сайта Газпромбанк

> <a target="_blank" href="http://automationpractice.com/index.php">Ссылка на сайт MyStore</a>

<p align="center">
  <img src="images/screenshots/Главная страница.PNG">
</p>

## :page_with_curl:    Содержание

➠ [Покрытый функционал](#globe_with_meridians-покрытый-функционал)

➠ [Технологический стек](#computer-технологический-стек)

➠ [Запуск тестов из терминала](#technologist-запуск-тестов-из-терминала)

➠ [Удаленный запуск тестов](#удаленный-запуск-тестов)

➠ [Сборка в Jenkins](#-главная-страница-сборки-Jenkins)

➠ [Отчет о результатах тестирования в Allure Report](#-отчет-о-результатах-тестирования-в-allure-report)

➠ [Уведомления в Telegram с использованием бота](#-уведомления-в-telegram-с-использованием-бота)

➠ [Пример запуска теста в Selenoid](#-пример-запуска-теста-в-selenoid)
## <a name="globe_with_meridians-покрытый-функционал"></a>:globe_with_meridians: Покрытый функционал

### UI

- [x] Проверка открытия страницы по тексту в заголовке
- [x] Проверка на ошибки в консоль логах страницы
- [x] Проверка функционала страницы во вкладке Women
- [x] Проверка одежды во вкладке Best Sellers
- [x] Проверка наличия номера телефона на главной странице сайта

## :computer: Технологический стек

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
</p>

```mermaid        
    stateDiagram-v2
        State1: START
        State2: Java & IntelliJ IDEA
        State3: Selenide & JUnit5
        State4: Gradle
        State5: GitHub
        State6: Jenkins
        State7: Selenoid
        State8: Allure Report
        State9: Telegram
        State10: STOP
        State1 --> State2
        State2 --> State3
        State3 --> State4
        State4 --> State5
        State5 --> State6
        State6 --> State7
        State7 --> State8
        State8 --> State9
        State9 --> State10
        note right of State2 : Работа с кодом
        note left of State3 : Фреймворки
        note right of State4 : Сборка проекта
        note left of State5 : Система контроля версий и хостинг проекта
        note right of State6 : Параметризация и запуск сборки
        note left of State7 : Контейнеризация
        note right of State8 : Отчётность
        note left of State9 : Уведомления
```
## :technologist: Запуск тестов из терминала

### Локальный запуск тестов
```bash
gradle clean test
```

## <img width="4%" title="Jenkins" src="images/logo/Jenkins.svg"> Главная страница сборки Jenkins

<p align="center">
  <img src="images/screenshots/Jenkins.PNG">
</p>


## :gear: Запуск тестов с выбором параметров
<img title="Jenkins ParamStart" src="images/screenshots/Jenkins2.0.PNG">

### Удаленный запуск тестов

```
clean test
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DremoteDriverUrl=https://${REMOTE_DRIVER_URL}/wd/hub/
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/
-Dthreads=${THREADS}
```

### Параметры сборки

> <code>BROWSER</code> – браузер, в котором будут выполняться тесты (_по умолчанию - <code>chrome</code>_).
>
> <code>BROWSER_SIZE</code> – размер окна браузера, в котором будут выполняться тесты (_по умолчанию - <code>1920x1080</code>_).
>
> <code>BROWSER_VERSION</code> – версия браузера (_по умолчанию - <code>99</code>_).
>
> <code>REMOTE_DRIVER_URL</code> – url селеноида.
>
> <code>THREADS</code> – кол-во потоков для параллельного запуска.
>

## <img width="4%" title="Allure Report" src="images/logo/Allure_Report.svg"> Отчет о результатах тестирования в Allure Report

### :pushpin: Главная страница Allure-отчета

<p align="center">
<img title="Allure Overview" src="images/screenshots/Allure main page.PNG">
</p>

### :pushpin: Страница с проведенными тестами

<p align="center">
<img title="Allure Behaviors" src="images/screenshots/Allure 3.PNG">
</p>

## <img width="4%" title="Telegram" src="images/logo/Telegram.svg"> Уведомления в Telegram с использованием бота

> После завершения сборки бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом.
<p align="center">
<img width="30%"  title="Telegram Notifications" src="images/screenshots/Бот.PNG">
</p>

## <img width="4%" title="Selenoid" src="images/logo/Selenoid.svg"> Пример запуска теста в Selenoid

> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
<p align="center">
  <img title="Selenoid Video" src="images/gif/8eaf96cb8f6c8c69.gif">
</p>

:blue_heart: <a target="_blank" href="https://t.me/Pygidium">t.me/Pygidium</a>