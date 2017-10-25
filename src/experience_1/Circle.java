package experience_1;


public class Circle extends Geometry {
    //Xc Yc 分别为圆中心点的x y坐标 范围20*20
    int Xc, Yc;

    //自定构造方法，得到中心点坐标
    public Circle() {
        System.out.println("一个圆被创建了");
        Xc = (int) (Math.random() * 20);
        Yc = (int) (Math.random() * 20);
    }

    //得到半径计算圆面积
    public double getAre(double radius, double y) {
        double are = radius * radius;
        return are;
    }

    //得到圆的半径计算周长
    public double getCir(double radius, double y) {
        double cir = radius * 2 * 3.1415926;
        return cir;
    }

    //四个参数分别输入图形与随机点的xy坐标
    public double getDistance(int Xc, int Yc, int Xp, int Yp) {
        //横坐标之差的平方
        double x2 = (Xc - Xp) * (Xc - Xp);
        //纵坐标之差的平方
        double y2 = Math.pow((Yc - Yp), 2);
        //两点距离
        double distance = Math.sqrt((x2 + y2));
        return distance;
    }
}
