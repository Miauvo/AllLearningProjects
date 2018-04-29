package Practice.Practice_05_1_ZD.Practice_05_ZD3;

public class Practice_05_ZD3 {
    public Practice_05_ZD3() {
        System.out.println("\n\u001B[34m Задание 1:\u001B[0m");
        System.out.println("Генерация массива....");
        CircleGenerator circleGenerator = new CircleGenerator();
        circleGenerator.generate(10);
        System.out.println("Кол-во столкновений между всеми кругами: " + circleGenerator.calcCountOfCollisions());


    }
}