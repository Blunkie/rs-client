import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class KeyHandler implements KeyListener, FocusListener {
   Collection aw = new ArrayList(100);
   Collection an = new ArrayList(100);
   volatile int ab = 0;
   boolean[] au = new boolean[112];
   be[] ac = new be[3];
   static int ul;

   static int getComponentClickMask(Component var0) {
      IntegerNode var2 = (IntegerNode)Client.componentClickMasks.get((long)(var0.childIndex * 55577617) + ((long)(1713081171 * var0.id) << 32));
      return var2 != null ? var2.integer : var0.clickMask * 1652991301;
   }

   void af(be var1, int var2) {
      this.ac[var2] = var1;
   }

   public int an() {
      return 581428417 * this.ab;
   }

   void aw(java.awt.Component var1) {
      var1.setFocusTraversalKeysEnabled(false);
      var1.addKeyListener(this);
      var1.addFocusListener(this);
   }

   void au() {
      this.ab += -132994239;
      this.ab();
      Iterator var2 = this.aw.iterator();

      while(var2.hasNext()) {
         bz var3 = (bz)var2.next();

         for(int var4 = 0; var4 < this.ac.length && !var3.af(this.ac[var4]); ++var4) {
         }
      }

      this.aw.clear();
   }

   public final synchronized void keyTyped(KeyEvent var1) {
      char var2 = var1.getKeyChar();
      if (0 != var2 && '\uffff' != var2) {
         boolean var3;
         if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
            var3 = true;
         } else {
            label61: {
               if (0 != var2) {
                  char[] var4 = od.af;

                  for(int var5 = 0; var5 < var4.length; ++var5) {
                     char var6 = var4[var5];
                     if (var6 == var2) {
                        var3 = true;
                        break label61;
                     }
                  }
               }

               var3 = false;
            }
         }

         if (var3) {
            this.an.add(new bz(3, var2));
         }
      }

      var1.consume();
   }

   synchronized void ab() {
      Collection var2 = this.aw;
      this.aw = this.an;
      this.an = var2;
   }

   public final synchronized void focusGained(FocusEvent var1) {
      this.an.add(new bz(4, 1));
   }

   public final synchronized void focusLost(FocusEvent var1) {
      for(int var2 = 0; var2 < 112; ++var2) {
         if (this.au[var2]) {
            this.au[var2] = false;
            this.an.add(new bz(2, var2));
         }
      }

      this.an.add(new bz(4, 0));
   }

   public final synchronized void keyPressed(KeyEvent var1) {
      int var2;
      label29: {
         var2 = var1.getKeyCode();
         if (var2 >= 0) {
            int var4 = bi.KeyHandler_keyCodes.length;
            if (var2 < var4) {
               var2 = ix.an_renamed(var2);
               boolean var5 = 0 != (var2 & 128);
               if (var5) {
                  var2 = -1;
               }
               break label29;
            }
         }

         var2 = -1;
      }

      if (var2 >= 0) {
         this.au[var2] = true;
         this.an.add(new bz(1, var2));
         this.ab = 0;
      }

      var1.consume();
   }

   static void an_renamed(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
      if (ax.an) {
         if (var3 == 4) {
            ee.ak_renamed(4);
         }

      } else {
         if (0 == var3) {
            cz.ay_renamed(var2);
         } else {
            ee.ak_renamed(var3);
         }

         Rasterizer2D.er();
         byte[] var5 = var0.takeFileByNames("title.jpg", "");
         ex.at = Strings.af_renamed(var5);
         ParamType.aa = ex.at.af();
         int var6 = Client.ce * -205173751;
         if ((var6 & 536870912) != 0) {
            Canvas.ay = MusicPatchNode2.au_renamed(var1, "logo_deadman_mode", "");
         } else if (0 != (var6 & 1073741824)) {
            Canvas.ay = MusicPatchNode2.au_renamed(var1, "logo_seasonal_mode", "");
         } else if ((var6 & 256) != 0) {
            Canvas.ay = MusicPatchNode2.au_renamed(var1, "logo_speedrunning", "");
         } else {
            Canvas.ay = MusicPatchNode2.au_renamed(var1, "logo", "");
         }

         cz.au = MusicPatchNode2.au_renamed(var1, "titlebox", "");
         lu.ab = MusicPatchNode2.au_renamed(var1, "titlebutton", "");
         qo.aq = MusicPatchNode2.au_renamed(var1, "titlebutton_large", "");
         os.al = MusicPatchNode2.au_renamed(var1, "play_now_text", "");
         MusicPatchNode2.au_renamed(var1, "titlebutton_wide42,1", "");
         py.ac = mz.ac_renamed(var1, "runes", "");
         fc.ao = mz.ac_renamed(var1, "title_mute", "");
         cz.ax = MusicPatchNode2.au_renamed(var1, "options_radio_buttons,0", "");
         cz.ai = MusicPatchNode2.au_renamed(var1, "options_radio_buttons,4", "");
         gs.ag = MusicPatchNode2.au_renamed(var1, "options_radio_buttons,2", "");
         cz.ah = MusicPatchNode2.au_renamed(var1, "options_radio_buttons,6", "");
         ChatChannel.cz = 1622050401 * cz.ax.subWidth;
         FloorUnderlayType.cw = cz.ax.subHeight * 905476585;
         em.av = new dp(py.ac);
         if (var2) {
            cz.ca = "";
            cz.cu = "";
            cz.cm = new String[8];
            cz.cq = 0;
         }

         hp.ct = 0;
         Messages.cp = "";
         cz.cd = true;
         cz.di = false;
         if (!aj.clientPreferences.aa()) {
            ks.ab_renamed(2, pj.archive6, "scape main", "", 255, false);
         } else {
            ly.au = -626822165;
            ly.ab = null;
            oq.aq = 1643562499;
            gz.al = -1823837761;
            dn.at = 0;
            ev.musicTrackBoolean = false;
            ga.aa = 440964570;
         }

         gn.an_renamed(false);
         ax.an = true;
         cz.aw = 983792155 * ((GameShell.aj * -1687260435 - 765) / 2);
         cz.ak = 794898887 * cz.aw + 2036160930;
         fy.az = -1036961612 + cz.ak * -949768875;
         ex.at.ay(578342931 * cz.aw, 0);
         ParamType.aa.ay(382 + cz.aw * 578342931, 0);
         Canvas.ay.aw(382 + cz.aw * 578342931 - Canvas.ay.subWidth / 2, 18);
      }
   }

   synchronized void ac(java.awt.Component var1) {
      var1.removeKeyListener(this);
      var1.removeFocusListener(this);
      synchronized(this) {
         this.an.add(new bz(4, 0));
      }
   }

   KeyHandler() {
   }

   static final void jl_renamed() {
      for(dg var1 = (dg)Client.nn.last(); var1 != null; var1 = (dg)Client.nn.previous()) {
         if (1457211081 * var1.ag == -1) {
            var1.ai = 0;
            Messages.kc_renamed(var1);
         } else {
            var1.ga();
         }
      }

   }

   static void ha_renamed(SeqType var0, int var1, int var2, int var3) {
      if (-297150195 * Client.soundEffectCount < 50 && aj.clientPreferences.az() != 0) {
         if (var0.ao != null && var0.ao.containsKey(var1)) {
            ge.hp_renamed((Integer)var0.ao.get(var1), var2, var3);
         }
      }
   }

   public final synchronized void keyReleased(KeyEvent var1) {
      int var2;
      label20: {
         var2 = var1.getKeyCode();
         if (var2 >= 0) {
            int var4 = bi.KeyHandler_keyCodes.length;
            if (var2 < var4) {
               var2 = ix.an_renamed(var2) & -129;
               break label20;
            }
         }

         var2 = -1;
      }

      if (var2 >= 0) {
         this.au[var2] = false;
         this.an.add(new bz(2, var2));
      }

      var1.consume();
   }

   public static int af_renamed() {
      return -1048050201 * ix.ai;
   }

   public static double an(double var0, double var2, double var4) {
      return fd.af((var0 - var2) / var4) / var4;
   }
}