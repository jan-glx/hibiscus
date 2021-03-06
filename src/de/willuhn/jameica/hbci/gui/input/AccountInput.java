/**********************************************************************
 *
 * Copyright (c) by Olaf Willuhn
 * All rights reserved
 *
 **********************************************************************/

package de.willuhn.jameica.hbci.gui.input;

import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

import de.willuhn.jameica.gui.input.TextInput;

/**
 * Basis-Klasse fuer die Eingabe von Kontonummern, BLZ und BIC.
 * Erlaubt das Einfuegen von Leerzeichen, die
 * automatisch entfernt werden.
 */
public class AccountInput extends TextInput
{
  /**
   * ct.
   * @param value Initialer Wert.
   * @param maxlength Maximale Laenge.
   */
  public AccountInput(String value, int maxlength)
  {
    super(value,maxlength);
    this.addListener(new Listener()
    {
      public void handleEvent(Event event)
      {
        String s = (String) getValue();
        if (s == null || s.length() == 0 || s.indexOf(" ") == -1)
          return;
        AccountInput.super.setValue(s.replaceAll(" ",""));
      }
    });
  }
  
  /**
   * Ueberschrieben, um zusaetzlich noch die Leerzeichen zuzulassen.
   * @see de.willuhn.jameica.gui.input.AbstractInput#setValidChars(java.lang.String)
   */
  @Override
  public void setValidChars(String chars)
  {
    super.setValidChars(chars + " ");
  }
}


