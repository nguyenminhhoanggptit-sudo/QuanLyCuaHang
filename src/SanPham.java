public class SanPham {
    private String maSp;
    private String tenSp;
    private double donGia;
    private int SoLuongTon;

    public SanPham() {
        this.maSp = "chua co";
        this.tenSp = "chua co";
        this.donGia = 0.0;
        this.SoLuongTon = 0;
    }

    public SanPham(String maSp, String tenSp) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.donGia = 0.0;
        this.SoLuongTon = 0;
    }

    public SanPham(String maSp, String tenSp, double donGia, int SoLuongTon) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.SoLuongTon = SoLuongTon;
    }

    public String getTenSp() {
        return tenSp;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGiaMoi) {
        this.donGia = donGiaMoi;
    }
    public void setSoLuongTon(int soLuongMoi) {
        this.SoLuongTon = soLuongMoi;
    }
    public void hienThi() {
        System.out.println(this.maSp + "\t" + this.tenSp + "\t" + this.donGia + "\ttồn " + this.SoLuongTon);
    }
}
