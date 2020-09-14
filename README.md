# Trabalho Factory Method

Feito com o intuito de aprender o design pattern Factory Method.

## Sobre:

O padrão Factory Method, contém os seguintes elementos:

- Creator(Criador abstrato) — declara o factory method (método de fabricação) que retorna o objeto da classe Product (produto). Este elemento também pode definir uma implementação básica que retorna um objeto de uma classe ConcreteProduct (produto concreto) básica;
- ConcreteCreator(Criador concreto) — sobrescreve o factory method e retorna um objeto da classe ConcreteProduct;
- Product(Produto abstrato) — define uma interface para os objectos criados pelo factory method;
- ConcreteProduct(Produto concreto) — uma implementação para a interface Product.

![Factory_Method_UML_class_diagram](https://user-images.githubusercontent.com/41343708/92502279-0658ce00-f1d6-11ea-95fc-b6c32a2bf77a.png)

## Exemplos

Primeiro é criada a interface que define o polígono.
```java
public interface Polygon {
    Integer getNumberOfSides();
}
```
Com a interface, nós criamos as implementações.
```java
public class Triangle implements Polygon {
    public Integer getNumberOfSides() {
		return 3;
	}
}

public class Square implements Polygon {
    public Integer getNumberOfSides() {
		return 4;
	}
}

public class Pentagon implements Polygon {
    public Integer getNumberOfSides() {
		return 5;
	}
}
```
Agora, criamos o factory, que sabe exatamente qual classe instanciar.
```java
public class PolygonFactory {
    public static Polygon getPolygon(int numberOfSides) {
		if (numberOfSides == 3) {
			return new Triangle();
		}
		if (numberOfSides == 4) {
			return new Square();
		}
		if (numberOfSides == 5) {
			return new Pentagon();
		}
	}
}

```
