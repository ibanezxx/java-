package homework.seventeen;

import java.io.*;

public class TestSerializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        double sum=0;
        try {
            File file=new File("Exercise17_06.dat");
            ObjectInputStream objectInput=new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));

            while (true){
                Object temp=objectInput.readObject();
                Loan loan=(Loan)temp;
                sum+=loan.getLoanAmount();
            }
        }catch (EOFException ex){
            System.out.println("总的贷款金额为："+sum);
        }
    }
}
