package tn.educanet.stockmarket.persistence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class AllMarkets {
	private List<Market> markets = new ArrayList<Market>();
    private Integer sequance;
    private Integer sequence;
    public List<Market> getMarkets() {
        return markets;
    }
    public void setMarkets(List<Market> markets) {
        this.markets = markets;
    }
    public Integer getSequance() {
        return sequance;
    }
    public void setSequance(Integer sequance) {
        this.sequance = sequance;
    }
    public Integer getSequence() {
        return sequence;
    }
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
	

}

