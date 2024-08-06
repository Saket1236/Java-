import java.util.Scanner;
class Complex1{
    int real ,img ;
    Complex1(int r ,int i){
        real=r;
        img=i;
    }    
    static void add(Complex1 c1 ,Complex1 c2){
        int real=c1.real+c2.real;
        int img=c1.img+c2.img;
        System.out.println("Addition :"+"("+real+")+("+img+"i)");
        

    }
    
    static void sub(Complex1 c1 ,Complex1 c2){
        int real=c1.real-c2.real;
        int img=c1.img-c2.img;
        System.out.println("Substraction :"+"("+real+")+("+img+"i)");
        
    }
    
    static void mult(Complex1 c1 ,Complex1 c2){
        int real=(c1.real*c2.real)+(c1.img*c2.img);
        int img=(c1.img*c2.real)+(c2.img*c1.real);
        System.out.println("Multiplication :"+"("+real+")+("+img+"i)");
        
    }
    
    static void div(Complex1 c1 ,Complex1 c2){
        int deno=(c2.real*c2.real+c2.img*c2.img);
        double real=((c1.real*c2.real)-(c1.img*c2.img))/deno;
        double img=(c1.img*c1.real)+(c2.img*c1.real)/deno;
        System.out.println("Division :"+"("+real+")+("+img+"i)");
        
    }

    public static void main(String args []){
        Scanner p=new Scanner (System.in);
        System.out.println("Enter 1st real no=");
        int a=p.nextInt();
        Scanner q=new Scanner (System.in);
        System.out.println("Enter 1st img no=");
        int b=q.nextInt();
        Scanner r=new Scanner (System.in);
        System.out.println("Enter 2nd real no=");
        int c=r.nextInt();
        Scanner s=new Scanner (System.in);
        System.out.println("Enter 2nd img no=");
        int d=s.nextInt();

        Complex1 first =new Complex1(a,b);
        Complex1 second =new Complex1(c,d);
    int i=1;
    do{
    Scanner sc =new Scanner (System.in);
    System.out.println("=======================");
    System.out.println("Enter your Option =");
    int option =sc.nextInt();
    if (option>4 || option<1){
        System.out.println("Wrong option");
    }
    switch(option){
    case 1:
    add(first,second);
    break;
    case 2:
    sub(first,second);
    break;
    case 3:
    mult(first,second);
    break;
    case 4:
    div(first,second);
    break;
    }
    }while(i<3);  
}
}