package br.com.dio.gftspringwebrestapi.repository;

import br.com.dio.gftspringwebrestapi.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepositorio {
    public void save(Usuario usuario){
        if (usuario.getId() <= 0)
            System.out.println("SAVE - Recebendo o usuário na camada de repository.");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repository.");

        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.printf("DELETE/id - Recebendo o id: %d para excluir um usuário.%n", id);
    }

    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usuários do sistema.");
        List<Usuario> usuarios = new ArrayList<>();
        Usuario u1 = new Usuario("Jesus", "1234");
        u1.setId(1);
        Usuario u2 = new Usuario("Maria", "4321");
        u2.setId(2);
        usuarios.add(u1);
        usuarios.add(u2);
        return usuarios;
    }

    public Usuario findById(Integer id) {
        System.out.printf("FIND/id - Recebendo o id: %d para localizar o usuário.%n", id);
        Usuario u = new Usuario("Jesus", "1234");
        u.setId(id != null ? id : 1);
        return u;
    }

    public Usuario findByUsername (String username) {
        System.out.printf("FIND/username - Recebendo o username: %s para localizar o usuário.%n", username);
        Usuario u = new Usuario("Jesus", "1234");
        u.setId(1);
        return u;
    }
}
