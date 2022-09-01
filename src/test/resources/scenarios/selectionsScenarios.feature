Feature: Тестирование страницы "Selections" на сайте "https://select2.org/selections"

  @Test
  Scenario: Тестирование страницы "Selections"
    Given Открываем сайт "https://select2.org/selections"
    When Проверка наличия слов "Built-in escaping"
    When Выбор из выпадающего списка 1 элемента -> "California"
    When Снимок экрана
    When Выбор из выпадающего списка 2 элемента -> "Hawaii"
    When Снимок экрана
    When Клик по ссылке -> "internal representation of the selected option"