import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String season="";
        int amountIceCream =0;
        double priceForOneIceCream =0;
        String nameOfIceCream="";
        String identityCodeOfIceCream="";
        String typeOfIceCream="";
        boolean flag =true;
        String myName="";

        System.out.println("ДОБРЕ ДОШЛИ ВЪВ ФАБРИКАТА ЗА СЛАДОЛЕД!");
        System.out.println("За да Ви помогнем с производството на новия Ви сладолед, моля следвайте стъпките.");
        System.out.println("В кой сезон се намираме?");
        season = scanner.nextLine();

        if(season.equals("Лято") || season.equals("Пролет") || season.equals("Есен")) {

            System.out.println("Колко сладоледа можем да произведем на ден?");
            amountIceCream = Integer.parseInt(scanner.nextLine());
            System.out.println("На каква цена да го пуснем?");
            priceForOneIceCream = Double.parseDouble(scanner.nextLine());
            System.out.println("Как да се казва сладоледа?");
            nameOfIceCream = scanner.nextLine();
            System.out.println("Въведи идентификационен код на сладоледа");
            identityCodeOfIceCream=scanner.nextLine();
            System.out.println("Трябва да избереш вкус. Предлагаме следните вкусове: шоколад, ванилия, ягода, пъпеш.");
            typeOfIceCream=scanner.nextLine();
            System.out.println("Въведи името си, за да участваш за награди от нашите спонсори :)");
            myName=scanner.nextLine();


            System.out.println("СЛУЖЕБНА БЕЛЕЖКА");
            System.out.println("------------------");
            System.out.println("Брой сладоледи за един ден: " + amountIceCream);
            System.out.println("Цена за един сладолед: " + priceForOneIceCream);
            System.out.println("Името на сладоледа е " + nameOfIceCream);
            System.out.println("Идентификационен код на сладоледа: "+ identityCodeOfIceCream);
            System.out.println("Вкус: "+ typeOfIceCream);
            System.out.println("------------------");
            System.out.println("Вашето име: "+ myName);

            System.out.println("ВАШИЯТ ПРЕКРАСЕН СЛАДОЛЕД ЩЕ БЪДЕ ПРОИЗВЕДЕН! GOOD JOB!");

        }else if(season.equals("Зима")){

            System.out.println("Съжаляваме , сладоледите ще почнат производство при по топло време :)");

        }
    }
}
