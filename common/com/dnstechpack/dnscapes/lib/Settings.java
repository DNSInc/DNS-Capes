package com.dnstechpack.dnscapes.lib;

import com.dnstechpack.dnscapes.DNSCapes;
import java.io.IOException;
import java.util.Properties;

public class Settings
{
  private final Properties properties;

  public Settings()
  {
    this.properties = new Properties();
    try
    {
      this.properties.load(DNSCapes.class.getClassLoader().getResourceAsStream("ModPack"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public Object get(String key) {
    return this.properties.get(key);
  }
}