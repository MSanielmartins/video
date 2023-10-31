package aula14B;

public class Main {

	public static void main(String[] args) {
		Video v [] = new Video[3];
		v[0] = new Video("curso em video");
		v[1] = new Video("video de php");
		v[2] = new Video("video de Html");
		
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("joao",18,"M","joaozin");
		g[1] = new Gafanhoto("Maria",20, "f", "mari");
		
		
		
		
		Visualizacao vis[] = new Visualizacao[5];
		
		vis[0] = new Visualizacao(g[0],v[1]);
		System.out.println(vis[0].toString());
		
		vis[1] = new Visualizacao(g[0], v[1]);
		System.out.println(vis[1].toString());
		
	}
	
 

}
