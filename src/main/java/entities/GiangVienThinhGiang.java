package entities;

import java.util.Scanner;

public class GiangVienThinhGiang extends GiangVien{
    private String coQuan;

    @Override
    public void fromConSole(Scanner sc) {
        super.fromConSole(sc);

        System.out.print("- Co quan: ");
        this.coQuan = sc.nextLine();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GiangVienThinhGiang{");
        super.getGVString(sb);
        sb.append("coQuan='").append(coQuan).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int tinhLuong() {
        final int luongMotGio = 200000;
        return this.soGioDay*luongMotGio;
    }
}
