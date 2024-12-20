# Leap Year Kata

## Description
Le **Leap Year Kata** est un exercice de codage conçu pour pratiquer le **Développement Dirigé par les Tests (TDD)**. L'objectif est d'implémenter un programme qui détermine si une année donnée est une année bissextile ou non, selon des règles bien définies.

## Règles
1. Une année est bissextile si elle est divisible par 4.
2. Une année n'est **pas** bissextile si elle est divisible par 100 mais **pas** par 400.
3. Toutes les autres années ne sont pas bissextiles.

### Exemple de résultats
Pour les années suivantes :

- 1997 : Non bissextile.
- 1996 : Bissextile.
- 1900 : Non bissextile.
- 2000 : Bissextile.

---

## Objectifs
- S'entraîner au **TDD** en écrivant des tests avant d'implémenter la logique.
- Se familiariser avec les frameworks de test unitaire comme **JUnit**.
- Améliorer ses compétences en refactoring et en écriture de code propre et lisible.

---

## Comment utiliser

### Pré-requis
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
