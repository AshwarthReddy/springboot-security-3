package com.anr.spring.bootsecurity.entity;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RequiredArgsConstructor
public enum Role {

    USER,
    ADMIN,
    MANAGER;


    public List<SimpleGrantedAuthority> getAuthorities() {


        List<SimpleGrantedAuthority> authorities = new ArrayList<>(Arrays.stream(Role.values())
                .map(permission -> new SimpleGrantedAuthority(permission.name()))
                .toList());
        authorities.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return authorities;
    }
}