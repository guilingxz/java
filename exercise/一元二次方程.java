package exercise;
import java.util.Scanner;//����java.util���µ�Scanner��
public class һԪ���η��� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.print("��ax^2+bx+c=0�ĸ�"+"\n");//�������
        Scanner in=new Scanner(System.in);//����scanner������̨��һֱ�ȴ����룬ֱ���ûس�����
        System.out.print("������a��ֵ��");//�������ʾ��
        int a=in.nextInt();//�û������ж���a��ֵ
        System.out.print("������b��ֵ��");//�������ʾ��
        int b=in.nextInt();//�û������ж���b��ֵ
        System.out.print("������c��ֵ��");//�������ʾ��
        int c=in.nextInt();//�û������ж���c��ֵ
        double x1=((-b+Math.sqrt(b*b-4*a*c))/(2*a));//���������ʽ������Math.sqrt()Ϊ��ƽ����
        double x2=((-b-Math.sqrt(b*b-4*a*c))/(2*a));//���������ʽ������Math.sqrt()Ϊ��ƽ����
        System.out.print("x1="+x1+"\n"+"x2="+x2);//����������Ľ��
	}
}
