import java.io.*;

public class TASK4
{
    public static void main(String []args) throws IOException
    {
        DataManagement obj = new DataManagement();
        obj.readDataReda56567();
        obj.WriteDataToFileReda56567();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        obj.ReadDataFromFileReda56567();
    }
}

class DataManagement
{
    String Reda56567;
    void readDataReda56567() throws IOException
    {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER UR NAME & LAST NAME");
        Reda56567=rd.readLine();
    }

    void WriteDataToFileReda56567()
    {
        try(FileWriter fr = new FileWriter("NAME.txt")) {
            fr.write(Reda56567);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void ReadDataFromFileReda56567(){
        String result;
        try(BufferedReader br = new BufferedReader(new FileReader("NAME.txt"))) {
            while((result=br.readLine()) !=null)
            {
                System.out.println(result);
            }
        }

        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}

