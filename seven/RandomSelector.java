package homework.seven;

public class RandomSelector {
    public static void main(String[] args) {
        System.out.println(getRandom());
    }
    public static int getRandom(int... numbers){
        int randomNumber=1+(int)(Math.random()*53);
        return randomNumber;
    }
}
