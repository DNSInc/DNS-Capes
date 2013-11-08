package com.dnstechpack.dnscapes.lib;

import com.dnstechpack.dnscapes.core.util.URLHelper;
import java.util.List;

public class Reference
{
  public static final String MOD_ID = "dnscapes";
  public static final String NAME = "DNS Capes";
  public static final String VERSION = "1.0.1";
  public static final String CLIENT_PROXY_CLASS = "com.dnstechpack.dnscapes.core.proxy.ClientProxy";
  public static final String SERVER_PROXY_CLASS = "com.dnstechpack.dnscapes.core.proxy.CommonProxy";
  public static Settings settings = new Settings();
  public static boolean allowCape = true;

  public static final List<String> staffList = URLHelper.retrieveStringList((String)settings.get("StaffList"));
}