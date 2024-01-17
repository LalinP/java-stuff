package com.java.stuff.designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

  private Map<String, Item> items = new HashMap<>();

  public Registry() {
    loadItems();
  }

  /**
   * If you've read the item about cloning in my book,
   * especially if you read between the lines, you will know that I think clone is deeply broken.
   * There are a few design flaws, the biggest of which is that the Cloneable interface does not have a clone method.
   * And that means it simply doesn't work: making something Cloneable doesn't say anything about what you can do with it.
   * Instead, it says something about what it can do internally.
   * It says that if by calling super.clone repeatedly it ends up calling Object's clone method,
   * this method will return a field copy of the original.
   *
   * Object's clone method is very tricky. It's based on field copies,
   * and it's "extra-linguistic." It creates an object without calling a constructor.
   * There are no guarantees that it preserves the invariants established by the constructors.
   * There have been lots of bugs over the years, both in and outside Sun,
   * stemming from the fact that if you just call super.clone repeatedly up the chain until you have cloned an object,
   * you have a shallow copy of the object. The clone generally shares state with the object being cloned. If that state is mutable, you don't have two independent objects.
   * If you modify one, the other changes as well. And all of a sudden, you get random behavior.
   * @param type
   * @return
   */
  public Item createClonedItem(String type){
    Item clonedItem;
    try {
      clonedItem = (Item)items.get(type).clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }

    return clonedItem;
  }


  private void loadItems() {
    Movie grinch = new Movie();
    grinch.setRuntime("2");
    grinch.setPrice(10.00);
    grinch.setTitle("The Grinch");
    grinch.setUrl("www.grinchthemovie.com");
    items.put("Grinch", grinch);

    Book farthestNorth = new Book();
    farthestNorth.setTitle("Farthest North");
    farthestNorth.setNumberOfPages(567);
    farthestNorth.setPrice(15.99);
    farthestNorth.setTitle("www.hamiltonbooks.co.uk");

    items.put("farthestNorth", farthestNorth);
  }

}
