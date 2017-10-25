package experience_1;

import java.util.Scanner;

public class TestGeometry {
    public static void main(String[] args) {
        //创建两个Scanner对象
        Scanner choice = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        while (true) {
            int c = 0;
            System.out.println("****************************");
            System.out.println("|       进行图形测试        |");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("|    可以测试以下三种图形    |");
            System.out.println("| 1.矩形  2.正三角形  3.圆形 |");
            System.out.println("------------------------------");
            //用户输入1——3的一个数
            while ((c != 1) && (c != 2) && (c != 3)) {
                System.out.print(" 您选择   ");
                c = choice.nextInt();
            }
            //根据用户输入的数字，调用不同对象的方法
            if (c == 1) {
                Rect rectangle = new Rect();
                System.out.println("请分别输入矩形的长和宽");
                double width, length;
                System.out.printf("请先输入矩形的长： ");
                length = num.nextDouble();
                System.out.printf("请再输入矩形的宽： ");
                width = num.nextDouble();
                System.out.println("该矩形的面积为：" + rectangle.getAre(length, width));

                System.out.println("该矩形的周长为: " + rectangle.getCir(length, width));
                System.out.println("图形中心点为(" + rectangle.Xr + "," + rectangle.Yr + ")");
                randomPoint rand_point = new randomPoint();
                System.out.println("矩形中心点距离该点距离为" + rectangle.getDistance(rectangle.Xr, rectangle.Xr, rand_point.Xp, rand_point.Yp));
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            }

            if (c == 2) {
                Triangle triangle = new Triangle();
                System.out.println("请输入正三角形的边长");
                double side = num.nextDouble();
                System.out.println("正三角形的面积为：" + triangle.getAre(side, 1));
                System.out.println("正三角形的周长为：" + triangle.getCir(side, 1));
                System.out.println("图形中心点为(" + triangle.Xt + "," + triangle.Yt + ")");
                randomPoint rand_point = new randomPoint();
                System.out.println("矩形中心点距离该点距离为" + triangle.getDistance(triangle.Xt, triangle.Xt, rand_point.Xp, rand_point.Yp));
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            }

            if (c == 3) {
                Circle circle = new Circle();
                System.out.println("请输入圆的半径");
                double radius = num.nextDouble();
                System.out.println("圆的面积为" + circle.getAre(radius, 1));
                System.out.println("圆的周长为" + circle.getCir(radius, 1));
                System.out.println("图形中心点为(" + circle.Xc + "," + circle.Yc + ")");
                randomPoint rand_point = new randomPoint();
                System.out.println("圆形中心点距离该点距离为" + circle.getDistance(circle.Xc, circle.Xc, rand_point.Xp, rand_point.Yp));
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");


            }

        }
    }
}
