package ru.job4j.condition;

/**
 * DummyBot.
 * Простейший чат-бот.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 */
public class DummyBot {

    /**
     * Бот отвечает на вопросы.
     * @param question Вопрос.
     * @return Ответ.
     */
    public String answer(String question) {
        String answer = "Это ставит меня в тупик. Спросите другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            answer = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            answer = "До скорой встречи.";
        }
        return answer;
    }
}
