package experience_1;

public class Rect extends Geometry {
    //Xr Yr 分别为矩形中心点的x y坐标 范围20*20
    int Xr, Yr;

    //自定构造方法，得到中心点坐标
    public Rect() {
        System.out.println("一个矩形被创建了");
        Xr = (int) (Math.random() * 20);
        Yr = (int) (Math.random() * 20);
    }

    //计算矩形面积
    public double getAre(double length, double width) {
        double are;
        are = length * width;
        return are;
    }

    //计算周长
    public double getCir(double length, double width) {
        double cir;
        cir = 2 * length + 2 * width;
        return cir;
    }

    //四个参数分别输入图形与随机点的xy坐标
    public double getDistance(int Xr, int Yr, int Xp, int Yp) {
        //横坐标之差的平方
        double x2 = (Xr - Xp) * (Xr - Xp);
        //纵坐标之差的平方
        double y2 = Math.pow((Yr - Yp), 2);
        //两点距离
        double distance = Math.sqrt((x2 + y2));
        return distance;
    }
}
