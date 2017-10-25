package experience_1;


public class Triangle extends Geometry {
    //Xc Yc 分别为正三角形中心点的x y坐标 范围20*20
    int Xt, Yt;

    //自定构造方法，得到中心点坐标
    public Triangle() {
        System.out.println("一个正三角形被创建了");
        Xt = (int) (Math.random() * 20);
        Yt = (int) (Math.random() * 20);
    }

    //length为边长 one不需要
    public double getAre(double length, double one) {
        double area;
        area = length * length * 1.732 / 2;
        return area;
    }

    //radius 为输入的边长
    public double getCir(double length, double one) {
        double cir;
        cir = length * 3;
        return cir;
    }


    //四个参数分别输入图形与随机点的xy坐标
    public double getDistance(int Xt, int Yt, int Xp, int Yp) {
        //横坐标之差的平方
        double x2 = (Xt - Xp) * (Xt - Xp);
        //纵坐标之差的平方
        double y2 = Math.pow((Yt - Yp), 2);
        //两点距离
        double distance = Math.sqrt((x2 + y2));
        return distance;
    }
}
