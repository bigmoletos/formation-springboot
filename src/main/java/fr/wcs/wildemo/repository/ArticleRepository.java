package fr.wcs.wildemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.wcs.wildemo.entity.Article;

@Repository
public interface ArticleRepository
		extends JpaRepository<Article, Integer> {

}
