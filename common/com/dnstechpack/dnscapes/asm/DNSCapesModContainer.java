package com.dnstechpack.dnscapes.asm;

import com.dnstechpack.dnscapes.core.handler.TickHandler;
import com.dnstechpack.dnscapes.core.util.CapeHandler;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
import java.io.IOException;
import java.util.Arrays;

public class DNSCapesModContainer extends DummyModContainer
{
  public DNSCapesModContainer()
  {
    super(new ModMetadata());
    getMetadata();
  }

  public ModMetadata getMetadata()
  {
    ModMetadata meta = super.getMetadata();

    meta.modId = "dnscapes";
    meta.name = "DNS Capes";
    meta.version = "1.0.1";
    meta.authorList = Arrays.asList(new String[] { "MCWizard111", "Darkhax", "Madcock83" });
    meta.description = "This mod adds capes for DNS Team members and DNS Users";
    meta.credits = "Maintained by MCWizard111, Darkhax, Madcock83 and ShadowChild";

    return meta;
  }

  public boolean registerBus(EventBus bus, LoadController controller)
  {
    bus.register(this);
    return true;
  }

  @Subscribe
  public void preInit(FMLPreInitializationEvent event) throws IOException {
    CapeHandler.init();

    TickRegistry.registerTickHandler(new TickHandler(), Side.CLIENT);
  }
}