public class en extends AbstractUserComparator {
   static PlatformInfo vz;
   final boolean af;

   public en(boolean var1) {
      this.af = var1;
   }

   int af(Buddy var1, Buddy var2) {
      if (177258591 * var1.au == -453810525 * Client.bw && 177258591 * var2.au == Client.bw * -453810525) {
         return this.af ? 1907692493 * var1.ab - 1907692493 * var2.ab : 1907692493 * var2.ab - var1.ab * 1907692493;
      } else {
         return this.ao(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.af((Buddy)var1, (Buddy)var2);
   }
}
