import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

public final class Client extends GameShell implements Usernamed, OAuthApi {
   static int th;
   static int sm;
   static int ce = 0;
   static int cs = 0;
   static StudioGame studioGame;
   public static boolean ca = false;
   static boolean cu = false;
   static int cl = 1581503853;
   static int cg = 240023661;
   static int cr = -2133726699;
   static String selectedItemName;
   static int cx = 322247329;
   static int dw = 0;
   static boolean da = true;
   static dj em;
   static long mouseLastLastPressedTimeMillis = 3648848592458615261L;
   static int et = 791348693;
   static int ef = -824333519;
   static int lv;
   static boolean ej = true;
   static int soundEffectCount;
   static int eu = 0;
   static int es = 0;
   static int eb = 0;
   static Component pr;
   static int en = 0;
   static cf wg;
   static int qx;
   static int mq;
   static Timer timer;
   static dj ew;
   static boolean ex;
   static int fi;
   static int fp;
   static int fo;
   static int js5Errors;
   am gz;
   static int ga;
   static int gt;
   static int gu;
   static fp gh;
   static sr gy;
   String gx;
   static int ws;
   static int lk;
   OtlTokenRequester hw;
   Future hi;
   boolean hj = false;
   static int[][] mt;
   static byte[] hf;
   Future hx;
   static final String hd;
   static Component pf;
   static boolean hb;
   static SecureRandomFuture secureRandomFuture;
   Packet ha;
   am hm;
   long he = -714003291813872507L;
   static int ea = 0;
   static Npc[] npcs;
   static int er = 0;
   static int[] iy;
   static int ig;
   static int[] ih;
   static NodeDeque projectiles;
   RefreshAccessTokenRequester hu;
   static boolean ik;
   al hp;
   static int vd;
   static int[] tg;
   static int[] sz;
   static int jk;
   static int jq;
   static int jx;
   static CollisionMap[] collisionMaps;
   static boolean cy = false;
   static int[][][] instanceChunkTemplates;
   static final int[] jy;
   static int ja;
   static int qa;
   static int[] lw;
   static int kk;
   static int kj;
   static boolean ki;
   static int ko;
   static int mu;
   static short vm;
   static NodeDeque nn;
   static int kn;
   static int kq;
   public static int ly;
   static int su;
   public static int bw = -1381008117;
   static int kz;
   static String[] menuTargetNames;
   static int viewportZoom;
   static int la;
   static int kw;
   static int[] vg;
   static boolean ln;
   static int[] lx;
   static boolean[] no;
   static int lc;
   static int overheadTextCount;
   static int lq;
   static int[] lj;
   static int[] ll;
   static int[] le;
   static int kp;
   static int pc;
   static int[] lo;
   static final int[] playerMenuOpcodes;
   static String[] overheadText;
   static int op;
   static int mw;
   static int ep = 0;
   static int[] tr;
   static boolean bh = true;
   static long ez = -2560228884295272563L;
   static int me;
   static int mv;
   static int[] overheadTextXOffsets;
   static int ma;
   static boolean mj;
   static Player[] players;
   static int mk;
   static int mo;
   static long mn;
   static boolean md;
   static PlatformInfoProvider platformInfoProvider;
   static int mb;
   static int[] nz;
   static int lt;
   static int[] tw;
   static short vo;
   static int je;
   static int nl;
   static NodeDeque[][][] objStacks;
   static int pk;
   static int py;
   static NodeDeque graphicsObjects;
   static int pi;
   static int[] ny;
   static int[] nu;
   static boolean nb;
   static int[] vf;
   static int menuOptionsCount;
   static int[] menuArguments0;
   static int[] menuArguments2;
   static int[] menuArguments1;
   static int[] menuOpcodes;
   static int[] oi;
   static String[] menuActions;
   static int[] rootComponentWidths;
   static boolean[] menuShiftClick;
   static boolean ov;
   static boolean ol;
   static boolean oz;
   static int of;
   static int oy;
   static int oe;
   static int on;
   static int oq;
   static int tz;
   static boolean om;
   static boolean[] rw;
   static int tp;
   static int el = 0;
   static String selectedSpellName;
   static int or;
   static NodeHashTable interfaceParents;
   static int oa;
   static int pp;
   static int rs;
   static Component pg;
   ag gl;
   static String oj;
   static int localPlayerIndex;
   static int pt;
   static boolean po;
   static Component ps;
   static rm ui;
   static boolean isMiniMenuOpen;
   static int pd;
   static int pw;
   static Component pz;
   static boolean pq;
   static boolean ub;
   static int pb;
   static int mm;
   static int ph;
   static int pv;
   static gj[] so;
   static int qu;
   static int km;
   public static int pu;
   static int pj;
   static int qc;
   static int[] qs;
   static int qf;
   static int[] qt;
   static int qn;
   static boolean isInInstance;
   static int qg;
   static int qd;
   static int qy;
   static int qz;
   static int[] nm;
   static short vk;
   static boolean mx;
   static int mouseWheelRotation;
   static tz rl;
   static NodeDeque rq;
   static NodeDeque rt;
   static NodeDeque rp;
   static NodeDeque re;
   static NodeHashTable componentClickMasks;
   static int ks;
   static int ed = 0;
   static boolean[] rf;
   static boolean[] rm;
   static int mz;
   static int[] rh;
   static int[] rb;
   static int lp;
   static int[] rootComponentHeights;
   static int rg;
   static long rj;
   static boolean ro;
   static int[] sy;
   static int sj;
   static HashMap im;
   static String ss;
   static int[] qj;
   static int sf;
   public static hy sh;
   static he si;
   static boolean pn;
   static int[] sk;
   static int jo;
   static long sc;
   static int lu;
   static int sp;
   static int sr;
   static boolean uk;
   static int[] ty;
   static Rasterizer3D[] ts;
   static int te;
   static String[] playerMenuActions;
   static int iw;
   static rf uz;
   static boolean tf;
   static int[] qr;
   static int[] tu;
   static pk wx;
   static int[] ng;
   static int[] tb;
   static SoundEffect[] soundEffects;
   static boolean uj;
   static int wi;
   static boolean uc;
   static boolean ud;
   static fj[] sg;
   static rf ua;
   static int qb;
   public static final PacketWriter packetWriter;
   static boolean[] ue;
   static int[] vq;
   static boolean px;
   static boolean lz;
   static int kf;
   static short vv;
   static short va;
   static int ii;
   static short ve;
   static int qq;
   static short vn;
   static int loginState;
   static int eg = 0;
   static int viewportHeight;
   static int vx;
   static int qv;
   static int viewportWidth;
   static int lm;
   static PlayerAppearance vh;
   static int vr;
   static int vu;
   static short vl;
   static GrandExchangeOffer[] grandExchangeOffers;
   static int[] vw;
   static int li;
   static EvictingDualNodeHashTable wq;
   static EvictingDualNodeHashTable ww;
   static int rr;
   public static int wn;
   static List wz;
   static ArrayList archiveLoaders;
   static int wy;
   static long[] st;
   static final cm xr;
   static int[] xm;
   static int[] xn;

   public final void init() {
      if (this.ae()) {
         int var3;
         for(int var1 = 0; var1 <= 28; ++var1) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (null != var2) {
               switch (var1) {
                  case 3:
                     if (var2.equalsIgnoreCase(Formatting.Formatting_true)) {
                        ca = true;
                     } else {
                        ca = false;
                     }
                     break;
                  case 4:
                     if (cg * -749752677 == -1) {
                        cg = Integer.parseInt(var2) * -240023661;
                     }
                     break;
                  case 5:
                     ce = Integer.parseInt(var2) * 1294598713;
                     break;
                  case 6:
                     fj.ck = Language.aq_renamed(Integer.parseInt(var2), (byte)-1);
                     break;
                  case 7:
                     iq.serverBuild = fv.af_renamed(Integer.parseInt(var2));
                     break;
                  case 8:
                     if (var2.equalsIgnoreCase(Formatting.Formatting_true)) {
                     }
                     break;
                  case 9:
                     ef.cm = var2;
                     break;
                  case 10:
                     studioGame = (StudioGame)StructType.findEnumerated(TaskHandler.au_renamed(), Integer.parseInt(var2));
                     if (studioGame == StudioGame.ab) {
                        co.loginType = LoginType.af;
                     } else {
                        co.loginType = LoginType.at;
                     }
                     break;
                  case 11:
                     ix.hv = var2;
                     break;
                  case 12:
                     bw = Integer.parseInt(var2) * -1381008117;
                  case 13:
                  case 16:
                  case 18:
                  case 19:
                  case 20:
                  case 22:
                  case 23:
                  case 24:
                  default:
                     break;
                  case 14:
                     TriBool.cf = Integer.parseInt(var2) * -447901147;
                     break;
                  case 15:
                     cs = Integer.parseInt(var2) * -261185633;
                     break;
                  case 17:
                     GrandExchangeOffer.worldsUrl = var2;
                     break;
                  case 21:
                     cl = Integer.parseInt(var2) * -1581503853;
                     break;
                  case 25:
                     var3 = var2.indexOf(".");
                     if (var3 == -1) {
                        cx = Integer.parseInt(var2) * -1712441187;
                     } else {
                        cx = Integer.parseInt(var2.substring(0, var3)) * -1712441187;
                        Integer.parseInt(var2.substring(1 + var3));
                     }
               }
            }
         }

         Scene.Scene_isLowDetail = false;
         cu = false;
         ea.worldHost = this.getCodeBase().getHost();
         String var16 = iq.serverBuild.name;
         byte var17 = 0;

         try {
            gc.idxCount = -327637298;
            gc.ah = var17 * 261077081;

            try {
               ne.osName = System.getProperty("os.name");
            } catch (Exception var14) {
               ne.osName = "Unknown";
            }

            WorldMapSectionType.osNameLowerCase = ne.osName.toLowerCase();

            try {
               hd.userHomeDirectory = System.getProperty("user.home");
               if (null != hd.userHomeDirectory) {
                  hd.userHomeDirectory = hd.userHomeDirectory + "/";
               }
            } catch (Exception var13) {
            }

            try {
               if (WorldMapSectionType.osNameLowerCase.startsWith("win")) {
                  if (hd.userHomeDirectory == null) {
                     hd.userHomeDirectory = System.getenv("USERPROFILE");
                  }
               } else if (hd.userHomeDirectory == null) {
                  hd.userHomeDirectory = System.getenv("HOME");
               }

               if (null != hd.userHomeDirectory) {
                  hd.userHomeDirectory = hd.userHomeDirectory + "/";
               }
            } catch (Exception var12) {
            }

            if (hd.userHomeDirectory == null) {
               hd.userHomeDirectory = "~/";
            }

            fe.cacheDirectoryLocations = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", hd.userHomeDirectory, "/tmp/", ""};
            Formatting.ar = new String[]{".jagex_cache_" + -1325133847 * gc.ah, ".file_store_" + -1325133847 * gc.ah};

            label154:
            for(var3 = 0; var3 < 4; ++var3) {
               my.au = fj.af_renamed("oldschool", var16, var3);
               if (!my.au.exists()) {
                  my.au.mkdirs();
               }

               File[] var4 = my.au.listFiles();
               if (null == var4) {
                  break;
               }

               File[] var5 = var4;
               int var6 = 0;

               while(true) {
                  if (var6 >= var5.length) {
                     break label154;
                  }

                  File var7 = var5[var6];

                  boolean var8;
                  try {
                     RandomAccessFile var9 = new RandomAccessFile(var7, "rw");
                     int var10 = var9.read();
                     var9.seek(0L);
                     var9.write(var10);
                     var9.seek(0L);
                     var9.close();
                     var8 = true;
                  } catch (Exception var11) {
                     var8 = false;
                  }

                  if (!var8) {
                     break;
                  }

                  ++var6;
               }
            }

            File var18 = my.au;
            tl.an = var18;
            if (!tl.an.exists()) {
               throw new RuntimeException("");
            }

            gm.af = true;
            Tiles.aw_renamed();
            gc.dat2File = new BufferedFile(new AccessFile(fd.af_renamed("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            gc.idx255File = new BufferedFile(new AccessFile(fd.af_renamed("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            ol.idxFiles = new BufferedFile[gc.idxCount * 1064766397];

            for(int var20 = 0; var20 < 1064766397 * gc.idxCount; ++var20) {
               ol.idxFiles[var20] = new BufferedFile(new AccessFile(fd.af_renamed("main_file_cache.idx" + var20), "rw", 1048576L), 6000, 0);
            }
         } catch (Exception var15) {
            ob.af_renamed((String)null, var15);
         }

         ClientScriptFrame.client = this;
         ClientError.au = cg * 1056936977;
         ne.gb = System.getenv("JX_ACCESS_TOKEN");
         Obj.gp = System.getenv("JX_REFRESH_TOKEN");
         SpriteMask.gn = System.getenv("JX_SESSION_ID");
         em.gv = System.getenv("JX_CHARACTER_ID");
         String var19 = System.getenv("JX_DISPLAY_NAME");
         cz.cy = bx.ac_renamed(var19);
         if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
            this.hj = true;
         }

         if (-1 == 838232771 * cr) {
            if (!this.gn() && !this.gv()) {
               cr = 0;
            } else {
               cr = 2078698903;
            }
         }

         this.ak(765, 503, 213, 1);
      }
   }

   public void setOtlTokenRequester(OtlTokenRequester var1) {
      if (null != var1) {
         this.hw = var1;
         ee.ak_renamed(10);
      }
   }

   public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
      if (var1 != null) {
         this.hu = var1;
      }
   }

   public boolean isOnLoginScreen() {
      return dw * -1275976559 == 10;
   }

   public long getAccountHash() {
      return -7932717541542796365L * this.he;
   }

   static int bn_renamed(int var0, ClientScript var1, boolean var2) {
      if (var0 == 5630) {
         ii = 719725026;
         return 1;
      } else {
         return 2;
      }
   }

   boolean gv() {
      return null != SpriteMask.gn && !SpriteMask.gn.trim().isEmpty() && null != em.gv && !em.gv.trim().isEmpty();
   }

   boolean gx() {
      return null != this.hw;
   }

   void gl(String var1) throws IOException {
      HashMap var3 = new HashMap();
      var3.put("grant_type", "refresh_token");
      var3.put("scope", "gamesso.token.create");
      var3.put("refresh_token", var1);
      URL var4 = new URL(ix.hv + "shield/oauth/token" + (new qa(var3)).au());
      pc var5 = new pc();
      var5.ab(hd);
      var5.aw("Host", (new URL(ix.hv)).getHost());
      var5.aa(qz.af);
      aa var6 = aa.af;
      RefreshAccessTokenRequester var7 = this.hu;
      if (null != var7) {
         this.hx = var7.request(var6.ab(), var4, var5.an(), "");
      } else {
         ay var8 = new ay(var4, var6, var5, this.hj);
         this.hm = this.gl.an(var8);
      }
   }

   void hw(String var1, String var2) throws IOException, JSONException {
      URL var4 = new URL(ix.hv + "/game-session/v1/tokens");
      ay var5 = new ay(var4, aa.af, this.hj);
      var5.af().aq(var1);
      var5.af().aa(qz.af);
      JSONObject var6 = new JSONObject();
      var6.put("accountId", (Object)var2);
      var5.an(new qv(var6));
      this.gz = this.gl.an(var5);
   }

   protected final void bm() {
      fl.af_renamed(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
      ClanChat.gw = (0 == -1274626977 * cs ? 'ꩊ' : '鱀' + -453810525 * bw) * -1326916691;
      ec.gc = -1927102761 * (0 == cs * -1274626977 ? 443 : '썐' + -453810525 * bw);
      Inventory.gf = 518729065 * ClanChat.gw;
      PlayerAppearance.ay = mu.af;
      PlayerAppearance.ao = mu.an;
      WorldMapIcon1.ax = mu.aw;
      qv.ai = mu.ac;
      ag.urlRequester = new ef(this.hj, 213);
      this.ai();
      this.av();
      ex.mouseWheel = this.aa();
      this.ah(si, 0);
      this.ah(sh, 1);
      kb.masterDisk = new ArchiveDisk(255, gc.dat2File, gc.idx255File, 500000);
      aj.clientPreferences = he.readClientPreferences();
      this.ay();
      String var3 = ReflectionCheck.bj;
      bx.af = this;
      if (var3 != null) {
         bx.an = var3;
      }

      Decimator.ir_renamed(aj.clientPreferences.bi());
      World.friendSystem = new FriendSystem(co.loginType);
      this.gl = new ag("tokenRequest", 1, 1);
   }

   protected final void bd() {
      ep += -310720817;
      this.hj();

      while(true) {
         ArchiveDiskAction var2;
         synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
            var2 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
         }

         if (null == var2) {
            int var9;
            try {
               if (1 == ly.au * 926096579) {
                  var9 = sa.midiPcmStream.an();
                  if (var9 > 0 && sa.midiPcmStream.isReady()) {
                     var9 -= -1128553755 * ga.aa;
                     if (var9 < 0) {
                        var9 = 0;
                     }

                     sa.midiPcmStream.af(var9);
                  } else {
                     sa.midiPcmStream.ao();
                     sa.midiPcmStream.removeAll();
                     if (ly.ab != null) {
                        ly.au = -1253644330;
                     } else {
                        ly.au = 0;
                     }

                     ia.musicTrack = null;
                     ly.soundCache = null;
                  }
               }
            } catch (Exception var8) {
               var8.printStackTrace();
               sa.midiPcmStream.ao();
               ly.au = 0;
               ia.musicTrack = null;
               ly.soundCache = null;
               ly.ab = null;
            }

            mj.hz_renamed();
            sh.ai();
            this.ag();
            synchronized(MouseHandler.MouseHandler_instance) {
               MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButton0 * 908499211;
               MouseHandler.ay = 1068258211 * MouseHandler.MouseHandler_y0;
               MouseHandler.ao = -1918688485 * MouseHandler.MouseHandler_x0;
               MouseHandler.ax = MouseHandler.at * -4029881570118555541L;
               MouseHandler.ar = MouseHandler.MouseHandler_lastPressedY0 * 199219569;
               MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButton0 * -1850432819;
               MouseHandler.as = MouseHandler.MouseHandler_lastPressedX0 * -1699120075;
               MouseHandler.MouseHandler_lastPressedTimeMillis = 3548908311918388543L * MouseHandler.MouseHandler_lastPressedTimeMillis0;
               MouseHandler.MouseHandler_lastPressedY0 = 0;
            }

            if (ex.mouseWheel != null) {
               var9 = ex.mouseWheel.useRotation();
               mouseWheelRotation = var9 * 1644925127;
            }

            if (dw * -1275976559 == 0) {
               DevicePcmPlayerProvider.hs_renamed();
               Npc.bz_renamed();
            } else if (dw * -1275976559 == 5) {
               EnumType.ab_renamed(this, Language.fontPlain11, WallDecoration.fontPlain12);
               DevicePcmPlayerProvider.hs_renamed();
               Npc.bz_renamed();
            } else if (10 != -1275976559 * dw && 11 != -1275976559 * dw) {
               if (-1275976559 * dw == 20) {
                  EnumType.ab_renamed(this, Language.fontPlain11, WallDecoration.fontPlain12);
                  this.doCycleLoggedOut();
               } else if (dw * -1275976559 == 50) {
                  EnumType.ab_renamed(this, Language.fontPlain11, WallDecoration.fontPlain12);
                  this.doCycleLoggedOut();
               } else if (dw * -1275976559 == 25) {
                  bb.jh_renamed();
               }
            } else {
               EnumType.ab_renamed(this, Language.fontPlain11, WallDecoration.fontPlain12);
            }

            if (-1275976559 * dw == 30) {
               this.hq();
            } else if (40 == dw * -1275976559 || -1275976559 * dw == 45) {
               this.doCycleLoggedOut();
            }

            return;
         }

         var2.archive.load(var2.archiveDisk, (int)var2.hr, var2.data, false);
      }
   }

   protected final void draw(boolean var1) {
      boolean var3;
      label176: {
         try {
            if (926096579 * ly.au == 2) {
               if (ia.musicTrack == null) {
                  ia.musicTrack = MusicTrack.readTrack(ly.ab, oq.aq * -747672747, gz.al * 1412530625);
                  if (ia.musicTrack == null) {
                     var3 = false;
                     break label176;
                  }
               }

               if (null == ly.soundCache) {
                  ly.soundCache = new SoundCache(ly.aw, ly.an);
               }

               if (sa.midiPcmStream.loadMusicTrack(ia.musicTrack, ly.af, ly.soundCache, 22050)) {
                  sa.midiPcmStream.clearAll();
                  sa.midiPcmStream.af(-280777997 * dn.at);
                  sa.midiPcmStream.setMusicTrack(ia.musicTrack, ev.musicTrackBoolean);
                  ly.au = 0;
                  ia.musicTrack = null;
                  ly.soundCache = null;
                  ly.ab = null;
                  var3 = true;
                  break label176;
               }
            }
         } catch (Exception var6) {
            var6.printStackTrace();
            sa.midiPcmStream.ao();
            ly.au = 0;
            ia.musicTrack = null;
            ly.soundCache = null;
            ly.ab = null;
         }

         var3 = false;
      }

      if (var3 && tf && null != bi.pcmPlayer0) {
         bi.pcmPlayer0.ad();
      }

      if ((-1275976559 * dw == 10 || -1275976559 * dw == 20 || 30 == dw * -1275976559) && -3223439394100928671L * rj != 0L && Formatting.af_renamed() > -3223439394100928671L * rj) {
         Decimator.ir_renamed(na.iv_renamed());
      }

      int var5;
      if (var1) {
         for(var5 = 0; var5 < 100; ++var5) {
            rf[var5] = true;
         }
      }

      if (-1275976559 * dw == 0) {
         this.bn(1158424865 * cz.ad, cz.Login_loadingText, var1);
      } else if (5 == dw * -1275976559) {
         aq.drawTitle(fx.fontBold12, Language.fontPlain11, WallDecoration.fontPlain12);
      } else if (dw * -1275976559 != 10 && -1275976559 * dw != 11) {
         if (-1275976559 * dw == 20) {
            aq.drawTitle(fx.fontBold12, Language.fontPlain11, WallDecoration.fontPlain12);
         } else if (dw * -1275976559 == 50) {
            aq.drawTitle(fx.fontBold12, Language.fontPlain11, WallDecoration.fontPlain12);
         } else if (25 == dw * -1275976559) {
            if (1 == je * -2139010133) {
               if (jx * -215929647 > jo * 817023789) {
                  jo = jx * 1957781173;
               }

               var5 = (jo * -2098483510 - jx * 2088419538) / (jo * 817023789);
               jl.ij_renamed(Strings.Strings_loadingPleaseWait + Formatting.Formatting_lineBreakTag + Formatting.Formatting_spaceLeftParenthesis + var5 + "%" + Formatting.Formatting_rightParenthesis, false);
            } else if (-2139010133 * je == 2) {
               if (jk * 1372828241 > jq * 1233759319) {
                  jq = 1072852375 * jk;
               }

               var5 = (jq * 1558423806 - -78064686 * jk) / (jq * 1233759319) + 50;
               jl.ij_renamed(Strings.Strings_loadingPleaseWait + Formatting.Formatting_lineBreakTag + Formatting.Formatting_spaceLeftParenthesis + var5 + "%" + Formatting.Formatting_rightParenthesis, false);
            } else {
               jl.ij_renamed(Strings.Strings_loadingPleaseWait, false);
            }
         } else if (dw * -1275976559 == 30) {
            this.drawLoggedIn();
         } else if (40 == dw * -1275976559) {
            jl.ij_renamed(Strings.Strings_connectionLost + Formatting.Formatting_lineBreakTag + Strings.Strings_pleaseWaitAttemptingToReestablish, false);
         } else if (45 == dw * -1275976559) {
            jl.ij_renamed(Strings.Strings_pleaseWait, false);
         }
      } else {
         aq.drawTitle(fx.fontBold12, Language.fontPlain11, WallDecoration.fontPlain12);
      }

      if (-1275976559 * dw == 30 && 0 == rg * -1928160607 && !var1 && !ro) {
         for(var5 = 0; var5 < -356793645 * rr; ++var5) {
            if (rm[var5]) {
               ia.rasterProvider.draw(rh[var5], rb[var5], rootComponentWidths[var5], rootComponentHeights[var5]);
               rm[var5] = false;
            }
         }
      } else if (dw * -1275976559 > 0) {
         ia.rasterProvider.drawFull(0, 0);

         for(var5 = 0; var5 < rr * -356793645; ++var5) {
            rm[var5] = false;
         }
      }

   }

   protected final void kill0() {
      if (oy.varcs.hasUnwrittenChanges()) {
         oy.varcs.at();
      }

      if (null != eg.mouseRecorder) {
         eg.mouseRecorder.isRunning = false;
      }

      eg.mouseRecorder = null;
      packetWriter.au();
      GraphicsObject.an_renamed();
      ex.mouseWheel = null;
      if (bi.pcmPlayer0 != null) {
         bi.pcmPlayer0.ae((byte)-1);
      }

      if (hd.pcmPlayer1 != null) {
         hd.pcmPlayer1.ae((byte)-1);
      }

      la.ab_renamed();
      fw.ac_renamed();
      if (ag.urlRequester != null) {
         ag.urlRequester.ab();
         ag.urlRequester = null;
      }

      try {
         gc.dat2File.close();

         for(int var2 = 0; var2 < gc.idxCount * 1064766397; ++var2) {
            ol.idxFiles[var2].close();
         }

         gc.idx255File.close();
         gc.randomDat.close();
      } catch (Exception var3) {
      }

      this.gl.aw();
   }

   void hj() {
      if (1000 != -1275976559 * dw) {
         boolean var2 = Tile.af_renamed();
         if (!var2) {
            this.doCycleJs5Connect();
         }

      }
   }

   void doCycleJs5Connect() {
      if (1551453085 * NetCache.NetCache_crcMismatches >= 4) {
         this.br("js5crc");
         fd.hi_renamed(1000);
      } else {
         if (-1386597723 * NetCache.NetCache_ioExceptions >= 4) {
            if (dw * -1275976559 <= 5) {
               this.br("js5io");
               fd.hi_renamed(1000);
               return;
            }

            fo = 1891795480;
            NetCache.NetCache_ioExceptions = -483971193;
         }

         if ((fo -= -185484651) * -95141699 + 1 <= 0) {
            try {
               if (fp * -1348062367 == 0) {
                  WorldMapSection0.js5SocketTask = af.newSocketTask(ea.worldHost, Inventory.gf * -1275160227);
                  fp += 1300738209;
               }

               if (-1348062367 * fp == 1) {
                  if (2 == WorldMapSection0.js5SocketTask.status) {
                     this.js5Error(-1);
                     return;
                  }

                  if (WorldMapSection0.js5SocketTask.status == 1) {
                     fp += 1300738209;
                  }
               }

               if (2 == -1348062367 * fp) {
                  IDKType.js5Socket = hu.af_renamed((Socket)WorldMapSection0.js5SocketTask.result, 40000, 5000);
                  Packet var2 = new Packet(5);
                  var2.bu(15);
                  var2.ba(213);
                  IDKType.js5Socket.ab(var2.array, 0, 5);
                  fp += 1300738209;
                  fi.fx = Formatting.af_renamed() * -51531514477814883L;
               }

               if (fp * -1348062367 == 3) {
                  if (IDKType.js5Socket.aw() > 0) {
                     int var10 = IDKType.js5Socket.ac();
                     if (var10 != 0) {
                        this.js5Error(var10);
                        return;
                     }

                     fp += 1300738209;
                  } else if (Formatting.af_renamed() - fi.fx * 4041510135797154485L > 30000L) {
                     this.js5Error(-2);
                     return;
                  }
               }

               if (-1348062367 * fp == 4) {
                  AbstractSocket var11 = IDKType.js5Socket;
                  boolean var3 = dw * -1275976559 > 20;
                  if (NetCache.af != null) {
                     try {
                        NetCache.af.aq();
                     } catch (Exception var8) {
                     }

                     NetCache.af = null;
                  }

                  NetCache.af = var11;
                  gn.an_renamed(var3);
                  NetCache.ag.index = 0;
                  ClientScript.NetCache_currentResponse = null;
                  NetCache.ah = null;
                  NetCache.av = 0;

                  while(true) {
                     NetFileRequest var4 = (NetFileRequest)NetCache.ab.first();
                     if (var4 == null) {
                        while(true) {
                           var4 = (NetFileRequest)NetCache.ay.first();
                           if (var4 == null) {
                              if (NetCache.ad != 0) {
                                 try {
                                    Packet var12 = new Packet(4);
                                    var12.bu(4);
                                    var12.bu(NetCache.ad);
                                    var12.p2(0);
                                    NetCache.af.ab(var12.array, 0, 4);
                                 } catch (IOException var7) {
                                    try {
                                       NetCache.af.aq();
                                    } catch (Exception var6) {
                                    }

                                    NetCache.NetCache_ioExceptions += -161323731;
                                    NetCache.af = null;
                                 }
                              }

                              NetCache.an = 0;
                              NetCache.aw = Formatting.af_renamed() * -6047020038529116697L;
                              WorldMapSection0.js5SocketTask = null;
                              IDKType.js5Socket = null;
                              fp = 0;
                              js5Errors = 0;
                              return;
                           }

                           NetCache.al.addLast(var4);
                           NetCache.at.put(var4, var4.hr);
                           NetCache.aa += -2069940741;
                           NetCache.ao -= -979537415;
                        }
                     }

                     NetCache.ac.put(var4, var4.hr);
                     NetCache.au += -1320339335;
                     NetCache.aq -= -1677618233;
                  }
               }
            } catch (IOException var9) {
               this.js5Error(-3);
            }

         }
      }
   }

   void js5Error(int var1) {
      WorldMapSection0.js5SocketTask = null;
      IDKType.js5Socket = null;
      fp = 0;
      if (1119961125 * ClanChat.gw == -1275160227 * Inventory.gf) {
         Inventory.gf = 293228307 * ec.gc;
      } else {
         Inventory.gf = 518729065 * ClanChat.gw;
      }

      js5Errors += 1159129441;
      if (-1027638623 * js5Errors < 2 || 7 != var1 && var1 != 9) {
         if (js5Errors * -1027638623 >= 2 && 6 == var1) {
            this.br("js5connect_outofdate");
            fd.hi_renamed(1000);
         } else if (-1027638623 * js5Errors >= 4) {
            if (dw * -1275976559 <= 5) {
               this.br("js5connect");
               fd.hi_renamed(1000);
            } else {
               fo = 1891795480;
            }
         }
      } else if (-1275976559 * dw <= 5) {
         this.br("js5connect_full");
         fd.hi_renamed(1000);
      } else {
         fo = 1891795480;
      }

   }

   final void doCycleLoggedOut() {
      AbstractSocket var2 = packetWriter.getSocket();
      PacketBit var3 = packetWriter.bit;

      try {
         if (0 == loginState * 572310033) {
            if (gk.secureRandom == null && (secureRandomFuture.isDone() || -1687986373 * ga > 250)) {
               gk.secureRandom = secureRandomFuture.get();
               secureRandomFuture.shutdown();
               secureRandomFuture = null;
            }

            if (gk.secureRandom != null) {
               if (var2 != null) {
                  var2.aq();
                  var2 = null;
               }

               an.is = null;
               ik = false;
               ga = 0;
               if (gy.au()) {
                  if (this.gn()) {
                     try {
                        this.gl(Obj.gp);
                        kz.og_renamed(21);
                     } catch (Throwable var20) {
                        ob.af_renamed((String)null, var20);
                        mu.hr_renamed(65);
                        return;
                     }
                  } else {
                     if (!this.gv()) {
                        mu.hr_renamed(65);
                        return;
                     }

                     try {
                        this.hw(SpriteMask.gn, em.gv);
                        kz.og_renamed(20);
                     } catch (Exception var19) {
                        ob.af_renamed((String)null, var19);
                        mu.hr_renamed(65);
                        return;
                     }
                  }
               } else {
                  kz.og_renamed(1);
               }
            }
         }

         aj var22;
         if (loginState * 572310033 == 21) {
            if (this.hx != null) {
               if (!this.hx.isDone()) {
                  return;
               }

               if (this.hx.isCancelled()) {
                  mu.hr_renamed(65);
                  this.hx = null;
                  return;
               }

               try {
                  RefreshAccessTokenResponse var4 = (RefreshAccessTokenResponse)this.hx.get();
                  if (!var4.isSuccess()) {
                     mu.hr_renamed(65);
                     this.hx = null;
                     return;
                  }

                  ne.gb = var4.getAccessToken();
                  Obj.gp = var4.getRefreshToken();
                  this.hx = null;
               } catch (Exception var18) {
                  ob.af_renamed((String)null, var18);
                  mu.hr_renamed(65);
                  this.hx = null;
                  return;
               }
            } else {
               if (this.hm == null) {
                  mu.hr_renamed(65);
                  return;
               }

               if (!this.hm.ac()) {
                  return;
               }

               if (this.hm.aw()) {
                  ob.af_renamed(this.hm.an(), (Throwable)null);
                  mu.hr_renamed(65);
                  this.hm = null;
                  return;
               }

               var22 = this.hm.au();
               if (var22.af() != 200) {
                  mu.hr_renamed(65);
                  this.hm = null;
                  return;
               }

               ga = 0;
               qv var5 = new qv(var22.aw());

               try {
                  ne.gb = var5.aq().getString("access_token");
                  Obj.gp = var5.aq().getString("refresh_token");
               } catch (Exception var17) {
                  ob.af_renamed("Error parsing tokens", var17);
                  mu.hr_renamed(65);
                  this.hm = null;
                  return;
               }
            }

            this.gz(ne.gb);
            kz.og_renamed(20);
         }

         if (20 == loginState * 572310033) {
            if (null != this.hi) {
               if (!this.hi.isDone()) {
                  return;
               }

               if (this.hi.isCancelled()) {
                  mu.hr_renamed(65);
                  this.hi = null;
                  return;
               }

               try {
                  OtlTokenResponse var23 = (OtlTokenResponse)this.hi.get();
                  if (!var23.isSuccess()) {
                     mu.hr_renamed(65);
                     this.hi = null;
                     return;
                  }

                  this.gx = var23.getToken();
                  this.hi = null;
               } catch (Exception var16) {
                  ob.af_renamed((String)null, var16);
                  mu.hr_renamed(65);
                  this.hi = null;
                  return;
               }
            } else {
               if (null == this.gz) {
                  mu.hr_renamed(65);
                  return;
               }

               if (!this.gz.ac()) {
                  return;
               }

               if (this.gz.aw()) {
                  ob.af_renamed(this.gz.an(), (Throwable)null);
                  mu.hr_renamed(65);
                  this.gz = null;
                  return;
               }

               var22 = this.gz.au();
               if (var22.af() != 200) {
                  ob.af_renamed("Response code: " + var22.af() + "Response body: " + var22.aw(), (Throwable)null);
                  mu.hr_renamed(65);
                  this.gz = null;
                  return;
               }

               List var25 = (List)var22.an().get("Content-Type");
               if (null != var25 && var25.contains(qz.af.af())) {
                  try {
                     JSONObject var6 = new JSONObject(var22.aw());
                     this.gx = var6.getString("token");
                  } catch (JSONException var15) {
                     ob.af_renamed((String)null, var15);
                     mu.hr_renamed(65);
                     this.gz = null;
                     return;
                  }
               } else {
                  this.gx = var22.aw();
               }

               this.gz = null;
            }

            ga = 0;
            kz.og_renamed(1);
         }

         if (572310033 * loginState == 1) {
            if (null == an.is) {
               an.is = af.newSocketTask(ea.worldHost, Inventory.gf * -1275160227);
            }

            if (an.is.status == 2) {
               throw new IOException();
            }

            if (1 == an.is.status) {
               var2 = hu.af_renamed((Socket)an.is.result, 40000, 5000);
               packetWriter.setSocket(var2);
               an.is = null;
               kz.og_renamed(2);
            }
         }

         PacketBitNode var24;
         if (loginState * 572310033 == 2) {
            packetWriter.af();
            var24 = sh.aw_renamed();
            var24.bit.bu(537668749 * LoginProt.af.id);
            packetWriter.aw(var24);
            packetWriter.an();
            var3.at = 0;
            kz.og_renamed(3);
         }

         int var27;
         if (3 == loginState * 572310033) {
            if (null != bi.pcmPlayer0) {
               bi.pcmPlayer0.az();
            }

            if (null != hd.pcmPlayer1) {
               hd.pcmPlayer1.az();
            }

            if (var2.an(1)) {
               var27 = var2.ac();
               if (null != bi.pcmPlayer0) {
                  bi.pcmPlayer0.az();
               }

               if (null != hd.pcmPlayer1) {
                  hd.pcmPlayer1.az();
               }

               if (var27 != 0) {
                  mu.hr_renamed(var27);
                  return;
               }

               var3.at = 0;
               kz.og_renamed(4);
            }
         }

         if (572310033 * loginState == 4) {
            if (var3.at * -1633313603 < 8) {
               var27 = var2.aw();
               if (var27 > 8 - var3.at * -1633313603) {
                  var27 = 8 - var3.at * -1633313603;
               }

               if (var27 > 0) {
                  var2.au(var3.al, -1633313603 * var3.at, var27);
                  var3.at += var27 * -1516355947;
               }
            }

            if (8 == var3.at * -1633313603) {
               var3.at = 0;
               GrandExchangeEvent.il = var3.cv() * 6538327643922962445L;
               kz.og_renamed(5);
            }
         }

         int var7;
         if (5 == 572310033 * loginState) {
            packetWriter.bit.at = 0;
            packetWriter.af();
            PacketBit var33 = new PacketBit(500);
            int[] var26 = new int[]{gk.secureRandom.nextInt(), gk.secureRandom.nextInt(), gk.secureRandom.nextInt(), gk.secureRandom.nextInt()};
            var33.at = 0;
            var33.bu(1);
            var33.ba(var26[0]);
            var33.ba(var26[1]);
            var33.ba(var26[2]);
            var33.ba(var26[3]);
            var33.bl(7290179413469624005L * GrandExchangeEvent.il);
            if (dw * -1275976559 == 40) {
               var33.ba(Huffman.hk[0]);
               var33.ba(Huffman.hk[1]);
               var33.ba(Huffman.hk[2]);
               var33.ba(Huffman.hk[3]);
            } else {
               if (50 == dw * -1275976559) {
                  var33.bu(fp.au.af());
                  var33.ba(ByteArrayPool.ck * -431815809);
               } else {
                  var33.bu(gh.af());
                  switch (gh.ab * 1915854149) {
                     case 0:
                        var33.at += -1770456492;
                        break;
                     case 1:
                     case 3:
                        var33.bq(1750214827 * hp.ct);
                        var33.at += -1516355947;
                        break;
                     case 2:
                        var33.ba(aj.clientPreferences.bx(cz.ca));
                  }
               }

               if (gy.au()) {
                  var33.bu(sr.an.af());
                  var33.bh(this.gx);
               } else {
                  var33.bu(sr.af.af());
                  var33.bh(cz.cu);
               }
            }

            var33.dz(co.af, co.an);
            Huffman.hk = var26;
            PacketBitNode var29 = sh.aw_renamed();
            var29.bit.at = 0;
            if (40 == dw * -1275976559) {
               var29.bit.bu(537668749 * LoginProt.ac.id);
            } else {
               var29.bit.bu(537668749 * LoginProt.aw.id);
            }

            var29.bit.bf(0);
            var7 = var29.bit.at * -1633313603;
            var29.bit.ba(213);
            var29.bit.ba(1);
            var29.bit.bu(cg * -749752677);
            var29.bit.bu(cr * 838232771);
            byte var8 = 0;
            var29.bit.bu(var8);
            var29.bit.cs(var33.al, 0, var33.at * -1633313603);
            int var9 = var29.bit.at * -1633313603;
            var29.bit.bh(cz.ca);
            var29.bit.bu((ro ? 1 : 0) << 1 | (cu ? 1 : 0));
            var29.bit.bf(aj * -1687260435);
            var29.bit.bf(1658005443 * kd.ak);
            oa.nj_renamed(var29.bit);
            var29.bit.bh(ef.cm);
            var29.bit.ba(1640118701 * TriBool.cf);
            Packet var10 = new Packet(en.platformInfo.size());
            en.platformInfo.write(var10);
            var29.bit.cs(var10.array, 0, var10.array.length);
            var29.bit.bu(cg * -749752677);
            var29.bit.ba(0);
            var29.bit.el(DevicePcmPlayerProvider.archive0.bk * -159523507);
            var29.bit.el(-159523507 * nt.archive11.bk);
            var29.bit.eb(nn.archive5.bk * -159523507);
            var29.bit.es(rr.archive7.bk * -159523507);
            var29.bit.eb(-159523507 * ey.fm.bk);
            var29.bit.es(-159523507 * NetFileRequest.archive9.bk);
            var29.bit.ba(pj.archive6.bk * -159523507);
            var29.bit.es(dk.archive2.bk * -159523507);
            var29.bit.es(dk.archive3.bk * -159523507);
            var29.bit.eb(-159523507 * bi.archive12.bk);
            var29.bit.es(-159523507 * id.archive15.bk);
            var29.bit.el(ei.fg.bk * -159523507);
            var29.bit.el(WorldMapLabelSize.archive8.bk * -159523507);
            var29.bit.es(-159523507 * FloorUnderlayType.fr.bk);
            var29.bit.eb(-159523507 * gw.go.bk);
            var29.bit.es(-159523507 * hc.archive10.bk);
            var29.bit.es(-159523507 * ServerBuild.archive1.bk);
            var29.bit.el(-159523507 * he.archive13.bk);
            var29.bit.el(0);
            var29.bit.eb(-159523507 * qc.archive4.bk);
            var29.bit.el(ey.archive16.bk * -159523507);
            var29.bit.dt(var26, var9, -1633313603 * var29.bit.at);
            var29.bit.ca(var29.bit.at * -1633313603 - var7);
            packetWriter.aw(var29);
            packetWriter.an();
            packetWriter.au = new Isaac(var26);
            int[] var11 = new int[4];

            for(int var12 = 0; var12 < 4; ++var12) {
               var11[var12] = 50 + var26[var12];
            }

            var3.newIsaac(var11);
            kz.og_renamed(6);
         }

         int var28;
         if (6 == loginState * 572310033 && var2.aw() > 0) {
            var27 = var2.ac();
            if (var27 == 61) {
               var28 = var2.aw();
               WorldMapSectionType.ds = 1 == var28 && var2.ac() == 1;
               kz.og_renamed(5);
            }

            if (var27 == 21 && 20 == -1275976559 * dw) {
               kz.og_renamed(12);
            } else if (var27 == 2) {
               kz.og_renamed(14);
            } else if (15 == var27 && dw * -1275976559 == 40) {
               packetWriter.al = -1873812295;
               kz.og_renamed(19);
            } else if (64 == var27) {
               kz.og_renamed(10);
            } else if (23 == var27 && gt * -858790111 < 1) {
               gt += 494296289;
               kz.og_renamed(0);
            } else if (29 == var27) {
               kz.og_renamed(17);
            } else {
               if (69 != var27) {
                  mu.hr_renamed(var27);
                  return;
               }

               kz.og_renamed(7);
            }
         }

         if (572310033 * loginState == 7 && var2.aw() >= 2) {
            var2.au(var3.al, 0, 2);
            var3.at = 0;
            ai.gk = var3.cl() * -1251228575;
            kz.og_renamed(8);
         }

         if (572310033 * loginState == 8 && var2.aw() >= 935976865 * ai.gk) {
            var3.at = 0;
            var2.au(var3.al, var3.at * -1633313603, ai.gk * 935976865);
            aq[] var36 = new aq[]{aq.af};
            aq var30 = var36[var3.cm()];

            try {
               ac var31 = ej.af_renamed(var30);
               this.hp = new al(var3, var31);
               kz.og_renamed(9);
            } catch (Exception var14) {
               mu.hr_renamed(22);
               return;
            }
         }

         if (loginState * 572310033 == 9 && this.hp.af()) {
            this.ha = this.hp.aw();
            this.hp.an();
            this.hp = null;
            if (null == this.ha) {
               mu.hr_renamed(22);
               return;
            }

            packetWriter.af();
            var24 = sh.aw_renamed();
            var24.bit.bu(LoginProt.au.id * 537668749);
            var24.bit.bf(-1633313603 * this.ha.index);
            var24.bit.cc(this.ha);
            packetWriter.aw(var24);
            packetWriter.an();
            this.ha = null;
            kz.og_renamed(6);
         }

         if (10 == 572310033 * loginState && var2.aw() > 0) {
            DevicePcmPlayerProvider.gi = var2.ac() * 1844861787;
            kz.og_renamed(11);
         }

         if (loginState * 572310033 == 11 && var2.aw() >= 1874484435 * DevicePcmPlayerProvider.gi) {
            var2.au(var3.al, 0, DevicePcmPlayerProvider.gi * 1874484435);
            var3.at = 0;
            kz.og_renamed(6);
         }

         if (12 == loginState * 572310033 && var2.aw() > 0) {
            gu = (var2.ac() + 3) * -956596276;
            kz.og_renamed(13);
         }

         if (loginState * 572310033 == 13) {
            ga = 0;
            he.ax_renamed(Strings.bf, Strings.bq, gu * 1922908789 / 60 + Strings.ba);
            if ((gu -= -2091844131) * 1922908789 <= 0) {
               kz.og_renamed(0);
            }

         } else {
            if (loginState * 572310033 == 14 && var2.aw() >= 1) {
               al.gm = var2.ac() * 296961217;
               kz.og_renamed(15);
            }

            if (15 == 572310033 * loginState && var2.aw() >= al.gm * -1894298815) {
               boolean var38 = var2.ac() == 1;
               var2.au(var3.al, 0, 4);
               var3.at = 0;
               boolean var32 = false;
               if (var38) {
                  var28 = var3.gIsaac1() << 24;
                  var28 |= var3.gIsaac1() << 16;
                  var28 |= var3.gIsaac1() << 8;
                  var28 |= var3.gIsaac1();
                  aj.clientPreferences.be(cz.ca, var28);
               }

               if (hb) {
                  aj.clientPreferences.ad(cz.ca);
               } else {
                  aj.clientPreferences.ad((String)null);
               }

               dn.ac_renamed();
               pu = var2.ac() * -345023019;
               po = var2.ac() == 1;
               localPlayerIndex = var2.ac() * 255869677;
               localPlayerIndex = 255869677 * (localPlayerIndex * -549033243 << 8);
               localPlayerIndex += var2.ac() * 255869677;
               mo = var2.ac() * 361347949;
               var2.au(var3.al, 0, 8);
               var3.at = 0;
               this.he = var3.cv() * 714003291813872507L;
               if (-1894298815 * al.gm >= 29) {
                  var2.au(var3.al, 0, 8);
                  var3.at = 0;
                  mn = var3.cv() * 1369385558963036297L;
               }

               var2.au(var3.al, 0, 1);
               var3.at = 0;
               ServerProt[] var34 = PacketBitNode.af_renamed();
               var7 = var3.gIsaacSmart1or2();
               if (var7 < 0 || var7 >= var34.length) {
                  throw new IOException(var7 + " " + var3.at * -1633313603);
               }

               packetWriter.serverPacket0 = var34[var7];
               packetWriter.al = packetWriter.serverPacket0.id * -1975731211;
               var2.au(var3.al, 0, 2);
               var3.at = 0;
               packetWriter.al = var3.cl() * 1873812295;

               try {
                  by.an_renamed(ClientScriptFrame.client, "zap");
               } catch (Throwable var13) {
               }

               kz.og_renamed(16);
            }

            if (572310033 * loginState != 16) {
               if (572310033 * loginState == 17 && var2.aw() >= 2) {
                  var3.at = 0;
                  var2.au(var3.al, 0, 2);
                  var3.at = 0;
                  au.gq = var3.cl() * -76488733;
                  kz.og_renamed(18);
               }

               if (572310033 * loginState == 18 && var2.aw() >= au.gq * -1182573109) {
                  var3.at = 0;
                  var2.au(var3.al, 0, au.gq * -1182573109);
                  var3.at = 0;
                  String var42 = var3.cw();
                  String var40 = var3.cw();
                  String var37 = var3.cw();
                  he.ax_renamed(var42, var40, var37);
                  fd.hi_renamed(10);
                  if (gy.au()) {
                     ee.ak_renamed(9);
                  }
               }

               if (19 == loginState * 572310033) {
                  if (889658999 * packetWriter.al == -1) {
                     if (var2.aw() < 2) {
                        return;
                     }

                     var2.au(var3.al, 0, 2);
                     var3.at = 0;
                     packetWriter.al = var3.cl() * 1873812295;
                  }

                  if (var2.aw() >= packetWriter.al * 889658999) {
                     var2.au(var3.al, 0, 889658999 * packetWriter.al);
                     var3.at = 0;
                     var27 = packetWriter.al * 889658999;
                     timer.ab();
                     em.hh_renamed();
                     qi.updatePlayer(var3);
                     if (var3.at * -1633313603 != var27) {
                        throw new RuntimeException();
                     }
                  }
               } else {
                  ga += -1982717453;
                  if (ga * -1687986373 > 2000) {
                     if (-858790111 * gt < 1) {
                        if (ClanChat.gw * 1119961125 == Inventory.gf * -1275160227) {
                           Inventory.gf = ec.gc * 293228307;
                        } else {
                           Inventory.gf = 518729065 * ClanChat.gw;
                        }

                        gt += 494296289;
                        kz.og_renamed(0);
                     } else {
                        mu.hr_renamed(-3);
                     }
                  }
               }
            } else {
               if (var2.aw() >= 889658999 * packetWriter.al) {
                  var3.at = 0;
                  var2.au(var3.al, 0, 889658999 * packetWriter.al);
                  timer.ac();
                  mouseLastLastPressedTimeMillis = 3648848592458615261L;
                  eg.mouseRecorder.index = 0;
                  AbstractByteArrayCopier.bf = true;
                  ej = true;
                  sc = -4061967902176514943L;
                  bt.reflectionChecks = new IterableNodeDeque();
                  packetWriter.af();
                  packetWriter.bit.at = 0;
                  packetWriter.serverPacket0 = null;
                  packetWriter.ao = null;
                  packetWriter.ax = null;
                  packetWriter.ai = null;
                  packetWriter.al = 0;
                  packetWriter.aa = 0;
                  ea = 0;
                  ii = 0;
                  eu = 0;
                  menuOptionsCount = 0;
                  isMiniMenuOpen = false;
                  MouseHandler.MouseHandler_idleCycles = 0;
                  ga.aq_renamed();
                  oq = 0;
                  om = false;
                  soundEffectCount = 0;
                  kf = 0;
                  lv = 0;
                  fi.wc = null;
                  tp = 0;
                  sp = 1715437485;
                  te = 0;
                  th = 0;
                  em = dj.ac;
                  ew = dj.ac;
                  iw = 0;
                  ds.ab = 0;

                  for(var27 = 0; var27 < 2048; ++var27) {
                     ds.au[var27] = null;
                     ds.ac[var27] = iu.aw;
                  }

                  for(var27 = 0; var27 < 2048; ++var27) {
                     players[var27] = null;
                  }

                  for(var27 = 0; var27 < 65536; ++var27) {
                     npcs[var27] = null;
                  }

                  nl = -1035820595;
                  projectiles.af();
                  graphicsObjects.af();

                  for(var27 = 0; var27 < 4; ++var27) {
                     for(var28 = 0; var28 < 104; ++var28) {
                        for(int var35 = 0; var35 < 104; ++var35) {
                           objStacks[var27][var28][var35] = null;
                        }
                     }
                  }

                  nn = new NodeDeque();
                  World.friendSystem.clear();

                  for(var27 = 0; var27 < gz.an * -774485467; ++var27) {
                     gz var39 = GraphicsDefaults.af_renamed(var27);
                     if (var39 != null) {
                        Varps.Varps_temp[var27] = 0;
                        Varps.Varps_main[var27] = 0;
                     }
                  }

                  oy.varcs.aq();
                  pt = 1296642255;
                  if (or * -896157613 != -1) {
                     var27 = or * -896157613;
                     if (var27 != -1 && kt.loadedInterfaces[var27]) {
                        eb.Component_archive.cl(var27);
                        if (hn.interfaceComponents[var27] != null) {
                           for(var28 = 0; var28 < hn.interfaceComponents[var27].length; ++var28) {
                              if (hn.interfaceComponents[var27][var28] != null) {
                                 hn.interfaceComponents[var27][var28] = null;
                              }
                           }

                           hn.interfaceComponents[var27] = null;
                           kt.loadedInterfaces[var27] = false;
                        }
                     }
                  }

                  for(InterfaceParent var41 = (InterfaceParent)interfaceParents.first(); null != var41; var41 = (InterfaceParent)interfaceParents.next()) {
                     nv.closeInterface(var41, true);
                  }

                  or = 32945189;
                  interfaceParents = new NodeHashTable(8);
                  pg = null;
                  menuOptionsCount = 0;
                  isMiniMenuOpen = false;
                  vh.an((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

                  for(var27 = 0; var27 < 8; ++var27) {
                     playerMenuActions[var27] = null;
                     no[var27] = false;
                  }

                  Inventory.itemContainers = new NodeHashTable(32);
                  da = true;

                  for(var27 = 0; var27 < 100; ++var27) {
                     rf[var27] = true;
                  }

                  an.io_renamed();
                  es.clanChat = null;
                  ObjType.sq = null;
                  Arrays.fill(sg, (Object)null);
                  MouseHandler.sx = null;
                  Arrays.fill(so, (Object)null);

                  for(var27 = 0; var27 < 8; ++var27) {
                     grandExchangeOffers[var27] = new GrandExchangeOffer();
                  }

                  oh.grandExchangeEvents = null;
                  qi.updatePlayer(var3);
                  bi.ji = -1006050753;
                  ec.loadRegions(false, var3);
                  packetWriter.serverPacket0 = null;
               }

            }
         }
      } catch (IOException var21) {
         if (gt * -858790111 < 1) {
            if (1119961125 * ClanChat.gw == Inventory.gf * -1275160227) {
               Inventory.gf = 293228307 * ec.gc;
            } else {
               Inventory.gf = 518729065 * ClanChat.gw;
            }

            gt += 494296289;
            kz.og_renamed(0);
         } else {
            mu.hr_renamed(-2);
         }
      }
   }

   final void hq() {
      if (ea * -1496573241 > 1) {
         ea -= 1317177079;
      }

      if (ii * 1705142349 > 0) {
         ii -= -100200315;
      }

      if (ik) {
         ik = false;
         ng.ht_renamed();
      } else {
         if (!isMiniMenuOpen) {
            gr.kw_renamed();
         }

         int var2;
         for(var2 = 0; var2 < 100 && this.ja(packetWriter); ++var2) {
         }

         if (30 == -1275976559 * dw) {
            while(true) {
               ReflectionCheck var3 = (ReflectionCheck)bt.reflectionChecks.last();
               boolean var17;
               if (null == var3) {
                  var17 = false;
               } else {
                  var17 = true;
               }

               int var4;
               PacketBitNode var18;
               if (!var17) {
                  PacketBitNode var19;
                  int var20;
                  if (timer.aw) {
                     var19 = mi.an_renamed(ClientProt.dz, packetWriter.au);
                     var19.bit.bu(0);
                     var20 = -1633313603 * var19.bit.at;
                     timer.write(var19.bit);
                     var19.bit.cu(-1633313603 * var19.bit.at - var20);
                     packetWriter.aw(var19);
                     timer.au();
                  }

                  int var5;
                  int var6;
                  int var7;
                  int var8;
                  int var9;
                  int var10;
                  int var11;
                  int var12;
                  int var13;
                  synchronized(eg.mouseRecorder.lock) {
                     if (!bh) {
                        eg.mouseRecorder.index = 0;
                     } else if (0 != -1222491879 * MouseHandler.ar || 535437747 * eg.mouseRecorder.index >= 40) {
                        var18 = null;
                        var4 = 0;
                        var5 = 0;
                        var6 = 0;
                        var7 = 0;

                        for(var8 = 0; var8 < 535437747 * eg.mouseRecorder.index && (var18 == null || -1633313603 * var18.bit.at - var4 < 246); ++var8) {
                           var5 = var8;
                           var9 = eg.mouseRecorder.ys[var8];
                           if (var9 < -1) {
                              var9 = -1;
                           } else if (var9 > 65534) {
                              var9 = 65534;
                           }

                           var10 = eg.mouseRecorder.xs[var8];
                           if (var10 < -1) {
                              var10 = -1;
                           } else if (var10 > 65534) {
                              var10 = 65534;
                           }

                           if (et * -751176573 != var10 || ef * -2076298705 != var9) {
                              if (var18 == null) {
                                 var18 = mi.an_renamed(ClientProt.df, packetWriter.au);
                                 var18.bit.bu(0);
                                 var4 = var18.bit.at * -1633313603;
                                 PacketBit var10000 = var18.bit;
                                 var10000.at += 1262255402;
                                 var6 = 0;
                                 var7 = 0;
                              }

                              if (-1L != ez * 8511124946921102523L) {
                                 var11 = var10 - -751176573 * et;
                                 var12 = var9 - -2076298705 * ef;
                                 var13 = (int)((eg.mouseRecorder.millis[var8] - ez * 8511124946921102523L) / 20L);
                                 var6 = (int)((long)var6 + (eg.mouseRecorder.millis[var8] - ez * 8511124946921102523L) % 20L);
                              } else {
                                 var11 = var10;
                                 var12 = var9;
                                 var13 = Integer.MAX_VALUE;
                              }

                              et = -791348693 * var10;
                              ef = 824333519 * var9;
                              if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                 var11 += 32;
                                 var12 += 32;
                                 var18.bit.bf((var13 << 12) + (var11 << 6) + var12);
                              } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                                 var11 += 128;
                                 var12 += 128;
                                 var18.bit.bu(var13 + 128);
                                 var18.bit.bf((var11 << 8) + var12);
                              } else if (var13 < 32) {
                                 var18.bit.bu(var13 + 192);
                                 if (var10 != -1 && var9 != -1) {
                                    var18.bit.ba(var10 | var9 << 16);
                                 } else {
                                    var18.bit.ba(Integer.MIN_VALUE);
                                 }
                              } else {
                                 var18.bit.bf((var13 & 8191) + '\ue000');
                                 if (var10 != -1 && var9 != -1) {
                                    var18.bit.ba(var10 | var9 << 16);
                                 } else {
                                    var18.bit.ba(Integer.MIN_VALUE);
                                 }
                              }

                              ++var7;
                              ez = 2560228884295272563L * eg.mouseRecorder.millis[var8];
                           }
                        }

                        if (null != var18) {
                           var18.bit.cu(var18.bit.at * -1633313603 - var4);
                           var8 = var18.bit.at * -1633313603;
                           var18.bit.at = -1516355947 * var4;
                           var18.bit.bu(var6 / var7);
                           var18.bit.bu(var6 % var7);
                           var18.bit.at = -1516355947 * var8;
                           packetWriter.aw(var18);
                        }

                        if (var5 >= eg.mouseRecorder.index * 535437747) {
                           eg.mouseRecorder.index = 0;
                        } else {
                           MouseRecorder var46 = eg.mouseRecorder;
                           var46.index -= -1762036357 * var5;
                           System.arraycopy(eg.mouseRecorder.xs, var5, eg.mouseRecorder.xs, 0, eg.mouseRecorder.index * 535437747);
                           System.arraycopy(eg.mouseRecorder.ys, var5, eg.mouseRecorder.ys, 0, 535437747 * eg.mouseRecorder.index);
                           System.arraycopy(eg.mouseRecorder.millis, var5, eg.mouseRecorder.millis, 0, eg.mouseRecorder.index * 535437747);
                        }
                     }
                  }

                  PacketBitNode var29;
                  if (1 == -1222491879 * MouseHandler.ar || !su.ev && 4 == MouseHandler.ar * -1222491879 || MouseHandler.ar * -1222491879 == 2) {
                     long var21 = MouseHandler.MouseHandler_lastPressedTimeMillis * -1442809844282041895L - 2243792022961482123L * mouseLastLastPressedTimeMillis;
                     if (var21 > 32767L) {
                        var21 = 32767L;
                     }

                     mouseLastLastPressedTimeMillis = 5332065808650620587L * MouseHandler.MouseHandler_lastPressedTimeMillis;
                     var4 = 1163896205 * MouseHandler.as;
                     if (var4 < 0) {
                        var4 = 0;
                     } else if (var4 > 1658005443 * kd.ak) {
                        var4 = kd.ak * 1658005443;
                     }

                     var5 = 2020601481 * MouseHandler.MouseHandler_lastButton;
                     if (var5 < 0) {
                        var5 = 0;
                     } else if (var5 > -1687260435 * aj) {
                        var5 = -1687260435 * aj;
                     }

                     var6 = (int)var21;
                     var29 = mi.an_renamed(ClientProt.ai, packetWriter.au);
                     var29.bit.bf((2 == MouseHandler.ar * -1222491879 ? 1 : 0) + (var6 << 1));
                     var29.bit.bf(var5);
                     var29.bit.bf(var4);
                     packetWriter.aw(var29);
                  }

                  if (sh.ac * 1888573011 > 0) {
                     var19 = mi.an_renamed(ClientProt.ab, packetWriter.au);
                     var19.bit.bf(0);
                     var20 = -1633313603 * var19.bit.at;
                     long var22 = Formatting.af_renamed();

                     for(var6 = 0; var6 < 1888573011 * sh.ac; ++var6) {
                        long var32 = var22 - 8736327498043665535L * sc;
                        if (var32 > 16777215L) {
                           var32 = 16777215L;
                        }

                        sc = var22 * 4061967902176514943L;
                        var19.bit.ez((int)var32);
                        var19.bit.bu(sh.aw[var6]);
                     }

                     var19.bit.ca(var19.bit.at * -1633313603 - var20);
                     packetWriter.aw(var19);
                  }

                  if (lt * -1504372859 > 0) {
                     lt -= 1691830605;
                  }

                  if (sh.av(96) || sh.av(97) || sh.av(98) || sh.av(99)) {
                     lz = true;
                  }

                  if (lz && lt * -1504372859 <= 0) {
                     lt = -523126268;
                     lz = false;
                     var19 = mi.an_renamed(ClientProt.cd, packetWriter.au);
                     var19.bit.bf(kf * 704283033);
                     var19.bit.bf(-954734641 * kp);
                     packetWriter.aw(var19);
                  }

                  if (AbstractByteArrayCopier.bf && !ej) {
                     ej = true;
                     var19 = mi.an_renamed(ClientProt.cy, packetWriter.au);
                     var19.bit.bu(1);
                     packetWriter.aw(var19);
                  }

                  if (!AbstractByteArrayCopier.bf && ej) {
                     ej = false;
                     var19 = mi.an_renamed(ClientProt.cy, packetWriter.au);
                     var19.bit.bu(0);
                     packetWriter.aw(var19);
                  }

                  if (null != ey.worldMap0) {
                     ey.worldMap0.an();
                  }

                  Coord.if_renamed();
                  MapElementType.ia_renamed();
                  ea.iu_renamed();
                  if (30 != dw * -1275976559) {
                     return;
                  }

                  for(dg var23 = (dg)nn.last(); null != var23; var23 = (dg)nn.previous()) {
                     if (var23.ag * 1457211081 > 0) {
                        var23.ag -= 376812409;
                     }

                     if (0 == var23.ag * 1457211081) {
                        if (var23.au * 637177597 < 0 || hc.aj_renamed(637177597 * var23.au, var23.aq * 1599541283)) {
                           do.ku_renamed(var23.af * 593068225, -1586499579 * var23.an, 68300005 * var23.aw, 800888185 * var23.ac, var23.au * 637177597, -1665966001 * var23.ab, var23.aq * 1599541283, var23.ay * 1699404385);
                           var23.ga();
                        }
                     } else {
                        if (-536117851 * var23.ai > 0) {
                           var23.ai -= 237969965;
                        }

                        if (-536117851 * var23.ai == 0 && 68300005 * var23.aw >= 1 && 800888185 * var23.ac >= 1 && var23.aw * 68300005 <= 102 && 800888185 * var23.ac <= 102 && (var23.al * 552715177 < 0 || hc.aj_renamed(var23.al * 552715177, var23.aa * -1966402261))) {
                           do.ku_renamed(var23.af * 593068225, -1586499579 * var23.an, var23.aw * 68300005, var23.ac * 800888185, 552715177 * var23.al, 120493739 * var23.at, var23.aa * -1966402261, 1699404385 * var23.ay);
                           var23.ai = -237969965;
                           if (var23.au * 637177597 == 552715177 * var23.al && -1 == var23.au * 637177597) {
                              var23.ga();
                           } else if (637177597 * var23.au == var23.al * 552715177 && -1665966001 * var23.ab == var23.at * 120493739 && -1966402261 * var23.aa == var23.aq * 1599541283) {
                              var23.ga();
                           }
                        }
                     }
                  }

                  int var10002;
                  for(var2 = 0; var2 < soundEffectCount * -297150195; ++var2) {
                     var10002 = tg[var2]--;
                     if (tg[var2] >= -10) {
                        SoundEffect var24 = soundEffects[var2];
                        if (null == var24) {
                           SoundEffect var47 = (SoundEffect)null;
                           var24 = SoundEffect.readSoundEffect(qc.archive4, tu[var2], 0);
                           if (var24 == null) {
                              continue;
                           }

                           int[] var48 = tg;
                           var48[var2] += var24.aw();
                           soundEffects[var2] = var24;
                        }

                        if (tg[var2] < 0) {
                           if (tb[var2] != 0) {
                              var5 = (tb[var2] & 255) * 128;
                              var6 = tb[var2] >> 16 & 255;
                              var7 = 128 * var6 + 64 - MusicPatchNode.localPlayer.bx * 1144428983;
                              if (var7 < 0) {
                                 var7 = -var7;
                              }

                              var8 = tb[var2] >> 8 & 255;
                              var9 = 64 + var8 * 128 - -411750205 * MusicPatchNode.localPlayer.bo;
                              if (var9 < 0) {
                                 var9 = -var9;
                              }

                              var10 = var7 + var9 - 128;
                              if (var10 > var5) {
                                 tg[var2] = -100;
                                 continue;
                              }

                              if (var10 < 0) {
                                 var10 = 0;
                              }

                              var4 = (var5 - var10) * aj.clientPreferences.az() / var5;
                           } else {
                              var4 = aj.clientPreferences.aj();
                           }

                           if (var4 > 0) {
                              RawSound var25 = var24.toRawSound().resample(WorldMapSectionType.decimator);
                              RawPcmStream var33 = RawPcmStream.aw_renamed(var25, 100, var4);
                              var33.aa(tr[var2] - 1);
                              fe.pcmStreamMixer.addSubStream(var33);
                           }

                           tg[var2] = -100;
                        }
                     } else {
                        soundEffectCount -= 831233477;

                        for(var20 = var2; var20 < soundEffectCount * -297150195; ++var20) {
                           tu[var20] = tu[1 + var20];
                           soundEffects[var20] = soundEffects[var20 + 1];
                           tr[var20] = tr[1 + var20];
                           tg[var20] = tg[var20 + 1];
                           tb[var20] = tb[var20 + 1];
                        }

                        --var2;
                     }
                  }

                  if (tf && !au.al_renamed()) {
                     if (aj.clientPreferences.am() != 0 && -1 != tz * 1976903761) {
                        Message.aw_renamed(pj.archive6, 1976903761 * tz, 0, aj.clientPreferences.am(), false);
                     }

                     tf = false;
                  }

                  PacketWriter var49 = packetWriter;
                  var49.aa += -18974871;
                  if (997558489 * packetWriter.aa > 750) {
                     ng.ht_renamed();
                     return;
                  }

                  hy.in_renamed();
                  EnumType.ic_renamed();
                  int[] var30 = ds.aq;

                  for(var20 = 0; var20 < -2010934433 * ds.ab; ++var20) {
                     Player var26 = players[var30[var20]];
                     if (null != var26 && var26.cs * -536830723 > 0) {
                        var26.cs -= 1655791701;
                        if (var26.cs * -536830723 == 0) {
                           var26.bw = null;
                        }
                     }
                  }

                  for(var20 = 0; var20 < 265474485 * iw; ++var20) {
                     var4 = iy[var20];
                     Npc var27 = npcs[var4];
                     if (var27 != null && -536830723 * var27.cs > 0) {
                        var27.cs -= 1655791701;
                        if (var27.cs * -536830723 == 0) {
                           var27.bw = null;
                        }
                     }
                  }

                  ja += -603147329;
                  if (-1306273505 * mv != 0) {
                     me += 2130385748;
                     if (me * 1513573489 >= 400) {
                        mv = 0;
                     }
                  }

                  Component var34 = MidiPcmStream.oh;
                  Component var37 = fe.os;
                  MidiPcmStream.oh = null;
                  fe.os = null;
                  pz = null;
                  px = false;
                  pq = false;
                  sm = 0;

                  while(sh.ag() && sm * -1685179677 < 128) {
                     if (324465533 * pu >= 2 && sh.av(82) && 66 == 546317845 * sh.ai) {
                        StringBuilder var28 = new StringBuilder();

                        Message var41;
                        for(Iterator var36 = Messages.Messages_hashTable.iterator(); var36.hasNext(); var28.append(var41.sender).append('\n')) {
                           var41 = (Message)var36.next();
                           if (null != var41.text && !var41.text.isEmpty()) {
                              var28.append(var41.text).append(':');
                           }
                        }

                        String var31 = var28.toString();
                        ClientScriptFrame.client.ao(var31);
                     } else if (lv * 986256295 != 1 || sh.ax <= 0) {
                        sz[sm * -1685179677] = sh.ai * 546317845;
                        sk[sm * -1685179677] = sh.ax;
                        sm += 703505099;
                     }
                  }

                  boolean var35 = pu * 324465533 >= 2;
                  PacketBitNode var38;
                  if (var35 && sh.av(82) && sh.av(81) && -121753353 * mouseWheelRotation != 0) {
                     var5 = -1900490645 * MusicPatchNode.localPlayer.ad - mouseWheelRotation * -121753353;
                     if (var5 < 0) {
                        var5 = 0;
                     } else if (var5 > 3) {
                        var5 = 3;
                     }

                     if (MusicPatchNode.localPlayer.ad * -1900490645 != var5) {
                        var6 = jm.ib * -1232093375 + MusicPatchNode.localPlayer.dy[0];
                        var7 = 827352769 * Scenery.jc + MusicPatchNode.localPlayer.ds[0];
                        var38 = mi.an_renamed(ClientProt.cq, packetWriter.au);
                        var38.bit.eb(0);
                        var38.bit.dy(var6);
                        var38.bit.dh(var5);
                        var38.bit.ds(var7);
                        packetWriter.aw(var38);
                     }

                     mouseWheelRotation = 0;
                  }

                  if (1 == MouseHandler.ar * -1222491879) {
                     si.ag();
                  }

                  if (-896157613 * or != -1) {
                     ReflectionCheck.mt_renamed(or * -896157613, 0, 0, aj * -1687260435, 1658005443 * kd.ak, 0, 0);
                  }

                  qu += -1340429835;

                  while(true) {
                     ClientScriptEvent var39;
                     Component var40;
                     Component var43;
                     do {
                        var39 = (ClientScriptEvent)rt.removeLast();
                        if (var39 == null) {
                           while(true) {
                              do {
                                 var39 = (ClientScriptEvent)rp.removeLast();
                                 if (var39 == null) {
                                    while(true) {
                                       do {
                                          var39 = (ClientScriptEvent)rq.removeLast();
                                          if (null == var39) {
                                             while(true) {
                                                hf var42 = (hf)re.removeLast();
                                                if (var42 == null) {
                                                   this.ko();
                                                   bt.ie_renamed();
                                                   if (pr != null) {
                                                      this.me();
                                                   }

                                                   if (Scene.bs()) {
                                                      var5 = Scene.Scene_selectedX;
                                                      var6 = Scene.Scene_selectedY;
                                                      var29 = mi.an_renamed(ClientProt.ck, packetWriter.au);
                                                      var29.bit.bu(5);
                                                      var29.bit.ds(Scenery.jc * 827352769 + var6);
                                                      var29.bit.dn(-1232093375 * jm.ib + var5);
                                                      var29.bit.du(sh.av(82) ? (sh.av(81) ? 2 : 1) : 0);
                                                      packetWriter.aw(var29);
                                                      Scene.br();
                                                      mq = MouseHandler.MouseHandler_lastButton * -1884483333;
                                                      mm = 2130738719 * MouseHandler.as;
                                                      mv = -1453825313;
                                                      me = 0;
                                                      te = -1970850269 * var5;
                                                      th = 875414437 * var6;
                                                   }

                                                   if (var34 != MidiPcmStream.oh) {
                                                      if (var34 != null) {
                                                         fw.ma_renamed(var34);
                                                      }

                                                      if (null != MidiPcmStream.oh) {
                                                         fw.ma_renamed(MidiPcmStream.oh);
                                                      }
                                                   }

                                                   if (fe.os != var37 && 1239377975 * on == 215597333 * oe) {
                                                      if (null != var37) {
                                                         fw.ma_renamed(var37);
                                                      }

                                                      if (fe.os != null) {
                                                         fw.ma_renamed(fe.os);
                                                      }
                                                   }

                                                   if (null != fe.os) {
                                                      if (215597333 * oe < 1239377975 * on) {
                                                         oe += -1411611075;
                                                         if (oe * 215597333 == on * 1239377975) {
                                                            fw.ma_renamed(fe.os);
                                                         }
                                                      }
                                                   } else if (oe * 215597333 > 0) {
                                                      oe -= -1411611075;
                                                   }

                                                   if (lv * 986256295 == 0) {
                                                      var5 = 1144428983 * MusicPatchNode.localPlayer.bx;
                                                      var6 = MusicPatchNode.localPlayer.bo * -411750205;
                                                      if (-1958669353 * bz.lg - var5 < -500 || bz.lg * -1958669353 - var5 > 500 || fw.lf * -365969735 - var6 < -500 || -365969735 * fw.lf - var6 > 500) {
                                                         bz.lg = var5 * 1293848551;
                                                         fw.lf = 892004233 * var6;
                                                      }

                                                      if (var5 != bz.lg * -1958669353) {
                                                         bz.lg += 1293848551 * ((var5 - bz.lg * -1958669353) / 16);
                                                      }

                                                      if (fw.lf * -365969735 != var6) {
                                                         fw.lf += 892004233 * ((var6 - fw.lf * -365969735) / 16);
                                                      }

                                                      var7 = bz.lg * -1958669353 >> 7;
                                                      var8 = fw.lf * -365969735 >> 7;
                                                      var9 = fq.getTileHeight(bz.lg * -1958669353, -365969735 * fw.lf, -1727408401 * GameShell.plane);
                                                      var10 = 0;
                                                      if (var7 > 3 && var8 > 3 && var7 < 100 && var8 < 100) {
                                                         for(var11 = var7 - 4; var11 <= var7 + 4; ++var11) {
                                                            for(var12 = var8 - 4; var12 <= 4 + var8; ++var12) {
                                                               var13 = -1727408401 * GameShell.plane;
                                                               if (var13 < 3 && 2 == (Tiles.Tiles_renderFlags[1][var11][var12] & 2)) {
                                                                  ++var13;
                                                               }

                                                               int var14 = var9 - Tiles.Tiles_heights[var13][var11][var12];
                                                               if (var14 > var10) {
                                                                  var10 = var14;
                                                               }
                                                            }
                                                         }
                                                      }

                                                      var11 = var10 * 192;
                                                      if (var11 > 98048) {
                                                         var11 = 98048;
                                                      }

                                                      if (var11 < 32768) {
                                                         var11 = 32768;
                                                      }

                                                      if (var11 > 205350563 * lc) {
                                                         lc += (var11 - lc * 205350563) / 24 * 800423179;
                                                      } else if (var11 < 205350563 * lc) {
                                                         lc += 800423179 * ((var11 - 205350563 * lc) / 80);
                                                      }

                                                      Formatting.ls = (fq.getTileHeight(MusicPatchNode.localPlayer.bx * 1144428983, MusicPatchNode.localPlayer.bo * -411750205, -1727408401 * GameShell.plane) - lm * 394960243) * -1138369095;
                                                   } else if (1 == lv * 986256295) {
                                                      ms.ni_renamed();
                                                      short var45 = -1;
                                                      if (sh.av(33)) {
                                                         var45 = 0;
                                                      } else if (sh.av(49)) {
                                                         var45 = 1024;
                                                      }

                                                      if (sh.av(48)) {
                                                         if (var45 == 0) {
                                                            var45 = 1792;
                                                         } else if (1024 == var45) {
                                                            var45 = 1280;
                                                         } else {
                                                            var45 = 1536;
                                                         }
                                                      } else if (sh.av(50)) {
                                                         if (0 == var45) {
                                                            var45 = 256;
                                                         } else if (1024 == var45) {
                                                            var45 = 768;
                                                         } else {
                                                            var45 = 512;
                                                         }
                                                      }

                                                      byte var44 = 0;
                                                      if (sh.av(35)) {
                                                         var44 = -1;
                                                      } else if (sh.av(51)) {
                                                         var44 = 1;
                                                      }

                                                      var7 = 0;
                                                      if (var45 >= 0 || var44 != 0) {
                                                         var7 = sh.av(81) ? lp * 519949591 : la * 1101365113;
                                                         var7 *= 16;
                                                         lu = var45 * -1988002169;
                                                         lk = 818868517 * var44;
                                                      }

                                                      if (li * -1277774705 < var7) {
                                                         li += var7 / 8 * 1574169199;
                                                         if (li * -1277774705 > var7) {
                                                            li = var7 * 1574169199;
                                                         }
                                                      } else if (li * -1277774705 > var7) {
                                                         li = 1384929543 * li / 10 * 1574169199;
                                                      }

                                                      if (li * -1277774705 > 0) {
                                                         var8 = li * -1277774705 / 16;
                                                         if (1382999863 * lu >= 0) {
                                                            var5 = lu * 1382999863 - ek.kh * -1010818347 & 2047;
                                                            var9 = in.ac[var5];
                                                            var10 = in.au[var5];
                                                            bz.lg += var8 * var9 / 65536 * 1293848551;
                                                            fw.lf += 892004233 * (var10 * var8 / 65536);
                                                         }

                                                         if (-168443219 * lk != 0) {
                                                            Formatting.ls += lk * -168443219 * var8 * -1138369095;
                                                            if (470489225 * Formatting.ls > 0) {
                                                               Formatting.ls = 0;
                                                            }
                                                         }
                                                      } else {
                                                         lu = 1988002169;
                                                         lk = -818868517;
                                                      }

                                                      if (sh.av(13)) {
                                                         Canvas.ne_renamed();
                                                      }
                                                   }

                                                   if (MouseHandler.MouseHandler_currentButton * 114417019 == 4 && su.ev) {
                                                      var5 = MouseHandler.ao * -1224153235 - 332197605 * km;
                                                      kn = 1932462086 * var5;
                                                      km = (var5 != -1 && var5 != 1 ? (332197605 * km + -1224153235 * MouseHandler.ao) / 2 : MouseHandler.ao * -1224153235) * 1302863597;
                                                      var6 = kz * -1491948821 - -2063363905 * MouseHandler.ay;
                                                      ks = var6 * -503524914;
                                                      kz = (-1 != var6 && var6 != 1 ? (-1491948821 * kz + MouseHandler.ay * -2063363905) / 2 : MouseHandler.ay * -2063363905) * -837440061;
                                                   } else {
                                                      if (sh.av(96)) {
                                                         ks += 1895721191 * ((-24 - 1977625303 * ks) / 2);
                                                      } else if (sh.av(97)) {
                                                         ks += 1895721191 * ((24 - 1977625303 * ks) / 2);
                                                      } else {
                                                         ks = 1895721191 * (1977625303 * ks / 2);
                                                      }

                                                      if (sh.av(98)) {
                                                         kn += (12 - kn * 1441154731) / 2 * -1181252605;
                                                      } else if (sh.av(99)) {
                                                         kn += (-12 - kn * 1441154731) / 2 * -1181252605;
                                                      } else {
                                                         kn = 1441154731 * kn / 2 * -1181252605;
                                                      }

                                                      km = MouseHandler.ao * 652543465;
                                                      kz = 1278432381 * MouseHandler.ay;
                                                   }

                                                   kf = 642728617 * (ks * 1977625303 / 2 + 704283033 * kf & 2047);
                                                   kp += -637026513 * (kn * 1441154731 / 2);
                                                   if (kp * -954734641 < 128) {
                                                      kp = 64984960;
                                                   }

                                                   if (kp * -954734641 > 383) {
                                                      kp = 831981393;
                                                   }

                                                   if (uk) {
                                                      an.ih_renamed();
                                                   } else if (uj) {
                                                      if (!ub) {
                                                         var5 = 64 + gx.ut * 957080960;
                                                         var6 = 958794368 * ex.uo + 64;
                                                         var7 = fq.getTileHeight(var5, var6, GameShell.plane * -1727408401) - av.uq * -887836823;
                                                         fh.il_renamed(var5, var7, var6);
                                                      } else if (null != ui) {
                                                         bt.kx = ui.af() * -1682679895;
                                                         ly.ke = ui.an() * 46344275;
                                                         if (ud) {
                                                            gk.kv = ui.aw() * -424093663;
                                                         } else {
                                                            gk.kv = (fq.getTileHeight(bt.kx * -2100544359, -91399205 * ly.ke, GameShell.plane * -1727408401) - ui.aw()) * -424093663;
                                                         }

                                                         ui.aa();
                                                      }

                                                      if (!uc) {
                                                         var5 = FontName.um * 332584320 + 64;
                                                         var6 = -1804719232 * MilliClock.ux + 64;
                                                         var7 = fq.getTileHeight(var5, var6, GameShell.plane * -1727408401) - ClientScriptFrame.ug * 1496735347;
                                                         var8 = var5 - -2100544359 * bt.kx;
                                                         var9 = var7 - 1772923873 * gk.kv;
                                                         var10 = var6 - -91399205 * ly.ke;
                                                         var11 = (int)Math.sqrt((double)(var8 * var8 + var10 * var10));
                                                         var12 = (int)(Math.atan2((double)var9, (double)var11) * 325.9490051269531) & 2047;
                                                         var13 = (int)(Math.atan2((double)var8, (double)var10) * -325.9490051269531) & 2047;
                                                         GraphicsObject.is_renamed(var12, var13);
                                                      } else {
                                                         if (null != uz) {
                                                            WorldMapSectionType.ky = uz.af() * 528729485;
                                                            WorldMapSectionType.ky = Math.min(Math.max(WorldMapSectionType.ky * 1897923909, 128), 383) * 528729485;
                                                            uz.aa();
                                                         }

                                                         if (ua != null) {
                                                            ek.kh = (ua.af() & 2047) * -1545206147;
                                                            ua.aa();
                                                         }
                                                      }
                                                   }

                                                   for(var5 = 0; var5 < 5; ++var5) {
                                                      var10002 = vg[var5]++;
                                                   }

                                                   oy.varcs.ay();
                                                   var5 = SecureRandomFuture.aw_renamed();
                                                   var6 = bq.an();
                                                   if (var5 > 15000 && var6 > 15000) {
                                                      ii = 719725026;
                                                      MouseHandler.MouseHandler_idleCycles = 1393311740;
                                                      var38 = mi.an_renamed(ClientProt.aw, packetWriter.au);
                                                      packetWriter.aw(var38);
                                                   }

                                                   World.friendSystem.ac();

                                                   for(var8 = 0; var8 < wz.size(); ++var8) {
                                                      if (aj.ag_renamed((Integer)wz.get(var8)) != 2) {
                                                         wz.remove(var8);
                                                         --var8;
                                                      }
                                                   }

                                                   var49 = packetWriter;
                                                   var49.ay += -1313905755;
                                                   if (1383386157 * packetWriter.ay > 50) {
                                                      var38 = mi.an_renamed(ClientProt.by, packetWriter.au);
                                                      packetWriter.aw(var38);
                                                   }

                                                   try {
                                                      packetWriter.an();
                                                   } catch (IOException var15) {
                                                      ng.ht_renamed();
                                                   }

                                                   return;
                                                }

                                                FriendsList.je_renamed(var42);
                                             }
                                          }

                                          var40 = var39.aw;
                                          if (var40.childIndex * 55577617 < 0) {
                                             break;
                                          }

                                          var43 = gh.an_renamed(var40.parentId * 913615679);
                                       } while(var43 == null || var43.children == null || var40.childIndex * 55577617 >= var43.children.length || var40 != var43.children[var40.childIndex * 55577617]);

                                       HeadbarUpdate.af_renamed(var39);
                                    }
                                 }

                                 var40 = var39.aw;
                                 if (55577617 * var40.childIndex < 0) {
                                    break;
                                 }

                                 var43 = gh.an_renamed(var40.parentId * 913615679);
                              } while(var43 == null || var43.children == null || 55577617 * var40.childIndex >= var43.children.length || var40 != var43.children[var40.childIndex * 55577617]);

                              HeadbarUpdate.af_renamed(var39);
                           }
                        }

                        var40 = var39.aw;
                        if (55577617 * var40.childIndex < 0) {
                           break;
                        }

                        var43 = gh.an_renamed(var40.parentId * 913615679);
                     } while(null == var43 || null == var43.children || var40.childIndex * 55577617 >= var43.children.length || var40 != var43.children[var40.childIndex * 55577617]);

                     HeadbarUpdate.af_renamed(var39);
                  }
               }

               var18 = mi.an_renamed(ClientProt.dk, packetWriter.au);
               var18.bit.bu(0);
               var4 = var18.bit.at * -1633313603;
               qg.af_renamed(var18.bit);
               var18.bit.cu(-1633313603 * var18.bit.at - var4);
               packetWriter.aw(var18);
            }
         }
      }
   }

   protected final void am() {
      rj = (Formatting.af_renamed() + 500L) * -1343645632282639199L;
      this.ip();
      if (-1 != or * -896157613) {
         this.ln(true);
      }

   }

   void ip() {
      int var2 = -1687260435 * aj;
      int var3 = kd.ak * 1658005443;
      if (-927540391 * this.av < var2) {
         var2 = this.av * -927540391;
      }

      if (this.ar * -1747234661 < var3) {
         var3 = this.ar * -1747234661;
      }

      if (aj.clientPreferences != null) {
         try {
            by.aw_renamed(ClientScriptFrame.client, "resize", new Object[]{na.iv_renamed()});
         } catch (Throwable var5) {
         }
      }

   }

   final void drawLoggedIn() {
      int var2;
      if (-1 != or * -896157613) {
         var2 = or * -896157613;
         if (SoundSystem.loadInterface(var2)) {
            Obj.ms_renamed(hn.interfaceComponents[var2], -1);
         }
      }

      for(var2 = 0; var2 < rr * -356793645; ++var2) {
         if (rf[var2]) {
            rm[var2] = true;
         }

         rw[var2] = rf[var2];
         rf[var2] = false;
      }

      rs = ep * -1146781383;
      of = -563689483;
      oy = -2111961447;
      if (-1 != or * -896157613) {
         rr = 0;
         ai.lk_renamed(or * -896157613, 0, 0, aj * -1687260435, kd.ak * 1658005443, 0, 0, -1);
      }

      Rasterizer2D.Rasterizer2D_resetClip();
      if (mx) {
         if (-1306273505 * mv == 1) {
            gq.kb[1513573489 * me / 100].ax(-902574261 * mq - 8, 682495699 * mm - 8);
         }

         if (-1306273505 * mv == 2) {
            gq.kb[4 + 1513573489 * me / 100].ax(-902574261 * mq - 8, 682495699 * mm - 8);
         }
      }

      if (!isMiniMenuOpen) {
         if (-1 != of * -2086038621) {
            dk.kk_renamed(-2086038621 * of, oy * -870509993);
         }
      } else {
         var2 = -1141903185 * hl.menuY;
         int var3 = ArchiveLoader.menuWidth * -115281635;
         int var4 = -960964385 * DesktopPlatformInfoProvider.menuHeight;
         int var5 = 245252327 * fq.menuX;
         int var6 = 6116423;
         Rasterizer2D.Rasterizer2D_fillRectangle(var2, var3, var4, var5, var6);
         Rasterizer2D.Rasterizer2D_fillRectangle(1 + var2, 1 + var3, var4 - 2, 16, 0);
         Rasterizer2D.Rasterizer2D_drawRectangle(1 + var2, var3 + 18, var4 - 2, var5 - 19, 0);
         fx.fontBold12.ar(Strings.Strings_chooseOption, 3 + var2, 14 + var3, var6, -1);
         int var7 = -2063363905 * MouseHandler.ay;
         int var8 = MouseHandler.ao * -1224153235;

         for(int var9 = 0; var9 < 730065501 * menuOptionsCount; ++var9) {
            int var10 = var3 + 31 + 15 * (menuOptionsCount * 730065501 - 1 - var9);
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
               var11 = 16776960;
            }

            fx.fontBold12.ar(Friend.lg_renamed(var9), 3 + var2, var10, var11, 0);
         }

         ClanChat.ki_renamed(-1141903185 * hl.menuY, -115281635 * ArchiveLoader.menuWidth, -960964385 * DesktopPlatformInfoProvider.menuHeight, fq.menuX * 245252327);
      }

      if (3 == -1928160607 * rg) {
         for(var2 = 0; var2 < rr * -356793645; ++var2) {
            if (rw[var2]) {
               Rasterizer2D.ev_renamed(rh[var2], rb[var2], rootComponentWidths[var2], rootComponentHeights[var2], 16711935, 128);
            } else if (rm[var2]) {
               Rasterizer2D.ev_renamed(rh[var2], rb[var2], rootComponentWidths[var2], rootComponentHeights[var2], 16711680, 128);
            }
         }
      }

      ms.au_renamed(GameShell.plane * -1727408401, MusicPatchNode.localPlayer.bx * 1144428983, MusicPatchNode.localPlayer.bo * -411750205, ja * -1795081153);
      ja = 0;
   }

   boolean jp(PacketWriter var1, int var2) {
      if (0 == var1.al * 889658999) {
         es.clanChat = null;
      } else {
         if (null == es.clanChat) {
            es.clanChat = new ClanChat(co.loginType, ClientScriptFrame.client);
         }

         es.clanChat.readUpdate(var1.bit, var2);
      }

      qd = qu * 235003969;
      GraphicsObject.sl = true;
      var1.serverPacket0 = null;
      return true;
   }

   boolean jt(PacketWriter var1) {
      if (es.clanChat != null) {
         es.clanChat.ax(var1.bit);
      }

      qd = qu * 235003969;
      GraphicsObject.sl = true;
      var1.serverPacket0 = null;
      return true;
   }

   final boolean kr() {
      int var2 = DynamicObject.lm_renamed();
      boolean var3 = nb && 730065501 * menuOptionsCount > 2;
      if (!var3) {
         boolean var4;
         if (var2 < 0) {
            var4 = false;
         } else {
            int var5 = menuArguments1[var2];
            if (var5 >= 2000) {
               var5 -= 2000;
            }

            if (1007 == var5) {
               var4 = true;
            } else {
               var4 = false;
            }
         }

         var3 = var4;
      }

      return var3 && !menuShiftClick[var2];
   }

   final void ln(boolean var1) {
      SeqType.lc_renamed(or * -896157613, aj * -1687260435, kd.ak * 1658005443, var1);
   }

   final void me() {
      fw.ma_renamed(pr);
      Formatting.qe += 873371827;
      if (px && pq) {
         int var2 = -2063363905 * MouseHandler.ay;
         int var3 = MouseHandler.ao * -1224153235;
         var2 -= -1789924433 * pd;
         var3 -= pw * 1902621241;
         if (var2 < pi * 1084046795) {
            var2 = 1084046795 * pi;
         }

         if (var2 + pr.width * -794961409 > -794961409 * pf.width + 1084046795 * pi) {
            var2 = 1084046795 * pi + pf.width * -794961409 - -794961409 * pr.width;
         }

         if (var3 < pb * -746723443) {
            var3 = pb * -746723443;
         }

         if (var3 + 1473950221 * pr.height > pb * -746723443 + pf.height * 1473950221) {
            var3 = -746723443 * pb + pf.height * 1473950221 - pr.height * 1473950221;
         }

         int var4 = var2 - 565355253 * ph;
         int var5 = var3 - pv * 1136091355;
         int var6 = pr.dragDeadZone * 154898553;
         if (1993201275 * Formatting.qe > pr.dragDeadTime * -1849043027 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
            pn = true;
         }

         int var7 = var2 - pi * 1084046795 + pf.scrollX * -1469632775;
         int var8 = pf.scrollY * 1223232735 + (var3 - -746723443 * pb);
         ClientScriptEvent var9;
         if (null != pr.onDragComplete && pn) {
            var9 = new ClientScriptEvent();
            var9.aw = pr;
            var9.ac = var7 * -2011830585;
            var9.au = 1126405829 * var8;
            var9.args0 = pr.onDragComplete;
            HeadbarUpdate.af_renamed(var9);
         }

         if (0 == 114417019 * MouseHandler.MouseHandler_currentButton) {
            if (pn) {
               if (null != pr.onScrollWheel) {
                  var9 = new ClientScriptEvent();
                  var9.aw = pr;
                  var9.ac = -2011830585 * var7;
                  var9.au = 1126405829 * var8;
                  var9.aq = pz;
                  var9.args0 = pr.onScrollWheel;
                  HeadbarUpdate.af_renamed(var9);
               }

               if (null != pz) {
                  Component var10 = pr;
                  int var11 = StructType.an_renamed(KeyHandler.getComponentClickMask(var10));
                  Component var13;
                  if (0 == var11) {
                     var13 = null;
                  } else {
                     int var12 = 0;

                     while(true) {
                        if (var12 >= var11) {
                           var13 = var10;
                           break;
                        }

                        var10 = gh.an_renamed(913615679 * var10.parentId);
                        if (var10 == null) {
                           var13 = null;
                           break;
                        }

                        ++var12;
                     }
                  }

                  if (null != var13) {
                     PacketBitNode var14 = mi.an_renamed(ClientProt.bw, packetWriter.au);
                     var14.bit.dy(-2006098851 * pz.itemId);
                     var14.bit.es(pz.id * 1713081171);
                     var14.bit.dy(55577617 * pz.childIndex);
                     var14.bit.dy(pr.childIndex * 55577617);
                     var14.bit.el(1713081171 * pr.id);
                     var14.bit.bf(pr.itemId * -2006098851);
                     packetWriter.aw(var14);
                  }
               }
            } else if (this.kr()) {
               this.openMiniMenu(ph * 565355253 + -1789924433 * pd, pw * 1902621241 + pv * 1136091355);
            } else if (menuOptionsCount * 730065501 > 0) {
               hp.mx_renamed(565355253 * ph + pd * -1789924433, 1136091355 * pv + pw * 1902621241);
            }

            pr = null;
         }

      } else {
         if (1993201275 * Formatting.qe > 1) {
            if (!pn && menuOptionsCount * 730065501 > 0) {
               hp.mx_renamed(ph * 565355253 + pd * -1789924433, pv * 1136091355 + pw * 1902621241);
            }

            pr = null;
         }

      }
   }

   public Username username() {
      return null != MusicPatchNode.localPlayer ? MusicPatchNode.localPlayer.username : null;
   }

   static {
      em = dj.ac;
      ew = dj.ac;
      ex = false;
      fi = 0;
      fp = 0;
      fo = 0;
      js5Errors = 0;
      loginState = 0;
      ga = 0;
      gt = 0;
      gu = 0;
      gh = fp.aw;
      gy = sr.af;
      hd = WorldMapSectionType.af_renamed(PlayerAppearance.af_renamed("com_jagex_auth_desktop_osrs:public", (byte)-35));
      hb = false;
      secureRandomFuture = new SecureRandomFuture();
      hf = null;
      npcs = new Npc[65536];
      iw = 0;
      iy = new int[65536];
      ig = 0;
      ih = new int[250];
      packetWriter = new PacketWriter();
      ii = 0;
      ik = false;
      timer = new Timer();
      im = new HashMap();
      jx = 0;
      jo = -1903772507;
      jk = 0;
      jq = -1711800473;
      je = 0;
      collisionMaps = new CollisionMap[4];
      isInInstance = false;
      instanceChunkTemplates = new int[4][13][13];
      jy = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
      ja = 0;
      kq = 914788991;
      kw = -384526119;
      kk = -33923405;
      kj = -2102998740;
      ki = false;
      ko = 0;
      kp = 64984960;
      kf = 0;
      ks = 0;
      kn = 0;
      kz = 0;
      km = 0;
      lv = 0;
      lm = -666725754;
      li = 0;
      lu = 0;
      lk = 0;
      la = 682934636;
      lp = -793681942;
      ly = 0;
      ln = false;
      lt = 0;
      lz = false;
      lc = 0;
      overheadTextCount = 0;
      lq = -763960690;
      lj = new int[lq * 1025553311];
      ll = new int[lq * 1025553311];
      le = new int[1025553311 * lq];
      overheadTextXOffsets = new int[1025553311 * lq];
      lx = new int[1025553311 * lq];
      lo = new int[lq * 1025553311];
      lw = new int[1025553311 * lq];
      overheadText = new String[lq * 1025553311];
      mt = new int[104][104];
      mw = 0;
      mz = 846498395;
      mu = 1610031701;
      mq = 0;
      mm = 0;
      me = 0;
      mv = 0;
      mx = true;
      ma = 0;
      mj = true;
      players = new Player[2048];
      localPlayerIndex = -255869677;
      mo = 0;
      mn = -1369385558963036297L;
      md = true;
      mk = 0;
      mb = 0;
      nz = new int[1000];
      playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
      playerMenuActions = new String[8];
      no = new boolean[8];
      nm = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
      nl = -1035820595;
      objStacks = new NodeDeque[4][104][104];
      nn = new NodeDeque();
      projectiles = new NodeDeque();
      graphicsObjects = new NodeDeque();
      ng = new int[25];
      ny = new int[25];
      nu = new int[25];
      nb = false;
      isMiniMenuOpen = false;
      menuOptionsCount = 0;
      menuArguments0 = new int[500];
      menuArguments2 = new int[500];
      menuArguments1 = new int[500];
      menuOpcodes = new int[500];
      oi = new int[500];
      menuActions = new String[500];
      menuTargetNames = new String[500];
      menuShiftClick = new boolean[500];
      ov = false;
      ol = false;
      oz = true;
      of = -563689483;
      oy = -2111961447;
      oe = 0;
      on = -315612066;
      oq = 0;
      selectedItemName = null;
      om = false;
      oa = 1204907975;
      op = -35668549;
      oj = null;
      selectedSpellName = null;
      or = 32945189;
      interfaceParents = new NodeHashTable(8);
      pc = 0;
      pp = 757532791;
      py = 0;
      pg = null;
      pk = 0;
      pj = 0;
      pu = 0;
      pt = 1296642255;
      po = false;
      ps = null;
      pr = null;
      pf = null;
      pd = 0;
      pw = 0;
      pz = null;
      pq = false;
      pi = 1150287901;
      pb = -68006725;
      px = false;
      ph = -463567197;
      pv = -551918419;
      pn = false;
      qu = -1340429835;
      qr = new int[32];
      qx = 0;
      qj = new int[32];
      qc = 0;
      qs = new int[32];
      qf = 0;
      qt = new int[32];
      qn = 0;
      qb = 0;
      qg = 0;
      qd = 0;
      qy = 0;
      qz = 0;
      qq = 0;
      qv = 0;
      qa = 0;
      mouseWheelRotation = 0;
      rl = new tz();
      rq = new NodeDeque();
      rt = new NodeDeque();
      rp = new NodeDeque();
      re = new NodeDeque();
      componentClickMasks = new NodeHashTable(512);
      rr = 0;
      rs = -769599022;
      rf = new boolean[100];
      rm = new boolean[100];
      rw = new boolean[100];
      rh = new int[100];
      rb = new int[100];
      rootComponentWidths = new int[100];
      rootComponentHeights = new int[100];
      rg = 0;
      rj = 0L;
      ro = true;
      sy = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
      sj = 0;
      su = 0;
      ss = "";
      st = new long[100];
      sf = 0;
      sh = new hy();
      si = new he();
      sm = 0;
      sk = new int[128];
      sz = new int[128];
      sc = -4061967902176514943L;
      sg = new fj[4];
      so = new gj[4];
      sp = 1715437485;
      sr = 0;
      tw = new int[1000];
      ty = new int[1000];
      ts = new Rasterizer3D[1000];
      te = 0;
      th = 0;
      tp = 0;
      tz = -1225072817;
      tf = false;
      soundEffectCount = 0;
      tu = new int[50];
      tr = new int[50];
      tg = new int[50];
      tb = new int[50];
      soundEffects = new SoundEffect[50];
      uj = false;
      ub = false;
      uc = false;
      ud = false;
      ui = null;
      ua = null;
      uz = null;
      uk = false;
      ue = new boolean[5];
      vq = new int[5];
      vw = new int[5];
      vf = new int[5];
      vg = new int[5];
      vv = 256;
      va = 205;
      vl = 256;
      ve = 320;
      vm = 1;
      vn = 32767;
      vo = 1;
      vk = 32767;
      vd = 0;
      vx = 0;
      viewportHeight = 0;
      viewportWidth = 0;
      viewportZoom = 0;
      vh = new PlayerAppearance();
      vr = 962307691;
      vu = 929779017;
      platformInfoProvider = new DesktopPlatformInfoProvider();
      grandExchangeOffers = new GrandExchangeOffer[8];
      wg = new cf();
      wx = new pk(8, py.af);
      wq = new EvictingDualNodeHashTable(64);
      ww = new EvictingDualNodeHashTable(64);
      wi = -978308099;
      wn = -595673725;
      wz = new ArrayList();
      archiveLoaders = new ArrayList(10);
      wy = 0;
      ws = 0;
      xr = new cm();
      xm = new int[50];
      xn = new int[50];
   }

   public long op() {
      return -7932717541542796365L * this.he;
   }

   public void oq(OtlTokenRequester var1) {
      if (null != var1) {
         this.hw = var1;
         ee.ak_renamed(10);
      }
   }

   public void om(RefreshAccessTokenRequester var1) {
      if (var1 != null) {
         this.hu = var1;
      }
   }

   public void on(OtlTokenRequester var1) {
      if (null != var1) {
         this.hw = var1;
         ee.ak_renamed(10);
      }
   }

   public boolean oa() {
      return dw * -1275976559 == 10;
   }

   final boolean ja(PacketWriter var1) {
      AbstractSocket var3 = var1.getSocket();
      PacketBit var4 = var1.bit;
      if (null == var3) {
         return false;
      } else {
         String var6;
         int var7;
         try {
            int var25;
            if (var1.serverPacket0 == null) {
               if (var1.at) {
                  if (!var3.an(1)) {
                     return false;
                  }

                  var3.au(var1.bit.al, 0, 1);
                  var1.aa = 0;
                  var1.at = false;
               }

               var4.at = 0;
               if (var4.au((byte)55)) {
                  if (!var3.an(1)) {
                     return false;
                  }

                  var3.au(var1.bit.al, 1, 1);
                  var1.aa = 0;
               }

               var1.at = true;
               ServerProt[] var5 = PacketBitNode.af_renamed();
               var25 = var4.gIsaacSmart1or2();
               if (var25 < 0 || var25 >= var5.length) {
                  throw new IOException(var25 + " " + -1633313603 * var4.at);
               }

               var1.serverPacket0 = var5[var25];
               var1.al = -1975731211 * var1.serverPacket0.id;
            }

            if (889658999 * var1.al == -1) {
               if (!var3.an(1)) {
                  return false;
               }

               var1.getSocket().au(var4.al, 0, 1);
               var1.al = (var4.al[0] & 255) * 1873812295;
            }

            if (889658999 * var1.al == -2) {
               if (!var3.an(2)) {
                  return false;
               }

               var1.getSocket().au(var4.al, 0, 2);
               var4.at = 0;
               var1.al = var4.cl() * 1873812295;
            }

            if (!var3.an(var1.al * 889658999)) {
               return false;
            }

            var4.at = 0;
            var3.au(var4.al, 0, var1.al * 889658999);
            var1.aa = 0;
            timer.af();
            var1.ai = var1.ax;
            var1.ax = var1.ao;
            var1.ao = var1.serverPacket0;
            int var23;
            if (var1.serverPacket0 == ServerProt.al) {
               var23 = var4.cx();
               var25 = var4.cx();
               var7 = NetCache.bq_renamed();
               PacketBitNode var85 = mi.an_renamed(ClientProt.cx, packetWriter.au);
               var85.bit.dh(1913114939 * aa);
               var85.bit.dp(var7);
               var85.bit.el(var23);
               var85.bit.el(var25);
               packetWriter.aw(var85);
               var1.serverPacket0 = null;
               return true;
            }

            int var14;
            byte var27;
            long var28;
            long var30;
            long var34;
            boolean var42;
            String var49;
            int var61;
            if (ServerProt.aj == var1.serverPacket0) {
               var27 = var4.cf();
               var28 = (long)var4.cl();
               var30 = (long)var4.cr();
               var34 = var30 + (var28 << 32);
               var42 = false;
               gj var67 = var27 >= 0 ? so[var27] : MouseHandler.sx;
               if (var67 == null) {
                  var42 = true;
               } else {
                  for(var14 = 0; var14 < 100; ++var14) {
                     if (st[var14] == var34) {
                        var42 = true;
                        break;
                     }
                  }
               }

               if (!var42) {
                  st[1960529059 * sf] = var34;
                  sf = 1561052939 * ((1 + 1960529059 * sf) % 100);
                  var49 = TilePaint.aw_renamed(var4);
                  var61 = var27 >= 0 ? 43 : 46;
                  fo.addMessage(var61, "", var49, var67.ab);
               }

               var1.serverPacket0 = null;
               return true;
            }

            int var8;
            int var9;
            if (var1.serverPacket0 == ServerProt.an) {
               var23 = var4.er();
               var25 = var4.eg();
               var7 = var4.eo();
               if (65535 == var7) {
                  var7 = -1;
               }

               var8 = var4.ep();
               if (var8 == 65535) {
                  var8 = -1;
               }

               for(var9 = var8; var9 <= var7; ++var9) {
                  var34 = ((long)var23 << 32) + (long)var9;
                  Node var59 = componentClickMasks.get(var34);
                  if (var59 != null) {
                     var59.remove();
                  }

                  componentClickMasks.put(new IntegerNode(var25), var34);
               }

               var1.serverPacket0 = null;
               return true;
            }

            Component var50;
            if (ServerProt.bc == var1.serverPacket0) {
               var23 = var4.et();
               var25 = var4.en();
               var7 = var4.eq();
               var50 = gh.an_renamed(var25);
               if (var23 != var50.rawX * -115015413 || var7 != 1651158159 * var50.rawY || 0 != -1596536121 * var50.xAlignment || 0 != 1484444061 * var50.yAlignment) {
                  var50.rawX = var23 * 1806877347;
                  var50.rawY = var7 * 1231090287;
                  var50.xAlignment = 0;
                  var50.yAlignment = 0;
                  fw.ma_renamed(var50);
                  this.alignComponent(var50);
                  if (883712245 * var50.bg == 0) {
                     WallDecoration.lz_renamed(hn.interfaceComponents[var25 >> 16], var50, false);
                  }
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.el == var1.serverPacket0) {
               var23 = var4.db();
               var25 = var4.df();
               var7 = var4.cx();
               var50 = gh.an_renamed(var7);
               ChatChannel.bq_renamed(var50, var23, var25);
               fw.ma_renamed(var50);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.cb == var1.serverPacket0) {
               var23 = var4.cm();
               lk.hg_renamed(var23);
               var1.serverPacket0 = null;
               return false;
            }

            if (ServerProt.et == var1.serverPacket0) {
               var23 = var4.eo();
               var25 = var4.cl();
               var7 = var4.er();
               var50 = gh.an_renamed(var7);
               var50.dq = (var25 + (var23 << 16)) * -1510822541;
               var1.serverPacket0 = null;
               return true;
            }

            Npc var55;
            if (ServerProt.dx == var1.serverPacket0) {
               var23 = var4.cl();
               var55 = npcs[var23];
               var7 = var4.cl();
               var25 = var4.cx();
               if (null != var55) {
                  var55.cj(0, var7, var25 >> 16, var25 & '\uffff');
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.cc) {
               EnumType.jb_renamed(lm.aq);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.dl == var1.serverPacket0) {
               var1.serverPacket0 = null;
               return true;
            }

            Npc var44;
            if (var1.serverPacket0 == ServerProt.dy) {
               var23 = var4.en();
               var25 = var4.ep();
               short var87 = (short)var4.eq();
               var8 = var4.df();
               var44 = npcs[var25];
               if (null != var44) {
                  var44.ai(var8, var23, var87);
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.ab) {
               var23 = var4.cl();
               Player var80;
               if (var23 == localPlayerIndex * -549033243) {
                  var80 = MusicPatchNode.localPlayer;
               } else {
                  var80 = players[var23];
               }

               var25 = var4.cl();
               var7 = var4.cx();
               if (var80 != null) {
                  var80.cj(0, var25, var7 >> 16, var7 & '\uffff');
               }

               var1.serverPacket0 = null;
               return true;
            }

            String var66;
            boolean var90;
            if (ServerProt.bp == var1.serverPacket0) {
               var23 = var4.cd();
               var90 = var4.cm() == 1;
               var66 = "";
               boolean var76 = false;
               if (var90) {
                  var66 = var4.cw();
                  if (World.friendSystem.aq(new Username(var66, co.loginType))) {
                     var76 = true;
                  }
               }

               String var69 = var4.cw();
               if (!var76) {
                  es.an_renamed(var23, var66, var69);
               }

               var1.serverPacket0 = null;
               return true;
            }

            Component var26;
            if (var1.serverPacket0 == ServerProt.eb) {
               var23 = var4.eg();
               var25 = var4.eg();
               var26 = gh.an_renamed(var23);
               ks.ba_renamed(var26, var25);
               fw.ma_renamed(var26);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.az == var1.serverPacket0) {
               var23 = var4.cx();
               var90 = var4.dq() == 1;
               var26 = gh.an_renamed(var23);
               if (var26.isHidden != var90) {
                  var26.isHidden = var90;
                  fw.ma_renamed(var26);
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.cf == var1.serverPacket0) {
               return this.jt(var1);
            }

            if (var1.serverPacket0 == ServerProt.dt) {
               EnumType.jb_renamed(lm.ab);
               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.br) {
               var23 = var4.en();
               var25 = var4.cl();
               var26 = gh.an_renamed(var23);
               if (1 != -123768459 * var26.modelType || -168077555 * var26.modelId != var25) {
                  var26.modelType = -1714481443;
                  var26.modelId = 509431749 * var25;
                  fw.ma_renamed(var26);
               }

               var1.serverPacket0 = null;
               return true;
            }

            int var10;
            int var11;
            if (ServerProt.ea == var1.serverPacket0) {
               uj = true;
               uk = false;
               ub = true;
               gx.ut = var4.cm() * -436480541;
               ex.uo = var4.cm() * 2032739133;
               var23 = var4.cl();
               var25 = var4.cl();
               ud = var4.co();
               var7 = var4.cm();
               var8 = gx.ut * 957080960 + 64;
               var9 = 64 + 958794368 * ex.uo;
               boolean var62 = false;
               boolean var73 = false;
               if (ud) {
                  var10 = gk.kv * 1772923873;
                  var11 = fq.getTileHeight(var8, var9, -1727408401 * GameShell.plane) - var23;
               } else {
                  var10 = fq.getTileHeight(bt.kx * -2100544359, ly.ke * -91399205, GameShell.plane * -1727408401) - gk.kv * 1772923873;
                  var11 = var23;
               }

               ui = new rs(-2100544359 * bt.kx, ly.ke * -91399205, var10, var8, var9, var11, var25, var7);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.bm == var1.serverPacket0) {
               return this.jp(var1, 2);
            }

            if (var1.serverPacket0 == ServerProt.dp) {
               FontName.jt = var4.df() * -522523151;
               aa.jp = var4.cm() * 671253333;

               while(-1633313603 * var4.at < 889658999 * var1.al) {
                  var23 = var4.cm();
                  lm var89 = Varcs.af_renamed()[var23];
                  EnumType.jb_renamed(var89);
               }

               var1.serverPacket0 = null;
               return true;
            }

            Component var47;
            if (ServerProt.aw == var1.serverPacket0) {
               var23 = var4.en();
               var47 = gh.an_renamed(var23);
               var47.modelType = -848477033;
               var47.modelId = MusicPatchNode.localPlayer.appearance.getChatHeadId() * 509431749;
               fw.ma_renamed(var47);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.eo == var1.serverPacket0) {
               var23 = var4.cl();
               if (65535 == var23) {
                  var23 = -1;
               }

               or = var23 * -32945189;
               this.ln(false);
               lm.mj_renamed(var23);
               ax.ci_renamed(-896157613 * or);

               for(var25 = 0; var25 < 100; ++var25) {
                  rf[var25] = true;
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.de == var1.serverPacket0) {
               World.friendSystem.aw(var4, var1.al * 889658999);
               qg = 1831095645 * qu;
               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.bl) {
               tp = var4.cm() * -690225493;
               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.aa) {
               EnumType.jb_renamed(lm.af);
               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.co) {
               ds.rx = null;
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.bs == var1.serverPacket0) {
               EnumType.jb_renamed(lm.aa);
               var1.serverPacket0 = null;
               return true;
            }

            String var24;
            if (ServerProt.ai == var1.serverPacket0) {
               var24 = var4.cw();
               Object[] var88 = new Object[var24.length() + 1];

               for(var7 = var24.length() - 1; var7 >= 0; --var7) {
                  if (var24.charAt(var7) == 's') {
                     var88[1 + var7] = var4.cw();
                  } else {
                     var88[1 + var7] = new Integer(var4.cx());
                  }
               }

               var88[0] = new Integer(var4.cx());
               ClientScriptEvent var86 = new ClientScriptEvent();
               var86.args0 = var88;
               HeadbarUpdate.af_renamed(var86);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.ae == var1.serverPacket0) {
               GrandExchangeEvents.an_renamed(var4, var1.al * 889658999);
               dk.nq_renamed();
               var1.serverPacket0 = null;
               return true;
            }

            int var16;
            int var17;
            String var63;
            Scenery var70;
            if (ServerProt.dn == var1.serverPacket0) {
               var27 = var4.cf();
               var6 = var4.cw();
               long var83 = (long)var4.cl();
               long var65 = (long)var4.cr();
               PlayerType var72 = (PlayerType)StructType.findEnumerated(StudioGame.au_renamed(), var4.cm());
               long var58 = var65 + (var83 << 32);
               boolean var57 = false;
               var70 = null;
               gj var78 = var27 >= 0 ? so[var27] : MouseHandler.sx;
               if (var78 == null) {
                  var57 = true;
               } else {
                  var16 = 0;

                  while(true) {
                     if (var16 >= 100) {
                        if (var72.isUser && World.friendSystem.aq(new Username(var6, co.loginType))) {
                           var57 = true;
                        }
                        break;
                     }

                     if (st[var16] == var58) {
                        var57 = true;
                        break;
                     }

                     ++var16;
                  }
               }

               if (!var57) {
                  st[sf * 1960529059] = var58;
                  sf = 1561052939 * ((sf * 1960529059 + 1) % 100);
                  var63 = AbstractFont.escapeBrackets(TilePaint.aw_renamed(var4));
                  var17 = var27 >= 0 ? 41 : 44;
                  if (2138745227 * var72.id != -1) {
                     fo.addMessage(var17, ArchiveDiskActionHandler.af_renamed(var72.id * 2138745227) + var6, var63, var78.ab);
                  } else {
                     fo.addMessage(var17, var6, var63, var78.ab);
                  }
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.ax) {
               var4.at += 491706444;
               if (var4.de()) {
                  ej.nc_renamed(var4, -1633313603 * var4.at - 28);
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.af) {
               ec.loadRegions(false, var1.bit);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.am == var1.serverPacket0) {
               var23 = var4.cm();
               if (var4.cm() == 0) {
                  grandExchangeOffers[var23] = new GrandExchangeOffer();
                  var4.at += -1524603270;
               } else {
                  var4.at -= -1516355947;
                  grandExchangeOffers[var23] = new GrandExchangeOffer(var4, false);
               }

               qq = -1209118871 * qu;
               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.cu) {
               var23 = var4.ef();
               var25 = var4.eg();
               var26 = gh.an_renamed(var25);
               if (var23 != var26.sequenceId * -1526544909 || var23 == -1) {
                  var26.sequenceId = -1195025605 * var23;
                  var26.modelFrame = 0;
                  var26.modelFrameCycle = 0;
                  fw.ma_renamed(var26);
               }

               var1.serverPacket0 = null;
               return true;
            }

            boolean var36;
            if (var1.serverPacket0 == ServerProt.es) {
               var36 = var4.cm() == 1;
               var25 = var4.cx();
               var26 = gh.an_renamed(var25);
               SecureRandomCallable.bv_renamed(var26, MusicPatchNode.localPlayer.appearance, var36);
               fw.ma_renamed(var26);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.cs == var1.serverPacket0) {
               var23 = var4.da();
               var25 = var4.eg();
               var7 = var23 >> 10 & 31;
               var8 = var23 >> 5 & 31;
               var9 = var23 & 31;
               var10 = (var7 << 19) + (var8 << 11) + (var9 << 3);
               Component var68 = gh.an_renamed(var25);
               if (1409091639 * var68.color != var10) {
                  var68.color = var10 * -1604768377;
                  fw.ma_renamed(var68);
               }

               var1.serverPacket0 = null;
               return true;
            }

            int var12;
            int var56;
            if (var1.serverPacket0 == ServerProt.bk) {
               var16 = var4.cl();
               var61 = var4.df() * 4;
               int var19 = var4.dq();
               byte var54 = var4.dx();
               var14 = var4.dq() * 4;
               var56 = var4.cl();
               var17 = var4.eo();
               var12 = var4.eu();
               int var18 = var4.cm();
               var7 = var4.ea();
               var23 = var7 >> 16;
               var25 = var7 >> 8 & 255;
               var8 = var23 + (var7 >> 4 & 7);
               var9 = var25 + (var7 & 7);
               byte var64 = var4.cf();
               var10 = var54 + var8;
               var11 = var64 + var9;
               if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104 && 65535 != var56) {
                  var8 = 128 * var8 + 64;
                  var9 = 128 * var9 + 64;
                  var10 = 128 * var10 + 64;
                  var11 = 128 * var11 + 64;
                  Projectile var20 = new Projectile(var56, GameShell.plane * -1727408401, var8, var9, fq.getTileHeight(var8, var9, -1727408401 * GameShell.plane) - var14, var16 + ep * -1886224337, ep * -1886224337 + var17, var18, var19, var12, var61);
                  var20.setDestination(var10, var11, fq.getTileHeight(var10, var11, -1727408401 * GameShell.plane) - var61, var16 + -1886224337 * ep);
                  projectiles.addFirst(var20);
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.cd) {
               EnumType.jb_renamed(lm.ac);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.ce == var1.serverPacket0) {
               World.friendSystem.an();
               qg = qu * 1831095645;
               var1.serverPacket0 = null;
               return true;
            }

            InterfaceParent var29;
            long var43;
            if (ServerProt.dm == var1.serverPacket0) {
               var23 = -1633313603 * var4.at + var1.al * 889658999;
               var25 = var4.cl();
               if (65535 == var25) {
                  var25 = -1;
               }

               var7 = var4.cl();
               if (-896157613 * or != var25) {
                  or = -32945189 * var25;
                  this.ln(false);
                  lm.mj_renamed(or * -896157613);
                  ax.ci_renamed(-896157613 * or);

                  for(var8 = 0; var8 < 100; ++var8) {
                     rf[var8] = true;
                  }
               }

               InterfaceParent var51;
               for(; var7-- > 0; var51.keep = true) {
                  var8 = var4.cx();
                  var9 = var4.cl();
                  var10 = var4.cm();
                  var51 = (InterfaceParent)interfaceParents.get((long)var8);
                  if (var51 != null && var9 != 944864121 * var51.af) {
                     nv.closeInterface(var51, true);
                     var51 = null;
                  }

                  if (null == var51) {
                     var51 = dj.openInterface(var8, var9, var10);
                  }
               }

               for(var29 = (InterfaceParent)interfaceParents.first(); var29 != null; var29 = (InterfaceParent)interfaceParents.next()) {
                  if (var29.keep) {
                     var29.keep = false;
                  } else {
                     nv.closeInterface(var29, true);
                  }
               }

               componentClickMasks = new NodeHashTable(512);

               while(-1633313603 * var4.at < var23) {
                  var8 = var4.cx();
                  var9 = var4.cl();
                  var10 = var4.cl();
                  var11 = var4.cx();

                  for(var12 = var9; var12 <= var10; ++var12) {
                     var43 = ((long)var8 << 32) + (long)var12;
                     componentClickMasks.put(new IntegerNode(var11), var43);
                  }
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.cz) {
               var23 = var4.cm();
               var25 = var4.cm();
               var7 = var4.cm();
               var8 = var4.cm();
               ue[var23] = true;
               vq[var23] = var25;
               vw[var23] = var7;
               vf[var23] = var8;
               vg[var23] = 0;
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.dg == var1.serverPacket0) {
               var23 = var4.ep();
               var7 = var4.db();
               var25 = var4.ep();
               if (var25 == 65535) {
                  var25 = -1;
               }

               var55 = npcs[var23];
               if (null != var55) {
                  if (var25 == var55.ct * -1372355773 && var25 != -1) {
                     var9 = Inventory.getSeqType(var25, (byte)28).be * 789159225;
                     if (1 == var9) {
                        var55.cp = 0;
                        var55.cd = 0;
                        var55.dm = -401806131 * var7;
                        var55.dw = 0;
                     } else if (var9 == 2) {
                        var55.dw = 0;
                     }
                  } else if (var25 == -1 || -1 == -1372355773 * var55.ct || Inventory.getSeqType(var25, (byte)38).frameCount * -1932560049 >= Inventory.getSeqType(var55.ct * -1372355773, (byte)25).frameCount * -1932560049) {
                     var55.ct = var25 * -1690721941;
                     var55.cp = 0;
                     var55.cd = 0;
                     var55.dm = var7 * -401806131;
                     var55.dw = 0;
                     var55.eo = -1718989897 * var55.dn;
                  }
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.cj == var1.serverPacket0) {
               eb.an_renamed(var4, 889658999 * var1.al);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.ci == var1.serverPacket0) {
               for(var23 = 0; var23 < players.length; ++var23) {
                  if (players[var23] != null) {
                     players[var23].ct = 1690721941;
                  }
               }

               for(var23 = 0; var23 < npcs.length; ++var23) {
                  if (null != npcs[var23]) {
                     npcs[var23].ct = 1690721941;
                  }
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.by) {
               FontName.jt = var4.dq() * -522523151;
               aa.jp = var4.df() * 671253333;
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.ep == var1.serverPacket0) {
               EnumType.jb_renamed(lm.al);
               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.dv) {
               var36 = var4.co();
               if (var36) {
                  if (null == fi.wc) {
                     fi.wc = new nf();
                  }
               } else {
                  fi.wc = null;
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.ds) {
               qz = 1358928753 * qu;
               var27 = var4.cf();
               gr var84 = new gr(var4);
               gj var79;
               if (var27 >= 0) {
                  var79 = so[var27];
               } else {
                  var79 = MouseHandler.sx;
               }

               var84.an(var79);
               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.ar) {
               var23 = var4.cx();
               var25 = var4.ep();
               Varps.Varps_temp[var25] = var23;
               if (var23 != Varps.Varps_main[var25]) {
                  Varps.Varps_main[var25] = var23;
               }

               al.md_renamed(var25);
               qr[(qx += 165304329) * -261310919 - 1 & 31] = var25;
               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.en) {
               var23 = var4.cx();
               var25 = var4.dq();
               var26 = gh.an_renamed(var23);
               ga.bf_renamed(var26, 1693987821 * MusicPatchNode.localPlayer.appearance.au, var25);
               fw.ma_renamed(var26);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.bo == var1.serverPacket0) {
               uk = false;
               uj = false;
               ub = false;
               uc = false;
               FontName.um = 0;
               MilliClock.ux = 0;
               ClientScriptFrame.ug = 0;
               ud = false;
               Archive.up = 0;
               MapElementType.uv = 0;
               fd.uu = 0;
               KeyHandler.ul = 0;
               gx.ut = 0;
               ex.uo = 0;
               av.uq = 0;
               ui = null;
               uz = null;
               ua = null;

               for(var23 = 0; var23 < 5; ++var23) {
                  ue[var23] = false;
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.at == var1.serverPacket0) {
               var23 = var4.da();
               if (65535 == var23) {
                  var23 = -1;
               }

               an.hf_renamed(var23);
               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.dh) {
               var23 = var4.cr();
               var25 = var4.da();
               if (var25 == 65535) {
                  var25 = -1;
               }

               CollisionMap.hy_renamed(var25, var23);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.dc == var1.serverPacket0) {
               var23 = var4.eg();
               var25 = var4.en();
               var7 = var4.eo();
               if (var7 == 65535) {
                  var7 = -1;
               }

               var50 = gh.an_renamed(var23);
               ObjType var48;
               if (!var50.isIf3) {
                  if (-1 == var7) {
                     var50.modelType = 0;
                     var1.serverPacket0 = null;
                     return true;
                  }

                  var48 = HeadbarUpdate.getObjType(var7);
                  var50.modelType = 1732008820;
                  var50.modelId = var7 * 509431749;
                  var50.modelAngleX = 874786355 * var48.yan2d;
                  var50.modelAngleY = var48.manwear2 * -2065246853;
                  var50.modelZoom = -1582059804 * var48.aj / var25 * -467727501;
                  fw.ma_renamed(var50);
               } else {
                  var50.itemId = -1852876811 * var7;
                  var50.itemQuantity = var25 * -568259577;
                  var48 = HeadbarUpdate.getObjType(var7);
                  var50.modelAngleX = 874786355 * var48.yan2d;
                  var50.modelAngleY = -2065246853 * var48.manwear2;
                  var50.modelAngleZ = 745454881 * var48.xof2d;
                  var50.modelOffsetX = -183088313 * var48.manwearyoff;
                  var50.modelOffsetY = var48.yof2d * -347855449;
                  var50.modelZoom = var48.aj * 1614948179;
                  if (var48.stackable * 1552863327 == 1) {
                     var50.dn = -761533221;
                  } else {
                     var50.dn = -1523066442;
                  }

                  if (-289037969 * var50.df > 0) {
                     var50.modelZoom = -467727501 * (100808544 * var50.modelZoom / (-289037969 * var50.df));
                  } else if (var50.rawWidth * -1960603747 > 0) {
                     var50.modelZoom = 100808544 * var50.modelZoom / (-1960603747 * var50.rawWidth) * -467727501;
                  }

                  fw.ma_renamed(var50);
               }

               var1.serverPacket0 = null;
               return true;
            }

            boolean var46;
            if (var1.serverPacket0 == ServerProt.eu) {
               uj = true;
               uk = false;
               ub = true;
               gx.ut = var4.cm() * -436480541;
               ex.uo = var4.cm() * 2032739133;
               var23 = var4.cl();
               var25 = var4.cm() * 128 + 64;
               var7 = var4.cm() * 128 + 64;
               var8 = var4.cl();
               ud = var4.co();
               var9 = var4.cm();
               var10 = 64 + 957080960 * gx.ut;
               var11 = 64 + 958794368 * ex.uo;
               var42 = false;
               var46 = false;
               if (ud) {
                  var12 = gk.kv * 1772923873;
                  var56 = fq.getTileHeight(var10, var11, -1727408401 * GameShell.plane) - var23;
               } else {
                  var12 = fq.getTileHeight(-2100544359 * bt.kx, ly.ke * -91399205, GameShell.plane * -1727408401) - 1772923873 * gk.kv;
                  var56 = var23;
               }

               ui = new rr(bt.kx * -2100544359, ly.ke * -91399205, var12, var10, var11, var56, var25, var7, var8, var9);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.bt == var1.serverPacket0) {
               if (-1 != -896157613 * or) {
                  ec.mu_renamed(-896157613 * or, 0);
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.dz == var1.serverPacket0 && uj) {
               uk = true;
               uc = false;
               ub = false;

               for(var23 = 0; var23 < 5; ++var23) {
                  ue[var23] = false;
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.ap) {
               te = var4.cm() * -1970850269;
               if (1494100363 * te == 255) {
                  te = 0;
               }

               th = var4.cm() * 875414437;
               if (255 == th * -1748014035) {
                  th = 0;
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.ez == var1.serverPacket0) {
               uj = true;
               uk = false;
               uc = true;
               var23 = var4.cg();
               var25 = var4.cg();
               var7 = am.iz_renamed(WorldMapSectionType.ky * 1897923909 + var25 & 2027);
               var8 = var23 + ek.kh * -1010818347;
               var9 = var4.cl();
               var10 = var4.cm();
               uz = new rf(WorldMapSectionType.ky * 1897923909, var7, var9, var10);
               ua = new rf(-1010818347 * ek.kh, var8, var9, var10);
               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.ak) {
               ds.rx = new qt(MiniMenuEntry.qh);
               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.cq) {
               byte[] var77 = new byte[889658999 * var1.al];
               var4.aq(var77, 0, var77.length);
               Packet var82 = new Packet(var77);
               var66 = var82.cw();
               Ignored.af_renamed(var66, true, false);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.dj == var1.serverPacket0) {
               uj = true;
               uk = false;
               ub = false;
               gx.ut = var4.cm() * -436480541;
               ex.uo = var4.cm() * 2032739133;
               av.uq = var4.cl() * -1725771559;
               KeyHandler.ul = var4.cm() * -2052337259;
               fd.uu = var4.cm() * -449391195;
               if (fd.uu * -1514927571 >= 100) {
                  bt.kx = gx.ut * -1848049280 + -317330880;
                  ly.ke = ex.uo * 2021222272 + -1328933696;
                  gk.kv = (fq.getTileHeight(bt.kx * -2100544359, ly.ke * -91399205, GameShell.plane * -1727408401) - av.uq * -887836823) * -424093663;
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.cx == var1.serverPacket0) {
               bt.no_renamed();
               var27 = var4.cf();
               fa var81 = new fa(var4);
               fj var60;
               if (var27 >= 0) {
                  var60 = sg[var27];
               } else {
                  var60 = ObjType.sq;
               }

               var81.an(var60);
               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.ad) {
               var23 = var4.cl();
               var25 = var4.cm();
               var7 = var4.cl();
               fh.he_renamed(var23, var25, var7);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.cp == var1.serverPacket0) {
               var23 = var4.cx();
               if (var23 != 1263827259 * ly) {
                  ly = var23 * 1409021939;
                  gq.nk_renamed();
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.cn) {
               ClientProt.mp_renamed();
               pk = var4.cl() * 440508051;
               qa = -235455367 * qu;
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.dd == var1.serverPacket0) {
               var23 = var4.eg();
               var25 = var4.eo();
               var26 = gh.an_renamed(var23);
               if (null != var26 && 0 == var26.bg * 883712245) {
                  if (var25 > -1273374131 * var26.scrollHeight - var26.height * 1473950221) {
                     var25 = -1273374131 * var26.scrollHeight - 1473950221 * var26.height;
                  }

                  if (var25 < 0) {
                     var25 = 0;
                  }

                  if (var25 != var26.scrollY * 1223232735) {
                     var26.scrollY = 946188063 * var25;
                     fw.ma_renamed(var26);
                  }
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.ca == var1.serverPacket0) {
               var24 = var4.cw();
               var25 = var4.eg();
               var26 = gh.an_renamed(var25);
               if (!var24.equals(var26.text)) {
                  var26.text = var24;
                  fw.ma_renamed(var26);
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.db == var1.serverPacket0) {
               bt.no_renamed();
               var27 = var4.cf();
               if (1 == var1.al * 889658999) {
                  if (var27 >= 0) {
                     sg[var27] = null;
                  } else {
                     ObjType.sq = null;
                  }

                  var1.serverPacket0 = null;
                  return true;
               }

               if (var27 >= 0) {
                  sg[var27] = new fj(var4);
               } else {
                  ObjType.sq = new fj(var4);
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.er) {
               var8 = var4.cm();
               var23 = var4.cl();
               var44 = npcs[var23];
               var7 = var4.cl();
               var25 = var4.cx();
               if (null != var44) {
                  var44.cj(var8, var7, var25 >> 16, var25 & '\uffff');
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.bv) {
               for(var23 = 0; var23 < Varps.Varps_main.length; ++var23) {
                  if (Varps.Varps_temp[var23] != Varps.Varps_main[var23]) {
                     Varps.Varps_main[var23] = Varps.Varps_temp[var23];
                     al.md_renamed(var23);
                     qr[(qx += 165304329) * -261310919 - 1 & 31] = var23;
                  }
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.du == var1.serverPacket0) {
               var23 = var4.cx();
               var25 = var4.cl();
               if (var23 < -70000) {
                  var25 += 32768;
               }

               if (var23 >= 0) {
                  var26 = gh.an_renamed(var23);
               } else {
                  var26 = null;
               }

               for(; -1633313603 * var4.at < var1.al * 889658999; oy.itemContainerSetItem(var25, var8, var9 - 1, var10, (byte)96)) {
                  var8 = var4.cd();
                  var9 = var4.cl();
                  var10 = 0;
                  if (0 != var9) {
                     var10 = var4.cm();
                     if (255 == var10) {
                        var10 = var4.cx();
                     }
                  }

                  if (null != var26 && var8 >= 0 && var8 < var26.gb.length) {
                     var26.gb[var8] = var9;
                     var26.gp[var8] = var10;
                  }
               }

               if (null != var26) {
                  fw.ma_renamed(var26);
               }

               ClientProt.mp_renamed();
               qj[(qc += -565562765) * -710491461 - 1 & 31] = var25 & 32767;
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.ac == var1.serverPacket0) {
               bx.hc_renamed();
               var1.serverPacket0 = null;
               return false;
            }

            if (var1.serverPacket0 == ServerProt.cl) {
               return this.jp(var1, 1);
            }

            if (ServerProt.ej == var1.serverPacket0) {
               uj = true;
               uk = false;
               uc = true;
               var23 = qj.ig_renamed(var4.cg() & 2027);
               var25 = am.iz_renamed(var4.cg() & 2027);
               var7 = var4.cl();
               var8 = var4.cm();
               uz = new rf(1897923909 * WorldMapSectionType.ky, var25, var7, var8);
               ua = new rf(-1010818347 * ek.kh, var23, var7, var8);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.di == var1.serverPacket0) {
               ClientProt.mp_renamed();
               pj = var4.cg() * 717110291;
               qa = qu * -235455367;
               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.bn) {
               EnumType.jb_renamed(lm.at);
               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.dq) {
               FontName.jt = var4.cm() * -522523151;
               aa.jp = var4.db() * 671253333;

               for(var23 = 1555915261 * aa.jp; var23 < 8 + aa.jp * 1555915261; ++var23) {
                  for(var25 = FontName.jt * -191732975; var25 < FontName.jt * -191732975 + 8; ++var25) {
                     if (null != objStacks[GameShell.plane * -1727408401][var23][var25]) {
                        objStacks[GameShell.plane * -1727408401][var23][var25] = null;
                        em.kd_renamed(var23, var25);
                     }
                  }
               }

               for(dg var52 = (dg)nn.last(); null != var52; var52 = (dg)nn.previous()) {
                  if (68300005 * var52.aw >= 1555915261 * aa.jp && var52.aw * 68300005 < 8 + 1555915261 * aa.jp && var52.ac * 800888185 >= -191732975 * FontName.jt && 800888185 * var52.ac < 8 + -191732975 * FontName.jt && var52.af * 593068225 == -1727408401 * GameShell.plane) {
                     var52.ag = 0;
                  }
               }

               var1.serverPacket0 = null;
               return true;
            }

            Component var35;
            if (ServerProt.bh == var1.serverPacket0) {
               var23 = var4.eg();
               var25 = var4.eg();
               InterfaceParent var41 = (InterfaceParent)interfaceParents.get((long)var23);
               var29 = (InterfaceParent)interfaceParents.get((long)var25);
               if (var29 != null) {
                  nv.closeInterface(var29, var41 == null || var29.af * 944864121 != var41.af * 944864121);
               }

               if (var41 != null) {
                  var41.ga();
                  interfaceParents.put(var41, (long)var25);
               }

               var35 = gh.an_renamed(var23);
               if (var35 != null) {
                  fw.ma_renamed(var35);
               }

               var35 = gh.an_renamed(var25);
               if (var35 != null) {
                  fw.ma_renamed(var35);
                  WallDecoration.lz_renamed(hn.interfaceComponents[1713081171 * var35.id >>> 16], var35, true);
               }

               if (-1 != or * -896157613) {
                  ec.mu_renamed(or * -896157613, 1);
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.cr) {
               World var45 = new World();
               var45.host = var4.cw();
               var45.id = var4.cl() * -2098511939;
               var25 = var4.cx();
               var45.properties = var25 * 1038974297;
               fd.hi_renamed(45);
               var3.aq();
               var3 = null;
               FloorOverlayType.ah_renamed(var45);
               var1.serverPacket0 = null;
               return false;
            }

            if (ServerProt.cm == var1.serverPacket0) {
               fv.kb_renamed(true, var4);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.aq == var1.serverPacket0) {
               EnumType.jb_renamed(lm.ay);
               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.do) {
               var23 = var4.cx();
               var47 = gh.an_renamed(var23);

               for(var7 = 0; var7 < var47.gb.length; ++var7) {
                  var47.gb[var7] = -1;
                  var47.gb[var7] = 0;
               }

               fw.ma_renamed(var47);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.da == var1.serverPacket0) {
               uj = true;
               uk = false;
               uc = false;
               FontName.um = var4.cm() * 775826691;
               MilliClock.ux = var4.cm() * 732155751;
               ClientScriptFrame.ug = var4.cl() * -213879109;
               Archive.up = var4.cm() * -1982200011;
               MapElementType.uv = var4.cm() * -2025357;
               if (942361787 * MapElementType.uv >= 100) {
                  var23 = 64 + 332584320 * FontName.um;
                  var25 = 64 + MilliClock.ux * -1804719232;
                  var7 = fq.getTileHeight(var23, var25, GameShell.plane * -1727408401) - ClientScriptFrame.ug * 1496735347;
                  var8 = var23 - -2100544359 * bt.kx;
                  var9 = var7 - gk.kv * 1772923873;
                  var10 = var25 - -91399205 * ly.ke;
                  var11 = (int)Math.sqrt((double)(var8 * var8 + var10 * var10));
                  WorldMapSectionType.ky = ((int)(Math.atan2((double)var9, (double)var11) * 325.9490051269531) & 2047) * 528729485;
                  ek.kh = ((int)(Math.atan2((double)var8, (double)var10) * -325.9490051269531) & 2047) * -1545206147;
                  if (1897923909 * WorldMapSectionType.ky < 128) {
                     WorldMapSectionType.ky = -1042102656;
                  }

                  if (1897923909 * WorldMapSectionType.ky > 383) {
                     WorldMapSectionType.ky = 639929843;
                  }
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.bf == var1.serverPacket0) {
               ClientScriptFrame.nt_renamed(var4.cw());
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.eg == var1.serverPacket0) {
               var8 = var4.cm();
               var23 = var4.cl();
               Player var38;
               if (var23 == -549033243 * localPlayerIndex) {
                  var38 = MusicPatchNode.localPlayer;
               } else {
                  var38 = players[var23];
               }

               var25 = var4.cl();
               var7 = var4.cx();
               if (var38 != null) {
                  var38.cj(var8, var25, var7 >> 16, var7 & '\uffff');
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.ao) {
               EnumType.jb_renamed(lm.au);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.ag == var1.serverPacket0) {
               ClientProt.mp_renamed();
               var23 = var4.dq();
               var25 = var4.dq();
               var7 = var4.en();
               nu[var23] = var7;
               ng[var23] = var25;
               ny[var23] = 1;

               for(var8 = 0; var8 < 98; ++var8) {
                  if (var7 >= Skills.aw[var8]) {
                     ny[var23] = 2 + var8;
                  }
               }

               qs[(qf += 1059665337) * -744210295 - 1 & 31] = var23;
               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.bu) {
               ec.loadRegions(true, var1.bit);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.ba == var1.serverPacket0) {
               var23 = var4.eo();
               var25 = var4.ep();
               var7 = var4.er();
               var8 = var4.cl();
               var35 = gh.an_renamed(var7);
               if (var25 != 797932055 * var35.modelAngleX || var35.modelAngleY * -480949115 != var23 || var8 != 942674363 * var35.modelZoom) {
                  var35.modelAngleX = var25 * -142910041;
                  var35.modelAngleY = -230241203 * var23;
                  var35.modelZoom = var8 * -467727501;
                  fw.ma_renamed(var35);
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.cy == var1.serverPacket0) {
               var10 = var4.cm();
               var11 = var10 >> 2;
               var12 = var10 & 3;
               var56 = jy[var11];
               var7 = var4.ej();
               var23 = var7 >> 16;
               var25 = var7 >> 8 & 255;
               var8 = var23 + (var7 >> 4 & 7);
               var9 = (var7 & 7) + var25;
               var14 = var4.da();
               if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
                  if (var56 == 0) {
                     Wall var75 = bx.scene.az(GameShell.plane * -1727408401, var8, var9);
                     if (null != var75) {
                        var16 = InterfaceParent.at(var75.tag * -4009183385476919801L);
                        if (var11 == 2) {
                           var75.entity1 = new DynamicObject(var16, 2, 4 + var12, GameShell.plane * -1727408401, var8, var9, var14, false, var75.entity1);
                           var75.entity2 = new DynamicObject(var16, 2, var12 + 1 & 3, -1727408401 * GameShell.plane, var8, var9, var14, false, var75.entity2);
                        } else {
                           var75.entity1 = new DynamicObject(var16, var11, var12, -1727408401 * GameShell.plane, var8, var9, var14, false, var75.entity1);
                        }
                     }
                  } else if (var56 == 1) {
                     WallDecoration var74 = bx.scene.ad(GameShell.plane * -1727408401, var8, var9);
                     if (var74 != null) {
                        var16 = InterfaceParent.at(var74.tag * -4691380879163567243L);
                        if (var11 != 4 && var11 != 5) {
                           if (6 == var11) {
                              var74.entity1 = new DynamicObject(var16, 4, 4 + var12, GameShell.plane * -1727408401, var8, var9, var14, false, var74.entity1);
                           } else if (7 == var11) {
                              var74.entity1 = new DynamicObject(var16, 4, 4 + (var12 + 2 & 3), -1727408401 * GameShell.plane, var8, var9, var14, false, var74.entity1);
                           } else if (8 == var11) {
                              var74.entity1 = new DynamicObject(var16, 4, var12 + 4, GameShell.plane * -1727408401, var8, var9, var14, false, var74.entity1);
                              var74.entity2 = new DynamicObject(var16, 4, (var12 + 2 & 3) + 4, GameShell.plane * -1727408401, var8, var9, var14, false, var74.entity2);
                           }
                        } else {
                           var74.entity1 = new DynamicObject(var16, 4, var12, GameShell.plane * -1727408401, var8, var9, var14, false, var74.entity1);
                        }
                     }
                  } else if (var56 == 2) {
                     var70 = bx.scene.ae(-1727408401 * GameShell.plane, var8, var9);
                     if (var11 == 11) {
                        var11 = 10;
                     }

                     if (null != var70) {
                        var70.entity = new DynamicObject(InterfaceParent.at(var70.ax * 5016412888503339625L), var11, var12, GameShell.plane * -1727408401, var8, var9, var14, false, var70.entity);
                     }
                  } else if (var56 == 3) {
                     FloorDecoration var71 = bx.scene.ap(GameShell.plane * -1727408401, var8, var9);
                     if (var71 != null) {
                        var71.entity = new DynamicObject(InterfaceParent.at(var71.tag * 3423223696102332293L), 22, var12, GameShell.plane * -1727408401, var8, var9, var14, false, var71.entity);
                     }
                  }
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.bg) {
               EnumType.jb_renamed(lm.aw);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.cg == var1.serverPacket0) {
               var23 = var4.cm();
               jn.nx_renamed(var23);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.ck == var1.serverPacket0) {
               var36 = var4.cm() == 1;
               if (var36) {
                  mj.wd = (Formatting.af_renamed() - var4.cv()) * 9023382677616235961L;
                  oh.grandExchangeEvents = new GrandExchangeEvents(var4, true);
               } else {
                  oh.grandExchangeEvents = null;
               }

               qv = qu * -707539581;
               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.ef) {
               uj = true;
               uk = false;
               uc = true;
               FontName.um = var4.cm() * 775826691;
               MilliClock.ux = var4.cm() * 732155751;
               ClientScriptFrame.ug = var4.cl() * -213879109;
               var23 = var4.cl();
               var25 = var4.cm();
               var7 = 64 + 332584320 * FontName.um;
               var8 = -1804719232 * MilliClock.ux + 64;
               var9 = fq.getTileHeight(var7, var8, GameShell.plane * -1727408401) - ClientScriptFrame.ug * 1496735347;
               var10 = var7 - -2100544359 * bt.kx;
               var11 = var9 - gk.kv * 1772923873;
               var12 = var8 - ly.ke * -91399205;
               double var53 = Math.sqrt((double)(var12 * var12 + var10 * var10));
               var61 = am.iz_renamed((int)(Math.atan2((double)var11, var53) * 325.9490051269531) & 2047);
               var16 = qj.ig_renamed((int)(Math.atan2((double)var10, (double)var12) * -325.9490051269531) & 2047);
               uz = new rf(1897923909 * WorldMapSectionType.ky, var61, var23, var25);
               ua = new rf(-1010818347 * ek.kh, var16, var23, var25);
               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.au) {
               FloorUnderlayType.sn = pj.af_renamed(var4.cm());
               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.ch) {
               World.friendSystem.ignoreList.read(var4, 889658999 * var1.al);
               cz.nd_renamed();
               qg = 1831095645 * qu;
               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.bj) {
               fv.kb_renamed(false, var4);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.bb == var1.serverPacket0) {
               if (ds.rx == null) {
                  ds.rx = new qt(MiniMenuEntry.qh);
               }

               te var31 = MiniMenuEntry.qh.ac(var4);
               ds.rx.af.an(-52705447 * var31.af, var31.an);
               qt[(qn += -2007914853) * 2106773395 - 1 & 31] = var31.af * -52705447;
               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.dk) {
               var27 = var4.dj();
               var25 = var4.cl();
               Varps.Varps_temp[var25] = var27;
               if (Varps.Varps_main[var25] != var27) {
                  Varps.Varps_main[var25] = var27;
               }

               al.md_renamed(var25);
               qr[(qx += 165304329) * -261310919 - 1 & 31] = var25;
               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.ah) {
               var23 = var4.ep();
               User.ab_renamed(var23);
               qj[(qc += -565562765) * -710491461 - 1 & 31] = var23 & 32767;
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.bz == var1.serverPacket0) {
               var23 = var4.eo();
               var25 = var4.en();
               var26 = gh.an_renamed(var25);
               if (var26.modelType * -123768459 != 6 || var26.modelId * -168077555 != var23) {
                  var26.modelType = -1696954066;
                  var26.modelId = 509431749 * var23;
                  fw.ma_renamed(var26);
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.bi) {
               var24 = var4.cw();
               var28 = (long)var4.cl();
               var30 = (long)var4.cr();
               PlayerType var37 = (PlayerType)StructType.findEnumerated(StudioGame.au_renamed(), var4.cm());
               long var40 = var30 + (var28 << 32);
               var46 = false;

               for(var14 = 0; var14 < 100; ++var14) {
                  if (st[var14] == var40) {
                     var46 = true;
                     break;
                  }
               }

               if (World.friendSystem.aq(new Username(var24, co.loginType))) {
                  var46 = true;
               }

               if (!var46 && 0 == 43311027 * ma) {
                  st[1960529059 * sf] = var40;
                  sf = (1 + sf * 1960529059) % 100 * 1561052939;
                  var49 = AbstractFont.escapeBrackets(er.ao_renamed(TilePaint.aw_renamed(var4)));
                  if (var37.isPrivileged) {
                     var61 = 7;
                  } else {
                     var61 = 3;
                  }

                  if (2138745227 * var37.id != -1) {
                     es.an_renamed(var61, ArchiveDiskActionHandler.af_renamed(var37.id * 2138745227) + var24, var49);
                  } else {
                     es.an_renamed(var61, var24, var49);
                  }
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.bw == var1.serverPacket0) {
               var23 = var4.eo();
               var25 = var4.er();
               var26 = gh.an_renamed(var25);
               if (-123768459 * var26.modelType != 2 || var23 != var26.modelId * -168077555) {
                  var26.modelType = 866004410;
                  var26.modelId = 509431749 * var23;
                  fw.ma_renamed(var26);
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.dw == var1.serverPacket0) {
               qz = qu * 1358928753;
               var27 = var4.cf();
               if (1 == 889658999 * var1.al) {
                  if (var27 >= 0) {
                     so[var27] = null;
                  } else {
                     MouseHandler.sx = null;
                  }

                  var1.serverPacket0 = null;
                  return true;
               }

               if (var27 >= 0) {
                  so[var27] = new gj(var4);
               } else {
                  MouseHandler.sx = new gj(var4);
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.bq == var1.serverPacket0) {
               for(var23 = 0; var23 < gz.an * -774485467; ++var23) {
                  gz var33 = GraphicsDefaults.af_renamed(var23);
                  if (null != var33) {
                     Varps.Varps_temp[var23] = 0;
                     Varps.Varps_main[var23] = 0;
                  }
               }

               ClientProt.mp_renamed();
               qx += 994771232;
               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.av) {
               var23 = var4.cx();
               InterfaceParent var32 = (InterfaceParent)interfaceParents.get((long)var23);
               if (var32 != null) {
                  nv.closeInterface(var32, true);
               }

               if (pg != null) {
                  fw.ma_renamed(pg);
                  pg = null;
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.ay) {
               var23 = var4.dq();
               var6 = var4.cw();
               var7 = var4.dq();
               if (var23 >= 1 && var23 <= 8) {
                  if (var6.equalsIgnoreCase(Strings.Strings_null)) {
                     var6 = null;
                  }

                  playerMenuActions[var23 - 1] = var6;
                  no[var23 - 1] = var7 == 0;
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.dr) {
               var24 = var4.cw();
               var6 = AbstractFont.escapeBrackets(er.ao_renamed(TilePaint.aw_renamed(var4)));
               es.an_renamed(6, var24, var6);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.cv == var1.serverPacket0) {
               var24 = var4.cw();
               var28 = var4.cv();
               var30 = (long)var4.cl();
               var34 = (long)var4.cr();
               PlayerType var39 = (PlayerType)StructType.findEnumerated(StudioGame.au_renamed(), var4.cm());
               var43 = var34 + (var30 << 32);
               boolean var15 = false;

               for(var16 = 0; var16 < 100; ++var16) {
                  if (st[var16] == var43) {
                     var15 = true;
                     break;
                  }
               }

               if (var39.isUser && World.friendSystem.aq(new Username(var24, co.loginType))) {
                  var15 = true;
               }

               if (!var15 && ma * 43311027 == 0) {
                  st[1960529059 * sf] = var43;
                  sf = 1561052939 * ((1 + 1960529059 * sf) % 100);
                  var63 = AbstractFont.escapeBrackets(er.ao_renamed(TilePaint.aw_renamed(var4)));
                  if (-1 != var39.id * 2138745227) {
                     fo.addMessage(9, ArchiveDiskActionHandler.af_renamed(var39.id * 2138745227) + var24, var63, FloorUnderlayType.longToTitleString(var28));
                  } else {
                     fo.addMessage(9, var24, var63, FloorUnderlayType.longToTitleString(var28));
                  }
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.eq) {
               var11 = var4.cm();
               var12 = var4.eo();
               var7 = var4.ej();
               var23 = var7 >> 16;
               var25 = var7 >> 8 & 255;
               var8 = var23 + (var7 >> 4 & 7);
               var9 = (var7 & 7) + var25;
               var10 = var4.cl();
               if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                  var8 = 64 + var8 * 128;
                  var9 = var9 * 128 + 64;
                  GraphicsObject var13 = new GraphicsObject(var10, -1727408401 * GameShell.plane, var8, var9, fq.getTileHeight(var8, var9, GameShell.plane * -1727408401) - var11, var12, ep * -1886224337);
                  graphicsObjects.addFirst(var13);
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (var1.serverPacket0 == ServerProt.ct) {
               sj = var4.dq() * 1410976369;
               su = var4.cm() * -2053731769;
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.cw == var1.serverPacket0) {
               ea = var4.da() * 860606706;
               qa = -235455367 * qu;
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.as == var1.serverPacket0) {
               eu = var4.cm() * -1378513753;
               if (1 == eu * 633821975) {
                  es = var4.cl() * -431692551;
               }

               if (eu * 633821975 >= 2 && eu * 633821975 <= 6) {
                  if (633821975 * eu == 2) {
                     eg = 2045745472;
                     ed = 349971264;
                  }

                  if (3 == eu * 633821975) {
                     eg = 0;
                     ed = 349971264;
                  }

                  if (eu * 633821975 == 4) {
                     eg = -203476352;
                     ed = 349971264;
                  }

                  if (5 == 633821975 * eu) {
                     eg = 2045745472;
                     ed = 0;
                  }

                  if (6 == 633821975 * eu) {
                     eg = 2045745472;
                     ed = 699942528;
                  }

                  eu = 1537939790;
                  el = var4.cl() * -501846925;
                  en = var4.cl() * 1886247917;
                  er = var4.cm() * 233713123;
               }

               if (10 == eu * 633821975) {
                  eb = var4.cl() * -1034603829;
               }

               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.bx == var1.serverPacket0) {
               var23 = var4.df();
               var25 = var4.da();
               var7 = var4.er();
               var29 = (InterfaceParent)interfaceParents.get((long)var7);
               if (null != var29) {
                  nv.closeInterface(var29, var25 != 944864121 * var29.af);
               }

               dj.openInterface(var7, var25, var23);
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.bd == var1.serverPacket0) {
               var23 = var4.cx();
               var25 = var4.cl();
               if (var23 < -70000) {
                  var25 += 32768;
               }

               if (var23 >= 0) {
                  var26 = gh.an_renamed(var23);
               } else {
                  var26 = null;
               }

               if (var26 != null) {
                  for(var8 = 0; var8 < var26.gb.length; ++var8) {
                     var26.gb[var8] = 0;
                     var26.gp[var8] = 0;
                  }
               }

               WorldMapRegion.au_renamed(var25);
               var8 = var4.cl();

               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var4.da();
                  var11 = var4.dq();
                  if (var11 == 255) {
                     var11 = var4.er();
                  }

                  if (null != var26 && var9 < var26.gb.length) {
                     var26.gb[var9] = var10;
                     var26.gp[var9] = var11;
                  }

                  oy.itemContainerSetItem(var25, var9, var10 - 1, var11, (byte)75);
               }

               if (var26 != null) {
                  fw.ma_renamed(var26);
               }

               ClientProt.mp_renamed();
               qj[(qc += -565562765) * -710491461 - 1 & 31] = var25 & 32767;
               var1.serverPacket0 = null;
               return true;
            }

            if (ServerProt.df == var1.serverPacket0) {
               EnumType.jb_renamed(lm.an);
               var1.serverPacket0 = null;
               return true;
            }

            ob.af_renamed("" + (null != var1.serverPacket0 ? 1287795301 * var1.serverPacket0.length : -1) + Formatting.Formatting_comma + (null != var1.ax ? 1287795301 * var1.ax.length : -1) + Formatting.Formatting_comma + (null != var1.ai ? 1287795301 * var1.ai.length : -1) + Formatting.Formatting_comma + var1.al * 889658999, (Throwable)null);
            bx.hc_renamed();
         } catch (IOException var21) {
            ng.ht_renamed();
         } catch (Exception var22) {
            var6 = "" + (var1.serverPacket0 != null ? 1287795301 * var1.serverPacket0.length : -1) + Formatting.Formatting_comma + (var1.ax != null ? 1287795301 * var1.ax.length : -1) + Formatting.Formatting_comma + (null != var1.ai ? 1287795301 * var1.ai.length : -1) + Formatting.Formatting_comma + 889658999 * var1.al + Formatting.Formatting_comma + (MusicPatchNode.localPlayer.dy[0] + -1232093375 * jm.ib) + Formatting.Formatting_comma + (Scenery.jc * 827352769 + MusicPatchNode.localPlayer.ds[0]) + Formatting.Formatting_comma;

            for(var7 = 0; var7 < 889658999 * var1.al && var7 < 50; ++var7) {
               var6 = var6 + var4.al[var7] + Formatting.Formatting_comma;
            }

            ob.af_renamed(var6, var22);
            bx.hc_renamed();
         }

         return true;
      }
   }

   void alignComponent(Component var1) {
      Component var3 = -1 == 913615679 * var1.parentId ? null : gh.an_renamed(913615679 * var1.parentId);
      int var4;
      int var5;
      if (null == var3) {
         var4 = -1687260435 * aj;
         var5 = kd.ak * 1658005443;
      } else {
         var4 = -794961409 * var3.width;
         var5 = var3.height * 1473950221;
      }

      gs.alignComponentSize(var1, var4, var5, false);
      hl.alignComponentPosition(var1, var4, var5);
   }

   final void ko() {
      qj.kn_renamed();
      if (pr == null) {
         int var2 = -1222491879 * MouseHandler.ar;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int var8;
         if (isMiniMenuOpen) {
            int var9;
            if (var2 != 1 && (su.ev || 4 != var2)) {
               var3 = MouseHandler.ay * -2063363905;
               var4 = MouseHandler.ao * -1224153235;
               if (var3 < -1141903185 * hl.menuY - 10 || var3 > -960964385 * DesktopPlatformInfoProvider.menuHeight + -1141903185 * hl.menuY + 10 || var4 < ArchiveLoader.menuWidth * -115281635 - 10 || var4 > ArchiveLoader.menuWidth * -115281635 + fq.menuX * 245252327 + 10) {
                  isMiniMenuOpen = false;
                  var5 = hl.menuY * -1141903185;
                  var6 = ArchiveLoader.menuWidth * -115281635;
                  var7 = DesktopPlatformInfoProvider.menuHeight * -960964385;
                  var8 = 245252327 * fq.menuX;

                  for(var9 = 0; var9 < -356793645 * rr; ++var9) {
                     if (rootComponentWidths[var9] + rh[var9] > var5 && rh[var9] < var5 + var7 && rootComponentHeights[var9] + rb[var9] > var6 && rb[var9] < var8 + var6) {
                        rf[var9] = true;
                     }
                  }
               }
            }

            if (var2 == 1 || !su.ev && var2 == 4) {
               var3 = -1141903185 * hl.menuY;
               var4 = ArchiveLoader.menuWidth * -115281635;
               var5 = -960964385 * DesktopPlatformInfoProvider.menuHeight;
               var6 = 2020601481 * MouseHandler.MouseHandler_lastButton;
               var7 = 1163896205 * MouseHandler.as;
               var8 = -1;

               int var10;
               for(var9 = 0; var9 < menuOptionsCount * 730065501; ++var9) {
                  var10 = (menuOptionsCount * 730065501 - 1 - var9) * 15 + 31 + var4;
                  if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < 3 + var10) {
                     var8 = var9;
                  }
               }

               int var11;
               int var12;
               int var13;
               if (var8 != -1 && var8 >= 0) {
                  var9 = menuArguments0[var8];
                  var10 = menuArguments2[var8];
                  var11 = menuArguments1[var8];
                  var12 = menuOpcodes[var8];
                  var13 = oi[var8];
                  String var14 = menuActions[var8];
                  String var15 = menuTargetNames[var8];
                  ar.ke_renamed(var9, var10, var11, var12, var13, var14, var15, 2020601481 * MouseHandler.MouseHandler_lastButton, MouseHandler.as * 1163896205);
               }

               isMiniMenuOpen = false;
               var9 = hl.menuY * -1141903185;
               var10 = -115281635 * ArchiveLoader.menuWidth;
               var11 = DesktopPlatformInfoProvider.menuHeight * -960964385;
               var12 = fq.menuX * 245252327;

               for(var13 = 0; var13 < rr * -356793645; ++var13) {
                  if (rootComponentWidths[var13] + rh[var13] > var9 && rh[var13] < var11 + var9 && rb[var13] + rootComponentHeights[var13] > var10 && rb[var13] < var10 + var12) {
                     rf[var13] = true;
                  }
               }
            }
         } else {
            var3 = DynamicObject.lm_renamed();
            if ((1 == var2 || !su.ev && 4 == var2) && this.kr()) {
               var2 = 2;
            }

            if ((var2 == 1 || !su.ev && var2 == 4) && menuOptionsCount * 730065501 > 0 && var3 >= 0) {
               var4 = menuArguments0[var3];
               var5 = menuArguments2[var3];
               var6 = menuArguments1[var3];
               var7 = menuOpcodes[var3];
               var8 = oi[var3];
               String var16 = menuActions[var3];
               String var17 = menuTargetNames[var3];
               ar.ke_renamed(var4, var5, var6, var7, var8, var16, var17, 2020601481 * MouseHandler.MouseHandler_lastButton, MouseHandler.as * 1163896205);
            }

            if (2 == var2 && menuOptionsCount * 730065501 > 0) {
               this.openMiniMenu(2020601481 * MouseHandler.MouseHandler_lastButton, 1163896205 * MouseHandler.as);
            }
         }

      }
   }

   boolean gn() {
      return null != ne.gb && !ne.gb.trim().isEmpty() && Obj.gp != null && !Obj.gp.trim().isEmpty();
   }

   protected final void ba() {
   }

   final void openMiniMenu(int var1, int var2) {
      qb.openMenu0(var1, var2);
      var1 -= -82629945 * vd;
      var2 -= 1352043351 * vx;
      bx.scene.menuOpen(GameShell.plane * -1727408401, var1, var2, false);
      isMiniMenuOpen = true;
   }

   void gz(String var1) throws IOException {
      URL var3 = new URL(ix.hv + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
      pc var4 = new pc();
      var4.aq(var1);
      aa var5 = aa.an;
      OtlTokenRequester var6 = this.hw;
      if (null != var6) {
         this.hi = var6.request(var5.ab(), var3, var4.an(), "");
      } else {
         ay var7 = new ay(var3, var5, var4, this.hj);
         this.gz = this.gl.an(var7);
      }
   }

   public long oj() {
      return -7932717541542796365L * this.he;
   }

   public void ow(RefreshAccessTokenRequester var1) {
      if (var1 != null) {
         this.hu = var1;
      }
   }

   public boolean ou() {
      return dw * 162401290 == 10;
   }

   public long oo() {
      return -7932717541542796365L * this.he;
   }

   public static void af_renamed(AbstractArchive var0, AbstractArchive var1) {
      IDKType.IDKType_archive = var0;
      IDKType.an = var1;
      IDKType.aw = IDKType.IDKType_archive.cq(3) * 1501460151;
   }
}