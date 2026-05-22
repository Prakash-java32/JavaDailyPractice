import java.text.spi.DateFormatProvider;
import java.time.*;
import java.time.format.DateTimeFormatter;

//Class level Genrics
class Genrics<T>{
    T obj;
    public Genrics(T name)
    {
       obj=name;
    }

    public T getObj() {
        return obj;
    }
    public  <T>void MethodlevelGenrics(T arg,T arg1)
    {
        System.out.println(arg);
        System.out.println(arg1);
    }
}
class Box<T>{
    T box ;
    public Box(T box)
    {
        this.box=box;
    }

    public T getBox() {
        return box;
    }
}
//date practice
class Date{
    public static  void dateUsage(){
        //ADD DAYS
        LocalDate u1=LocalDate.now();
        System.out.println(u1.plusDays(10));
        //DATE FORMATE CHANGE
        String date="02-03-2026";
        DateTimeFormatter d1=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localdate=LocalDate.parse(date,d1);
        System.out.println(localdate);
        //DATE DIFFER PERIOD CLASS USEAGE:
        LocalDate per=LocalDate.of(2026,05,18);
        LocalDate date2=LocalDate.now();
        Period period=Period.between(per,date2);
        System.out.println(period.getDays());
        //TIME DIFFER PERIOD CLASS USEAGE:
        LocalTime localtime =LocalTime.of(1,15,18);
        LocalTime localtime2 =LocalTime.of(1,05,18);
        Duration period2=Duration.between(localtime,localtime2);
        System.out.println(period2.toHours());
        System.out.println(period2.toMinutes());
        System.out.println(period2.getSeconds());
        //LOCALDATETIMEUSEAGE
        LocalDateTime l1=LocalDateTime.of(2026,05,22,1,22,05);
        LocalDateTime l2=LocalDateTime.of(2025,05,22,1,22,05);
        LocalDate local=l1.toLocalDate();
        LocalDate local2=l2.toLocalDate();
        Period peri =Period.between(local,local2);
        Duration dur=Duration.between(l1,l2);
        System.out.println("the duration of time in localdatetime "+dur);
        System.out.println("the date period of year " + peri);

    }
}

public class GenricsPractice {
    public static  void  main (String args[]){
//        Genrics<String> g1=new Genrics<>("Aravind");
//        System.out.println(g1.getObj());
//        g1.MethodlevelGenrics(2,"prakash");
//        //realtime schenorio
//       // we can store in multipe items in one box
//        Box<String> b1=new Box<String>("rice box");
//        Box<String> b21=new Box<String>("selad box");
//        Box<String> b321 =new Box<String>("vegitable box");
        Date d1=new Date();
        d1.dateUsage();


    }
}
