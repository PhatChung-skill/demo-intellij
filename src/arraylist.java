import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> lon=new ArrayList<>();
        int n;
        Scanner dc=new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cho List lon: ");
        n=dc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Nhap phan tu thu "+(i+1)+": ");
            int x=dc.nextInt();
            lon.add(x);
        }
        System.out.println("Ds list lon sau khi nhap la: "+lon);
        System.out.println("");

        //them phan tu cuoi
        System.out.print("NHap phan tu can them vao cuoi: ");
        int themcuoi= dc.nextInt();
        lon.add(themcuoi);
        System.out.print("Ds sau khi them phan tu cuoi la: "+lon);
        System.out.println("");

        //themdau
        System.out.print("Nhap phan tu can them vao dau ds: ");
        int themdau= dc.nextInt();
        lon.add(0,themdau);
        System.out.print("Ds sau khi them phan tu dau la: "+lon);
        System.out.println("");

        //xoa phan tu o vi tri bat ky
        System.out.print("Nhap vi tri can xoa phan tu: ");
        int xoa=dc.nextInt();
        lon.remove(xoa);
        System.out.println("DS sau khi xoa phan tu tai vi tri: "+lon);
        System.out.println("");

        //sap xep phan tu tang dan
        Collections.sort(lon);
        System.out.println("Ds sau khi sap xep tang dan la: "+lon);
        //sap xep giam dan
        Collections.reverse(lon);
        System.out.println("Ds sau khi sap xep giam dan la: "+lon);
        System.out.println("");
        lon.clear();
        if (lon.isEmpty()){
            System.out.println("Danh sach rong!");
        }
        else {
            System.out.println("DS hien tai la: "+lon);
        }



    }
}
