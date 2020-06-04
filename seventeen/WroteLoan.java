package homework.seventeen;

import javax.imageio.IIOException;
import java.io.*;

public class WroteLoan {
    public static void main(String[] args) throws IOException {
        File f=new File("Exercise17_06.dat");
        ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream(f));
        for (int i=0;i<5;i++) {
            outputStream.writeObject(new Loan());
        }
        outputStream.close();
    }
}
