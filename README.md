# 課題11-2: カプセル化

### 課題の説明
課題11-1で作成したプログラムに、以下のSwordクラスを追加したい。
ただしSwordクラスには以下の変更を加えなさい。
- Swordクラスをカプセル化する
- コンストラクタやSetterから剣の名前を代入するときに２文字以下であれば `名無し剣` とする

またHeroクラスにSword型のフィールドを追加してカプセル化する。
最後にProgB2.main()に変更を加えてカプセル化したコードで実行例のように動作するようにしなさい。

### Swordクラス（カプセル化前）
```java
public class Sword
{
    String name; // 剣の名前

    public Sword(String name)
    {
        this.name = name;
    }
}
```
### Heroクラス（参考：Heroクラスのカプセル化前にSwordクラスを追加した状態）
```java
public class Hero
{
    String name = "??";
    int hp = 0;
    Sword sword;

    public void run()
    {
        System.out.println(this.name + "は逃げ出した！");
    }
}
```

### ProgB2クラス（指示にあるクラスの追加・カプセル化後も同様の結果が得られるように変更する）
```java
public class ProgB2 {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "太郎";
        h.hp = 100;

        System.out.println("勇者" + h.name + " (HP:" + h.hp + ") が誕生した！");

        Sword sword = new Sword("こんぼう");
        h.sword = sword;

        System.out.println("勇者は" + h.sword.name + "を装備した！");
    }
}

```

### 実行例
```
勇者太郎 (HP:100) が誕生した！
勇者はこんぼうを装備した！
```