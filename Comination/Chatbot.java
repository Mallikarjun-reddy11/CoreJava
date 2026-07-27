package Comination;

public class Chatbot {
private int id;
private String name;
private String version;
private String dpname;
private String apikey;
public Chatbot(int id,String name, String version,String dpname,String apikey) {
	this.id=id;
	this.name=name;
	this.version=version;
	this.dpname=dpname;
	this.apikey=apikey;
}
public void getid(int id) {
	this.id=id;
}
public void getname(String name) {
	this.name=name;
	
}
public void getversion(String version ) {
	this.version=version;
}
public void getdpname(String dpname) {
	this.dpname=dpname;
}
public void getapikey(String apikey) {
	this.apikey=apikey;
}
void display1() {
	System.out.println("Bot ID: "+id);
	System.out.println("Bot Name: "+name);
	System.out.println("Bot Version: "+version);
	System.out.println("Bot Developer Name: "+dpname);
	System.out.println("Bot API Key : "+apikey);
	System.out.println();
}
void display() {
	System.out.println("Chatbot platform has been processed.......");
}
}
