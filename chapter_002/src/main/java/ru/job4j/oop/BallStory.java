package ru.job4j.oop;
/**
 * BallStory.
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com).
 *
 * 1. По аналогии с заданием про пионера, сделать классы для описание сказки колобок.
 * 2. Сделайте 4 класса Ball, Hare, Wolf, Fox.
 * 3. В каждом классе должен быть метод public void tryEat(Ball ball).
 * 4. Создайте класс BallStory с методом main и опишите историю через  объекты.
 * 5. Залейте код в репозиторий.
 * 6. Переведите ответственного на Петра Арсентьева.
 */
public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();

        hare.tryEat(ball);
        ball.escape(hare);
        wolf.tryEat(ball);
        ball.escape(wolf);
        fox.tryEat(ball);
        ball.escape(fox);
    }
}
