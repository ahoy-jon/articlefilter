package fr.cedeela.alice.model;

public class Article {

	// url to open if we open the article
	private String url;
	// the title of the article, to be displayed in list of articles
	private String title;
	// interest of the article
	/*
	 * -1 -> title not interesting
	 * 0 -> title interesting, but not content
	 * 1 -> content interesting
	 */
	private int interest;
	
	// status of the article
	/*
	 * -1 -> Deleted
	 * 0 -> toBeRead
	 * 1 -> Read
	 */
	private int status;
	
	/**
	 * Create an article given an url
	 * 
	 * @param url the url which point to the article
	 */
	public Article(String url) {
		this.status = 0;
		this.url = url;
	}
	
	/**
	 * Function to be called if the article is deleted from the article list
	 */
	public void delete() {
		this.status = -1;
		this.interest = -1;
	}
	
}
