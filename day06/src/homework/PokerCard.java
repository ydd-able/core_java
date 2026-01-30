package homework;
//使用二维数组生成一副扑克牌（除去大王，小王）。
public class PokerCard {
    public static void main(String[] args) {
        String[][] cards = new String[4][13];
        String[] types = {"黑桃","红桃","梅花","方块"};
        String[] playCards = {"A","K","Q","J","10","9",
                "8","7","6","5","4","3","2","1"};
        for (int i = 0; i <cards.length ; i++) {
            for(int j = 0;j<cards[i].length;j++){
                cards[i][j] = types[i]+playCards[j];
            }

        }
        for (String[] card : cards) {
            for (String s : card) {
                System.out.print(s+"\t");

            }
            System.out.println();

        }
    }
}
