package kenming.casestudy.turtlestore.model;

public class 烏龜商品 {
	
	private String 編號;
	private String 龜名;
	private int  價格;
	private int  數量;
	
	public String get編號() {
		return 編號;
	}
	public void set編號(String Id) {
		this.編號 = Id;
	}
	public String get龜名() {
		return 龜名;
	}
	public void set龜名(String 龜名) {
		this.龜名 = 龜名;
	}
	public int get價格() {
		return 價格;
	}
	public void set價格(int 價格) {
		this.價格 = 價格;
	}
	public int get數量() {
		return 數量;
	}
	public void set數量(int 數量) {
		this.數量 = 數量;
	}	
}