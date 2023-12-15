
import java.time.LocalDate;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Test {
    ResourceBundle bundle=ResourceBundle.getBundle("message", Locale.CHINA);
    public void  show (Locale loc){
        bundle=ResourceBundle.getBundle("message",loc);
        System.out.println("Date:"+LocalDate.now());
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("welcome"));
        System.out.println(bundle.getString("message1"));
        System.out.println(bundle.getString("message2"));
        System.out.println(bundle.getString("regards"));

    }
    public static void main(String[] args) throws Exception{
        Test t=new Test();
        Locale inLocale=new Locale("hi","IN");
        Locale uslocale=new Locale("en","US");
        Locale zhLocale=new Locale("zh","CN");
        Locale frLocale=new Locale("fr","FR");
        Locale setLocale=Locale.getDefault();


        System.out.println("Date:" + LocalDate.now());
        System.out.println("Hello Guest,");
        System.out.println("Welcome to our country.");
        System.out.println("We are happy to host you in our country.");
        System.out.println("Enjoy your stay.");
        System.out.println("Thank you!");
        System.out.println("***************************");
        System.out.println("Select your language ");
        System.out.println("1: English");
        System.out.println("2: French");
        System.out.println("3: Chinese");
        System.out.println("4: Hindi");
        System.out.println("5: Exit");
        Scanner scn = new Scanner(System.in);
        int choice= scn.nextInt();
        switch (choice) {
            case 1: t.show(uslocale);
            break;
            case 2: t.show(inLocale);
                break;
            case 3: t.show(frLocale);
                break;
            case 4: t.show(zhLocale);
                break;

        }

    }
}
