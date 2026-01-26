package com.kaua.reviewpoo.miniprojetos.assistindovideo;

public class MainYoutube {
	public static void main(String[] args) {

        Video v1 = new Video("Aula 01 - Java POO");
        Video v2 = new Video("Aula 20 - MySQL");
        Video v3 = new Video("Spring Boot do Zero");

        YoutubeUsuario u1 = new YoutubeUsuario("Kaua", 19, "Masculino", "Kaauazinho12");
        YoutubeUsuario u2 = new YoutubeUsuario("Japa", 12, "Masculino", "Jappaa");

        Visualizacao vis1 = new Visualizacao(u1, v1);
        vis1.avaliar(9);

        Visualizacao vis2 = new Visualizacao(u1, v2);
        vis2.avaliar(80f);

        Visualizacao vis3 = new Visualizacao(u2, v1);
        vis3.avaliar();

        Visualizacao vis4 = new Visualizacao(u2, v3);
        vis4.avaliar(10);

        v1.like();
        v1.like();
        v3.like();

        System.out.println("=== VIDEOS ===");
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        System.out.println("\n=== USUÁRIOS ===");
        System.out.println(u1);
        System.out.println(u2);
	}
}
