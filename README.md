# JTC

В это проекте находятся небольшие автотесты для сайта компании JTC

Стэк используемых технологий:


**Java**  | **Selenide** | **Selenoid** | **Gradle** | **JUnit5** | **Jenkins** | **Allure Reports** | **Allure TestOps** | **Telegram**|
------------ | ------------- |----------|----------- |------------|-------------|--------------------|--------------------|-------------|
![java](https://github.com/MaryEsekhina/JTC/blob/main/ForReadMe/logos/Java.png?raw=true "Java")| ![selenide](https://github.com/MaryEsekhina/JTC/blob/main/ForReadMe/logos/Selenide.png?raw=true "Selenide") | ![Selenoid](https://github.com/MaryEsekhina/JTC/blob/main/ForReadMe/logos/Selenoid.png?raw=true "Selenoid")|![gradle](https://github.com/MaryEsekhina/JTC/blob/main/ForReadMe/logos/Gradle.png?raw=true "Gradle")|![jUnit5](https://github.com/MaryEsekhina/JTC/blob/main/ForReadMe/logos/JUnit5.png?raw=true "JUnit5")|![jenkins](https://github.com/MaryEsekhina/JTC/blob/main/ForReadMe/logos/Jenkins.png?raw=true "Jenkins")|![allure-logo](https://github.com/MaryEsekhina/JTC/blob/main/ForReadMe/logos/Allure_Report.png?raw=true "Allure_Report")|![allureT-logo](https://github.com/MaryEsekhina/JTC/blob/main/ForReadMe/logos/Allure_TestOps.png?raw=true "Allure_TestOps")|![telegram-logo](https://github.com/MaryEsekhina/JTC/blob/main/ForReadMe/logos/Telegram.png?raw=true "Telegram")|

----
## Запуск из командной строки
###Локально

```bash
gradle clean test
```

### Удаленно через Selenoid:

```bash
gradle clean test -Dlogin=user1 -Dpassword=1234 -Dremote=true -Dselenoid=selenoid.autotests.cloud/wd/hub/
```

### Построение отчета в Allure:
```bash
gradle allureserve
```
После выполнения данной команды открывается окно с отчетом:

![Allure_serve](/ForReadMe/Imgs/Allure_Report.png)

----
## Запуск тестов через Jenkins

1. Авторизоваться в [Jenkins](https://jenkins.autotests.cloud/)
2. Открыть [проект](https://jenkins.autotests.cloud/job/c07-bukva_zu-L12-JTC/)
3. Выбрать пункт "Собрать с параметрами"
4. Оставить параметры по умолчанию, нажать "Собрать"
   ![4](/ForReadMe/Imgs/jenkins_job_param.PNG)
5. Для просмотра отчета о выполненных тестах необходимо нажать "Allure Report"
   ![img.png](/ForReadMe/Imgs/jenkins_job.PNG)

----  
## Просмотр информации в Allure TestOps
[!5](/ForReadMe/Imgs/Allure_TestOps.png)

----
## Отправка уведомления в Телеграм
[!6](/ForReadMe/Imgs/TG.PNG)

----
## Выидео прохождения тестов в Selenoid
[!7](/ForReadMe/video.gif)