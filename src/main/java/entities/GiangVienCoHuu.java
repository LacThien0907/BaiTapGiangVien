package entities;

import java.util.Scanner;

public class GiangVienCoHuu extends GiangVien {
    private int soGioDay, luong, soGioDayToiThieu;

    @Override
    public void fromConSole(Scanner sc) {
        super.fromConSole(sc);

        System.out.print("- Luong: ");
        this.luong = Integer.parseInt(sc.nextLine());

        System.out.print("- So gio day toi thieu: ");
        this.soGioDayToiThieu = Integer.parseInt(sc.nextLine());

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GiangVienCoHuu{");
        super.getGVString(sb);
        sb.append(", soGioDay=").append(soGioDay);
        sb.append(", luong=").append(luong);
        sb.append(", soGioDayToiThieu=").append(soGioDayToiThieu);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int tinhLuong() {
        final int luongNgoaiGio = 300000;
        int bonus = this.soGioDay > this.soGioDayToiThieu ? (this.soGioDay - this.soGioDayToiThieu) * luongNgoaiGio : 0;
        return this.luong + bonus;
    }
}
