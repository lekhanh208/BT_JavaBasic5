package JAVABASICBT5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class ExerciseArrayList {

    public static void nhanVien(){
        ArrayList<String> kyNang = new ArrayList<String>();
        kyNang.add("Java");
        kyNang.add("Python");
        kyNang.add("SQL");
        kyNang.add("Automation Test");
        kyNang.add("Manual Test");


        HashSet<String> kinhNghiem = new HashSet<String>();
        kinhNghiem.add("Công ty ABC");
        kinhNghiem.add("Dự án XYZ");
        kinhNghiem.add("Sản phẩm !@#");

        HashMap<String, String> hocTap = new HashMap<String, String>();
        hocTap.put("Trường học", "Đại học KHTN");
        hocTap.put("Điểm GPA", "8.0");
        hocTap.put("Chương trình đào tạo", "Chính Quy");
        hocTap.put("Tốt nghiệp loại", "Giỏi");
        hocTap.put("Năm tốt nghiệp", "2021");

        for (int i = 0; i < kyNang.size(); i++){
            System.out.println(kyNang.get(i));
        }
        for (String a : kinhNghiem){
            System.out.println(a);
        }
        System.out.println(hocTap);


    }

    public static void main(String[] args) {
        ArrayList<Integer> listEven = new ArrayList<Integer>();
        int vitri = 0;
        for (int i = 0; i <= 50; i = i + 2){
            listEven.add(i);
            listEven.get(vitri++);
        }

        System.out.println("Chỉnh sửa bài tập Java Basic 4 với ArrayList");
        for (int a : listEven){
            System.out.println(a);
        }

        System.out.println("In ra thông tin nhân viên");
        nhanVien();
        }

    }

