package cw.samsung.com;
import cw.samsung.com.Person;
import cw.samsung.com.Student;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Unit unit = new Unit("X", 18);
        Unit unit1 = new Unit(unit);
        unit1.cure();
        unit.printInfo();
        unit1.printInfo();

        Mage mage = new Mage("X", 18, 200);
        Mage mage1 = new Mage(mage);
        mage.printInfo();
        mage1.GiftIsFound();
        mage.printInfo();
        mage1.printInfo();

        System.out.println("Отличие класса от объекта заключается в том, что класс - это описание типа объекта, а объект, удовлетворяющий данному описанию - экземпляр класса");
        System.out.println("Первый принцип ООП - инкапсуляция (объединение данных и методов по работе с ними + обеспечение их приватности), второй - наследование (данные могут наследоваться от класса к класссу), третий - полиморфизм(возможность реализации одного и того же действия различными способами в зависимости от типа объекта)");
        System.out.println("Существует четыре модификатора доступа: private (задается при задании экземпляра класса, не может меняться), default (может изменяться только в том же пакете), protected (может изменяться в тоом же пакете через наследование), public (может изменяться везде).");
    }
}




