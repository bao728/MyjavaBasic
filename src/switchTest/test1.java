package switchTest;

/**
 * 关于switch的练习 ，重点是break穿透
 *  结论： switch先通过查找条件  然后在进入语句里面，如果没有break就是直接执行下面语句,直到遇到break或者执行完整个循环
 *
 */

public class test1 {
    public static void main(String[] args) {
        int a = 2;

        switch (a){
            default:
                System.out.println("都没有");
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");  //如果这里没有break  输出结果是 2，3,4
            case 3:
                System.out.println("3");

            case 4:
                System.out.println("4");

        }
    }
}
