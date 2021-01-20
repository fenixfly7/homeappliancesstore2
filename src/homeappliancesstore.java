import java.lang.String;
import java.util.Scanner;


public class homeappliancesstore {
    private static String name ;
    private static String ADDRESS ;
    private static int   noumeroypal ;

    public static void main (String [] args)
    {
        try {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Grapse name etairias: ");
            String Namecomp = myObj.nextLine();
            if (Namecomp.equals(" ")) {
                System.out.println("Den iparxei name ");
            }

            {
                Scanner myObj2 = new Scanner(System.in);
                System.out.println("Grapse ADDRESS tis etairias: ");
                String Idcomp = myObj2.nextLine();
                if (Idcomp.equals(" ")) {

                    System.out.println("Den iparxei ADDRESS etairias"); }
            }

            {
                Scanner myObj3 = new Scanner(System.in);
                System.out.println("Posoi ypal douleuoun : ");
                int Stuffcomp = Integer.parseInt(myObj3.nextLine());
                if (Stuffcomp == 0 || Stuffcomp < 0 ) {

                    System.out.println("Den iparxoun ypal"); }
            }
        }
        catch(Exception e) {
            System.out.println(name);
            System.out.println(ADDRESS);
            System.out.println(noumeroypal);
        }

    }
}
