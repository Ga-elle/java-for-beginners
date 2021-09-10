# Débutez la programmation avec Java

[Openclassroom tutorial]<https://openclassrooms.com/fr/courses/6173501-debutez-la-programmation-avec-java/>

## Types et déclaration de variable

- la déclartion du type permet d'allouer seulement l'espace mémoire nécessaire
- double est 2 fois plus précis que float
- String est une classe (commence par une majuscule): il définit un état (stockage de la chaine de caractères) et un comportement (ensemble des méthodes qu'on peut lui appliquer). Référence: [page java doc]<https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html>


## Les classes

Classes de modèle. Exemple: String

Classes utilitaires.


## Niveaux de contrôle

*Tous les éléments de code (variables, classes, et membres de classe) ont des niveaux de contrôle qui sont affectés explicitement ou par défaut. Le "paramètre par défaut" est plus restrictif que public ou protégé.*

- public: visible pour tous et par conséquent le moins restrictif
- protected: visible pour le package et l'ensemble des sous-classes
- package-protected: généralement visible uniquement par le package dans lequel il se trouve (paramètres par défaut)
- private: accessible uniquement dans le contexte dans lequel les variables sont définies (à l'intérieur de la classe dans laquelle il est situé)

### Hiérarchie de contrôle

Un élément peut avoir le même niveau de contrôle ou un niveau de contrôle plus restrictif que son élément contenant. Cela signifie que tous les éléments d'une classe peuvent être du même niveau d'exposition d'un niveau inférieur.


## Exécution

### Hello world example

```
javac hello\HelloWorld.java
Java hello.HelloWorld
```

```
javac conditions\ConditionalHello.java
Java conditions.ConditionalHello Me
```

### Classes et héritages

```
javac animal\HelloWorld.java
Java hello.HelloWorld
```

### Exceptions avec l'exemple des temperatures

```
javac exceptions/*.java
java exceptions.TemperatureAverage 4 7 9 16
java exceptions.TemperatureAverage 4 7
java exceptions.TemperatureAverage
java exceptions.TemperatureAverageWithCheckForEmptyList
java exceptions.TemperatureAverageWithExceptionWarning
```

Comment gérer les exceptions ? En utilisant un try/catch:
```
try {

}
catch (ExceptionName e) {

}
```


## Bonnes pratiques

- Nettoyer la fonction main. A noter que parfois la fonction main() n'est même pas accessible (kit de dev android ou spring framework)
