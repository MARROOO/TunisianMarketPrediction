package tn.educanet.stockmarket.persistence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="allMarkets")
public class AllLimits {


	    private List<Limit> limits = new ArrayList<Limit>();
	    private Integer sequance;
	    private Integer sequence;
	    public List<Limit> getLimits() {
	        return limits;
	    }
	    public void setLimits(List<Limit> limits) {
	        this.limits = limits;
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

