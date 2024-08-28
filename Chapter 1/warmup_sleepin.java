public class warmup_sleepin{
   public boolean Alert(boolean weekday, boolean vacation){
      return !weekday || vacation;
   }
   public static void main(String[] args){
      warmup_sleepin checker = new warmup_sleepin();
      System.out.println("sleepIn(flase,flase) = " + checker.Alert(false,false));
      System.out.println("sleepIn(true,false) = " + checker.Alert(true,false));
      System.out.println("sleepIn(false,true) = " + checker.Alert(false,true));
   }
}