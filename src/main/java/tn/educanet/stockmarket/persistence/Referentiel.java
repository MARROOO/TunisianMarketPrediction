package tn.educanet.stockmarket.persistence;

public class Referentiel {
	private String arabName;
    private String id;
    private String isin;
    private String stockName;
    private String ticker;
    private String valGroup;
    public String getArabName() {
        return arabName;
    }
    public void setArabName(String arabName) {
        this.arabName = arabName;
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
    public String getStockName() {
        return stockName;
    }
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
    public String getTicker() {
        return ticker;
    }
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }
    public String getValGroup() {
        return valGroup;
    }
    public void setValGroup(String valGroup) {
        this.valGroup = valGroup;
    }

}
