public class Main {
    public static void main(String[] args) {

        System.out.println("Синтаксис языка и Переменные");
        System.out.println("Задача1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задача2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задача3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задача4");
        var friend = 19;
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);

        System.out.println("Задача5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача6");
        var oneBoxer = 78.2;
        System.out.println("Масса одного боксера - " + oneBoxer + " кг");
        var twoBoxer = 82.7;
        System.out.println("Масса второго боксера - " + twoBoxer + " кг");
        var totalWeight = oneBoxer + twoBoxer;
        System.out.println("общая масса двух бойцов " + totalWeight + " кг");
        var differenceBoxer = twoBoxer - oneBoxer;
        System.out.println("Разница между массами бойцов " + differenceBoxer + " кг");

        System.out.println("Задача7");
        var remainder = twoBoxer % oneBoxer;
        System.out.println("Остаток от деления между двумя весами " + remainder + " кг");
        //1
        System.out.println("Задача8");
        var hoursOpening = 640;
        System.out.println("Часов работы поделено между сотрудниками " + hoursOpening);
        var oneEmployee = 8;
        System.out.println("Один сотрудник посвящает работе " + oneEmployee + " часов");
        //2
        var totalWorker = hoursOpening / oneEmployee;
        System.out.println("Всего работников в компании " + totalWorker + " человек");
        var totalWorker2 = 94;
        System.out.println("если в компании работает на " + totalWorker2 + " человека больше");
        var totalPerson = (totalWorker + totalWorker2);
        System.out.println(totalPerson + " всего работников");
        var hoursWork = (oneEmployee *totalPerson);
        System.out.println("Если в компании работает " +
                totalPerson +
                " человек, то всего " + hoursWork +
                " часов работы может быть поделено между сотрудниками");

    }
}