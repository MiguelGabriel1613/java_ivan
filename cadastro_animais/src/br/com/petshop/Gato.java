package br.com.petshop;

	public class Gato extends Animal {
		private String corPelo;
		
		public Gato(String nome, int idade, String corPelo) {
			super(nome, idade);
			this.corPelo = corPelo;
		}
}
