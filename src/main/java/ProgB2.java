public class ProgB2 {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "太郎";
		h.hp = 100;

		System.out.println("勇者" + h.name + " (HP:" + h.hp + ") が誕生した!");

		Sword sword = new Sword("こんぼう");
		h.sword = sword;

		System.out.println("勇者は" + h.sword.name + "を装備した!");
	}
}
