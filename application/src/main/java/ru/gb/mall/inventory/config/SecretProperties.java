package ru.gb.mall.inventory.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@PropertySource(value="file:./config/secret.properties")
@ConfiigurationProperties("encryption")
public class SecretProperties {

    private String className;
    private byte[] password;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public byte[] getPassword() {
        return password;
    }

    public void setPassword(byte[] password) {
        this.password = password;
    }
}