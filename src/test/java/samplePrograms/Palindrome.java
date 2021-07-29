package samplePrograms;

public class Palindrome {

    public static void isPalindrome(int num){
        int r =0;
        int sum=0;
        int t;

        t = num;
        while(num>0){
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(t==sum){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("The number is not Palindrome");
        }


    }
    public static void main(String[] args) {
        isPalindrome(511);
        //System.out.println("The given number is Palindrome"+result );
    }
}
