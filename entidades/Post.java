package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	public Post(){
		
	}
	
	public Post(Date data, String titulo, String conteudo, Integer like){
		this.moment = data;
		this.title = titulo;
		this.content = conteudo;
		this.likes = like;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
List<Comment> ListaDeComentarios = new ArrayList<>();

public List<Comment> getListaDeComentarios() {
	return ListaDeComentarios;
}

public void addComment(Comment comentario) {
	ListaDeComentarios.add(comentario);
}

public void removeComment(Comment comentario) {
	ListaDeComentarios.remove(comentario);
}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		
		sb.append(likes +" Likes - " + 
		sdf.format(moment)+"\n");
		
		sb.append(content +" \n");
		
		sb.append("Comments: ");
		for(Comment lc: ListaDeComentarios ) {
			sb.append(lc.getComentarios()+"\n");
		}
		
		return sb.toString();
		
	}
	
	
}
