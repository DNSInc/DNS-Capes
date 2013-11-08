package com.dnstechpack.dnscapes.asm;

import cpw.mods.fml.relauncher.IFMLCallHook;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.TransformerExclusions;
import java.util.Map;

@IFMLLoadingPlugin.TransformerExclusions({"com.dnstechpack.dnscapes.asm"})
public class DNSCapesPlugin
  implements IFMLLoadingPlugin, IFMLCallHook
{
  public String[] getLibraryRequestClass()
  {
    return null;
  }

  public String[] getASMTransformerClass()
  {
    return new String[] { "com.dnstechpack.dnscapes.asm.DNSCapesAccessTransformer" };
  }

  public String getModContainerClass()
  {
    return "com.dnstechpack.dnscapes.asm.DNSCapesModContainer";
  }

  public String getSetupClass()
  {
    return getClass().getName();
  }

  public void injectData(Map<String, Object> data)
  {
  }

  public Void call()
    throws Exception
  {
    return null;
  }
}