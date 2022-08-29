# **Дипломный проект профессии «Инженер по тестированию»**

**Ссылка на задание/требования:** https://github.com/netology-code/qamid-diplom/blob/main/README.md

**Описание**

Автоматизация тестирования мобильного приложения "Мобильный хоспис".

Приложение предоставляет функционал по работе с претензиями хосписа и включает в себя:

1. Информацию о претензиях и функционал для работы с ними.
2. Новостную сводку хосписа.
3. Тематические цитаты.

**План тестирования:** Plan.md (https://github.com/Dmitruzd21/qamid-diplom/blob/master/Plan.md)

**Чек-лист проекта с отметками о пройденых и непройденых тестах:** Check (https://docs.google.com/spreadsheets/d/13MR91e0j5iHWv38YCGKOjnacwgPFuM5jpcaTcb4pjM8/edit?usp=sharing)

**Тест-кейсы:** Cases (https://docs.google.com/spreadsheets/d/1Y9aNNuPW_pxjvxBwos1Z-89hdOvnLjlDGh3Gj6Bljsw/edit?usp=sharing)

**Проект автоматизации тест-кейсов:**
https://github.com/Dmitruzd21/qamid-diplom/tree/master/fmh-android

## **Процедура запуска авто-тестов:**

**1 способ (без Allure)**

1. Склонировать репозиторий https://github.com/Dmitruzd21/qamid-diplom

2. Открыть проект fmh-android в Android Studio.

3. Запустить эмулятор или подключить устройство для тестирования.

4. Запустить тесты консольной командой ./gradlew connectedAndroidTest.

**2 способ (с выгрузкой Allure-results)**

Повторить предыдущие шаги и далее:

5. Во вкладке Project левым кликом мыши (или аналогичным образом) выделить каталог app.

6. Запустить тесты сочетанием клавиш Shift+Ctl+R (Mac) или Shift+Ctrl+F10 (Windows).

7. По завершению, выгрузите каталог /data/data/ru.iteco.fmhandroid/files/allure-results с эмулятора или тестового устройства.

8. Выполните локально консольную команду allure serve находясь на уровень выше каталога allure-results.
