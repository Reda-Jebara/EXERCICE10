import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class TASK5
{
    public static void main(String []args) throws IOException
    {
        System.out.println("Enter first three digits of ur bank account");

        BufferedReader rd = new BufferedReader (new InputStreamReader(System.in));
        String digits= rd.readLine();

        URL url = new URL("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt");

        try(BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String line;
            System.out.println("LOADING..");
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\t +");

                String BankNumberReda56567 = words[0].trim();
                String BankNameReda56567 = words[1].trim();

                if (BankNumberReda56567.equals(digits)) {
                    System.out.println("OVER");
                    System.out.println("BANK DIGITS: " + BankNumberReda56567 + "\n\n BANK NAME: " + BankNameReda56567);
                    break;
                }
            }
        }

        catch (IOException e)
        {System.out.println("LOADING FAILED!");}
    }
}