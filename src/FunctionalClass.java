import java.util.Scanner;

public class FunctionalClass 
{
	static Scanner in = new Scanner(System.in);
	 public static char Operation()
     {
         char l;
         while (true)
         {
             try
             {
            	 System.out.println("������� ��������  (+,-,* ��� /)");
            	 String n=in.next();
            	 char[] chArray = n.toCharArray();
                 l = chArray[0];
                 break;
             }
             catch (Exception e)
             {
            	 System.out.println("����� �� ������������ ��������");
             }
         }
         return l;
     }
     public static double EnterNumber()
     {
         double number;
         while (true)
         {
             try
             {
                 
                 number =in.nextDouble();
                 break;
             }
             catch (NumberFormatException e)
             {
            	 System.out.println("������� ������������ ������, ��������� ����");
             }
             catch (Exception e)
             {
            	 System.out.println("������� �������� ������");
             }

         }
         return number;
     }
     public static double Final(double a,double b,char oper)
     {
         switch (oper)
         {
             case '+':
                 a = a + b;
                 System.out.println("��������� ��������� =" + a);
                 break;
             case '-':
                 a = a - b;
                 System.out.println("��������� ��������� =" + a);
                 break;
             case '*':
                 a = a * b;
                 System.out.println("��������� ��������� =" + a);
                 break;
             case '/':
                 try
                 {
                     a = a / b;
                     System.out.println("��������� ��������� =" + a);
                     break;
                 }
                 catch (Exception e)
                 {
                	 System.out.println("�������� ����������");
                     break;
                 }
             default:
            	 System.out.println("����� �� ������������ ��������");
                 break;

         }
         return a;

     }
     public static double Handler(double a)
     {
         double b;
         char operration;
         operration = Operation();
         System.out.println("������ �����");
         b = EnterNumber();
         a = Final(a, b, operration);
         return a;
     }
}
