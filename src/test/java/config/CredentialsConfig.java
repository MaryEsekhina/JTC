package config;


import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/credentials.properties",
        "system:properties"})
public interface CredentialsConfig extends Config {
    String login();
    String password();
  /*  @DefaultValue("false")*/
    boolean remote();
}
