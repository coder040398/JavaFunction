package com.trungtamjava.main;

import com.trungtamjava.model.BaoVe;
import com.trungtamjava.model.KeToan;
import com.trungtamjava.model.LeTan;

public class Main {

	public static void main(String[] args) {
		//
		long luongLeTan = LeTan.luong(138);
		long luongBaoVe = BaoVe.luong(84);
		long luongKeToan = KeToan.luong(160);
		//
		System.out.println("---------------------START-MAIN-----------------------");
		System.out.println("-------------------Lương-Nhân-Viên--------------------");
		System.out.println("Lương Lê Tân: "+luongLeTan);
		System.out.println("Lương Bảo Vệ: "+luongBaoVe);
		System.out.println("Lương Kế Toán: "+luongKeToan);
		System.out.println("----------------------END-MAIN------------------------");
		System.out.println("-----------------Code--by--LinhCaro-------------------");

	}

}
