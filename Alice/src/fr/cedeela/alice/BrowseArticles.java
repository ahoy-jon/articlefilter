package fr.cedeela.alice;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import fr.cedeela.alice.model.Article;
import fr.cedeela.alice.model.ArticlesList;

public class BrowseArticles extends Activity {
	
	private ArticlesList articles;
	private Article articleCurrentlyRead;
	private int expectedReadingDurationInMinutes;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_browse_articles);
		
	}

	@Override
	protected void onStart() {
		// load connection in articles
		articles.setupArticlesList();
		// update articles
		articles.updateArticlesList(expectedReadingDurationInMinutes);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.browse_articles, menu);
		return true;
	}

}
