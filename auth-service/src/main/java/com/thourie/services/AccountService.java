package com.thourie.services;

import com.thourie.repositories.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    public UserDetails loadUserByUsername(String username) {

        return accountRepository.getUserByUsername(username);
    }
}
