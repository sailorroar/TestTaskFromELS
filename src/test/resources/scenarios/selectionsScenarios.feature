Feature: Тестирование страницы "Selections" на сайте "https://select2.org/selections"

  @Test
  Scenario: Тестирование страницы "Selections"
    Given Открываем сайт "https://select2.org/selections"
    When Проверка наличия слов "Built-in escaping"
    When Выбор из первого выпадающего списка элемента 1 -> "California"
    When Выбор из первого выпадающего списка элемента 2 -> "Hawaii"
    When Клик по ссылке -> "internal representation of the selected option"