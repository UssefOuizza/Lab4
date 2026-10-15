# TP : Gestion de l'héritage en JPA / Hibernate

---

### 1. Création des tables (DDL)
Génération automatique du schéma par Hibernate lors du démarrage de l'application, illustrant la structure propre à chaque stratégie (notamment la table unique `Vehicule` avec la colonne discriminante `vehicule_type`).

![Création des tables par Hibernate](Lab4/Screenshot%201.png)

---

### 2. Insertion des entités (CRUD)
Exécution des requêtes SQL `INSERT` lors de la persistance des différentes entités en base de données.

![Insertion des entités en base de données](Lab4/Screenshot%202.png)

---

### 3. Requêtes polymorphiques et affichage
Lecture et affichage console des entités polymorphiques, montrant la requête avec jointure (`LEFT OUTER JOIN`) générée pour la stratégie `JOINED`.

![Requêtes polymorphiques et affichage console](Lab4/Screenshot%203.png)

---

### 4. Nettoyage de la base de données
Suppression automatique des tables et séquences lors de la fermeture de la session grâce à la propriété `create-drop`.

![Suppression des tables à la fermeture](Lab4/Screenshot%204.png)
