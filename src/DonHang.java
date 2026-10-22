public class DonHang {
    private String tenKhach;
    private SanPham sanPham;
    private int soLuong;

    public DonHang(String tenKhach, SanPham sanPham, int soLuong) {
        this.tenKhach = tenKhach;
        this.sanPham = sanPham;

        if (soLuong < 1) {
            this.soLuong = 1;
        } else {
            this.soLuong = soLuong;
        }
    }

    public double tinhThanhTien () {
        double tongTien = this.sanPham.getDonGia()*this.soLuong;

        if (this.soLuong >= 5) {
            tongTien = tongTien - (tongTien*0.1);
        }
        return tongTien;
    }

    public void inDonHang() {
        System.out.println(this.tenKhach + "\t" + this.sanPham.getTenSp() + "\t" + this.soLuong + "\t" + this.tinhThanhTien());
    }
 }
