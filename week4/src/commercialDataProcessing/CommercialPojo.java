package commercialDataProcessing;

public class CommercialPojo {
	private String companyName;
	private String symbol;
	private int symbolValue;
	
	public CommercialPojo(String companyName, String symbol, int symbolValue) {
		this.companyName=companyName;
		this.symbol = symbol;
		this.symbolValue = symbolValue;
	
	}
	

	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public int getSymbolValue() {
		return symbolValue;
	}
	public void setSymbolValue(int symbolValue) {
		this.symbolValue = symbolValue;
	}

}
