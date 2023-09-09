package tn.educanet.stockmarket.persistence;

	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;
@Document
	public class AllIntradays {
	    private List<Intraday> intradays = new ArrayList<Intraday>();
	    private Integer sequance;
	    private Integer sequence;
	    public List<Intraday> getIntradays() {
	        return intradays;
	    }
	    public void setIntradays(List<Intraday> intradays) {
	        this.intradays = intradays;
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

