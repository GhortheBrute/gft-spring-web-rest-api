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
        System.out.printf("DELETE/id - Recebendo o id: %d para excluir um usuário.", id);
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usuários do sistema.");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Jesus", "1234"));
        usuarios.add(new Usuario("Maria", "4321"));
        return usuarios;
    }

    public Usuario findById(Integer id) {
        System.out.printf("FIND/id - Recebendo o id: %d para localizar o usuário.", id);
        return new Usuario("Jesus", "1234");
    }

    public Usuario findByUsername (String username) {
        System.out.printf("FIND/username - Recebendo o username: %s para localizar o usuário", username);
        return new Usuario("Jesus", "1234");
    }
}
