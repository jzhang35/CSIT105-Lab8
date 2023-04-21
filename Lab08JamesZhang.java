//James Zhang
package chpt7samplecode;
import java.util.ArrayList;

public class Lab08JamesZhang
{
   public static void main(String[] args)
   {
      ArrayList<InventoryItem> list = new ArrayList<InventoryItem>();
      
      list.add(new InventoryItem("Hammers", 105));
      list.add(new InventoryItem("Nails", 1200));
      list.add(new InventoryItem("Saws", 12));
      list.add(new InventoryItem("Tires", 32));
      list.add(new InventoryItem("Vacuums", 6));
      list.add(new InventoryItem("Cement", 300));
      list.add(new InventoryItem("Metal Sheets", 16));
      list.add(new InventoryItem("Shears", 22));
      
      System.out.println("Original Inventory List:");
      System.out.println("Index    Description  Units");
      
      for (int index = 0; index < list.size(); index++)
      {
         InventoryItem item = (InventoryItem)list.get(index);
         System.out.printf("%5d %14s %6s\n", index, item.getDescription(), item.getUnits());
      }
      
      list.remove(0);
      list.remove(0);
      list.remove(0);
      
      System.out.println("\nFirst Three Items Removed:");
      System.out.println("Index    Description  Units");
      
      for (int index = 0; index < list.size(); index++)
      {
         InventoryItem item = (InventoryItem)list.get(index);
         System.out.printf("%5d %14s %6s\n", index, item.getDescription(), item.getUnits());
      }
      
      list.set(4, new InventoryItem("Shower Heads", 69));
      
      System.out.println("\nLast Item Removed:");
      System.out.println("Index    Description  Units");
      
      for (int index = 0; index < list.size(); index++)
      {
         InventoryItem item = (InventoryItem)list.get(index);
         System.out.printf("%5d %14s %6s\n", index, item.getDescription(), item.getUnits());
      }
      
   }
}