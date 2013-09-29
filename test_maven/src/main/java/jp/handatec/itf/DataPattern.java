package jp.handatec.itf;

public class DataPattern {
	private String id;
	private String info;
	private String pattern;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
	public String toString() {
		return "id:" + id + " info:" + info + " pattern:" + pattern;
	}
	
}
