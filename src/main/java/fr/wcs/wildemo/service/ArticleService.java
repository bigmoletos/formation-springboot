package fr.wcs.wildemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.wcs.wildemo.entity.Article;

@Service
public class ArticleService {

	private List<Article> articles;
	private int count;

	public ArticleService() {
		this.count = 0;
		this.articles = new ArrayList<Article>(Arrays.asList(new Article(
				this.count++, "Article n°1",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque a eros vel ante dictum dignissim. Vivamus aliquam tellus non consequat bibendum. In aliquet justo quis ligula tristique, a ornare est porttitor. Curabitur mattis at dui vehicula interdum. Etiam pharetra arcu eu blandit convallis. Vivamus ac neque at arcu ultricies lacinia at a justo. Curabitur interdum hendrerit purus ut sodales. Duis eget nisl at est ullamcorper varius vitae sed odio. Proin dictum et sem at consectetur. Quisque pharetra lacus a sem facilisis volutpat. Proin at imperdiet mi. Aenean id odio vel quam laoreet semper sit amet et turpis. In vehicula nisi quis velit posuere sagittis. Duis quis dictum nibh. Fusce quis ipsum fermentum, congue nunc sed, auctor tellus."),
				new Article(this.count++, "Article n°2",
						"Vivamus sem dui, commodo eget velit eget, euismod venenatis ex. Nunc metus quam, tristique sed est nec, iaculis aliquam massa. Fusce nec porttitor ipsum. Donec rhoncus diam odio, id suscipit augue rhoncus sed. Interdum et malesuada fames ac ante ipsum primis in faucibus. Suspendisse malesuada arcu orci, nec dapibus leo feugiat id. Aenean porttitor tortor ac ante porttitor, a pharetra ex bibendum. Etiam sagittis libero sed tortor elementum, vel condimentum diam condimentum. Curabitur ut purus vitae mi gravida interdum."),
				new Article(this.count++, "Article n°3",
						"Ut dictum urna nunc, a sodales lacus sodales id. Aenean vitae mauris non lacus auctor porta at id augue. Proin sit amet sem sit amet est vehicula dapibus. Donec condimentum, dolor a dictum vehicula, risus sem mattis purus, sit amet volutpat mauris quam sit amet leo. Aliquam est sapien, lacinia eu ultrices consectetur, tristique ut odio. In sit amet ipsum at quam euismod feugiat. Phasellus vitae turpis vel leo gravida iaculis vel pharetra velit. Vestibulum justo erat, vulputate at ultricies eget, rhoncus ac magna."),
				new Article(this.count++, "Article n°4",
						"Maecenas eleifend ornare lorem. Sed posuere faucibus lorem eu sollicitudin. Fusce congue vestibulum ipsum eget facilisis. Vestibulum quis dapibus ligula. In elementum justo vel nibh dictum, a rhoncus nulla pellentesque. Quisque tellus sapien, semper porttitor fermentum vel, posuere ac dui. Cras non tristique est. Integer semper luctus massa. Nulla et placerat tortor, nec facilisis ante. Duis nec aliquam urna. Nulla condimentum sem ac ex venenatis rhoncus."),
				new Article(this.count++, "Article n°5",
						"Nam maximus ullamcorper metus, vel sagittis elit mattis laoreet. Morbi euismod urna et mauris vehicula dignissim. Nunc nec rhoncus dui. Donec a varius arcu. Nulla facilisi. Morbi ut gravida libero, a fringilla urna. Aliquam nec lorem a turpis mattis ultrices in sit amet enim. Proin nec nibh est. Cras dignissim cursus erat, id lobortis velit auctor in.")));
	}
	
	public List<Article> getAll() {
		return this.articles;
	}

	public void create(String title, String content) {
		this.articles.add(new Article(this.count++, title, content));
	}
	
	public Article read(int id) {
		Article result = null;
		int index = this.articles.indexOf(new Article(id, null, null));
		if (index >= 0) {
			result = this.articles.get(index);
		}
		return result;
	}
	
	public void update(Article article) {
		int index = this.articles.indexOf(article);
		if (index >= 0) {
			this.articles.set(index, article);
		}
	}

	public void delete(int id) {
		this.articles.remove(new Article(id, null, null));
	}
	
}
