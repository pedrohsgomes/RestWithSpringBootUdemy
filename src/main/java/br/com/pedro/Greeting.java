package br.com.pedro;

/***
 * 
 * @author pedro - 2021/11/18 11:34:48
 *
 */
public class Greeting {
	
	private final long id;
	private final String content;
	
	public long getId() {
		return id;
	}
	
	public String getContent() {
		return content;
	}
	
	public Greeting(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
}
