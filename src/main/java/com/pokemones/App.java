package com.pokemones;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hazte con todos!!!");

		TodosLosPokemon pokemon1 = new TodosLosPokemon();

		System.out.println("El pokemon se llama: " + pokemon1.nombre + " y es de tipo: " + pokemon1.tipo);

		TodosLosPokemon pokemon2 = new TodosLosPokemon("Squirtle", Tipo.AGUA);

		System.out.println("El pokemon se llama: " + pokemon2.nombre + " y es de tipo: " + pokemon2.tipo);

		TodosLosPokemon pokemon3 = new TodosLosPokemon("Charmander", Tipo.FUEGO);

		System.out.println("El pokemon se llama: " + pokemon3.nombre + " y es de tipo: " + pokemon3.tipo);

		TodosLosPokemon pokemon4 = new TodosLosPokemon("Bulbasaur", Tipo.PLANTA);

		System.out.println("El pokemon se llama: " + pokemon4.nombre + " y es de tipo: " + pokemon4.tipo);

	}
}