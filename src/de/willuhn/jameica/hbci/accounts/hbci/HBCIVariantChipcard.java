/**********************************************************************
 *
 * Copyright (c) by Olaf Willuhn
 * All rights reserved
 *
 **********************************************************************/

package de.willuhn.jameica.hbci.accounts.hbci;

import de.willuhn.annotation.Lifecycle;
import de.willuhn.annotation.Lifecycle.Type;
import de.willuhn.jameica.gui.parts.InfoPanel;
import de.willuhn.jameica.hbci.HBCI;
import de.willuhn.jameica.system.Application;
import de.willuhn.util.ApplicationException;
import de.willuhn.util.I18N;

/**
 * Implementierung der HBCI-Variante fuer Chipkarte.
 */
@Lifecycle(Type.CONTEXT)
public class HBCIVariantChipcard implements HBCIVariant
{
  private final static I18N i18n = Application.getPluginLoader().getPlugin(HBCI.class).getResources().getI18N();
  
  /**
   * @see de.willuhn.jameica.hbci.accounts.hbci.HBCIVariant#getName()
   */
  @Override
  public String getName()
  {
    return i18n.tr("Chipkarte");
  }

  /**
   * @see de.willuhn.jameica.hbci.accounts.hbci.HBCIVariant#getInfo()
   */
  @Override
  public InfoPanel getInfo()
  {
    InfoPanel info = new InfoPanel();
    info.setTitle(this.getName());
    info.setText(i18n.tr("Verwenden Sie dieses Verfahren, wenn Sie eine spezielle HBCI-Chipkarte besitzen."));
    info.setComment(i18n.tr("Sie ben�tigen hierf�r zus�tzlich ein Chipkarten-Leseger�t mit USB-Anschluss."));
    info.setUrl("http://www.willuhn.de/wiki/doku.php?id=support:list:kartenleser");
    info.setIcon("hbci-chipcard.png");
    return info;
  }

  /**
   * @see de.willuhn.jameica.hbci.accounts.hbci.HBCIVariant#create()
   */
  @Override
  public void create() throws ApplicationException
  {
    // TODO Auto-generated

  }

}


