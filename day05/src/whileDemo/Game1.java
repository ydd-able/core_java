package whileDemo;

public class Game1 {
    public static void main(String[] args) {
        //打怪游戏 玩家300血量 怪物500血量
        //采用回合制游戏规则，玩家攻击力5-8之间 怪物攻击力3-5之间
        //知道有一方血量小于等于0，游戏结束了。
        int p = 310;
        int b = 500;
        int i = 1;
        while (true) {
            System.out.println("第"+(i++)+"个回合");
            int pg = (int) (Math.random() * (8 - 5 + 1)) + 5;
            int bg = (int) (Math.random() * (5 - 3 + 1)) + 3;
            b-=pg;//主宰还剩血量。
            System.out.println("玩家攻击暗影主宰，暗影主宰掉了" + pg + "点血,还剩" + b + "点血");
            if(b<=0){
                break;
            }
            p-=bg;//玩家还剩血量。
            System.out.println("暗影主宰攻击玩家，玩家掉了"+bg+"点血，还剩"+p+"点血");
            System.out.println("___________________________________________");
            if(p<=0){
                break;
            }


        }
//
        System.out.println(b<=0?"玩家胜利":"主宰胜利");

    }
}
