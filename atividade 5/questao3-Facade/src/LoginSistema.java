public class LoginSistema {

    public boolean fazerLogin(String usuario, String senha) {
        System.out.println("Verificando credenciais...");
        
        if (usuario.equals("maria") && senha.equals("123")) {
            System.out.println("Login realizado com sucesso.");
            return true;
        } else {
            System.out.println("Usuário ou senha incorretos.");
            return false;
        }
    }
}

