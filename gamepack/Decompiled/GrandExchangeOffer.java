public class GrandExchangeOffer {
   static String cq;
   byte af;
   public int ab;
   public int ac;
   public int an;
   public int au;
   public int aw;

   public static void af_renamed(String[] var0, short[] var1) {
      FaceNormal.an_renamed(var0, var1, 0, var0.length - 1);
   }

   public GrandExchangeOffer() {
   }

   public GrandExchangeOffer(Packet var1, boolean var2) {
      this.af = var1.g1s();
      this.an = var1.cl() * -2000800301;
      this.aw = var1.g4s() * 945098885;
      this.ac = var1.g4s() * 275172041;
      this.au = var1.g4s() * 832101099;
      this.ab = var1.g4s() * 2084457045;
      if (var2) {
         this.an(ArchiveDiskActionHandler.af_renamed(var1));
      }

   }

   public static ta[] au_renamed() {
      return new ta[]{ta.aw, ta.af, ta.an};
   }

   public static int an_renamed(byte[] var0, int var1, CharSequence var2) {
      int var4 = var2.length();
      int var5 = var1;

      for(int var6 = 0; var6 < var4; ++var6) {
         char var7 = var2.charAt(var6);
         if (var7 <= 127) {
            var0[var5++] = (byte)var7;
         } else if (var7 <= 2047) {
            var0[var5++] = (byte)(192 | var7 >> 6);
            var0[var5++] = (byte)(128 | var7 & 63);
         } else {
            var0[var5++] = (byte)(224 | var7 >> 12);
            var0[var5++] = (byte)(128 | var7 >> 6 & 63);
            var0[var5++] = (byte)(128 | var7 & 63);
         }
      }

      return var5 - var1;
   }

   void an(Integer var1) {
   }

   public int status() {
      return this.af & 7;
   }

   public int type() {
      return (this.af & 8) == 8 ? 1 : 0;
   }

   void au(int var1) {
      this.af &= -8;
      this.af = (byte)(this.af | var1 & 7);
   }

   void ab(int var1) {
      this.af &= -9;
      if (var1 == 1) {
         this.af = (byte)(this.af | 8);
      }

   }
}
