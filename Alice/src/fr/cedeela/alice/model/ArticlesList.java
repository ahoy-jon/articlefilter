package fr.cedeela.alice.model;

public interface ArticlesList {
	
	/**
	 * Update the list of articles, according to the time set to read
	 * 
	 * @param expectedReadingDurationInMinutes
	 */
	public void updateArticlesList(int expectedReadingDurationInMinutes);
	
	/**
	 * Setup the articles list
	 */
	public void setupArticlesList();
	
	/**
	 * Save the articles list in a database
	 */
	public void saveArticlesList();
	
	/**
	 * Delete the selected article from the articles list
	 * 
	 * @param article the selected article
	 */
	public void deleteArticle(Article article);
	
	/**
	 * Delete all the articles from the list
	 */
	public void deleteAllArticles();
	
	/**
	 * 
	 * 
	 * @param article
	 */
	public void deleteAllArticlesBefore(Article article);

}
