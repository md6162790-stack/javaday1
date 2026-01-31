import java.util.Scanner;
class ChapterOne{
    public static void main(String[] args) {
    /*  int a=12;
        byte b=12;
        short s=123;
        long l=6787;
        double d=234.345d;
        float f=12.f;
        char ch='a';
        String str="Harry";
        boolean c=true;
        System.out.println(a);
        System.out.println(b);
        System.out.println(s);
        System.out.println(l);
        System.out.println(d);
        System.out.println(f);
        System.out.println(ch);
        System.out.println(str);
        System.out.println(s+l);
        float add=a+23;
        System.out.println("value of ab is :"+add);
    }
}*/
Scanner sc=new Scanner(System.in);
System.out.println("enter a value:");
int a=sc.nextInt();
System.out.println("enter b  value");
int b=sc.nextInt();
int sum=a+b;
System.out.println("sum of the values are:");
System.out.println(sum);
System.out.println("enter a value:");
boolean b1=sc.hasNextInt();
System.out.println(b1);

    }
}


