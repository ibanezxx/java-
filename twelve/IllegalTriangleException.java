package homework.twelve;

public class IllegalTriangleException extends Throwable{
        private double l1,l2,l3;
        public IllegalTriangleException(double l1,double l2,double l3){
            super("无效边长"+l1+" "+l2+" "+l3);
            this.l1=l1;
            this.l2=l2;
            this.l3=l3;
        }

}
