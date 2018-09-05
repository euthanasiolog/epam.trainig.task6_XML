package runner;

import entity.Card;
import parser.BuilderType;
import parser.XMLParserBuilder;
import parser.XMLParserBuilderFactory;
import java.util.Set;

/**
 * Created by piatr on 06.09.18.
 */
public class Runner {
    private static String FILENAME = "Card.xml";
    public static void main(String[] args) {
        XMLParserBuilderFactory factory = new XMLParserBuilderFactory();
        XMLParserBuilder builder = factory.getXMLParserBuilder(BuilderType.SAX);
        builder.buildSetCards(FILENAME);
        Set<Card> cards = builder.getCards();
        for (Card card:cards){
            System.out.println(card.toString());
        }
    }
}
