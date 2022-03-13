
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ngọc Hùng
 */
public class SinhVienUDPM extends SinhVien{
    private double diemJava;
    private double diemC;

    public static void main(String[] args) {
        System.out.println("a"=="a");
        String x1 = "a",x2="a";
        System.out.println("a"==x1);
        System.out.println(x1==x2);
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("Mời bạn nhập a ");
        a = sc.nextLine();
        System.out.println("a"==a);
    }
    
    public SinhVienUDPM() {
    }

    public SinhVienUDPM(double diemJava, double diemC, int MaSV, String Ten, int NamSinh, double DiemCsharo) {
        super(MaSV, Ten, NamSinh, DiemCsharo);
        this.diemJava = diemJava;
        this.diemC = diemC;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemC() {
        return diemC;
    }

    public void setDiemC(double diemC) {
        this.diemC = diemC;
    }
    public void inRaManHinh(){
        System.out.println("SinhVienUDPM{" + "diemJava=" + diemJava + ", diemC=" + diemC + '}' + "SinhVien{" + "MaSV=" + super.getMaSV() + ", Ten=" + super.getTen() + ", NamSinh=" + super.getNamSinh() + ", DiemCsharo=" + super.getDiemCsharo() + '}');
    }
    
}
