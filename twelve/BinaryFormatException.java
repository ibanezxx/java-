package homework.twelve;

public class BinaryFormatException extends Throwable{
    public BinaryFormatException(String s) {
       super(s+" is not a binary string");
    }
}
