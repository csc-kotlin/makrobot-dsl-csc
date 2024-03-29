# Makrobot DSL

Демонстрация возможностей Kotlin для создания DSL на примере DSL для сценариев детского робота.

DSL определен в пакете `csc.makrobot.dsl` отдельно от основного API.

#### Задание:

Допишите DSL для описания и создания робота, позволяющий использовать такой синтаксис:

```
    val робот = робот("Wall-E") {
        голова {
            пластик толщиной 2

            глаза {
                лампы {
                    количество = 2
                    яркость = 10
                }
                диоды {
                    количество = 1
                    яркость = 3
                }
            }

            рот {
                динамик {
                    мощность = 3
                }
            }
        }

        туловище {
            металл толщиной 1

            надпись {
                +"I don't want to survive."
                +"I want live."
            }
        }

        руки {
            пластик толщиной 3
            нагрузка = легкая - средняя
        }

        шасси = гусеницы шириной 10
    }
```

Другие варианты для `шасси`, которые нужно поддержать:
```
   шасси = ноги
   
   шасси = колеса {
        диаметр = 4
        количество = 2
   }
```

В результате выполнения кода выше должен быть собран экземпляр класса `MakroBot`.

Весь API находится в пакете `csc.makrobot.api`, **его изменять нельзя**.

Ваш DSL должен появиться в пакете `csc.makrobot.dsl`.

Данный синтаксис не претендует на адекватность, полноту и единый стиль.
Его цель - использовать разные инструменты языка Kotlin для DSL.

В проекте есть тесты, которыми вы можете себя проверять.
Код тестов также нельзя модифицировать, можно лишь добавлять в них import-ы.

Удачи!
