import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entidades.Comment;
import entidades.Post;

public class Main{
	
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		//Mexeu com Data, nada melhor que o SDF - SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Hi");
		
		
		Comment comentarios = new Comment("Have a nice Day");
		Comment MaisUmComentario = new Comment("Bons Estudos!");
		
		Post boraPostar = new Post(sdf.parse("25/04/2021 19:33:01"), "One Titulo", "Estou brincando com instancias", 12 );
	
		boraPostar.addComment(comentarios);
		boraPostar.addComment(MaisUmComentario);
		
		System.out.println(boraPostar);
		
		
		System.out.println();
		System.out.println("Digite dois comentarios!!");
		
		Comment comentarios2 = new Comment(sc.next());
		Comment MaisUmComentario2 = new Comment(sc.next());
		
		Post boraPostar2 = new Post(sdf.parse("25/04/2021 19:33:01"), "Second Titulo", "Estou brincando com instancias2", 6 );
		
		boraPostar2.addComment(comentarios2);
		boraPostar2.addComment(MaisUmComentario2);
		
		System.out.println(boraPostar2);
		sc.close();
	}
}