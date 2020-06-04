package homework.six;

public class Tax {
    // 0 表示单身纳税人， 1表示已婚共同纳税人，2 为已婚单独纳 税人，3 为家庭户主纳税人
    public static void main(String[] args) {
        //6.15
        System.out.println("TaxableIncome"+"\t"+"single"+"\t"+"MarriedJoint"+"\t"+"MarriedSeparate"+"\t"+"HeadOfAHouse");
        for(double income=50000;income<=60000;income+=50){
            System.out.println((int)income+ "\t\t\t" +
                    Math.round(computeTax(0, income)) + "\t" +
                    Math.round(computeTax(1, income)) + "\t\t\t" +
                    Math.round(computeTax(2, income)) + "\t\t\t" +
                    Math.round(computeTax(3, income)));
        }
    }
    public static double computeTax(int status, double taxableIncome){
        double tax=1;
        switch (status){
            case 0:tax=tax(taxableIncome,8350, 33950, 82250, 171550, 372950);
                    break;
            case 1:tax=tax(taxableIncome, 16700, 67900, 137050, 208850, 372950);
                    break;
            case 2:tax=tax(taxableIncome,8350, 33950, 68525, 104425, 186475);
                    break;
            case 3:tax=tax(taxableIncome,11950, 45500, 117450, 190200, 372950);
            default:break;
        }
        return tax;
    }

    public static double tax(double taxableIncome,int n1,int n2,int n3,int n4,int n5){
        double tax1=1;
        if (taxableIncome <= n1)
            tax1 = taxableIncome * 0.10;
        else if (taxableIncome <= n2)
            tax1 = n1 * 0.10 + (taxableIncome - n1) * 0.15;
        else if (taxableIncome <= n3)
            tax1 = n1 * 0.10 + (n2 - n1) * 0.15 + (taxableIncome - n2) * 0.25;
        else if (taxableIncome <= n4)
            tax1 = n1 * 0.10 + (n2 - n1) * 0.15 +
                    (n3 - n2) * 0.27 + (taxableIncome - n3) * 0.28;
        else if (taxableIncome <= n5)
            tax1 = n1 * 0.10 + (n2 - n1) * 0.15 + (n3 - n2) * 0.25 +
                    (n4 - n3) * 0.28 + (taxableIncome - n4) * 0.33;
        else
            tax1 = n1 * 0.10 + (n2 - n1) * 0.15 + (n3 - n2) * 0.25 +
                    (n4 - n3) * 0.28 + (n5 - n4) * 0.33 + (taxableIncome - n5) * 0.35;

        return tax1;
    }
}
