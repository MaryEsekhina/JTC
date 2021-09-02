# JTC

В это проекте находятся небольшие автотесты для сайта компании JTC

Стэк используемых технологий:


**Java**  | **Selenide** | **Selenoid** | **Gradle** | **JUnit5** | **Jenkins** | **Allure Reports** | **Allure TestOps** | **Telegram**|
------------ | ------------- |----------|----------- |------------|-------------|--------------------|--------------------|-------------|
![java](https://github.com/MaryEsekhina/JTC/blob/main/ForReadMe/logos/Java.png?raw=true "Java")| ![selenide](https://github.com/MaryEsekhina/JTC/blob/main/ForReadMe/logos/Selenide.png?raw=true "Selenide") | ![Selenoid](https://github.com/MaryEsekhina/JTC/blob/main/ForReadMe/logos/Selenoid.png?raw=true "Selenoid")|![gradle](https://github.com/MaryEsekhina/JTC/blob/main/ForReadMe/logos/Gradle.png?raw=true "Gradle")|![jUnit5](https://github.com/MaryEsekhina/JTC/blob/main/ForReadMe/logos/JUnit5.png?raw=true "JUnit5")|![jenkins](https://github.com/MaryEsekhina/JTC/blob/main/ForReadMe/logos/Jenkins.png?raw=true "Jenkins")|![allure-logo](https://github.com/MaryEsekhina/JTC/blob/main/ForReadMe/logos/Allure_Report.png?raw=true "Allure_Report")|![allureT-logo](https://github.com/MaryEsekhina/JTC/blob/main/ForReadMe/logos/Allure_TestOps.png?raw=true "Allure_TestOps")|![telegram-logo](https://github.com/MaryEsekhina/JTC/blob/main/ForReadMe/logos/Telegram.png?raw=true "Telegram")|


### Run tests using local browser:
```bash
gradle clean test -Dremote=false

```

### Run tests using Selenoid:
```bash




gradle clean test -Dlogin=user1 -Dpassword=1234 -Dremote=true -Dselenoid=selenoid.autotests.cloud/wd/hub/
```

### Serve Allure report:
```bash
allure serve build/allure-results
```