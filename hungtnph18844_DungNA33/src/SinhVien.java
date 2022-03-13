/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author Ngọc Hùng
 */
public class SinhVien {
    private int MaSV;
    private String Ten;
    private int NamSinh;
    private double DiemCsharo;

    public SinhVien() {
    }

    public SinhVien(int MaSV, String Ten, int NamSinh, double DiemCsharo) {
        this.MaSV = MaSV;
        this.Ten = Ten;
        this.NamSinh = NamSinh;
        this.DiemCsharo = DiemCsharo;
    }

    public int getMaSV() {
        return MaSV;
    }

    public void setMaSV(int MaSV) {
        this.MaSV = MaSV;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }

    public double getDiemCsharo() {
        return DiemCsharo;
    }

    public void setDiemCsharo(double DiemCsharo) {
        this.DiemCsharo = DiemCsharo;
    }
    public void inThongTin(){
        System.out.println("SinhVien{" + "MaSV=" + MaSV + ", Ten=" + Ten + ", NamSinh=" + NamSinh + ", DiemCsharo=" + DiemCsharo + '}');
    }
}
