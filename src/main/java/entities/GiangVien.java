package entities;

import java.util.Scanner;

public class GiangVien {
    protected String ten, email, diachi, dienThoai;
    protected int soGioDay;

    public GiangVien() {
    }

    public GiangVien(String ten, String email, String diachi, String dienThoai, int soGioDay) {
        this.ten = ten;
        this.email = email;
        this.diachi = diachi;
        this.dienThoai = dienThoai;
        this.soGioDay = soGioDay;
    }
    // Ham nhap
    public void  fromConSole(Scanner sc){

        System.out.print("- Ten: ");
        this.ten = sc.nextLine();

        System.out.print("- Email: ");
        this.email = sc.nextLine();

        System.out.print("- Dia Chi: ");
        this.diachi = sc.nextLine();

        System.out.print("- Dien Thoai: ");
        this.dienThoai = sc.nextLine();

        System.out.print("- So gio day trong thang: ");
        this.soGioDay = Integer.parseInt(sc.nextLine());

    }
    // Ham xuat
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GiangVien{");
        getGVString(sb);
        sb.append('}');
        return sb.toString();
    }
        // Dong goi xuat
    protected void getGVString(StringBuilder sb) {
        sb.append("ten='").append(ten).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", diachi='").append(diachi).append('\'');
        sb.append(", dienThoai='").append(dienThoai).append('\'');
        sb.append(", soGioDay=").append(soGioDay);
    }

    public int tinhLuong(){
        return 0;
    }
}
