package com.dnstechpack.dnscapes.core.proxy;

import com.dnstechpack.dnscapes.core.handler.TickHandler;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class ClientProxy extends CommonProxy
{
  public void registerTickHandler()
  {
    TickRegistry.registerTickHandler(new TickHandler(), Side.CLIENT);
  }
}