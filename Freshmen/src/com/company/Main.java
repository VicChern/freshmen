package com.company;

/** Main class for starting of the programme
 <b>name</b> and <b>colour</b>
 @author Vic_Chern
 @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        // creating object for choosing of new president of the group
        Group group = new Group ();

        group.choosePresidentOfTheGroup();

        // creating object for roll call
        Professor professor = new Professor();

        professor.rollCallOfTheGroup();




//        Технічне завдання: напишіть програму “Першокурсники”:
//
//        В програмі мають бути створені класи: студенти, професор, група (за бажанням класи можна додавати);
//
//        Дизайн класів (їх поля, взаємозв’язки) - також Ваша задача;
//
//        Студенти повинні вміти обрати Старосту за особистими якостями одногрупників (правила відбору визначаєте Ви). Програма повинна виводити Старосту групи в консоль;
//
//        Професор має вміти провести перекличку та визначити, чи всі студенти присутні (результат виводиться в консоль);
//
//        Набір студентів, груп та професорів може бути заданий за замовчуванням (можна захардкодити);
//
//        Приділіть увагу правилам ООП;
//
//        Не забудьте прикласти інструкцію користувача до виконаного завдання.
    }
}
