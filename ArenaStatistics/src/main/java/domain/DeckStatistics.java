package domain;

import java.util.HashMap;
import java.util.Map;
import util.Mapper;

public class DeckStatistics {

    private final Map<DeckClass, Integer> decksByClass;
    private final Map<DeckClass, Integer> winsByClass;
    private final Map<Integer, Integer> decksByWins;
    private final Map<Integer, Integer> dustByWins;
    private final Map<Integer, Integer> goldByWins;
    private final Map<Integer, Integer> extraPacksByWins;
    private final Map<Integer, Integer> cardsByWins;
    private final Map<Integer, Integer> goldCardsByWins;
    private final Map<DeckClass, Double> avgWinsByClass;
    private final Map<DeckClass, Double> playPerAsClass;
    private final Map<Integer, Double> avgDustByWins;
    private final Map<Integer, Double> avgGoldByWins;
    private final Map<Integer, Double> avgExtraPacksByWins;
    private final Map<Integer, Double> avgCardsByWins;
    private final Map<Integer, Double> avgGoldCardsByWins;

    public DeckStatistics() {
        decksByClass = new HashMap();
        winsByClass = new HashMap();
        decksByWins = new HashMap();
        dustByWins = new HashMap();
        goldByWins = new HashMap();
        extraPacksByWins = new HashMap();
        cardsByWins = new HashMap();
        goldCardsByWins = new HashMap();
        avgWinsByClass = new HashMap();
        playPerAsClass = new HashMap();
        avgDustByWins = new HashMap();
        avgGoldByWins = new HashMap();
        avgExtraPacksByWins = new HashMap();
        avgCardsByWins = new HashMap();
        avgGoldCardsByWins = new HashMap();
        mapZeroesToValues();
    }

    private void mapZeroesToValues() {
        Mapper.mapZeroesToADeckClassIntegerMap(decksByClass);
        Mapper.mapZeroesToADeckClassIntegerMap(winsByClass);
        Mapper.mapZeroesToADeckClassDoubleMap(avgWinsByClass);
        Mapper.mapZeroesToADeckClassDoubleMap(playPerAsClass);
        mapZeroesToIntegerIntegerMaps();
        mapZeroesToIntegerDoubleMaps();
    }

    private void mapZeroesToIntegerIntegerMaps() {
        Mapper.mapZeroesToIntegerIntegerMap(decksByWins);
        Mapper.mapZeroesToIntegerIntegerMap(dustByWins);
        Mapper.mapZeroesToIntegerIntegerMap(goldByWins);
        Mapper.mapZeroesToIntegerIntegerMap(extraPacksByWins);
        Mapper.mapZeroesToIntegerIntegerMap(cardsByWins);
        Mapper.mapZeroesToIntegerIntegerMap(goldCardsByWins);
    }

    private void mapZeroesToIntegerDoubleMaps() {
        Mapper.mapZeroesToIntegerDoubleMap(avgDustByWins);
        Mapper.mapZeroesToIntegerDoubleMap(avgGoldByWins);
        Mapper.mapZeroesToIntegerDoubleMap(avgExtraPacksByWins);
        Mapper.mapZeroesToIntegerDoubleMap(avgCardsByWins);
        Mapper.mapZeroesToIntegerDoubleMap(avgGoldCardsByWins);
    }

    public Map<Integer, Double> getAvgDustByWins() {
        return avgDustByWins;
    }

    public Map<Integer, Double> getAvgExtraPacksByWins() {
        return avgExtraPacksByWins;
    }

    public Map<Integer, Double> getAvgGoldByWins() {
        return avgGoldByWins;
    }

    public Map<DeckClass, Double> getAvgWinsByClass() {
        return avgWinsByClass;
    }

    public Map<DeckClass, Integer> getDecksByClass() {
        return decksByClass;
    }

    public Map<Integer, Integer> getDecksByWins() {
        return decksByWins;
    }

    public Map<Integer, Integer> getDustByWins() {
        return dustByWins;
    }

    public Map<Integer, Integer> getExtraPacksByWins() {
        return extraPacksByWins;
    }

    public Map<Integer, Integer> getGoldByWins() {
        return goldByWins;
    }

    public Map<DeckClass, Double> getPlayPerAsClass() {
        return playPerAsClass;
    }

    public Map<Integer, Double> getAvgCardsByWins() {
        return avgCardsByWins;
    }

    public Map<Integer, Double> getAvgGoldCardsByWins() {
        return avgGoldCardsByWins;
    }

    public Map<Integer, Integer> getCardsByWins() {
        return cardsByWins;
    }

    public Map<Integer, Integer> getGoldCardsByWins() {
        return goldCardsByWins;
    }

    public Map<DeckClass, Integer> getWinsByClass() {
        return winsByClass;
    }
    
}
