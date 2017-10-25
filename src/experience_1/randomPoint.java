package experience_1;

public class randomPoint {
    int Xp, Yp;

    //在20*20的平面上随机生成一个点用于计算图形中心点到其的距离
    public randomPoint() {

        Xp = (int) (Math.random() * 20);
        Yp = (int) (Math.random() * 20);
        System.out.printf("\n平面上随机生成坐标为(%d,%d)的一个点\n", Xp, Yp);
    }


}
