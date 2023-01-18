package code_review.practice.chap04_control_statement.level04_advanced;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {

		/* 받은 금액을 입력 받고, 상품 가격을 입력 받아 거스름돈을 계산하는 프로그램을 작성하세요
		 * 
		 * 단, 거스름돈은 대한민국 화폐 단위 별 필요 수량이 출력되도록 작성하고,
		 * 지폐외 동전을 구분하여 단위를 표기하세요
		 * 
		 * -- 입력 예시 --
		 * 받으신 금액을 입력하세요 : 100000
		 * 상품 가격을 입력하세요 : 22340
		 * 
		 * -- 출력 예시 --
		 * ============================
		 * 50000원권 지폐 1장
		 * 10000원권 지폐 2장
		 * 5000원권 지폐 1장
		 * 1000원권 지폐 2장
		 * 500원권 동전 1개
		 * 100원권 동전 1개
		 * 50원권 동전 1개
		 * 10원권 동전 1개
		 * ============================
		 * 거스름돈 : 77660원
		 * */



		Scanner sc = new Scanner(System.in);
		System.out.print("받으신 금액을 입력하세요 : ");
		int money = sc.nextInt();
		System.out.print("상품 가격을 입력하세요 : ");
		int price = sc.nextInt();

		System.out.println("============================");

		int[] bill = new int[] {50000, 10000, 5000, 1000};
		int[] coin = new int[] {500, 100, 50, 10};
		int change = money - price;
		int count = 0;

		for(int i = 0; i < bill.length; i++) {

			if(change >= bill[i]) {
				count = change / bill[i];
				change = change % bill[i];
				System.out.println(bill[i] + "원권 지폐 " + count + "장");
			}
		}

		for(int i = 0; i < coin.length; i++) {
			if(change < 1000) {
				if(change >= coin[i]) {
					count = change / coin[i];
					change = change % coin[i];
					System.out.println(coin[i] + "원권 동전 " + count + "개");
				}
			}
		}

		System.out.println("============================");
		System.out.println("거스름돈 : " + (money - price) + "원");

	}

}

