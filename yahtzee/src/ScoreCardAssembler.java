
public class ScoreCardAssembler {
	
	public static ScoreCard assembleScoreCard(){
		ScoreCard card = new ScoreCard();
		
		/*card.addLine(new ScoreCardLine("1's", "Scored as total of all 1's"));
		card.addLine(new ScoreCardLine("2's", "Scored as total of all 2's"));
		card.addLine(new ScoreCardLine("3's", "Scored as total of all 3's"));
		card.addLine(new ScoreCardLine("4's", "Scored as total of all 4's"));
		card.addLine(new ScoreCardLine("5's", "Scored as total of all 5's"));
		card.addLine(new ScoreCardLine("6's", "Scored as total of all 6's"));
		card.addLine(new ScoreCardLine("3 of a kind", "Scored as total of all dice"));
		card.addLine(new ScoreCardLine("4 of a kind", "Scored as total of all dice"));
		card.addLine(new ScoreCardLine("Small Straight", "Scored as 30 points"));
		card.addLine(new ScoreCardLine("Large Straight", "Scored as 40 points"));
		card.addLine(new ScoreCardLine("Full House", "Scored as 25 points"));
		card.addLine(new ScoreCardLine("Yahtzee", "Scored as 50 points"));*/
        card.addLine(new ScoreCardLine(Category.CHANCE, "Chance", "Scored as total of all dice"));
        card.addLine(new ScoreCardLine(Category.ONE_PAIR, "One Pair", "Scored as total of all dice"));
		return card;
	}

}
