package Buoi3;

public class Bang107503 {
    public static String gioiTinh(boolean gt) {
        return gt ? "nam" : "nu";
    }
    public static void main(String[] args) {
        String  maSV = "107503", hoVaTen = "Trần Chí Bằng", ngaySinh = "21/12/2006", lop = "IT24A", khoa = "Công Nghệ Thông Tin", diaChi = "Đà Nẵng";
        int tuoi = 18;
        boolean gt = true;

        System.out.println("----------THÔNG TIN SINH VIÊN----------");
        System.out.println("Mã Sinh Viên:     " + maSV);
        System.out.println("Họ Và Tên:        " + hoVaTen);
        System.out.println("Ngày Sinh:        " + ngaySinh);
        System.out.println("Lớp:              " + lop);
        System.out.println("Khoa:             " + khoa);
        System.out.println("Địa Chỉ:          " + diaChi);
        System.out.println("Tuổi:             " + tuoi);
        System.out.println("Giới Tính:        " + gt);
        System.out.println("------------------END------------------");


    }
}
