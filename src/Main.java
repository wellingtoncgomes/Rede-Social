
public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("user1", "senha123", "user1@example.com");
        UsuarioEspecial usuarioPremium = new UsuarioEspecial("especialUser", "senha123", "premium@example.com");
        UsuarioAdmin usuarioAdmin = new UsuarioAdmin("adminUser", "senha123", "admin@example.com");

        Postagem postagem = new Postagem("Olá, este é um post!");

        usuario1.getPerfil().setBiografia("Sou um usuário normal.");
        usuarioPremium.criarPostagemEmDestaque("Este é um post em destaque!");
        usuarioAdmin.deletarPostagem(postagem);

        postagem.curtir();
        postagem.adicionarComentario("Ótimo post!");

        System.out.println("Postagem: " + postagem.getConteudo());
        System.out.println("Curtidas: " + postagem.getCurtidas());
        System.out.println("Comentários: " + postagem.getComentarios());
    }
}

