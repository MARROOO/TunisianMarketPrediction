package tn.educanet.stockmarket.persistence;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;


import java.util.HashMap;
import java.util.Map;
@Document(collection="limits")
public class Limit {
    private Double ask;
    private Integer askOrd;
    private Integer askQty;
    private Double bid;
    private Integer bidOrd;
    private Integer bidQty;
    private String id;
    private String isin;
    private Integer limit;
    private String seance;
    private String time;
	private String apiUrl;
	private String apiResponseJson;
    public Double getAsk() {
        return ask;
    }
    public void setAsk(Double ask) {
        this.ask = ask;
    }
    public Integer getAskOrd() {
        return askOrd;
    }
    public void setAskOrd(Integer askOrd) {
        this.askOrd = askOrd;
    }
    public Integer getAskQty() {
        return askQty;
    }
    public void setAskQty(Integer askQty) {
        this.askQty = askQty;
    }
    public Double getBid() {
        return bid;
    }
    public void setBid(Double bid) {
        this.bid = bid;
    }
    public Integer getBidOrd() {
        return bidOrd;
    }
    public void setBidOrd(Integer bidOrd) {
        this.bidOrd = bidOrd;
    }
    public Integer getBidQty() {
        return bidQty;
    }
    public void setBidQty(Integer bidQty) {
        this.bidQty = bidQty;
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
    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    public String getSeance() {
        return seance;
    }
    public void setSeance(String seance) {
        this.seance = seance;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
	public void setUrl(String apiUrl) {
		// TODO Auto-generated method stub
		this.apiUrl=apiUrl;
	}
	public void setResponseJson(String apiResponseJson) {
		// TODO Auto-generated method stub
		this.apiResponseJson=apiResponseJson;
	}
}