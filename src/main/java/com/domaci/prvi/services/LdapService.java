package com.domaci.prvi.services;

import com.domaci.prvi.config.LdapApiConfiguration;
import org.springframework.stereotype.Service;

@Service
public class LdapService {

    private  LdapApiConfiguration ldapApiConfiguration;

    public LdapService(LdapApiConfiguration ldapApiConfiguration) {
        this.ldapApiConfiguration = ldapApiConfiguration;
    }

    public void connect ()
    {
        System.out.println("hello world");
        System.out.println("domain je " + ldapApiConfiguration.getDomain().toString());
        System.out.println("port je " + ldapApiConfiguration.getPort().toString());
        System.out.println("secure context je " + ldapApiConfiguration.getSearchContext().toString());
        System.out.println("is secure : "+ ldapApiConfiguration.getSecure());
    }
}
