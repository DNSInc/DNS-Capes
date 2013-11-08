package com.dnstechpack.dnscapes.asm;

import cpw.mods.fml.common.asm.transformers.AccessTransformer;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DNSCapesAccessTransformer extends AccessTransformer
{
  private static DNSCapesAccessTransformer instance;
  private static List<String> mapFiles = new LinkedList();

  public DNSCapesAccessTransformer() throws IOException
  {
    instance = this;
    mapFiles.add("dnscapes_at.cfg");

    Iterator it = mapFiles.iterator();

    while (it.hasNext()) {
      String file = (String)it.next();
      readMapFile(file);
    }
  }

  public static void addTransformerMap(String mapFile) {
    if (instance == null)
      mapFiles.add(mapFile);
    else
      instance.readMapFile(mapFile);
  }

  private void readMapFile(String name) {
    System.out.println("Adding Accesstransformer map: " + name);
    try
    {
      Method e = AccessTransformer.class.getDeclaredMethod("readMapFile", new Class[] { String.class });
      e.setAccessible(true);
      e.invoke(this, new Object[] { name });
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}