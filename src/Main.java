import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,bc,kq;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a");
        a= scanner.nextInt();
        System.out.println("nhap b");
        b= scanner.nextInt();
        System.out.println("nhap bien bc");
        bc= scanner.nextInt();
        switch (bc){
            case 1:
                kq=a+b;
                System.out.println("tong a+b la:"+kq);
                break;
            case 2:
                kq=a-b;
                System.out.println("hieu a-b la:"+kq);
                break;
            case 3:
                kq=a*b;
                System.out.println("tich a*b la:"+kq);
                break;
            case 4:
                kq=a/b;
                System.out.println("chia lay nguyen a/b la:"+kq);
                break;
            case 5:
                kq=a%b;
                System.out.println("chia lay du a%b la:"+kq);
                break;
            default:
                System.out.println("lenh khong dung");
        }
    }
}