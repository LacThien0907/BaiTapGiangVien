import entities.GiangVien;
import entities.GiangVienCoHuu;
import entities.GiangVienThinhGiang;

import java.util.Scanner;

public class APP {
    public static void main(String[] args){
        // Ham nhap
        Scanner sc = new Scanner(System.in);
        System.out.print("So giang vien: ");
        int n = Integer.parseInt(sc.nextLine());
        GiangVien[] list = new GiangVien[n];
        for(int i = 0; i < n; i++){
            System.out.format("Giang vien thu %d\n", i+1);
            System.out.print("- Loai giang vien(0. Co Huu/1. Thinh Giang): ");
            int type = Integer.parseInt(sc.nextLine());

            if (type == 0){
                list[i] = new GiangVienCoHuu();
            }else {
                list[i] = new GiangVienThinhGiang();
            }
            list[i].fromConSole(sc);
        }

        // Ham xuat tat ca
        for (GiangVien gv: list){
            System.out.println(gv);
        }

        // Ham xuat GiangVienCoHuu
        for (GiangVien gv: list){
            if(gv instanceof GiangVienCoHuu){
                System.out.println(gv);
            }
        }
        // Ham xuat GiangVienThinhGiang
        for (GiangVien gv: list){
            if(gv instanceof GiangVienThinhGiang){
                System.out.println(gv);
            }
        }

        // Tinh luong
        int total = 0;
        for (GiangVien gv : list){
            total += gv.tinhLuong();
        }
        System.out.format("Tong luong: %d\n", total);

    }
}
