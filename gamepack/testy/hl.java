public class hl {
   static final hl ac;
   static final hl an;
   static final hl aw;
   static int nf;
   static final hl au;
   static final hl ab;
   static final int al = 3;
   static final hl af;
   static final hl aq;
   static final int ay = 5;
   static final int ba = 500;

   hl(int var1, hp var2) {
      try {
         super();
      } catch (RuntimeException var3) {
         throw db.an(var3, "hl.<init>(" + ')');
      }
   }

   static {
      af = new hl(0, hp.at);
      an = new hl(1, hp.ao);
      aw = new hl(2, hp.au);
      ac = new hl(3, hp.aq);
      au = new hl(4, hp.aa);
      ab = new hl(5, hp.al);
      aq = new hl(6, hp.ay);
   }

   static void lj(mq var0, int var1, int var2, byte var3) {
      try {
         if (-1596536121 * var0.bq == 0) {
            var0.ce = -942335045 * var0.bp;
         } else if (-1596536121 * var0.bq == 1) {
            if (var3 >= 1) {
               return;
            }

            var0.ce = ((var1 - -794961409 * var0.cs) / 2 + -115015413 * var0.bp) * 750411281;
         } else if (-1596536121 * var0.bq == 2) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            var0.ce = 750411281 * (var1 - -794961409 * var0.cs - -115015413 * var0.bp);
         } else if (var0.bq * -1596536121 == 3) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            var0.ce = (var0.bp * -115015413 * var1 >> 14) * 750411281;
         } else if (4 == -1596536121 * var0.bq) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            var0.ce = ((var1 * var0.bp * -115015413 >> 14) + (var1 - -794961409 * var0.cs) / 2) * 750411281;
         } else {
            var0.ce = (var1 - -794961409 * var0.cs - (-115015413 * var0.bp * var1 >> 14)) * 750411281;
         }

         if (var0.ba * 1484444061 == 0) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            var0.ci = 843760119 * var0.bc;
         } else if (1 == 1484444061 * var0.ba) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            var0.ci = ((var2 - 1473950221 * var0.cc) / 2 + var0.bc * 1651158159) * -1520068583;
         } else if (1484444061 * var0.ba == 2) {
            var0.ci = -1520068583 * (var2 - var0.cc * 1473950221 - 1651158159 * var0.bc);
         } else if (3 == var0.ba * 1484444061) {
            var0.ci = -1520068583 * (var0.bc * 1651158159 * var2 >> 14);
         } else if (4 == var0.ba * 1484444061) {
            if (var3 >= 1) {
               return;
            }

            var0.ci = ((var2 - var0.cc * 1473950221) / 2 + (var2 * var0.bc * 1651158159 >> 14)) * -1520068583;
         } else {
            var0.ci = (var2 - var0.cc * 1473950221 - (var0.bc * 1651158159 * var2 >> 14)) * -1520068583;
         }

      } catch (RuntimeException var4) {
         throw db.an(var4, "hl.lj(" + ')');
      }
   }
}
