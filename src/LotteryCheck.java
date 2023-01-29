import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LotteryCheck {
	public static void main(String[] args) {
		// random 9 giải cho xổ số
		Random random = new Random();
		// dùng random.nextInt(max - min + 1) + min
		int price8 = random.nextInt(99); // 2 số cuối
		int price7 = random.nextInt(999); // 3 số cuối
		int price6 = random.nextInt(9999); // 4 số cuối
		int price5 = random.nextInt(9999); // 4 số cuối
		int price4 = random.nextInt(99999); // 5 số cuối
		int price3 = random.nextInt(99999); // 5 số cuối
		int price2 = random.nextInt(99999); // 5 số cuối
		int price1 = random.nextInt(99999); // 5 số cuối
		int priceSpecial = random.nextInt(999999); // 6 số cuối

		System.out.println("Kết quả xổ số là: ");
		System.out.println("Giải 8: " + price8);
		System.out.println("Giải 7: " + price7);
		System.out.println("Giải 6: " + price6);
		System.out.println("Giải 5: " + price5);
		System.out.println("Giải 4: " + price4);
		System.out.println("Giải 3: " + price3);
		System.out.println("Giải 2: " + price2);
		System.out.println("Giải 1: " + price1);
		System.out.println("Giải Đặc biệt: " + priceSpecial);

		// lấy vé số đầu vào
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập xổ số của bạn: ");
		int myLotteryNumber = input.nextInt();
		int y;
		// tách 6 số thành ArrayList
		ArrayList<Integer> myLottery = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0));
		while (myLotteryNumber > 0) {
			for (int x = 5; x >= 0; x--) {
				y = myLotteryNumber % 10;
				myLottery.set(x, y);
				myLotteryNumber = myLotteryNumber / 10;
			}
		}
		System.out.println(myLottery);

		// lấy các số cuối
		int endNumber = 0, end2Number = 0, end3Number = 0, end4Number = 0, end5Number = 0, end6Number = 0;
		for (int i = 0; i < myLottery.size(); i++) { // 6 số cuối
			end6Number = 10 * end6Number + myLottery.get(i);
		}
		for (int i = 1; i < myLottery.size(); i++) { // 5 số cuối
			end5Number = 10 * end5Number + myLottery.get(i);
		}
		for (int i = 2; i < myLottery.size(); i++) { // 4 số cuối
			end4Number = 10 * end4Number + myLottery.get(i);
		}
		for (int i = 3; i < myLottery.size(); i++) { // 3 số cuối
			end3Number = 10 * end3Number + myLottery.get(i);
		}
		for (int i = 4; i < myLottery.size(); i++) { // 2 số cuối
			end2Number = 10 * end2Number + myLottery.get(i);
		}

		// System.out.println(end5Number);
		// so sánh kết quả
		if (end6Number == priceSpecial) {
			System.out.println("Chúc mừng bạn đã trúng giải Đặt biệt !");
		} else if (end5Number == price1) {
			System.out.println("Chúc mừng bạn đã trúng giải Nhất !");
		} else if (end5Number == price2) {
			System.out.println("Chúc mừng bạn đã trúng giải 2 !");
		} else if (end5Number == price3) {
			System.out.println("Chúc mừng bạn đã trúng giải 3 !");
		} else if (end5Number == price4) {
			System.out.println("Chúc mừng bạn đã trúng giải 4 !");
		} else if (end4Number == price5) {
			System.out.println("Chúc mừng bạn đã trúng giải 5 !");
		} else if (end4Number == price6) {
			System.out.println("Chúc mừng bạn đã trúng giải 6 !");
		} else if (end3Number == price7) {
			System.out.println("Chúc mừng bạn đã trúng giải 7 !");
		} else if (end2Number == price8) {
			System.out.println("Chúc mừng bạn đã trúng giải 8 !");
		} else {
			System.out.println("Chúc bạn may mắn lần sau.");
		}
	};
}
