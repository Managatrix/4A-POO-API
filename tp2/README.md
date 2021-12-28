# Compte Rendu TP2 et TP4 - POO, API et Outillages

### Lien du projet GitHub : https://github.com/Managatrix/4A-POO-API/tree/main/tp2

<br>

## Etape 5 :

Description succinte de chaque dépendance utilisée dans le projet.

* Web : permet de créer des application web en modèle MVC (Model View Controller).

* Hibernate : est un ORM (Mapping Objet-Relationnel) ce qui permet de lier une base de données relationnelle à un système orienté objet.
* JPA (Java Persistance API) : est la fondation de Hibernate.
* H2 : est un SGBD (Système de Gestion de Base de Données).
* DevTools : apporte différents outils pour la programmation tels que le LiveReload (rechargement automatique de la page si elle a été modifiée) et le relancement automatique de la compilation lorsqu'un fichier du projet est modifié.
* Thymeleaf : permet notamment de créer des templates HTML et de facilement travailler avec des objets Java.

___

## Etape 13 :

1. Avec quelle partie du code avons-nous paramétré l’url d’appel /greeting ?
>@GetMapping("/greeting")
2. Avec quelle partie du code avons-nous choisi le fichier HTML à afficher ?
>return "greeting";
3. Comment envoyons-nous le nom à qui nous disons bonjour avec le second lien ?

Le nom est envoyé par la méthode GET et donc se retrouve dans l'URL en passant par la clé ``name``.
>http://localhost:9090/greeting?name=ENSIM

___

## Etape 17 :

Après avoir ajouté la classe ``Address``, on la retrouve sous forme de *table* dans l'interface de H2.

___

## Etape 18 :

La nouvelle table a pu apparaître grâce à l'annotation ``@Entity`` qui informe à Hibernate que c'est une entité de la base de données. Par défaut, c'est une table.

___

## Etape 20 :

>SELECT * FROM address;

Cette requête permet de voir tout le contenu de ``data.sql``.

___

## Etape 23 :

>@Autowired

Cette annotation est la base de l'injection de dépendances.

___

## Partie 2 - Etape 6 :

* Faut-il une clé API pour appeler MeteoConcept ?

Oui, il faut créer un compte auprès de MeteoConcept pour demander une clé d'API ``token``. Cette clé sera utilisée dans toutes les requêtes.

* Quelle URL appeler ?

L'URL de base de MeteoConcept est ``https://api.meteo-concept.com/api/``.

* Quelle méthode HTTP utiliser ?

On utilise la méthode ``GET``. C'est imposé par l'API MeteoConcept.

* Comment passer les paramètres d’appels ?

Les paramètres d'appels sont à la suite de l'URL. Par exemple pour utiliser le paramètre ``insee``, on écrit ``?insee=35238``. Plusieurs paramètres à la suite sont séparés par un ``&``.
<br>Exemple de requête : ``https://api.meteo-concept.com/api/observations/around?token=7e8b559bf6bc23298e6db076cab9cd50abd8a4945d70d6cad630d29b5b92d7c5&insee=04068``.

* Où est l’information dont j’ai besoin dans la réponse :

Un fichier JSON est retourné par la requête. Par exemple :
<br>Pour afficher la température du lieu visé par les coordonnées GPS, on va chercher l'attribut ``observation.temperature.value``.
<br>Pour afficher la prévision de météo du lieu visé par les coordonnées GPS, on va chercher l'attribut ``forecast.weather``.