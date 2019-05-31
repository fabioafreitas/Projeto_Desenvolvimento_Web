package br.ufrpe.myalert.services;

import br.ufrpe.myalert.dao.LoginDAO;
import br.ufrpe.myalert.models.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component
public class MongoUserDetailsService implements UserDetailsService {
    @Autowired
    private LoginDAO repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        Login login = repository.findByUsername(username);
        if(login == null){
            throw new UsernameNotFoundException("Usuario nao encontrado");
        }

        List<SimpleGrantedAuthority> authorities = Arrays.asList(new SimpleGrantedAuthority("user"));

        return new User(login.getUsername(),"{noop}"+login.getPassword(),authorities); //Esse {noop} eh pra ler em plaintext, por enquanto
    }
}
