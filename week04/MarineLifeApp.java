package week04;

// 1. 父類別 (如果別的檔案已經定義過 MarineLife，這裡可以不用再寫，或者改名)
// 假設這是你這個檔案專用的父類別，我們加個 Parent 辨別
class MarineLife {
    protected String name;
    protected String habitat;

    public MarineLife(String name, String habitat) {
        this.name = name;
        this.habitat = habitat;
    }

    public String info() {
        return name + "，棲息地：" + habitat;
    }

    public String move() {
        return name + " 在水中移動";
    }
}

class Fish extends MarineLife {
    private String scaleColor;
    public Fish(String name, String habitat, String scaleColor) {
        super(name, habitat);
        this.scaleColor = scaleColor;
    }
    @Override
    public String move() { return name + " 擺動魚鰭游泳"; }
    public String fishInfo() { return info() + " 鱗片：" + scaleColor; }
}

class Whale extends MarineLife {
    private final double length;
    public Whale(String name, String habitat, double length) {
        super(name, habitat);
        this.length = length;
    }
    @Override
    public String move() { return name + " 擺動尾鰭前進"; }
    public String whaleInfo() { return info() + " 體長：" + length + " 公尺"; }
}

// 2. 主程式類別：改名為 MarineLifeApp 以解決 "already defined" 衝突
public class MarineLifeApp { 
    public static void main(String[] args) {
        System.out.println("=== 海洋生物觀察日誌 ===\n");

        // 多型應用
        MarineLife[] creatures = {
            new Fish("小丑魚", "珊瑚礁", "橘白相間"),
            new Whale("藍鯨", "太平洋", 30.0)
        };

        for (MarineLife c : creatures) {
            System.out.println(c.move());
        }

        System.out.println("\n--- 個別詳細資訊 ---");
        Fish nemo = new Fish("小丑魚", "珊瑚礁", "橘白相間");
        System.out.println(nemo.fishInfo());
    }
}