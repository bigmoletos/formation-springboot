# formation-springboot
WCS by jeremy
atelier Java spring Boot le 17 oct

 Tester l'application (CRUD fonctionne)
- Dans la classe Article
 - Ajouter l'annotation @Entity et @Table avec nom minuscule en paramètre, sur la classe
 - Ajouter les annotations @Id et @GeneratedValue avec strategy IDENTITY
 - Ajouter les annotations @Column avec le nom de la colonne en minuscule
- Dans le client mysql, créer une nouvelle base de données "wildemo"
- Ajouter un package "persistence" dans le package "fr.wcs.wildemo"
- Ajouter une interface ArticleRepository qui étend/hérite de l'interface JpaRepository<Article, Integer>
- Ajouter le nouveau package créé dans l'annotation @ComponentScan sur la classe WildemoApplication
- Modifier ArticleService
 - Supprimer la collection articles et le constructeur
 - Ajouter un membre de type ArticleRepository injecté (@Autowired)
 - Remplacer les appels à la collection articles par des appels au repository (modifié)
 $2a$10$gz78HDOrKRDbW4PczUgJWuASzZfc1rKv6srshTW4BAlMgl9VO0FLq 