package tn.educanet.stockmarket.persistence;
	import java.util.HashMap;

	import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;
	@Document(collection="Intraday")
	public class Intraday {
	    private Integer caps;
	    private Double change;
	    private String id;
	    private String isin;
	    private Double last;
	    private Object referentiel;
	    private String seance;
	    private Integer seq;
	    private String time;
	    private Integer volume;
	    public Integer getCaps() {
	        return caps;
	    }
	    public void setCaps(Integer caps) {
	        this.caps = caps;
	    }
	    public Double getChange() {
	        return change;
	    }
	    public void setChange(Double change) {
	        this.change = change;
	    }
	    public String getId() {
	        return id;
	    }
	    public void setId(String id) {
	        this.id = id;
	    }
	    public String getIsin() {
	        return isin;
	    }
	    public void setIsin(String isin) {
	        this.isin = isin;
	    }
	    public Double getLast() {
	        return last;
	    }
	    public void setLast(Double last) {
	        this.last = last;
	    }
	    public Object getReferentiel() {
	        return referentiel;
	    }
	    public void setReferentiel(Object referentiel) {
	        this.referentiel = referentiel;
	    }
	    public String getSeance() {
	        return seance;
	    }
	    public void setSeance(String seance) {
	        this.seance = seance;
	    }
	    public Integer getSeq() {
	        return seq;
	    }
	    public void setSeq(Integer seq) {
	        this.seq = seq;
	    }
	    public String getTime() {
	        return time;
	    }
	    public void setTime(String time) {
	        this.time = time;
	    }
	    public Integer getVolume() {
	        return volume;
	    }
	    public void setVolume(Integer volume) {
	        this.volume = volume;
	    }
	}

