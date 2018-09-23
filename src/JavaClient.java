import java.io.*;
import java.net.*;
import java.sql.SQLOutput;

public class JavaClient
{
    public static void main(String[] args) {

        try {
            Socket client = new Socket("localhost", 1220);
            System.out.println("Client started");


            //Input- und Outputstreams

            OutputStream out = client.getOutputStream();
            PrintWriter writer = new PrintWriter(out);

            InputStream in = client.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));

            //-----------------------------------

            writer.write(" Hallo Server!");
            writer.flush();

            writer.close();
            reader.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
