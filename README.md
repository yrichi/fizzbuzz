# FizzBuzz Kata

## Description
Le **FizzBuzz Kata** est un exercice de codage simple conçu pour pratiquer le **Développement Dirigé par les Tests (TDD)**. L'objectif est d'implémenter un programme qui produit des nombres ou des mots spécifiques selon des règles de divisibilité.

## Règles
1. Afficher "Fizz" pour les nombres divisibles par 3.
2. Afficher "Buzz" pour les nombres divisibles par 5.
3. Afficher "FizzBuzz" pour les nombres divisibles à la fois par 3 et par 5.
4. Afficher le nombre lui-même si aucune des conditions ci-dessus n'est remplie.

### Exemple de sortie
Pour les nombres de 1 à 15 :

```
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
```

---

## Objectifs
- S'entraîner au **TDD** en écrivant des tests avant d'implémenter la logique.
- Se familiariser avec les frameworks de test unitaire comme **JUnit**.
- Améliorer ses compétences en refactoring et en écriture de code propre et lisible.

---

## Comment utiliser

### Pré-requis
- **Java Development Kit (JDK)** installé (Java 11 ou version supérieure recommandée).
- Un outil de build comme **Maven** ou **Gradle** (facultatif).
- **JUnit 5** pour les tests.


### Exécution des tests
Exécutez les tests via l'outil intégré de votre IDE ou depuis la ligne de commande :

- Gradle :
  ```bash
  gradle test
  ```

---

## Cycle de développement
Suivez le cycle **Rouge-Vert-Refactor** du TDD :

1. **Rouge** : Écrivez un test qui échoue pour une nouvelle exigence.
2. **Vert** : Écrivez le code minimal pour faire passer le test.
3. **Refactor** : Améliorez le code tout en vous assurant que tous les tests restent verts.

---