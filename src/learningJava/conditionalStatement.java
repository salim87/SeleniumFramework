package learningJava;

public class conditionalStatement {

   static String grading(int score){
       String grade;
        if (score > 91){
            grade="a";
        }else grade="b";
       System.out.println(grade);
        return grade;
    }

    public static void main(String[] args) {
        int a=10;
        int b=20;

        grading(80);
        /*if (a+b>40)
            System.out.println("true");
        else if (a+b<25)
            System.out.println("false");
        else {
            System.out.println("executes when all conditions are false");
        }*/

        String address= "Georgia, US";

        /*if(address.endsWith("US")){
            if(address.contains("Den")){
                System.out.println("Your city is Georgia");
            } else if (address.contains("COS")) {
                System.out.println("your city is COS");
            }else {
                System.out.println("You are living in  " + address.split(",")[0]);
            }
        }else {
            System.out.println("You are not living in US");
        }*/
//Switch Statement
        int num=2;
        /*switch (num){
            case 1:
                System.out.println("value is 1");
                break;
            case 2:
                System.out.println("value is 2");
                break;
            default:
                System.out.println(num);
        }*/

        //For Loop

        int sum=0;
        for (int j=1; j<=10; j++){
            sum=sum+j;
            System.out.println(j);
        }
        System.out.println("The sum of first 10 natural number is "+ sum);

        String s[]= {"asd", "def"};

        for (String t:
             s) {
            System.out.println(t);
        }
    }
}
