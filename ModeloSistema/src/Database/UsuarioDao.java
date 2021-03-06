package Database;

import Model.Usuario;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UsuarioDao {
    protected DB db;
    protected String table;
    
    public UsuarioDao(){
        this.db = new DB();
        this.table = "usuario";
    }
    
    // Busca um usuário com base nos dados de uma busca passada
    public List<Usuario> buscaUsuario (String s) {
        try{
            Connection con = db.connect();

            String query = "SELECT * FROM "+table+" WHERE UPPER(login) LIKE "
                    + "UPPER(?) OR UPPER(nome) LIKE UPPER(?) OR UPPER(email) "
                    + "LIKE UPPER(?)";
            PreparedStatement stmt = con.prepareStatement(query);

            stmt.setString(1, "%"+s+"%");
            stmt.setString(2, "%"+s+"%");
            stmt.setString(3, "%"+s+"%");
            
            ResultSet rs = stmt.executeQuery();            
            
            List<Usuario> listUsers = new ArrayList<Usuario>();
            
            while (rs.next()){
                Usuario user = new Usuario();
                user.setNome(rs.getString("nome"));
                user.setLogin(rs.getString("login"));
                user.setSenha(rs.getString("senha"));
                user.setEmail(rs.getString("email"));
                user.setTipoUsuario(rs.getInt("tipo_usuario"));
                user.setIdDepartamento(rs.getInt("id_departamento"));
                user.setDataHoraCadastro(rs.getString("data_hora_cadastro"));
                user.setDataHoraAtualizacao(rs.getString("data_hora_atualizacao"));
                user.setAceito(rs.getBoolean("aceito"));
                user.setAtivo(rs.getBoolean("ativo"));
                
                listUsers.add(user);
            }
            
            con.close();
            return listUsers;
            
        } catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    
    // Obter o usuário com base nos dados de acesso salvos
    public Usuario getAuth (Usuario u) {
        try{
            Connection con = db.connect();

            String query = "SELECT * FROM "+table+" WHERE login = ? AND senha = ?";
            PreparedStatement stmt = con.prepareStatement(query);

            stmt.setString(1, u.getLogin());
            stmt.setString(2, u.getSenha());
            
            ResultSet rs = stmt.executeQuery();            
            
            Usuario user = new Usuario();
            
            while (rs.next()){
                user.setNome(rs.getString("nome"));
                user.setLogin(rs.getString("login"));
                user.setSenha(rs.getString("senha"));
                user.setEmail(rs.getString("email"));
                user.setTipoUsuario(rs.getInt("tipo_usuario"));
                user.setIdDepartamento(rs.getInt("id_departamento"));
                user.setDataHoraCadastro(rs.getString("data_hora_cadastro"));
                user.setDataHoraAtualizacao(rs.getString("data_hora_atualizacao"));
                user.setAceito(rs.getBoolean("aceito"));
                user.setAtivo(rs.getBoolean("ativo"));
            }
            
            con.close();
            return user;
            
        } catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    
    // Obter todos os objetos ATIVOS
    public List<Usuario> getAllAdmins () {
        List<Usuario> user = getAll();  
        List<Usuario> ativos = new ArrayList<Usuario>();
        for (Usuario usr : user){
            if(usr.getTipoUsuario() == 1 && usr.isAtivo() == true)
                ativos.add(usr);
        }
        
        return ativos;
    }
    // Obter todos os objetos ATIVOS
    public List<Usuario> getAllProfs () {
        List<Usuario> user = getAll();  
        List<Usuario> ativos = new ArrayList<Usuario>();
        for (Usuario usr : user){
            if(usr.getTipoUsuario() == 0 && usr.isAtivo() == true)
                ativos.add(usr);
        }
        
        return ativos;
    }
    // Obter todos os objetos ATIVOS
    public List<Usuario> getAllMasters () {
        List<Usuario> user = getAll();  
        List<Usuario> ativos = new ArrayList<Usuario>();
        for (Usuario usr : user){
            if(usr.getTipoUsuario() == 2 && usr.isAtivo() == true)
                ativos.add(usr);
        }
        
        return ativos;
    }
    
    
    
    /**
    * Funções básicas de CRUD 
    */
    
    // Obter um objeto com base na coluna dada
    public Usuario get (Usuario u, String column) {
        try{
            Connection con = db.connect();

            String query = "SELECT * FROM "+table+" WHERE "+column+" = ?";
            PreparedStatement stmt = con.prepareStatement(query);

            try{
                Method m = u.getClass().getMethod("get" + Util.Utility.upperCaseFirst(column));
                String val = (String) m.invoke(u);
                
                stmt.setString(1, val);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
                        
            
            ResultSet rs = stmt.executeQuery();            
            
            Usuario user = new Usuario();
            
            while (rs.next()){
                user.setNome(rs.getString("nome"));
                user.setLogin(rs.getString("login"));
                user.setSenha(rs.getString("senha"));
                user.setEmail(rs.getString("email"));
                user.setTipoUsuario(rs.getInt("tipo_usuario"));
                user.setIdDepartamento(rs.getInt("id_departamento"));
                user.setDataHoraCadastro(rs.getString("data_hora_cadastro"));
                user.setDataHoraAtualizacao(rs.getString("data_hora_atualizacao"));
                user.setAceito(rs.getBoolean("aceito"));
                user.setAtivo(rs.getBoolean("ativo"));
            }
            
            con.close();
            return user;
            
        } catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    // Obter um objeto ATIVO com base na coluna dada
    public Usuario getAtivo (Usuario u, String column) {
        Usuario dep = get (u, column);
        
        if(dep.isAtivo() == true)
            return dep;
        else
            return null;
    }
    
    
    // Obter todos os objetos
    public List<Usuario> getAll () {
        try{
            Connection con = db.connect();

            String query = "SELECT * FROM "+table;
            PreparedStatement stmt = con.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();
            
            List<Usuario> users = new ArrayList<Usuario>();
            
            while (rs.next()){
                Usuario user = new Usuario();
                user.setNome(rs.getString("nome"));
                user.setLogin(rs.getString("login"));
                user.setSenha(rs.getString("senha"));
                user.setEmail(rs.getString("email"));
                user.setTipoUsuario(rs.getInt("tipo_usuario"));
                user.setIdDepartamento(rs.getInt("id_departamento"));
                user.setDataHoraCadastro(rs.getString("data_hora_cadastro"));
                user.setDataHoraAtualizacao(rs.getString("data_hora_atualizacao"));
                user.setAceito(rs.getBoolean("aceito"));
                user.setAtivo(rs.getBoolean("ativo"));
                
                users.add(user);
            }
            
            con.close();
            return users;
            
        } catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    // Obter todos os objetos ATIVOS
    public List<Usuario> getAllAtivos () {
        List<Usuario> user = getAll();  
        List<Usuario> ativos = new ArrayList<Usuario>();
        for (Usuario usr : user){
            if(usr.isAtivo() == true)
                ativos.add(usr);
        }
        
        return ativos;
    }
    
    
    
    // Insere um dado objeto do BD
    public boolean insert (Usuario u){
        try{
            Connection con = db.connect();

            String query = "INSERT INTO "+table+" (nome, login, senha, email, "
                    + "tipo_usuario, id_departamento, data_hora_cadastro, "
                    + "data_hora_atualizacao, aceito, ativo) VALUES "
                    + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getLogin());
            stmt.setString(3, u.getSenha());
            stmt.setString(4, u.getEmail());
            stmt.setInt(5, u.getTipoUsuario());
            stmt.setInt(6, u.getIdDepartamento());
            stmt.setString(7, u.getDataHoraCadastro());
            stmt.setString(8, u.getDataHoraAtualizacao());
            stmt.setBoolean(9, u.isAceito());
            stmt.setBoolean(10, u.isAtivo());

            stmt.execute();
            
            con.close();
            return true;
            
        } catch(SQLException e){
            System.out.println(e);
            return false;
        }
    }
    
    
    // Atualiza um dado objeto no BD
    public boolean update (Usuario u){
        try{
            Connection con = db.connect();

            String query = "UPDATE "+table+" SET nome = ?, "
                    + "senha = ?, email = ?, tipo_usuario = ?, "
                    + "id_departamento = ?, data_hora_cadastro = ?, "
                    + "data_hora_atualizacao = ?, aceito = ?, ativo = ? WHERE login = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getSenha());
            stmt.setString(3, u.getEmail());
            stmt.setInt(4, u.getTipoUsuario());
            stmt.setInt(5, u.getIdDepartamento());
            stmt.setString(6, u.getDataHoraCadastro());
            stmt.setString(7, u.getDataHoraAtualizacao());
            stmt.setBoolean(8, u.isAceito());
            stmt.setBoolean(9, u.isAtivo());
            stmt.setString(10, u.getLogin());

            stmt.execute();
            
            con.close();
            return true;
            
        } catch(SQLException e){
            System.out.println(e);
            return false;
        }
    }
    
    // Desabilita o objeto no sistema
    public boolean disable (Usuario u) {
        u.setAtivo(false);
        
        return update(u);
    }
    
    // Reabilita o objeto no sistema
    public boolean enable (Usuario u) {
        u.setAtivo(true);
        
        return update(u);
    }
}
