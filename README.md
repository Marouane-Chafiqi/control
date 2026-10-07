# contrats d'assurance

Petit projet Java qui utilise Hibernate et MySQL pour gérer des clients, des assurances et des contrats.

## Fonctionnement

- Un client peut souscrire plusieurs contrats.
- Une assurance peut être liée à plusieurs contrats.
- Un contrat a un statut : `ACTIF`, `SUSPENDU` ou `RESILIE`.

Les tables `client`, `assurance` et `contrat` sont créées automatiquement par Hibernate au lancement.


## Structure

- `entities` : les classes `Client`, `Assurance`, `Contrat` et l'énumération `StatutContrat`
- `dao` : `AbstractFacade` (create, edit, remove, find, findAll, count) et une facade par entité
- `util` : `HibernateUtil` qui ouvre la connexion à la base
- `Main` : exemple qui ajoute un client, une assurance et un contrat, puis les affiche

## Lancer le projet

1. Démarrer MySQL depuis XAMPP.
2. Ouvrir le projet dans IntelliJ et laisser Maven télécharger les dépendances.
3. Lancer la classe `Main`.

La base `control_db` est créée si elle n'existe pas. L'utilisateur est `root` sans mot de passe, à modifier dans `src/main/resources/hibernate.cfg.xml` si besoin.

# execution & BD
<img width="1111" height="495" alt="Capture d&#39;écran 2026-10-07 121546" src="https://github.com/user-attachments/assets/045f732c-5b31-4fd7-9269-143798912768" />

<img width="532" height="378" alt="Capture d&#39;écran 2026-10-07 121513" src="https://github.com/user-attachments/assets/ac8b1a64-6aae-41a4-be16-53c71713f1e0" />

