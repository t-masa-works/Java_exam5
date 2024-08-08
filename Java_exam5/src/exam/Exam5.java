package exam;

import java.util.Random;
import java.util.Scanner;

public class Exam5 {
	public static void main(String[] args) {
		//		資料を確認した後、以下の課題を解いてください。
		//
		//		【課題1】Scannerクラス
		//		ユーザーに2つの整数を入力させ、これらの整数の和を計算するプログラムの作成
		Scanner input_number = new Scanner(System.in);

		int input_times = 2;
		int[] numbers = new int[input_times];
		int get_number = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("数字を入力してください");
			numbers[i] = input_number.nextInt();
			int sum = numbers[i] + get_number;
			if (i == numbers.length - 1) {
				System.out.println("合計値は" + sum + "です。");
			}
			get_number = numbers[i];
		}
		//		System.out.println("数字を入力してください");
		//		int number_a = scanner.nextInt();
		//		System.out.println("数字を入力してください");
		//		int number_b = scanner.nextInt();
		//		int sum = number_a + number_b;
		//		System.out.println(sum);

		//		円の半径をユーザーに入力させ、円の面積を計算するプログラムの作成
		Scanner input_radius = new Scanner(System.in);
		double Pi = 3.14;

		System.out.println("面積を求めたい円の半径を入力してください");
		int radius = input_radius.nextInt();
		double area = radius * radius * Pi;
		System.out.println("この円の面積は、" + area + "です。");

		//		【課題2】Mathクラス
		//		2つの整数をユーザーに入力させ、それらの整数の最大公約数（GCD）を求めるプログラムの作成
		Scanner input_n = new Scanner(System.in);

		System.out.println("GCDを求めます");
		System.out.println("１つ目の数字を入力してください");
		int a = input_n.nextInt();
		System.out.println("２つ目の数字を入力してください");
		int b = input_n.nextInt();

		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
			int gcd = a;
			if (b == 0) {
				System.out.println("最大公約数は" + gcd);
			}
		}

		//		ユーザーに入力させた浮動小数点数の平方根を求めるプログラムの作成

		Scanner input_sq = new Scanner(System.in);

		System.out.println("平方根を求めたい数字を入力してください");
		double sq = input_sq.nextDouble();

		double sqrt = Math.sqrt(sq);

		System.out.println("平方根は" + sqrt + "です。");

		//		【課題3】Randomクラス
		//		サイコロを模したランダムな数(1-6)を生成し、ユーザーがサイコロの目を予想するプログラムの作成
		Random random = new Random();
		Scanner input_choice = new Scanner(System.in);
		Scanner input_yn = new Scanner(System.in);
		boolean flag = true;
		String yn = null;

		while (flag) {
			System.out.println("サイコロを降ります。出目を1~6の間で予想して選択してください。");
			System.out.println("1~6の数字を入力:");

			int choice = input_choice.nextInt();
			int dice = random.nextInt(6) + 1;

			if (dice == choice) {
				System.out.println("サイコロの目は" + dice + "です。");
				System.out.println("おめでとうございます。予想は見事的中しました。");
				flag = false;
			} else {
				System.out.println("サイコロの目は" + dice + "です。");
				System.out.println("残念。予想した" + choice + "でありませんでした。");
				while (true) {
					System.out.println("もう一度サイコロを降りますか？ y/n");
					yn = input_yn.next();
					if (yn.equals("y")) {
						flag = true;
						System.out.println("グッドラック！");
						break;
					} else if (yn.equals("n")) {
						System.out.println("お疲れ様でした。");
						flag = false;
						break;
					} else {
						System.out.println("yかnを入力してください");
					}
				}
			}
		}
		//	【課題4】メソッド作成
		//	文字列を引数として受け取り、その文字列を逆順にして表示するメソッドの作成
		//	文字列はABCDEFGとする。
		WordReverse("ABCDEFG");

		//	3つの整数を引数として受け取り、それらの整数の平均を返すメソッドを作成
		//	整数は2, 7, 1とする
		IntAvg(2,7,1);
	}

	public static void WordReverse(String input_abc) {
		StringBuilder abc = new StringBuilder(input_abc);

		abc.reverse();
		System.out.println(abc);
	}

	public static void IntAvg(int number_1, int number_2, int number_3) {
		int a = number_1;
		int b = number_2;
		int c = number_3;
		
		double sum = a + b + c;

		double avg = sum / 3;
		System.out.println(avg);
	}

}
