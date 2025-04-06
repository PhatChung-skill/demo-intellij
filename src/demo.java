import java.util.ArrayList;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        ArrayList<Integer> siu=new ArrayList<>();
        int n;
        Scanner dc=new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cho ds: ");
        n=dc.nextInt();
        for (int i=0;i<n;i++){
            System.out.print("Nhap phan tu thu "+(i+1)+": ");
            int x=dc.nextInt();
            siu.add(x);
        }

        //them phan tu vao dau ds
        System.out.print("NHap phan tu can them dau: ");
        int themDau=dc.nextInt();
        siu.add(0,themDau);
        System.out.println("Ds sau khi them dau la: "+siu);
        System.out.println("");

        //them phan tu vao cuoi
        System.out.print("Nhap phan tu can them vao cuoi: ");
        int themCuoi= dc.nextInt();
        siu.add(themCuoi);
        System.out.println("Ds sau khi them cuoi la: "+siu);
        System.out.println("");

        //duyet ds
        for (int x: siu){
            System.out.println(x);
        }
        //tinh Tong
        int s=0;
        for (int i=0;i<siu.size();i++){
            s+=siu.get(i);
        }
        System.out.println("Tong cac phan tu la: "+s);
        System.out.println("");

        //trung binh cong
        double tb=0;
        System.out.println("Trung binh cong la: "+(1.0*s/siu.size()));

    }
}
