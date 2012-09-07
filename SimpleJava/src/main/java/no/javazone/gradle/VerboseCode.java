package no.javazone.gradle;

public class VerboseCode {
	private String name;
	private String text;
	
	public VerboseCode(String name, String text) {
		this.name = name;
		this.text = text;
		int i = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public String getText() {
		return text;
	}
}