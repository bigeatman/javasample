package home.ex05.case10;

import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main(String[] args) {
      Bag bag = new Bag();

      bag.add(new Pencil());
      bag.add(new Eraser());
      bag.add(new Pencil());
      bag.add(new Pencil());
      bag.add(new Eraser());
      bag.add(new Eraser());

      for (int i = 0; i < bag.getSize(); i++) {
         WriteTools wt = bag.itemAt(i);

         if (wt instanceof Pencil) {
            ((Pencil) wt).write();
         } else if (wt instanceof Eraser) {
            ((Eraser) wt).erase();
         }
      }
   }

   private static class WriteTools {

   }

   private static class Pencil extends WriteTools {
      public void write() {

      }
   }

   private static class Eraser extends WriteTools {
      public void erase() {

      }
   }

   private static class Bag {
      private List<WriteTools> list = new ArrayList<>();

      public void add(WriteTools wt) {
         list.add(wt);
      }

      public WriteTools itemAt(int index) {
         return list.get(index);
      }

      public int getSize() {
         return list.size();
      }
   }
}
/**
 * 가방에 연필과 지우개를 덮는다. 
 * 가방에서 물건을 꺼낸다. 꺼낸 물건이 연필이면 write, 지우개면 덮는다.
 */