package exercise;
import java.util.Scanner;//导入java.util包下的Scanner类
public class 一元二次方程 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print("求ax^2+bx+c=0的根"+"\n");//输出标题
        Scanner in=new Scanner(System.in);//创建scanner，控制台会一直等待输入，直到敲回车结束
        System.out.print("请输入a的值：");//输出“提示”
        int a=in.nextInt();//用户可自行定义a的值
        System.out.print("请输入b的值：");//输出“提示”
        int b=in.nextInt();//用户可自行定义b的值
        System.out.print("请输入c的值：");//输出“提示”
        int c=in.nextInt();//用户可自行定义c的值
        double x1=((-b+Math.sqrt(b*b-4*a*c))/(2*a));//运用求根公式，并且Math.sqrt()为开平方根
        double x2=((-b-Math.sqrt(b*b-4*a*c))/(2*a));//运用求根公式，并且Math.sqrt()为开平方根
        System.out.print("x1="+x1+"\n"+"x2="+x2);//输出两个根的结果
	}
}
