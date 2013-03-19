package fr.cedeela.alice.model;

import java.util.List;

import twitter4j.Twitter;

public class ArticlesListTwitterImpl implements ArticlesList  {
	
	private final static String ConsumerKey = "q0R0EhFLLBWbEC3qKukXQ";
	private final static String ConsumerSecret = "WFbZHNDqPlQv6qoCcGsAQYA582Sa6KgbDLqytuoo";
	
	private int timestampLastUpdate;
	private Twitter twitter;
	private List<Article> articles;
	
	@Override
	public void updateArticlesList(int expectedReadingDurationInMinutes) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setupArticlesList() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void saveArticlesList() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteArticle(Article article) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAllArticles() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAllArticlesBefore(Article article) {
		// TODO Auto-generated method stub
		
	}

}
