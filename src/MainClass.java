
import java.util.Scanner;
public class MainClass 
{
	static Scanner in = new Scanner(System.in);
	public static void main(String args[]) 
	{
		
		String triger;
		String t="y";
		do
        {

            double a;
            System.out.println("Первое число");
            a = FunctionalClass.EnterNumber();
            
            do
            {
                a = FunctionalClass.Handler(a);
                System.out.println("Хотите продолжить работу с имеющимися данными? Введите y.Если нет, то любую клавишу.");
                triger=in.next();
            } while (t.equals(triger));
            System.out.println("Для продолжения работы введите y, для завершения любую другую клавишу.");
            triger=in.next();
        } while (t.equals(triger));
	
	}

}
