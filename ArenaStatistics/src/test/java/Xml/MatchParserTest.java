package Xml;

import domain.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MatchParserTest {

    MatchParser parser;
    Match match1;
    Match match2;
    Match match3;
    Match match4;
    Match match5;
    Match match6;
    Match match7;
    Match match8;
    Match match9;
    
    public MatchParserTest() {
        parser = new MatchParser("src/main/resources/MatchParseTest.xml");
        parser.addValues();
        match1 = parser.getMatches().get(0);
        match2 = parser.getMatches().get(1);
        match3 = parser.getMatches().get(2);
        match4 = parser.getMatches().get(3);
        match5 = parser.getMatches().get(4);
        match6 = parser.getMatches().get(5);
        match7 = parser.getMatches().get(6);
        match8 = parser.getMatches().get(7);
        match9 = parser.getMatches().get(8);
       
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void childlist_is_empty_if_invalid_filepath() {
        XmlParser parser = new MatchParser("sdasfafs");
        assertEquals(0, parser.childlist.size());
    }
    
    @Test
    public void parses_all_matches() {
        assertEquals(9, parser.getMatches().size());
    }

    @Test
    public void match_has_correct_opponent_class1() {
        assertEquals(DeckClass.MAGE, match1.getOpponentDeckClass());
    }
    
    @Test
    public void match_has_correct_opponent_class2() {
        assertEquals(DeckClass.HUNTER, match2.getOpponentDeckClass());
    }
    
    @Test
    public void match_has_correct_opponent_class3() {
        assertEquals(DeckClass.SHAMAN, match3.getOpponentDeckClass());
    }
    
    @Test
    public void match_has_correct_opponent_class4() {
        assertEquals(DeckClass.PRIEST, match4.getOpponentDeckClass());
    }

    @Test
    public void match_has_correct_opponent_class5() {
        assertEquals(DeckClass.WARLOCK, match5.getOpponentDeckClass());
    }
    
    @Test
    public void match_has_correct_opponent_class6() {
        assertEquals(DeckClass.PALADIN, match6.getOpponentDeckClass());
    }
    
    @Test
    public void match_has_correct_opponent_class7() {
        assertEquals(DeckClass.WARRIOR, match7.getOpponentDeckClass());
    }
    
    @Test
    public void match_has_correct_opponent_class8() {
        assertEquals(DeckClass.DRUID, match8.getOpponentDeckClass());
    }
    
    @Test
    public void match_has_correct_opponent_class9() {
        assertEquals(DeckClass.ROGUE, match9.getOpponentDeckClass());
    }

    @Test
    public void match_has_correct_opponent_name1() {
        assertEquals("Dennis", match1.getOpponentName());
    }
   
    @Test
    public void match_has_correct_opponent_name2() {
        assertEquals("", match6.getOpponentName());
    }

    @Test
    public void match_has_correct_outcome1() {
        assertEquals(Outcome.WIN, match1.getOutcome());
    }

    @Test
    public void match_has_correct_outcome2() {
        assertEquals(Outcome.LOSS, match2.getOutcome());
    }

    @Test
    public void match_has_correct_outcome3() {
        assertEquals(Outcome.DISCONNECT, match3.getOutcome());
    }
    
    @Test
    public void match_has_correct_outcome4() {
        assertEquals(Outcome.TIE, match6.getOutcome());
    }

    @Test
    public void match_has_correct_wentFirst_boolean1() {
        assertEquals(true, match1.wentFirst());
    }

    @Test
    public void match_has_correct_wentFirst_boolean2() {
        assertEquals(false, match2.wentFirst());
    }

    @Test
    public void match_has_correct_deck_number() {
        assertEquals(1, match1.getDeckNumber());
    }

    @Test
    public void match_has_correct_match_number() {
        assertEquals(2, match1.getMatchNumber());
    }
}
